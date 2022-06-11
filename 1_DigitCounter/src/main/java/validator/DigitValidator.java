/**
 * Validator Class
 */
package main.java.validator;


/**
 * @author Ritik
 *
 */
public class DigitValidator {
	
	/**
	 * validateInteger method to validate if the input value is integer or not
	 * @param inputInteger
	 * @return Boolean.True - Valid case
	 * @return NumberFormatException - Invalid case
	 */
	public Boolean validateInteger(String inputInteger) {
		
		Integer sizeOfInteger = inputInteger.length();
		
		if(sizeOfInteger == 0) {
			throw new NumberFormatException("Entered value is Empty");
		}
		
		if(sizeOfInteger == 1 && !(inputInteger.charAt(0) >= '0' && inputInteger.charAt(0) <= '9')) {
			throw new NumberFormatException("Entered value is Invalid");
		}
		
		if(inputInteger.charAt(0) != '-' && !(inputInteger.charAt(0) >= '0' && inputInteger.charAt(0) <= '9')) {
			throw new NumberFormatException("Entered value is not an Integer");
		}
		for(int i=1; i<sizeOfInteger; i++) {
			
			if(!(inputInteger.charAt(i) >= '0' && inputInteger.charAt(i) <= '9')) {
				throw new NumberFormatException("Entered value is not an Integer");
			}
		}
		return Boolean.TRUE;
	}
}
