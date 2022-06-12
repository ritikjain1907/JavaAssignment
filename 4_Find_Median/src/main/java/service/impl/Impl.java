/**
 * Implementation Class
 */
package main.java.service.impl;

import main.java.schema.Schema;
import main.java.service.IService;

/**
 * @author Ritik
 * @description findMedian Method to find the median
 *
 */
public class Impl implements IService {
	
	/**
	 * @description - findMedian Method to find the median
	 * @param schemaObj
	 * @return double
	 */
	@Override
	public double findMedian(Schema schemaObj) {
		
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
