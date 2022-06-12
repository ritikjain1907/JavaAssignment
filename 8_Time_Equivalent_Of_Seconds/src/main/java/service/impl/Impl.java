/**
 * Implementation Class
 */
package main.java.service.impl;

import main.java.schema.Schema;
import main.java.service.IService;

/**
 * @author Ritik
 *
 */
public class Impl implements IService {
	
	/**
	 * @description computeTimeEquivalent Method to compute Days, Hours, Minutes and Seconds
	 * @param digitObj
	 * @return digitCounter
	 */
	@Override
	public void computeTimeEquivalent(Schema schemaObj) {
		
		Integer seconds = schemaObj.getSeconds();
		
		schemaObj.setDays(seconds/(60*60*24));
		seconds = seconds%(60*60*24);
		schemaObj.setHours(seconds/(60*60));
		seconds = seconds%(60*60);
		schemaObj.setMinutes(seconds/60);
		seconds = seconds%60;
		schemaObj.setSeconds(seconds);
	}
}
