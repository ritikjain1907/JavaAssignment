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
		System.out.print("Enter the number of elements you want to store : ");
		Integer sizeOfArray = scanObj.nextInt();
		
		if(sizeOfArray==0) {
			System.out.println("-1");
		}
		else {
		
			double[] array = new double[sizeOfArray];
			
			System.out.println("Enter the elements of the array : "); 
			for(int i=0; i<sizeOfArray; i++)
			{
				array[i] = scanObj.nextDouble();
			}
			scanObj.close();
			
			Validator validator = new Validator();
			
			try {
				validator.validate(array, sizeOfArray);
				
				Schema schemaObj = new Schema(array, sizeOfArray);
				
				Impl impl = new Impl();
				
				double secondLargest = impl.findSecondLargestNumber(schemaObj);
				
				System.out.println("Second Largest Number is : " + secondLargest);
			}
			catch(RuntimeException e) {
				e.printStackTrace();
			}
		}
	}
}
