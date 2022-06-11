package GetTimestamp.GetTimestamp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.AbstractJsonParser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import GetTimestamp.GetTimestamp.dto.ResponseTimestamp;
import GetTimestamp.GetTimestamp.service.CoreServiceImpl;

@RestController
@Slf4j
public class TimestampController {
	
	private Logger logger = LoggerFactory.getLogger(TimestampController.class);
	
	@Autowired
	private CoreServiceImpl coreServiceImpl;
	
	@RequestMapping(value = "/timestamp", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<ResponseTimestamp> getTimeStamp() {
		
		logger.info("Get API called");
		
		ResponseTimestamp simpleDateFormat = coreServiceImpl.getTimeStamp();
		
		return ResponseEntity.ok().body(simpleDateFormat);
	}
}
