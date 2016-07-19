package mailchimp.attributes;

import java.util.List;

//TODO: alterar nomeclatura dos atributos
public class ListMailChimp {

	private String id;
	private String name;
	private Contact contact;
	private String permissionReminder;
	private List<ListMailChimp> lists;
	private boolean use_archive_bar;
	private CampaignDefaults campaignDefaults;
	private String notifyOnSubscribe;
	private String notifyOnUnsubscribe;
	private String dateCreated;
	private Integer listRating;
	private Boolean emailTypeOption;
	private String subscribeUrlShort;
	private String subscribeUrlLong;
	private String beamerAddress;
	private String visibility;
	private Stats stats;
	private List<Link> _links;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPermissionReminder() {
		return permissionReminder;
	}

	public void setPermissionReminder(String permissionReminder) {
		this.permissionReminder = permissionReminder;
	}

	public List<ListMailChimp> getLists() {
		return lists;
	}

	public void setLists(List<ListMailChimp> lists) {
		this.lists = lists;
	}

	public boolean isUse_archive_bar() {
		return use_archive_bar;
	}

	public void setUse_archive_bar(boolean use_archive_bar) {
		this.use_archive_bar = use_archive_bar;
	}

	public CampaignDefaults getCampaignDefaults() {
		return campaignDefaults;
	}

	public void setCampaignDefaults(CampaignDefaults campaignDefaults) {
		this.campaignDefaults = campaignDefaults;
	}

	public String getNotifyOnSubscribe() {
		return notifyOnSubscribe;
	}

	public void setNotifyOnSubscribe(String notifyOnSubscribe) {
		this.notifyOnSubscribe = notifyOnSubscribe;
	}

	public String getNotifyOnUnsubscribe() {
		return notifyOnUnsubscribe;
	}

	public void setNotifyOnUnsubscribe(String notifyOnUnsubscribe) {
		this.notifyOnUnsubscribe = notifyOnUnsubscribe;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Integer getListRating() {
		return listRating;
	}

	public void setListRating(Integer listRating) {
		this.listRating = listRating;
	}

	public Boolean getEmailTypeOption() {
		return emailTypeOption;
	}

	public void setEmailTypeOption(Boolean emailTypeOption) {
		this.emailTypeOption = emailTypeOption;
	}

	public String getSubscribeUrlShort() {
		return subscribeUrlShort;
	}

	public void setSubscribeUrlShort(String subscribeUrlShort) {
		this.subscribeUrlShort = subscribeUrlShort;
	}

	public String getSubscribeUrlLong() {
		return subscribeUrlLong;
	}

	public void setSubscribeUrlLong(String subscribeUrlLong) {
		this.subscribeUrlLong = subscribeUrlLong;
	}

	public String getBeamerAddress() {
		return beamerAddress;
	}

	public void setBeamerAddress(String beamerAddress) {
		this.beamerAddress = beamerAddress;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}

	public List<Link> get_links() {
		return _links;
	}

	public void set_links(List<Link> _links) {
		this._links = _links;
	}
	
	public ListMailChimp withName(final String name) {
		this.name = name;
		return this;
	}
	
	public ListMailChimp withContact(final Contact contact) {
		this.contact = contact;
		return this;
	}
	
	public ListMailChimp withPermissionReminder(final String permission_reminder) {
		this.permissionReminder = permission_reminder;
		return this;
	}
	
	public ListMailChimp withCampaignDefault(final CampaignDefaults campaignDefaults) {
		this.campaignDefaults = campaignDefaults;
		return this;
	}
	
	public ListMailChimp withEmailTypeOption(final boolean emailTypeOption) {
		this.emailTypeOption = emailTypeOption;
		return this;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
}
