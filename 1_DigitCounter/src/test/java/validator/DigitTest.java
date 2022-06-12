/**
 * JUnit Test Cases
 */
package test.java.validator;

import main.java.schema.Digit;
import main.java.service.impl.DigitImpl;

/**
 * @author Ritik
 *
 */

import main.java.validator.DigitValidator;
import org.junit.Test;
import main.java.schema.Digit;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

public class DigitTest {

	/**
	 * Valid - Positive Integer
	 */
	@Test
	public void testValidPositiveInteger() {
		
		String testInteger = "345";
		DigitValidator digitValidator = new DigitValidator();
		
		Boolean check = digitValidator.validateInteger(testInteger);
		Assert.assertEquals(Boolean.TRUE, check);
		
		Integer parseTestInteger = Integer.parseInt(testInteger);
		
		Digit digitObj = new Digit(parseTestInteger);
		DigitImpl digitImpl = new DigitImpl();
		Integer ans = digitImpl.countDigits(digitObj);
		
		assertEquals(ans, Integer.valueOf(3));
	}
	
	/**
	 * Valid - Negative Integer
	 */
	@Test
	public void testValidNegativeInteger() {
		
		String testInteger = "-90362";
		DigitValidator digitValidator = new DigitValidator();
		
		Boolean check = digitValidator.validateInteger(testInteger);
		Assert.assertEquals(Boolean.TRUE, check);
		
		Integer parseTestInteger = Integer.parseInt(testInteger);
		
		Digit digitObj = new Digit(parseTestInteger);
		DigitImpl digitImpl = new DigitImpl();
		Integer ans = digitImpl.countDigits(digitObj);
		
		assertEquals(ans, Integer.valueOf(5));
	}
	
	/**
	 * Valid - Positive Integer With Leading Zero
	 */
	@Test()
	public void testValidPositiveIntegerWithLeadingZero() {
		
		String testInteger = "00089";
		DigitValidator digitValidator = new DigitValidator();
		
		Boolean check = digitValidator.validateInteger(testInteger);
		Assert.assertEquals(Boolean.TRUE, check);
		
		Integer parseTestInteger = Integer.parseInt(testInteger);
		
		Digit digitObj = new Digit(parseTestInteger);
		DigitImpl digitImpl = new DigitImpl();
		Integer ans = digitImpl.countDigits(digitObj);
		
		assertEquals(ans, Integer.valueOf(2));
	}
	
	/**
	 * Valid - Negative Integer With Leading Zero
	 */
	@Test()
	public void testValidNegativeIntegerWithLeadingZero() {
		
		String testInteger = "-0039486";
		DigitValidator digitValidator = new DigitValidator();
		
		Boolean check = digitValidator.validateInteger(testInteger);
		Assert.assertEquals(Boolean.TRUE, check);
		
		Integer parseTestInteger = Integer.parseInt(testInteger);
		
		Digit digitObj = new Digit(parseTestInteger);
		DigitImpl digitImpl = new DigitImpl();
		Integer ans = digitImpl.countDigits(digitObj);
		
		assertEquals(ans, Integer.valueOf(5));
	}
	
	/**
	 * Invalid - Empty Value
	 */
	@Test(expected = NumberFormatException.class)
	public void testInvalidIntegerWithEmptyValue() {
		
		String testInteger = "";
		DigitValidator digitValidator = new DigitValidator();
		
		Boolean check = digitValidator.validateInteger(testInteger);
	}
	
	/**
	 * Invalid - Contains String
	 */
	@Test(expected = NumberFormatException.class)
	public void testInvalidIntegerWithString() {
		
		String testInteger = "testString";
		DigitValidator digitValidator = new DigitValidator();
		
		Boolean check = digitValidator.validateInteger(testInteger);
	}
	
	/**
	 * Invalid - Positive Integer Contains Characters
	 */
	@Test(expected = NumberFormatException.class)
	public void testInvalidPositiveIntegerWithChar() {
		
		String testInteger = "a12g3";
		DigitValidator digitValidator = new DigitValidator();
		
		Boolean check = digitValidator.validateInteger(testInteger);
	}
	
	/**
	 * Invalid - Negative Integer Contains Characters
	 */
	@Test(expected = NumberFormatException.class)
	public void testInvalidNegativeIntegerWithChar() {
		
		String testInteger = "-12df3";
		DigitValidator digitValidator = new DigitValidator();
		
		Boolean check = digitValidator.validateInteger(testInteger);
	}
	
	/**
	 * Invalid - Positive Integer With Decimal
	 */
	@Test(expected = NumberFormatException.class)
	public void testInvalidPositiveIntegerWithDecimal() {
		
		String testInteger = "9563.87";
		DigitValidator digitValidator = new DigitValidator();
		
		Boolean check = digitValidator.validateInteger(testInteger);
	}
	
	/**
	 * Invalid - Negative Integer With Decimal
	 */
	@Test(expected = NumberFormatException.class)
	public void testInvalidNegativeIntegerWithDecimal() {
		
		String testInteger = "-1052.563";
		DigitValidator digitValidator = new DigitValidator();
		
		Boolean check = digitValidator.validateInteger(testInteger);
	}
}
