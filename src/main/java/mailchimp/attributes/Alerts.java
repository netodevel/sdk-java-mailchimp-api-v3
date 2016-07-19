package mailchimp.attributes;

public class Alerts {
	
	private String description;
	private String code;

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Alerts [description=" + description + ", code=" + code + "]";
	}

}
