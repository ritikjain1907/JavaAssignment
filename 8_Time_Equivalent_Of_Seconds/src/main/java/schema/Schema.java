/**
 * Schema Class
 */
package main.java.schema;

/**
 * @author Ritik
 *
 */
public class Schema {
	
	private Integer days;
	private Integer hours;
	private Integer minutes;
	private Integer seconds;

	public Schema() {}

	/**
	 * @param days
	 * @param hours
	 * @param minutes
	 * @param seconds
	 */
	public Schema(Integer seconds) {
		super();
		this.days = 0;
		this.hours = 0;
		this.minutes = 0;
		this.seconds = seconds;
	}

	/**
	 * @return the days
	 */
	public Integer getDays() {
		return days;
	}

	/**
	 * @param days the days to set
	 */
	public void setDays(Integer days) {
		this.days = days;
	}

	/**
	 * @return the hours
	 */
	public Integer getHours() {
		return hours;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(Integer hours) {
		this.hours = hours;
	}

	/**
	 * @return the minutes
	 */
	public Integer getMinutes() {
		return minutes;
	}

	/**
	 * @param minutes the minutes to set
	 */
	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}

	/**
	 * @return the seconds
	 */
	public Integer getSeconds() {
		return seconds;
	}

	/**
	 * @param seconds the seconds to set
	 */
	public void setSeconds(Integer seconds) {
		this.seconds = seconds;
	}

}
