/**
 * Product Class
 */
package main.java.schema;

/**
 * @author Ritik
 *
 */
public class Product {
	
	

	private double netPrice;
	private double taxRate;

	public Product() {}
	
	/**
	 * @param netPrice
	 * @param taxRate
	 */
	public Product(double netPrice, double taxRate) {
		super();
		this.netPrice = netPrice;
		this.taxRate = taxRate;
	}
	
	/**
	 * @return the netPrice
	 */
	public double getNetPrice() {
		return netPrice;
	}

	/**
	 * @param netPrice the netPrice to set
	 */
	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}

	/**
	 * @return the taxRate
	 */
	public double getTaxRate() {
		return taxRate;
	}

	/**
	 * @param taxRate the taxRate to set
	 */
	public void setTaxRate(double taxrate) {
		this.taxRate = taxrate;
	}
	

}