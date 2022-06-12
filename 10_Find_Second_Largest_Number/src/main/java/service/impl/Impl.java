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
	 * @description findSecondLargestNumber Method to find the second largest number
	 * @param digitObj
	 * @return digitCounter
	 */
	@Override
	public double findSecondLargestNumber(Schema schemaObj) {
		
		Integer sizeOfArray = schemaObj.getSizeOfArray();
		double[] array = schemaObj.getArray();
		
		double largest;
		double secondLargest;
		
		if(array[0]>array[1]) {
			largest = array[0];
			secondLargest = array[1];
		}
		else
		{
			largest = array[1];
			secondLargest = array[0];
		}
		
		for(int i=2; i<sizeOfArray; i++) {
			if(array[i]>largest) {
				largest = array[i];
				secondLargest = largest;
			}
			else if(array[i]>secondLargest) {
				secondLargest = array[i];
			}
		}
		
		return secondLargest;
	}
}
