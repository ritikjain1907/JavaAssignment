/**
 * Junit Test Case Class
 */
package test.java.validator;

/**
 * @author Ritik
 *
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import main.java.schema.Product;
import main.java.service.impl.GrossPriceImpl;
import main.java.validator.PriceAndTaxValidator;

public class GrossPriceTest {
	
	@Test
	public void testValidCase1() {
		
		double netPrice = 99.95;
		double taxrate = 0.12;
		
		PriceAndTaxValidator priceAndTaxValidator = new PriceAndTaxValidator();
		Boolean check = priceAndTaxValidator.validatePriceAndTax(netPrice, taxrate);
		Assert.assertEquals(check, Boolean.TRUE);
		Product productObj = new Product(netPrice, taxrate);
		GrossPriceImpl grossPriceImpl = new GrossPriceImpl();
		double ans = grossPriceImpl.calculateGrossPrice(productObj);
		assertEquals(ans, 89.24, 0.01);
	}
	
	@Test
	public void testValidCase2() {
		
		double netPrice = 49999.00;
		double taxrate = 0.28;
		
		PriceAndTaxValidator priceAndTaxValidator = new PriceAndTaxValidator();
		Boolean check = priceAndTaxValidator.validatePriceAndTax(netPrice, taxrate);
		Assert.assertEquals(check, Boolean.TRUE);
		Product productObj = new Product(netPrice, taxrate);
		GrossPriceImpl grossPriceImpl = new GrossPriceImpl();
		double ans = grossPriceImpl.calculateGrossPrice(productObj);
		assertEquals(ans, 39061.72, 0.01);
	}
	
	@Test
	public void testValidCase3() {
		
		double netPrice = 720.00;
		double taxrate = 0.05;
		
		PriceAndTaxValidator priceAndTaxValidator = new PriceAndTaxValidator();
		Boolean check = priceAndTaxValidator.validatePriceAndTax(netPrice, taxrate);
		Assert.assertEquals(check, Boolean.TRUE);
		Product productObj = new Product(netPrice, taxrate);
		GrossPriceImpl grossPriceImpl = new GrossPriceImpl();
		double ans = grossPriceImpl.calculateGrossPrice(productObj);
		assertEquals(ans, 685.71, 0.01);
	}
	
	@Test
	public void testValidCase4() {
		
		double netPrice = 45.00;
		double taxrate = 0.0;
		
		PriceAndTaxValidator priceAndTaxValidator = new PriceAndTaxValidator();
		Boolean check = priceAndTaxValidator.validatePriceAndTax(netPrice, taxrate);
		Assert.assertEquals(check, Boolean.TRUE);
		Product productObj = new Product(netPrice, taxrate);
		GrossPriceImpl grossPriceImpl = new GrossPriceImpl();
		double ans = grossPriceImpl.calculateGrossPrice(productObj);
		assertEquals(ans, 45.00, 0.01);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testInvalidCase5() {
		
		double netPrice = -1099.99;
		double taxrate = 0.18;
		
		PriceAndTaxValidator priceAndTaxValidator = new PriceAndTaxValidator();
		Boolean check = priceAndTaxValidator.validatePriceAndTax(netPrice, taxrate);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testInvalidCase6() {
		
		double netPrice = 2999;
		double taxrate = -0.1;
		
		PriceAndTaxValidator priceAndTaxValidator = new PriceAndTaxValidator();
		Boolean check = priceAndTaxValidator.validatePriceAndTax(netPrice, taxrate);
	}

}
