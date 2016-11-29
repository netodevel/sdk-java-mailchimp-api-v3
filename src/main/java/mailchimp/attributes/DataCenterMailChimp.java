package mailchimp.attributes;

/**
 * 
 * Choose datacenter where has your key api ex: https://us13.api.mailchimp.com/3.0
 * @author Jose
 * @since 0.1.5
 */
public final class DataCenterMailChimp {

	private String numberDataCenter;

	/**
	 * 
	 * @param numberDataCenter number ex: 6 --> https://us6.api.mailchimp.com/3.0/
	 */
	public DataCenterMailChimp(String numberDataCenter) {
		this.numberDataCenter = numberDataCenter;
	}
	
	public String getUrl() {
		String url = "https://us" + this.numberDataCenter + ".api.mailchimp.com/3.0";
		return url;
	}
	
	public String getNumberDataCenter() {
		return numberDataCenter;
	}

	public void setNumberDataCenter(String numberDataCenter) {
		this.numberDataCenter = numberDataCenter;
	}
	
}
