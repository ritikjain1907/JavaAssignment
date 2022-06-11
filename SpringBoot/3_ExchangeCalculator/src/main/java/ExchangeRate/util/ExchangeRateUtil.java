package ExchangeRate.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ExchangeRate.dto.CurrencyPOJO;


@Component
public class ExchangeRateUtil {
	
	@Autowired
	@Qualifier(value="RestTemplate")
	RestTemplate restTemplate;
	public ResponseEntity<String> fetchExchangeRates() {
		
		return restTemplate.exchange("http://www.floatrates.com/daily/EUR.json", HttpMethod.GET, null, String.class);
	}
	
}
