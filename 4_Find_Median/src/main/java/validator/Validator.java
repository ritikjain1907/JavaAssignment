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
	 * validate method to validate if the array is sorted
	 * 
	 * @param inputInteger
	 * @return Boolean.True - Valid case
	 * @return RunTimeException - Invalid case
	 */
	public Boolean validate(double[] medianArray, Integer sizeOfArray) {

		Boolean asc = Boolean.FALSE;
		if (sizeOfArray >= 2) {
			if (medianArray[0] < medianArray[1]) {
				asc = Boolean.TRUE;
			}
			if (asc) {
				for (int i = 0; i < sizeOfArray - 1; i++) {
					if (medianArray[i] <= medianArray[i + 1]) {
						continue;
					} else {
						throw new RuntimeException("Array Is Not Sorted");
					}
				}
			} else {
				for (int i = 0; i < sizeOfArray - 1; i++) {
					if (medianArray[i] >= medianArray[i + 1]) {
						continue;
					} else {
						throw new RuntimeException("Array Is Not Sorted");
					}
				}
			}
		}
			return Boolean.TRUE;
	}
}