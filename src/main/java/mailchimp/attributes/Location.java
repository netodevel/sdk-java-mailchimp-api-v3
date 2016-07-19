package mailchimp.attributes;


public class Location {

    private Number latitude;
    private Number longitude;
    private Integer gmtoff;
    private Integer dstoff;
    private String countryCode;
    private String timezone;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Location() {
    }

    /**
     * 
     * @param gmtoff
     * @param timezone
     * @param countryCode
     * @param longitude
     * @param latitude
     * @param dstoff
     */
    public Location(Integer latitude, Integer longitude, Integer gmtoff, Integer dstoff, String countryCode, String timezone) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.gmtoff = gmtoff;
        this.dstoff = dstoff;
        this.countryCode = countryCode;
        this.timezone = timezone;
    }

    public Number getLatitude() {
		return latitude;
	}

	public void setLatitude(Number latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(Number longitude) {
		this.longitude = longitude;
	}

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Location withLatitude(Integer latitude) {
        this.latitude = latitude;
        return this;
    }

    public Number getLongitude() {
		return longitude;
	}

	public Location withLongitude(Integer longitude) {
        this.longitude = longitude;
        return this;
    }

    public Integer getGmtoff() {
        return gmtoff;
    }

    public void setGmtoff(Integer gmtoff) {
        this.gmtoff = gmtoff;
    }

    public Location withGmtoff(Integer gmtoff) {
        this.gmtoff = gmtoff;
        return this;
    }
 
    public Integer getDstoff() {
        return dstoff;
    }
   
    public void setDstoff(Integer dstoff) {
        this.dstoff = dstoff;
    }

    public Location withDstoff(Integer dstoff) {
        this.dstoff = dstoff;
        return this;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Location withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Location withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
}
