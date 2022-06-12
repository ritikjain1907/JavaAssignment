/**
 * Digit Class
 */
package main.java.schema;

/**
 * @author Ritik
 *
 */
public class Schema {
	
	private String[] stringArray;
	private Integer sizeOfArray;

	public Schema() {}

	/**
	 * @param stringArray
	 * @param sizeOfArray
	 */
	public Schema(String[] stringArray, Integer sizeOfArray) {
		this.stringArray = stringArray;
		this.sizeOfArray = sizeOfArray;
	}

	/**
	 * @return the stringArray
	 */
	public String[] getStringArray() {
		return stringArray;
	}

	/**
	 * @param stringArray the stringArray to set
	 */
	public void setStringArray(String[] stringArray) {
		this.stringArray = stringArray;
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
