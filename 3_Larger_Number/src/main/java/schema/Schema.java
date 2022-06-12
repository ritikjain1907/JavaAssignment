/**
 * Digit Class
 */
package main.java.schema;

/**
 * @author Ritik
 *
 */
public class Schema {
	
	private Double firstNumber;
	private Double SecondNumber;

	public Schema() {}

	/**
	 * @param firstNumber
	 * @param secondNumber
	 */
	public Schema(Double firstNumber, Double secondNumber) {
		super();
		this.firstNumber = firstNumber;
		SecondNumber = secondNumber;
	}

	/**
	 * @return the firstNumber
	 */
	public Double getFirstNumber() {
		return firstNumber;
	}

	/**
	 * @param firstNumber the firstNumber to set
	 */
	public void setFirstNumber(Double firstNumber) {
		this.firstNumber = firstNumber;
	}

	/**
	 * @return the secondNumber
	 */
	public Double getSecondNumber() {
		return SecondNumber;
	}

	/**
	 * @param secondNumber the secondNumber to set
	 */
	public void setSecondNumber(Double secondNumber) {
		SecondNumber = secondNumber;
	}
	
}
