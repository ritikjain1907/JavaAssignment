/**
 * Digit Class
 */
package main.java.schema;

/**
 * @author Ritik
 *
 */
public class Schema {
	
	private double[] medianArray;
	private Integer sizeOfArray;

	public Schema() {}

	/**
	 * @param medianArray
	 * @param sizeOfArray
	 */
	public Schema(double[] medianArray, Integer sizeOfArray) {
		super();
		this.medianArray = medianArray;
		this.sizeOfArray = sizeOfArray;
	}

	/**
	 * @return the medianArray
	 */
	public double[] getMedianArray() {
		return medianArray;
	}

	/**
	 * @param medianArray the medianArray to set
	 */
	public void setMedianArray(double[] medianArray) {
		this.medianArray = medianArray;
	}

	/**
	 * @return the sizeOfArray
	 */
	public Integer getSizeOfArray() {
		return sizeOfArray;
	}

	/**
	 * @param sizeOfArray the sizeOfArray to set
	 */
	public void setSizeOfArray(Integer sizeOfArray) {
		this.sizeOfArray = sizeOfArray;
	}
	
}
