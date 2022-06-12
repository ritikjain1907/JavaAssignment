/**
 * Res TemplateConfiguration
 */
package ExchangeRate.configuration;

/**
 * @author Ritik
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {
	
	/**
	 * 
	 * @return RestTemplate
	 * 
	 */
	@Bean(name="RestTemplate")
	public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
}
