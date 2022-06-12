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
		System.out.print("Enter the Rate Of Inflation in percent : ");
		double rateOfInflation = scanObj.nextDouble();
		System.out.print("Enter the number of Yeras : ");
		Integer years = scanObj.nextInt();
		scanObj.close();

		Validator validator = new Validator();

		try {
			validator.validate(years);

			Schema schemaObj = new Schema(rateOfInflation, years);

			Impl impl = new Impl();

			double compoundedRetailInflation = impl.computeCompoundedRetailInflation(schemaObj);

			DecimalFormat df = new DecimalFormat("#");
			String compoundedRetailInflationFormatted = df.format(compoundedRetailInflation);

			System.out.println("Componded Retail Inflation Is : " + compoundedRetailInflationFormatted + "%");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
