package mailchimp.attributes;

public class Authentication {

	private String secret;
	private String token;

	public Authentication(final String token, final String secret) {
        this.token = token;
        this.secret = secret;
    }
	
	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
