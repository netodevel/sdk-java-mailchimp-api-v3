package mailchimp.attributes;

//TODO: alterar nomeclatura dos atributos
public class Stats {

	private Integer member_count;
	
	private Integer unsubscribe_count;
	
	private Integer cleaned_count;
	
	private Integer member_count_since_send;
	
	private Integer unsubscribe_count_since_send;
	
	private Integer campaign_count;
	
	private String campaign_last_sent;
	
	private Integer merge_field_count;
	
	private Number avg_sub_rate;
	
	private Number avg_unsub_rate;
	
	private Number open_rate;
	
	private Number click_rate;
	
	private String last_sub_date;
	
	private String last_unsub_date;

	public Integer getMember_count() {
		return member_count;
	}

	public void setMember_count(Integer member_count) {
		this.member_count = member_count;
	}

	public Integer getUnsubscribe_count() {
		return unsubscribe_count;
	}

	public void setUnsubscribe_count(Integer unsubscribe_count) {
		this.unsubscribe_count = unsubscribe_count;
	}

	public Integer getCleaned_count() {
		return cleaned_count;
	}

	public void setCleaned_count(Integer cleaned_count) {
		this.cleaned_count = cleaned_count;
	}

	public Integer getMember_count_since_send() {
		return member_count_since_send;
	}

	public void setMember_count_since_send(Integer member_count_since_send) {
		this.member_count_since_send = member_count_since_send;
	}

	public Integer getUnsubscribe_count_since_send() {
		return unsubscribe_count_since_send;
	}

	public void setUnsubscribe_count_since_send(Integer unsubscribe_count_since_send) {
		this.unsubscribe_count_since_send = unsubscribe_count_since_send;
	}

	public Integer getCampaign_count() {
		return campaign_count;
	}

	public void setCampaign_count(Integer campaign_count) {
		this.campaign_count = campaign_count;
	}

	public String getCampaign_last_sent() {
		return campaign_last_sent;
	}

	public void setCampaign_last_sent(String campaign_last_sent) {
		this.campaign_last_sent = campaign_last_sent;
	}

	public Integer getMerge_field_count() {
		return merge_field_count;
	}

	public void setMerge_field_count(Integer merge_field_count) {
		this.merge_field_count = merge_field_count;
	}

	public Number getAvg_sub_rate() {
		return avg_sub_rate;
	}

	public void setAvg_sub_rate(Number avg_sub_rate) {
		this.avg_sub_rate = avg_sub_rate;
	}

	public Number getAvg_unsub_rate() {
		return avg_unsub_rate;
	}

	public void setAvg_unsub_rate(Number avg_unsub_rate) {
		this.avg_unsub_rate = avg_unsub_rate;
	}

	public Number getOpen_rate() {
		return open_rate;
	}

	public void setOpen_rate(Number open_rate) {
		this.open_rate = open_rate;
	}

	public Number getClick_rate() {
		return click_rate;
	}

	public void setClick_rate(Number click_rate) {
		this.click_rate = click_rate;
	}

	public String getLast_sub_date() {
		return last_sub_date;
	}

	public void setLast_sub_date(String last_sub_date) {
		this.last_sub_date = last_sub_date;
	}

	public String getLast_unsub_date() {
		return last_unsub_date;
	}

	public void setLast_unsub_date(String last_unsub_date) {
		this.last_unsub_date = last_unsub_date;
	}
	
}
