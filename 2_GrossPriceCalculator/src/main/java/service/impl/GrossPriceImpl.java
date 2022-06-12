/**
 * Implementation Class
 */
package main.java.service.impl;

import main.java.schema.Product;
import main.java.service.IService;

/**
 * @author Ritik
 *
 */
public class GrossPriceImpl implements IService {
	
	/**
	 * @description calculateGrossPrice Method to calculate gross price
	 * @param digitObj
	 * @return digitCounter
	 */
	@Override
	public double calculateGrossPrice(Product productObj) {

		double netPrice = productObj.getNetPrice();
		double taxRate = productObj.getTaxRate();
		
		double grossPrice = netPrice/(1+taxRate);
		
		return grossPrice;
	}
}
