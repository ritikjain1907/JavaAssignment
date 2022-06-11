/**
 * 
 */
package ExchangeRate.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ExchangeRate.constants.ExchangeRateConstants;
import ExchangeRate.dto.ResponseExchangeRate;
import ExchangeRate.service.IExchangeRateService;

/**
 * @author ritik
 *
 */

@Service
public class ExchangeRateServiceProdImpl implements IExchangeRateService{
	
	private Logger logger = LoggerFactory.getLogger(ExchangeRateServiceProdImpl.class);
	
	@Override
	public ResponseExchangeRate exchangeRate() {
		
		logger.info("Fetching Prod Exchange Rate");
		
		
		
		
		return new ResponseExchangeRate(ExchangeRateConstants.ExchangeEURtoUSD);
	}
}
