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
	 * validate method to check if the number is positive two digit or not
	 * 
	 * @param income
	 * @return Boolean.True - Valid case
	 * @return NumberFormatException - Invalid case
	 */
	public Boolean validate(Integer number) {

		if(number<10 || number>99) {
			throw new NumberFormatException("Number is not a positive two digit number");
		}
		return Boolean.TRUE;
	}
}