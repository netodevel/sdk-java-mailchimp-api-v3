package mailchimp.attributes;

public class Links {

	private String rel;
	
	private String href;
	
	private String method;
	
	private String targetSchema;
	
	private String schema;

	public String getRel() {
		return rel;
	}

	public void setRel(String rel) {
		this.rel = rel;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getTargetSchema() {
		return targetSchema;
	}

	public void setTargetSchema(String targetSchema) {
		this.targetSchema = targetSchema;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

}
