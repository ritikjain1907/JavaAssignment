/**
 * Junit Test Case Class
 */
package test.java.validator;

import org.junit.Assert;

/**
 * @author Ritik
 *
 */

import org.junit.Test;

import main.java.schema.Schema;
import main.java.service.impl.Impl;
import main.java.validator.Validator;

public class ValidatorTest {
	
	@Test
	public void testValidCase1() {
		
		Integer number = 59;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(number);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(number);
		Impl impl = new Impl();
		boolean specialInteger = impl.checkIfIntegerIsSpecial(schemaObj);
		Assert.assertEquals(specialInteger, Boolean.TRUE);
	}
	
	@Test
	public void testValidCase2() {
		
		Integer number = 19;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(number);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(number);
		Impl impl = new Impl();
		boolean specialInteger = impl.checkIfIntegerIsSpecial(schemaObj);
		Assert.assertEquals(specialInteger, Boolean.TRUE);
	}
	
	@Test
	public void testValidCase3() {
		
		Integer number = 37;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(number);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(number);
		Impl impl = new Impl();
		boolean specialInteger = impl.checkIfIntegerIsSpecial(schemaObj);
		Assert.assertEquals(specialInteger, Boolean.FALSE);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testInvalidCase4() {
		
		Integer number = 100;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(number);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testInvalidCase5() {
		
		Integer number = 9;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(number);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testInvalidCase6() {
		
		Integer number = -100;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(number);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testInvalidCase7() {
		
		Integer number = -9;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(number);
	}

}
