package mailchimp.attributes;

public class Stats {

	private Integer memberCount;
	private Integer unsubscribeCount;
	private Integer cleanedCount;
	private Integer memberCountSinceSend;
	private Integer unsubscribeCountSinceSend;
	private Integer campaignCount;
	private String campaignLastSent;
	private Integer mergeFieldCount;
	private Number avgSubRate;
	private Number avgUnsubRate;
	private Number openRate;
	private Number clickRate;
	private String lastSubDate;
	private String lastUnsubDate;
	
	public Integer getMemberCount() {
		return memberCount;
	}
	public void setMemberCount(Integer memberCount) {
		this.memberCount = memberCount;
	}
	public Integer getUnsubscribeCount() {
		return unsubscribeCount;
	}
	public void setUnsubscribeCount(Integer unsubscribeCount) {
		this.unsubscribeCount = unsubscribeCount;
	}
	public Integer getCleanedCount() {
		return cleanedCount;
	}
	public void setCleanedCount(Integer cleanedCount) {
		this.cleanedCount = cleanedCount;
	}
	public Integer getMemberCountSinceSend() {
		return memberCountSinceSend;
	}
	public void setMemberCountSinceSend(Integer memberCountSinceSend) {
		this.memberCountSinceSend = memberCountSinceSend;
	}
	public Integer getUnsubscribeCountSinceSend() {
		return unsubscribeCountSinceSend;
	}
	public void setUnsubscribeCountSinceSend(Integer unsubscribeCountSinceSend) {
		this.unsubscribeCountSinceSend = unsubscribeCountSinceSend;
	}
	public Integer getCampaignCount() {
		return campaignCount;
	}
	public void setCampaignCount(Integer campaignCount) {
		this.campaignCount = campaignCount;
	}
	public String getCampaignLastSent() {
		return campaignLastSent;
	}
	public void setCampaignLastSent(String campaignLastSent) {
		this.campaignLastSent = campaignLastSent;
	}
	public Integer getMergeFieldCount() {
		return mergeFieldCount;
	}
	public void setMergeFieldCount(Integer mergeFieldCount) {
		this.mergeFieldCount = mergeFieldCount;
	}
	public Number getAvgSubRate() {
		return avgSubRate;
	}
	public void setAvgSubRate(Number avgSubRate) {
		this.avgSubRate = avgSubRate;
	}
	public Number getAvgUnsubRate() {
		return avgUnsubRate;
	}
	public void setAvgUnsubRate(Number avgUnsubRate) {
		this.avgUnsubRate = avgUnsubRate;
	}
	public Number getOpenRate() {
		return openRate;
	}
	public void setOpenRate(Number openRate) {
		this.openRate = openRate;
	}
	public Number getClickRate() {
		return clickRate;
	}
	public void setClickRate(Number clickRate) {
		this.clickRate = clickRate;
	}
	public String getLastSubDate() {
		return lastSubDate;
	}
	public void setLastSubDate(String lastSubDate) {
		this.lastSubDate = lastSubDate;
	}
	public String getLastUnsubDate() {
		return lastUnsubDate;
	}
	public void setLastUnsubDate(String lastUnsubDate) {
		this.lastUnsubDate = lastUnsubDate;
	}
	
}
