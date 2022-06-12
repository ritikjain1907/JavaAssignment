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
	 * @description findStringWithMostVowels Method to find the string with most vowels
	 * @param digitObj
	 * @return digitCounter
	 */
	@Override
	public String findStringWithMostVowels(Schema schemaObj) {
		
		Integer sizeOfArray = schemaObj.getSizeOfArray();
		String[] stringArray = schemaObj.getStringArray();
		
		Integer[] vowelCount = new Integer[sizeOfArray];
		for (int i=0; i<sizeOfArray; i++) {
			vowelCount[i] = 0;
		}
		
		for (int i=0; i<sizeOfArray; i++) {
			for (int j=0; j<stringArray[i].length(); j++) {
				
				if(stringArray[i].charAt(j)=='a' || stringArray[i].charAt(j)=='e' || stringArray[i].charAt(j)=='i' 
						|| stringArray[i].charAt(j)=='o' || stringArray[i].charAt(j)=='u' || stringArray[i].charAt(j)=='A' 
						|| stringArray[i].charAt(j)=='E' || stringArray[i].charAt(j)=='I' || stringArray[i].charAt(j)=='O' 
						|| stringArray[i].charAt(j)=='U') {
					vowelCount[i] += 1;
				}
			}
		}
		
		Integer maxPosition = 0 ;
		Integer maxValue = vowelCount[0];
		
		for (int i=1; i<sizeOfArray; i++) {
			if(maxValue < vowelCount[i]) {
				maxValue = vowelCount[i];
				maxPosition = i;
			}
		}
		
		return stringArray[maxPosition];
	}
}
