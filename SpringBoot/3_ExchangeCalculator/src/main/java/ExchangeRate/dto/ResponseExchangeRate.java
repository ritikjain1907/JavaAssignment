/**
 * Response Exchange Rate
 */

package ExchangeRate.dto;


/**
 * @author Ritik
 */

import lombok.Data;

@Data
public class ResponseExchangeRate {
	
	private double exchangeRate;
	
	public ResponseExchangeRate() {}
	
	public ResponseExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	/**
	 * @return the exchangeRate
	 */
	public double getExchangeRate() {
		return exchangeRate;
	}

	/**
	 * @param exchangeRate the exchangeRate to set
	 */
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
}