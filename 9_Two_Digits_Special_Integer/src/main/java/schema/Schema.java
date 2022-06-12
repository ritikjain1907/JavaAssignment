/**
 * Schema Class
 */
package main.java.schema;

/**
 * @author Ritik
 *
 */
public class Schema {
	
	private Integer number;

	public Schema() {}

	/**
	 * @param number
	 */
	public Schema(Integer number) {
		super();
		this.number = number;
	}

	/**
	 * @return the number
	 */
	public Integer getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(Integer number) {
		this.number = number;
	}
	

}
