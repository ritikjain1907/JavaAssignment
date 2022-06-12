/**
 * Digit Class
 */
package main.java.schema;

/**
 * @author Ritik
 *
 */
public class Schema {
	
	private double[] array;
	private Integer sizeOfArray;

	public Schema() {}

	/**
	 * @param array
	 * @param sizeOfArray
	 */
	public Schema(double[] array, Integer sizeOfArray) {
		super();
		this.array = array;
		this.sizeOfArray = sizeOfArray;
	}

	/**
	 * @return the Array
	 */
	public double[] getArray() {
		return array;
	}

	/**
	 * @param array the array to set
	 */
	public void setArray(double[] array) {
		this.array = array;
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
