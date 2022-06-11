/**
 * Digit Class
 */
package main.java.schema;

/**
 * @author Ritik
 *
 */
public class Digit {
	
	private Integer inputInteger;

	public Digit() {}
	
	public Digit(Integer inputInteger) {
		this.inputInteger = inputInteger;
	}

	/**
	 * @return the inputInteger
	 */
	public Integer getInputInteger() {
		return inputInteger;
	}

	/**
	 * @param inputInteger
	 */
	public void setInputInteger(Integer inputInteger) {
		this.inputInteger = inputInteger;
	}
}
