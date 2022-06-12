/**
 * IExchange Rate Service Interface
 */
package ExchangeRate.service;

/**
 * @author Ritik
 */

import org.springframework.http.ResponseEntity;

public interface IExchangeRateService {
	/**
	 * 
	 * @return ResponseEntity
	 */
	public ResponseEntity<?> exchangeRate();
}