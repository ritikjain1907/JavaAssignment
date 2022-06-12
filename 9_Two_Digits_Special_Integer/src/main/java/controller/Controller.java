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
		System.out.print("Enter a two digit number : ");
		Integer number = scanObj.nextInt();
		scanObj.close();

		Validator validator = new Validator();

		try {
			validator.validate(number);

			Schema schemaObj = new Schema(number);

			Impl impl = new Impl();

			Boolean check = impl.checkIfIntegerIsSpecial(schemaObj);

			if(check) {
				System.out.println("Integer is Special");
			}
			else {
				System.out.println("Integer is not Special");
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
