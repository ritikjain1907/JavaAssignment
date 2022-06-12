/**
 * Controller Class
 * 
 */
package main.java.controller;

import java.util.Scanner;

import main.java.schema.Schema;
import main.java.service.impl.Impl;
import main.java.validator.Validator;

/**
 * @author Ritik
 *
 */

public class Controller {

	/**
	 * Main class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanObj = new Scanner(System.in);
		System.out.print("Enter the number of strings you want to store : ");
		Integer sizeOfArray = scanObj.nextInt();
		scanObj.nextLine();

		String[] stringArray = new String[sizeOfArray];

		System.out.println("Enter the strings : ");
		for (int i = 0; i < sizeOfArray; i++) {
			stringArray[i] = scanObj.nextLine();
		}
		scanObj.close();

		Validator validator = new Validator();

		try {
			validator.validate(stringArray, sizeOfArray);

			Schema schemaObj = new Schema(stringArray, sizeOfArray);

			Impl impl = new Impl();

			String stringWithMostVowels = impl.findStringWithMostVowels(schemaObj);

			System.out.println("String with most Vowels is : " + stringWithMostVowels);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
}
