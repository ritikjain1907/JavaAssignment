package GetTimestamp.GetTimestamp.service;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import GetTimestamp.GetTimestamp.dto.ResponseTimestamp;

@Service
public class CoreServiceImpl implements ICoreService{
	
	private Logger logger = LoggerFactory.getLogger(CoreServiceImpl.class);
	
	/**
	 * @description 
	 * @param
	 * @return
	 */
	@Override
	public ResponseTimestamp getTimeStamp() {
		
		try {
			logger.info("CoreService Called");
			String date = new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
			String time = new SimpleDateFormat("HH:mm+ss").format(new java.util.Date());
			String timestamp = date + "T" + time +"Z";
			
			ResponseTimestamp responseTimestamp = new ResponseTimestamp();
			responseTimestamp.setTimestamp(timestamp);
			
			return responseTimestamp;
			
		} catch (Exception e) {
			logger.error("Exception : {}",e);
			throw e;
		}
	}
}
