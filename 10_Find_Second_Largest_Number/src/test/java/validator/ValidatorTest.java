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
		
		double[] array = {10.7, 34.6, 2.98, -67.12};
		Integer sizeofArray = 4;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(array, sizeofArray);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(array, sizeofArray);
		Impl impl = new Impl();
		double ans = impl.findSecondLargestNumber(schemaObj);
		assertEquals(ans, 10.7, 0.001);
	}
	
	@Test
	public void testValidCase2() {
		
		double[] array = {789, 473, -1876, 907, 453};
		Integer sizeofArray = 5;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(array, sizeofArray);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(array, sizeofArray);
		Impl impl = new Impl();
		double ans = impl.findSecondLargestNumber(schemaObj);
		assertEquals(ans, 789, 0.001);
	}
	
	@Test(expected = RuntimeException.class)
	public void testInvalidCase3() {
		
		double[] array = {};
		Integer sizeofArray = 0;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(array, sizeofArray);
	}
	
	@Test(expected = RuntimeException.class)
	public void testInvalidCase4() {
		
		double[] array = {23};
		Integer sizeofArray = 1;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(array, sizeofArray);
	}
	
	@Test(expected = RuntimeException.class)
	public void testInvalidCase5() {
		
		double[] array = {5.0, 5.0, 5.0, 5.0, 5.0, 5.0};
		Integer sizeofArray = 5;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(array, sizeofArray);
	}

}
