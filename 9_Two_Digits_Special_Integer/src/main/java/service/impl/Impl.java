/**
 * Implementation Class
 */
package main.java.service.impl;

import main.java.schema.Schema;
import main.java.service.IService;

/**
 * @author Ritik
 *
 */
public class Impl implements IService {

	/**
	 * @description computeTimeEquivalent Method to compute Days, Hours, Minutes and
	 *              Seconds
	 * @param schemaObj
	 * @return Boolean
	 */
	@Override
	public Boolean checkIfIntegerIsSpecial(Schema schemaObj) {

		Integer number = schemaObj.getNumber();
		Integer firstDigit = number / 10;
		Integer secondDigit = number % 10;
		Integer calcValue = (firstDigit + secondDigit) + (firstDigit * secondDigit);

		if (calcValue == number) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}
}
