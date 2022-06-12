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
	 * @description findLargerNumber method to find the larger number between two numbers
	 * @param digitObj
	 * @return digitCounter
	 */
	@Override
	public double findLargerNumber(Schema schemaObj) {
		
		if(schemaObj.getFirstNumber() > schemaObj.getSecondNumber())
		{
			return schemaObj.getFirstNumber();
		}
		return schemaObj.getSecondNumber();
	}
}
