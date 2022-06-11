package ExchangeRate.dto;


public class CurrencyPOJO {
	
	public String curreny;
	public ExchangeRatePOJO exchangeRatePOJO;
	/**
	 * @return the curreny
	 */
	public String getCurreny() {
		return curreny;
	}
	/**
	 * @param curreny the curreny to set
	 */
	public void setCurreny(String curreny) {
		this.curreny = curreny;
	}
	/**
	 * @return the exchangeRatePOJO
	 */
	public ExchangeRatePOJO getExchangeRatePOJO() {
		return exchangeRatePOJO;
	}
	/**
	 * @param exchangeRatePOJO the exchangeRatePOJO to set
	 */
	public void setExchangeRatePOJO(ExchangeRatePOJO exchangeRatePOJO) {
		this.exchangeRatePOJO = exchangeRatePOJO;
	}
}

