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
		
		String[] stringArray = {"Sunshine", "Umbrella", "Major", "Resourceful"};
		Integer sizeofArray = 4;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(stringArray, sizeofArray);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(stringArray, sizeofArray);
		Impl impl = new Impl();
		String ans = impl.findStringWithMostVowels(schemaObj);
		assertEquals(ans, "Resourceful");
	}
	
	@Test
	public void testValidCase2() {
		
		String[] stringArray = {"Afforest", "Establish", "Forest", "Unforested", "Aftermath"};
		Integer sizeofArray = 5;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(stringArray, sizeofArray);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(stringArray, sizeofArray);
		Impl impl = new Impl();
		String ans = impl.findStringWithMostVowels(schemaObj);
		assertEquals(ans, "Unforested");
	}
	
	@Test(expected = RuntimeException.class)
	public void testInvalidCase3() {
		
		String[] stringArray = {};
		Integer sizeofArray = 0;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(stringArray, sizeofArray);
	}
	
	@Test(expected = RuntimeException.class)
	public void testInvalidCase4() {
		
		String[] stringArray = {"letter", "comb", ""};
		Integer sizeofArray = 3;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(stringArray, sizeofArray);
	}
	
	@Test(expected = RuntimeException.class)
	public void testInvalidCase5() {
		
		String[] stringArray = {"sky", "Gypsy", "Fly"};
		Integer sizeofArray = 3;
		
		Validator validator = new Validator();
		Boolean check = validator.validate(stringArray, sizeofArray);
		Assert.assertEquals(check, Boolean.TRUE);
		Schema schemaObj = new Schema(stringArray, sizeofArray);
		Impl impl = new Impl();
		String ans = impl.findStringWithMostVowels(schemaObj);
	}

}
