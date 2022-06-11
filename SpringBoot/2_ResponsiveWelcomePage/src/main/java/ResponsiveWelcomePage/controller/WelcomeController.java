package ResponsiveWelcomePage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class WelcomeController {
	
	private Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	
	
	
	@GetMapping("/welcome")
	public String welcome(Model model) {
		
		logger.info("Preview Welcome Page");
		
		return "welcome";
	}
}
