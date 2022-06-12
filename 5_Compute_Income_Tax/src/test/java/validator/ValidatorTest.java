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
		
		double income = 190000;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(income);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(income);
		Impl impl = new Impl();
		double ans = impl.computeIncomeTax(schemaObj);
		assertEquals(ans, 0, 0.001);
	}
	
	@Test
	public void testValidCase2() {
		
		double income = 345000;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(income);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(income);
		Impl impl = new Impl();
		double ans = impl.computeIncomeTax(schemaObj);
		assertEquals(ans, 9500, 0.001);
	}
	
	@Test
	public void testValidCase3() {
		
		double income = 780000;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(income);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(income);
		Impl impl = new Impl();
		double ans = impl.computeIncomeTax(schemaObj);
		assertEquals(ans, 81000, 0.001);
	}
	@Test
	public void testValidCase4() {
		
		double income = 2400000;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(income);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(income);
		Impl impl = new Impl();
		double ans = impl.computeIncomeTax(schemaObj);
		assertEquals(ans, 545000, 0.001);
	}
	
	@Test(expected = RuntimeException.class)
	public void testInvalidCase5() {
		
		double income = -800000;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(income);
	}

}
