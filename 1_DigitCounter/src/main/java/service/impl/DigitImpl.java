/**
 * Implementation Class
 */
package main.java.service.impl;

import main.java.schema.Digit;
import main.java.service.IService;

/**
 * @author Ritik
 *
 */
public class DigitImpl implements IService{
	
	/**
	 * countDigits Method to count the number of digits in an integer
	 * @param digitObj
	 * @return digitCounter
	 */
	public Integer countDigits(Digit digitObj) {

		Integer givenInteger = digitObj.getInputInteger();

		if (givenInteger < 0) {
			givenInteger *= -1;
		}

		Integer digitCounter = 0;

		while (givenInteger != 0) {
			digitCounter += 1;
			givenInteger /= 10;
		}

		return digitCounter;
	}
}
