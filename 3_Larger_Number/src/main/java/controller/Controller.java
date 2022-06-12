/**
 * Controller Class
 * 
 */
package main.java.controller;

import java.util.Scanner;
import main.java.schema.Schema;
import main.java.validator.Validator;
import main.java.service.impl.Impl;

/**
 * @author Ritik
 *
 */

public class Controller {
	
	/**
	 * Main class
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanObj = new Scanner(System.in);
		System.out.print("Enter the First Number : ");
		double firstNumber = scanObj.nextDouble();
		System.out.print("Enter the Second Number : ");
		double secondNumber = scanObj.nextDouble();
		scanObj.close();
		
		Validator validator = new Validator();
		
		try {
			validator.validate(firstNumber, secondNumber);
			
			Schema schemaObj = new Schema(firstNumber, secondNumber);
			
			Impl impl = new Impl();
			System.out.println("Larger Number Between " + firstNumber + " and : " + secondNumber + " is : " + impl.findLargerNumber(schemaObj));
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
	}
}
