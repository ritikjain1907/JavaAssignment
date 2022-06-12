/**
 * JUnit Test Cases
 */
package test.java.validator;

/**
 * @author Ritik
 *
 */

import main.java.validator.PriceAndTaxValidator;
import org.junit.Test;
import org.junit.Assert;

public class GrossPriceTest {

	/**
	 * Valid - Positive Integer
	 */
	@Test
	public void testValidPositiveInteger() {
		
		String testInteger = "345";
		DigitValidator digitValidator = new DigitValidator();
		
		Boolean check = digitValidator.validateInteger(testInteger);
		Assert.assertEquals(Boolean.TRUE, check);
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
