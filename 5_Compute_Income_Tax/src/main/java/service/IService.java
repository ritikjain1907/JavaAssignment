/**
 * Iservice Interface
 */
package main.java.service;

/**
 * @author Ritik
 *
 */

import main.java.schema.Schema;

public interface IService {
	/**
	 * 
	 * @param schemaObj
	 * @return double
	 */
	public double computeIncomeTax(Schema schemaObj);
}
