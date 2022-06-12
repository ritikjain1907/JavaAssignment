/**
 * Exchange Rate Controller
 */
package ExchangeRate.controller;

/**
 * @author Ritik
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ExchangeRate.dto.ResponseExchangeRate;
import ExchangeRate.service.impl.ExchangeRateServiceDevImpl;
import ExchangeRate.service.impl.ExchangeRateServiceProdImpl;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ExchangeRateController {
	
	private Logger logger = LoggerFactory.getLogger(ExchangeRateController.class);
	
	@Autowired
	private ExchangeRateServiceDevImpl exchangeRateServiceDevImpl;
	
	@Autowired
	private ExchangeRateServiceProdImpl exchangeRateServiceProdImpl;
	
	/**
	 * 
	 * @return ResponseEntity
	 */
	@RequestMapping(value = "/exchange-rate-dev", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<ResponseExchangeRate> getExchangeRateDev() {
		
		logger.info("Fetching fixed exchange rate from {} to {} ","EUR","USD");
		
		return exchangeRateServiceDevImpl.exchangeRate();
		
	}
	
	/**
	 * 
	 * @return ResponseEntity
	 */
	
	@RequestMapping(value = "/exchange-rate-prod", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<?> getExchangeRateProd() {
		
		logger.info("Fetching daily exchange rate from {} to {} ","EUR","USD");
		
		return exchangeRateServiceProdImpl.exchangeRate();
				
	}
}
