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
	 * validate method to validate number of years is positive
	 * 
	 * @param income
	 * @return Boolean.True - Valid case
	 * @return NumberFormatException - Invalid case
	 */
	public Boolean validate(Integer years) {

		if(years<0) {
			throw new NumberFormatException("Number of years is Negative");
		}
		return Boolean.TRUE;
	}
}