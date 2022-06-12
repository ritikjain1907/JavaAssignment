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
		
		Integer seconds = 21893872;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(seconds);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(seconds);
		Impl impl = new Impl();
		impl.computeTimeEquivalent(schemaObj);
		
		Integer day = Integer.valueOf(schemaObj.getDays());
		Integer hour = schemaObj.getHours();
		Integer minute = schemaObj.getMinutes();
		Integer second = schemaObj.getSeconds();
		
		assertEquals(day, Integer.valueOf(253));
		assertEquals(hour, Integer.valueOf(9));
		assertEquals(minute, Integer.valueOf(37));
		assertEquals(second, Integer.valueOf(52));
	}
	
	@Test(expected = NumberFormatException.class)
	public void testInvalidCase2() {
		
		Integer seconds = -97653;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(seconds);
		Assert.assertEquals(check, Boolean.TRUE);
	}

}
