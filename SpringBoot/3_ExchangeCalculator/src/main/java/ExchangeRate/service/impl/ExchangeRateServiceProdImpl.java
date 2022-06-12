/**
 * Exchange Rate Service Prod Impl
 */
package ExchangeRate.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ExchangeRate.constants.ExchangeRateConstants;
import ExchangeRate.dto.ResponseExchangeRate;
import ExchangeRate.dto.floatrates.Root;
import ExchangeRate.service.IExchangeRateService;
import ExchangeRate.util.ExchangeRateUtil;

/**
 * @author ritik
 *
 */

@Service
public class ExchangeRateServiceProdImpl implements IExchangeRateService{
	
	private Logger logger = LoggerFactory.getLogger(ExchangeRateServiceProdImpl.class);
	
	@Autowired
	private ExchangeRateUtil exchangeRateUtil;
	
	/**
	 * @return ResponseEntity
	 */
	@Override
	public ResponseEntity<?> exchangeRate() {
		
		logger.info("Fetching Prod Exchange Rate");
		
		try {
			ResponseEntity<Root> exchangeRates = exchangeRateUtil.fetchExchangeRates();
			
			ResponseExchangeRate responseExchangeRate = new ResponseExchangeRate(exchangeRates.getBody().usd.rate);
			return ResponseEntity.ok().body(responseExchangeRate);
		} catch (RuntimeException e) {
			logger.error("Exception : {}",e);
			return ResponseEntity.internalServerError().body("Exception occured in fetching daily exchange rate");
		}
		
	}
}
