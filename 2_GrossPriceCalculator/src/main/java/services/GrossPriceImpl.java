/**
 * Implementation Class
 */
package main.java.services;

import main.java.schema.Product;

/**
 * @author Ritik
 *
 */
public class GrossPriceImpl {
	
	/**
	 * calculateGrossPrice Method to calculate gross price
	 * @param digitObj
	 * @return digitCounter
	 */
	public double calculateGrossPrice(Product productObj) {

		double netPrice = productObj.getNetPrice();
		double taxRate = productObj.getTaxRate();
		
		double grossPrice = netPrice/(1+taxRate);
		
		return grossPrice;
	}
}
