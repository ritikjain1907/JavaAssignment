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
	 * @description checkIfIntegerIsSpecial Method check if integer is special
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
