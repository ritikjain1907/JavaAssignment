/**
 * Implementation Class
 */
package main.java.service.impl;

import main.java.schema.Schema;
import main.java.service.IService;

/**
 * @author Ritik
 *
 */
public class Impl implements IService {
	
	/**
	 * @description computeIncomeTax Method to compute income tax
	 * @param digitObj
	 * @return digitCounter
	 */
	@Override
	public double computeIncomeTax(Schema schemaObj) {
		
		double income = schemaObj.getIncome();
		
		double incomeTax = 0;
		
		
		if(income>250000 && income<=500000) {
			income -= 250000;
			incomeTax = 0.1*income;
		}
		
		else if(income>500000 && income<=1000000) {
			income -= 250000;
			incomeTax = 0.1*250000 + 0.2*(income-250000);
		}
		
		else if(income>1000000){
			income -= 250000;
			incomeTax = 0.1*250000 + 0.2*500000 + 0.3*(income-750000);
		}
		
		return incomeTax;
	}
}
