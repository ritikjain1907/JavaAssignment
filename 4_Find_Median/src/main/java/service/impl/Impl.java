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
	 * @description findLargerNumber Method to find the larger number between two numbers
	 * @param digitObj
	 * @return digitCounter
	 */
	@Override
	public Double findMedian(Schema schemaObj) {
		
		Integer sizeOfArray = schemaObj.getSizeOfArray();
		double[] medianArray = schemaObj.getMedianArray();
		
		double medianValue = medianArray[sizeOfArray/2];
		
		if(sizeOfArray%2==0) {
			medianValue += medianArray[(sizeOfArray/2)-1];
			medianValue /= 2;
		}
		
		return medianValue;
	}
}
