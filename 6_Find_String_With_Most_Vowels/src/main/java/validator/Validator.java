/**
 * Validator Class
 */
package main.java.validator;

/**
 * @author Ritik
 *
 */
public class Validator {

	/**
	 * @description - validate method to check if the Array is empty or is there any empty string
	 * 
	 * @param stringArray
	 * @param sizeOfArray
	 * @return Boolean.True - Valid case
	 * @return RuntimeException - Invalid case
	 */
	public Boolean validate(String[] stringArray, Integer sizeOfArray) {

		if(sizeOfArray==0) {
			throw new RuntimeException("Array Is Empty");
		}
		
		for (int i = 0; i < sizeOfArray; i++) {
			if(stringArray[i].isEmpty() || stringArray[i].isBlank()) {
				throw new RuntimeException("Empty String Found");
			}
		}
		return Boolean.TRUE;
	}
}