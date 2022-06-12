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
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanObj = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store : ");
		Integer sizeOfArray = scanObj.nextInt();
		
		if(sizeOfArray==0) {
			System.out.println("-1");
		}
		else {
		
			double[] medianArray = new double[sizeOfArray];
			
			System.out.println("Enter the elements of the array : "); 
			for(int i=0; i<sizeOfArray; i++)
			{
				medianArray[i] = scanObj.nextDouble();
			}
			scanObj.close();
			
			Validator validator = new Validator();
			
			try {
				validator.validate(medianArray, sizeOfArray);
				
				Schema schemaObj = new Schema(medianArray, sizeOfArray);
				
				Impl impl = new Impl();
				
				double medianValue = impl.findMedian(schemaObj);
				
				DecimalFormat df = new DecimalFormat("#.0");
			    String medianFormatted = df.format(medianValue);
			    
				System.out.println("Median Value is : " + medianFormatted);
			}
			catch(ArithmeticException e) {
				e.printStackTrace();
			}
		}
	}
}
