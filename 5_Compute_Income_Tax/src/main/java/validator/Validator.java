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
	 * validate method to validate in income is positive
	 * 
	 * @param income
	 * @return Boolean.True - Valid case
	 * @return NumberFormatException - Invalid case
	 */
	public Boolean validate(double income) {

		if(income<0) {
			throw new ArithmeticException("Income is Negative");
		}
		return Boolean.TRUE;
	}
}