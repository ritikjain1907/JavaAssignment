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
	 * @description computeCompoundedRetailInflation Method to compute compounded retail inflation
	 * @param schemaObj
	 * @return compoundedRetailInflation
	 */
	@Override
	public double computeCompoundedRetailInflation(Schema schemaObj) {
		
		double rateOfInflation = schemaObj.getRateOfInflation();
		Integer years = schemaObj.getYears();
		
		rateOfInflation = 1 + (double)(rateOfInflation/100);
		
		double compoundedRetailInflation =  Math.pow(rateOfInflation, years) - 1;
		return compoundedRetailInflation * 100 ;
		
	}
}
