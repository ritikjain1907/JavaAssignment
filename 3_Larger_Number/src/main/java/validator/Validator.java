/**
 * Validator Class
 */
package main.java.validator;


/**
 * @author Ritik
 *
 */
public class Validator {
	
	/**
	 * validate method to validate if the input numbers are not equal
	 * @param inputInteger
	 * @return Boolean.True - Valid case
	 * @return NumberFormatException - Invalid case
	 */
	public Boolean validate(double firstNumber, double secondNumber) {
		
		if(firstNumber == secondNumber) {
			throw new ArithmeticException("Entered numbers are equal to each other");
		}
		
		return Boolean.TRUE;
	}
}