package GetTimestamp.GetTimestamp.dto;

import lombok.Data;

@Data
public class ResponseTimestamp {
	
	private String timestamp;
	
	public ResponseTimestamp() {}
	
	public ResponseTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}
