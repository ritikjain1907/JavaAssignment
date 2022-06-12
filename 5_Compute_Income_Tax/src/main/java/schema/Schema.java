/**
 * Digit Class
 */
package main.java.schema;

/**
 * @author Ritik
 *
 */
public class Schema {
	
	private double income;

	public Schema() {}

	/**
	 * @param income
	 */
	public Schema(double income) {
		this.income = income;
	}

	/**
	 * @return the income
	 */
	public double getIncome() {
		return income;
	}

	/**
	 * @param income the income to set
	 */
	public void setIncome(double income) {
		this.income = income;
	}

}
