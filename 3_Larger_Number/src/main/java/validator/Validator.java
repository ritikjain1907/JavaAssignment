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
	 * @description - validate method to validate if the input numbers are equal or not
	 * @param firstNumber
	 * @param secondNumber
	 * @return Boolean
	 */
	public Boolean validate(double firstNumber, double secondNumber) {
		
		if(firstNumber == secondNumber) {
			throw new RuntimeException("Entered numbers are equal to each other");
		}
		
		return Boolean.TRUE;
	}
}
