package ExchangeRate.dto;

public class ExchangeRatePOJO {

	    public String code;
	    public String alphaCode;
	    public String numericCode;
	    public String name;
	    public double rate;
	    public String date;
	    public double inverseRate;
		
	    /**
		 * @return the code
		 */
		public String getCode() {
			return code;
		}
		/**
		 * @param code the code to set
		 */
		public void setCode(String code) {
			this.code = code;
		}
		/**
		 * @return the alphaCode
		 */
		public String getAlphaCode() {
			return alphaCode;
		}
		/**
		 * @param alphaCode the alphaCode to set
		 */
		public void setAlphaCode(String alphaCode) {
			this.alphaCode = alphaCode;
		}
		/**
		 * @return the numericCode
		 */
		public String getNumericCode() {
			return numericCode;
		}
		/**
		 * @param numericCode the numericCode to set
		 */
		public void setNumericCode(String numericCode) {
			this.numericCode = numericCode;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the rate
		 */
		public double getRate() {
			return rate;
		}
		/**
		 * @param rate the rate to set
		 */
		public void setRate(double rate) {
			this.rate = rate;
		}
		/**
		 * @return the date
		 */
		public String getDate() {
			return date;
		}
		/**
		 * @param date the date to set
		 */
		public void setDate(String date) {
			this.date = date;
		}
		/**
		 * @return the inverseRate
		 */
		public double getInverseRate() {
			return inverseRate;
		}
		/**
		 * @param inverseRate the inverseRate to set
		 */
		public void setInverseRate(double inverseRate) {
			this.inverseRate = inverseRate;
		}
}