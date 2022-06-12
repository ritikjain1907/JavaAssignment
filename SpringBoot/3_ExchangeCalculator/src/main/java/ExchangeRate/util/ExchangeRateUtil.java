/**
 * Exchange Rate Util
 */
package ExchangeRate.util;

/**
 * @author Ritik
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import ExchangeRate.dto.floatrates.Root;


@Component
public class ExchangeRateUtil {
	
	/**
	 * @return ResponseEntity<Root>
	 */
	@Autowired
	@Qualifier(value="RestTemplate")
	RestTemplate restTemplate;
	public ResponseEntity<Root> fetchExchangeRates() {
		
		return restTemplate.exchange("http://www.floatrates.com/daily/EUR.json", HttpMethod.GET, null, Root.class);
	}
	
}
