/**
 * Iservice Interface
 */
package main.java.service;

/**
 * @author Ritik
 *
 */

import main.java.schema.Product;

public interface IService {
	/**
	 * 
	 * @param schemaObj
	 * @return double
	 */
	public double calculateGrossPrice(Product productObj);
}
