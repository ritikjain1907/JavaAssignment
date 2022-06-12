/**
 * Schema Class
 */
package main.java.schema;

/**
 * @author Ritik
 *
 */
public class Schema {
	
	private double firstNumber;
	private double SecondNumber;

	public Schema() {}

	/**
	 * @param firstNumber
	 * @param secondNumber
	 */
	public Schema(double firstNumber, double secondNumber) {
		super();
		this.firstNumber = firstNumber;
		SecondNumber = secondNumber;
	}

	/**
	 * @return the firstNumber
	 */
	public double getFirstNumber() {
		return firstNumber;
	}

	/**
	 * @param firstNumber the firstNumber to set
	 */
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	/**
	 * @return the secondNumber
	 */
	public double getSecondNumber() {
		return SecondNumber;
	}

	/**
	 * @param secondNumber the secondNumber to set
	 */
	public void setSecondNumber(double secondNumber) {
		SecondNumber = secondNumber;
	}
	
}
