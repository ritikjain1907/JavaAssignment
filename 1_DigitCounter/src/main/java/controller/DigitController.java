/**
 * Controller Class
 * 
 */
package main.java.controller;

import java.util.Scanner;
import main.java.schema.Digit;
import main.java.validator.DigitValidator;
import main.java.service.impl.DigitImpl;

/**
 * @author Ritik
 *
 */

public class DigitController {
	
	/**
	 * Main class
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanObj = new Scanner(System.in);
		System.out.print("Enter the Integer : ");
		String inputInteger = scanObj.nextLine();
		scanObj.close();
		
		DigitValidator digitValidator = new DigitValidator();
		
		try {
			digitValidator.validateInteger(inputInteger);
			Integer parseinputInteger = Integer.parseInt(inputInteger);
			Digit digitObj = new Digit(parseinputInteger);
			Integer digitCount = 0;
			
			DigitImpl digitImpl = new DigitImpl();
			digitCount = digitImpl.countDigits(digitObj);
			System.out.println("Number of Digits in " + parseinputInteger + " is : " + digitCount);
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
