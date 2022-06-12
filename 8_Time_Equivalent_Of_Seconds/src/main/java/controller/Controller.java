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
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanObj = new Scanner(System.in);
		System.out.print("Enter the number of seconds : ");
		Integer seconds = scanObj.nextInt();
		scanObj.close();

		Validator validator = new Validator();

		try {
			validator.validate(seconds);

			Schema schemaObj = new Schema(seconds);

			Impl impl = new Impl();

			impl.computeTimeEquivalent(schemaObj);

			System.out.println(schemaObj.getDays() + " Day(s)" + schemaObj.getHours() + " Hour(s)" + schemaObj.getMinutes() + " Minute(s)" + schemaObj.getSeconds() + " Second(s)");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
