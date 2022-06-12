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
	public Boolean validate(Integer seconds) {

		if(seconds<0) {
			throw new NumberFormatException("Number of seconds is Negative");
		}
		return Boolean.TRUE;
	}
}