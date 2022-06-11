package ExchangeRate.dto;

import lombok.Data;

@Data
public class ResponseExchangeRate {
	
	private float exchangeRate;
	
	public ResponseExchangeRate() {}
	
	public ResponseExchangeRate(float exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	/**
	 * @return the exchangeRate
	 */
	public float getExchangeRate() {
		return exchangeRate;
	}

	/**
	 * @param exchangeRate the exchangeRate to set
	 */
	public void setExchangeRate(float exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
}