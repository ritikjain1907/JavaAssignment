/**
 * Exchange Rate Service Dev Impl
 */
package ExchangeRate.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ExchangeRate.constants.ExchangeRateConstants;
import ExchangeRate.dto.ResponseExchangeRate;
import ExchangeRate.service.IExchangeRateService;

/**
 * @author ritik
 *
 */

@Service
public class ExchangeRateServiceDevImpl implements IExchangeRateService{
	
	private Logger logger = LoggerFactory.getLogger(ExchangeRateServiceDevImpl.class);
	
	/**
	 * @return ResponseEntity<ResponseExchangeRate>
	 */
	@Override
	public ResponseEntity<ResponseExchangeRate> exchangeRate() {
		
		logger.info("Fetching Dev Exchange Rate");
		
		ResponseExchangeRate responseExchangeRate = new ResponseExchangeRate(ExchangeRateConstants.ExchangeEURtoUSD);
		return ResponseEntity.ok().body(responseExchangeRate);
	}
	
	

}
