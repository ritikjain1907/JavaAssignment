/**
 * Controller Class
 * 
 */
package main.java.controller;

import java.text.DecimalFormat;
import java.util.Scanner;
import main.java.schema.Product;
import main.java.service.impl.GrossPriceImpl;
import main.java.validator.PriceAndTaxValidator;

/**
 * @author Ritik
 *
 */

public class GrossCalculatorController {
	
	/**
	 * Main class
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanObj = new Scanner(System.in);
		System.out.print("Enter the Net Price : ");
		double netPrice = scanObj.nextDouble();
		System.out.print("Enter the Tax Rate : ");
		double taxRate = scanObj.nextDouble();
		scanObj.close();
		
		PriceAndTaxValidator priceAndTaxValidator = new PriceAndTaxValidator();
		
		try {
			priceAndTaxValidator.validatePriceAndTax(netPrice, taxRate);
			
			Product productObj = new Product(netPrice, taxRate);
			
			double grossPrice = 0;
			
			GrossPriceImpl grossPriceImpl = new GrossPriceImpl();
			grossPrice = grossPriceImpl.calculateGrossPrice(productObj);
			
			DecimalFormat df = new DecimalFormat("#.00");
		    String grossFormatted = df.format(grossPrice);
			System.out.println("Gross Price For Net Price " + netPrice + " and Tax Rate " + taxRate + " is : " + grossFormatted);
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
