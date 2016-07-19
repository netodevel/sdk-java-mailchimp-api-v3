package mailchimp.exception;

import java.util.List;

import mailchimp.attributes.Alerts;
import mailchimp.attributes.Errors;


public class ApiResponseError {
	private List<Alerts> alerts;
	private List<Errors> errors;
	private String message;

	public List<Alerts> getAlerts() {
		return alerts;
	}

	public List<Errors> getErrors() {
		return errors;
	}

	public String getMessage() {
		return message;
	}
	
}
