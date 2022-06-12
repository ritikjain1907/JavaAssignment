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
	 * @return String
	 */
	public String findStringWithMostVowels(Schema schemaObj);
}
