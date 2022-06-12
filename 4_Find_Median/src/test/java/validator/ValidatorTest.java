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
		
		double[] medianArray = {10.7};
		Integer sizeofArray = 1;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(medianArray, sizeofArray);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(medianArray, sizeofArray);
		Impl impl = new Impl();
		double ans = impl.findMedian(schemaObj);
		assertEquals(ans, 10.7, 0.001);
	}
	
	@Test
	public void testValidCase2() {
		
		double[] medianArray = {1.0, 2.0, 3.0};
		Integer sizeofArray = 3;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(medianArray, sizeofArray);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(medianArray, sizeofArray);
		Impl impl = new Impl();
		double ans = impl.findMedian(schemaObj);
		assertEquals(ans, 2.0, 0.001);
	}
	
	@Test
	public void testValidCase3() {
		
		double[] medianArray = {17.4, 21.1, 39.7, 48.0};
		Integer sizeofArray = 4;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(medianArray, sizeofArray);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(medianArray, sizeofArray);
		Impl impl = new Impl();
		double ans = impl.findMedian(schemaObj);
		assertEquals(ans, 30.4, 0.001);
	}
	
	@Test
	public void testValidCase4() {
		
		double[] medianArray = {-957.0, -493.0, -384.0, -268.0, -131.0};
		Integer sizeofArray = 5;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(medianArray, sizeofArray);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(medianArray, sizeofArray);
		Impl impl = new Impl();
		double ans = impl.findMedian(schemaObj);
		assertEquals(ans, -384.0, 0.001);
	}
	
	@Test(expected = RuntimeException.class)
	public void testInvalidCase5() {
		
		double[] medianArray = {56.0, 24.5, 61.1, 124.8};
		Integer sizeofArray = 4;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(medianArray, sizeofArray);
	}

}
