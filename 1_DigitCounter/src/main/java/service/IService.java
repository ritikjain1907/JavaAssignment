/**
 * Iservice Interface
 */
package main.java.service;

/**
 * @author Ritik
 *
 */

import main.java.schema.Digit;

public interface IService {
	/**
	 * @param schemaObj
	 * @return Integer
	 */
	public Integer countDigits(Digit digitObj);
}
