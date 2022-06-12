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
	
	/**
	 * Valid - Second number is larger
	 */
	@Test
	public void testValidCase1() {
		
		double firstNumber = 5.0;
		double secondNumber = 10.0;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(firstNumber, secondNumber);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(firstNumber, secondNumber);
		Impl impl = new Impl();
		double ans = impl.findLargerNumber(schemaObj);
		assertEquals(ans, secondNumber, 0.001);
	}
	
	/**
	 * Valid - First number is larger
	 */
	@Test
	public void testValidCase2() {
		
		double firstNumber = -100.0;
		double secondNumber = -875326.0;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(firstNumber, secondNumber);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(firstNumber, secondNumber);
		Impl impl = new Impl();
		double ans = impl.findLargerNumber(schemaObj);
		assertEquals(ans, firstNumber, 0.001);
	}
	
	/**
	 * Invalid - Both number are equal
	 */
	@Test(expected = RuntimeException.class)
	public void testInvalidCase3() {
		
		double firstNumber = 56.5;
		double secondNumber = 56.5;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(firstNumber, secondNumber);
	}

}
