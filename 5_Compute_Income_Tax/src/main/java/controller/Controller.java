/**
 * Controller Class
 * 
 */
package main.java.controller;

import java.text.DecimalFormat;
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
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanObj = new Scanner(System.in);
		System.out.print("Enter the Income ");
		double income = scanObj.nextDouble();
		scanObj.close();

		Validator validator = new Validator();

		try {
			validator.validate(income);

			Schema schemaObj = new Schema(income);

			Impl impl = new Impl();

			double incomeTax = impl.computeIncomeTax(schemaObj);

			DecimalFormat df = new DecimalFormat("#,###.00");
			String incomeTaxFormatted = df.format(incomeTax);

			System.out.println("Income Tax is : " + incomeTaxFormatted);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
}
