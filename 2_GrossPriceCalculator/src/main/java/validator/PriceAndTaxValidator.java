/**
 * Validator Class
 */
package main.java.validator;


/**
 * @author Ritik
 *
 */
public class PriceAndTaxValidator {
	
	/**
	 * validatePriceAndTax method to validate if the netPrice and taxRate is positive
	 * @param netPrice
	 * @param taxRate
	 * @return Boolean.True - Valid case
	 * @return NumberFormatException - Invalid case
	 */
	public Boolean validatePriceAndTax(double netPrice, double taxRate) {
		
		if(netPrice < 0) {
			throw new NumberFormatException("Net price cannot be negative");
		}
		
		if(taxRate < 0) {
			throw new NumberFormatException("Tax rate cannot be negative");
		}
		
		return Boolean.TRUE;
	}
}
