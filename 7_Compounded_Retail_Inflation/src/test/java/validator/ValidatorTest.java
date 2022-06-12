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

import main.java.schema.Schema;
import main.java.service.impl.Impl;
import main.java.validator.Validator;

public class ValidatorTest {
	
	@Test
	public void testValidCase1() {
		
		double rateOfInflation = 20;
		Integer years = 5;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(years);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(rateOfInflation, years);
		Impl impl = new Impl();
		double ans = impl.computeCompoundedRetailInflation(schemaObj);
		assertEquals(ans, 149.0, 0.2);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testInvalidCase5() {
		
		double rateOfInflation = 10;
		Integer years = -4;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(years);
	}

}
