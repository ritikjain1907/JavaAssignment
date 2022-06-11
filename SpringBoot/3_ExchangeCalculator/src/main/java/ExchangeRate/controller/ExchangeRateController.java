package ExchangeRate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import ExchangeRate.dto.CurrencyPOJO;
import ExchangeRate.dto.ResponseExchangeRate;
import ExchangeRate.service.impl.ExchangeRateServiceDevImpl;
import ExchangeRate.util.ExchangeRateUtil;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ExchangeRateController {
	
	private Logger logger = LoggerFactory.getLogger(ExchangeRateController.class);
	
	@Autowired
	private ExchangeRateServiceDevImpl exchangeRateServiceDevImpl;
	
	@Autowired
	private ExchangeRateUtil exchangeRateUtil;
	
	@RequestMapping(value = "/calculator-dev", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<ResponseExchangeRate> getExchangeRateDev(@RequestParam(name="to", required=false, defaultValue="USD") String to) {
		
		logger.info("Fetching exchange rate from {} to {} ","EUR",to);
		
		ResponseExchangeRate responseExchangeRate = exchangeRateServiceDevImpl.exchangeRate();
		
		return ResponseEntity.ok().body(responseExchangeRate);
	}
	
	@RequestMapping(value = "/calculator-prod", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<String> getExchangeRateProd() {
		
		logger.info("Get Prod API called");
		
		ResponseEntity<String> exchangeRates = exchangeRateUtil.fetchExchangeRates();
		
		
		
		return exchangeRates;
//		ResponseEntity.ok().body(exchangeRates);
		
//		ResponseExchangeRate simpleDateFormat = coreServiceImpl.getTimeStamp();
//		
//		return ResponseEntity.ok().body(simpleDateFormat);
	}
}
