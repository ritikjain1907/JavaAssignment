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
	 * validate method to validate if the array doesnot contains similar values
	 * 
	 * @param inputInteger
	 * @return Boolean.True - Valid case
	 * @return RuntimeException - Invalid case
	 */
	public Boolean validate(double[] array, Integer sizeOfArray) {
		
		if(sizeOfArray==1) {
			throw new RuntimeException("Array Contains Only 1 Value");
		}

		double valueAtZero = array[0];
		Integer countValue = 1;
				for (int i = 1; i < sizeOfArray; i++) {
					if (array[i] == valueAtZero) {
						countValue =+ 1;
					}
				}
		if(countValue == sizeOfArray) {
			throw new RuntimeException("Array Contains Similar Values");
		}
		return Boolean.TRUE;
	}
}