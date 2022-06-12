/**
 * Schema Class
 */
package main.java.schema;

/**
 * @author Ritik
 *
 */
public class Schema {
	
	private double rateOfInflation;
	private Integer years;

	public Schema() {}

	/**
	 * @param rateOfInflation
	 * @param years
	 */
	public Schema(double rateOfInflation, Integer years) {
		super();
		this.rateOfInflation = rateOfInflation;
		this.years = years;
	}

	/**
	 * @return the rateOfInflation
	 */
	public double getRateOfInflation() {
		return rateOfInflation;
	}

	/**
	 * @param rateOfInflation the rateOfInflation to set
	 */
	public void setRateOfInflation(double rateOfInflation) {
		this.rateOfInflation = rateOfInflation;
	}

	/**
	 * @return the years
	 */
	public Integer getYears() {
		return years;
	}

	/**
	 * @param years the years to set
	 */
	public void setYears(Integer years) {
		this.years = years;
	}
	
}
