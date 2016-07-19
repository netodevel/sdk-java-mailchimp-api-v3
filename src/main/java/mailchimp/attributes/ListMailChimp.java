package mailchimp.attributes;

import java.util.List;

//TODO: alterar nomeclatura dos atributos
public class ListMailChimp {

	private String id;
	
	private String name;
	
	private Contact contact;
	
	private String permission_reminder;
	
	private List<ListMailChimp> lists;
	
	private boolean use_archive_bar;
	
	private CampaignDefaults campaign_defaults;
	
	private String notify_on_subscribe;
	
	private String notify_on_unsubscribe;
	
	private String date_created;
	
	private Integer list_rating;
	
	private Boolean email_type_option;
	
	private String subscribe_url_short;
	
	private String subscribe_url_long;
	
	private String beamer_address;
	
	private String visibility;
	
	private Stats stats;
	
	private List<Links> _links;
	
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

	public String getPermission_reminder() {
		return permission_reminder;
	}

	public void setPermission_reminder(String permission_reminder) {
		this.permission_reminder = permission_reminder;
	}

	public boolean isUse_archive_bar() {
		return use_archive_bar;
	}

	public void setUse_archive_bar(boolean use_archive_bar) {
		this.use_archive_bar = use_archive_bar;
	}

	public List<ListMailChimp> getLists() {
		return lists;
	}

	public void setLists(List<ListMailChimp> lists) {
		this.lists = lists;
	}

	public CampaignDefaults getCampaign_defaults() {
		return campaign_defaults;
	}

	public void setCampaign_defaults(CampaignDefaults campaign_defaults) {
		this.campaign_defaults = campaign_defaults;
	}

	public String getNotify_on_subscribe() {
		return notify_on_subscribe;
	}

	public void setNotify_on_subscribe(String notify_on_subscribe) {
		this.notify_on_subscribe = notify_on_subscribe;
	}

	public String getNotify_on_unsubscribe() {
		return notify_on_unsubscribe;
	}

	public void setNotify_on_unsubscribe(String notify_on_unsubscribe) {
		this.notify_on_unsubscribe = notify_on_unsubscribe;
	}

	public String getDate_created() {
		return date_created;
	}

	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}

	public Integer getList_rating() {
		return list_rating;
	}

	public void setList_rating(Integer list_rating) {
		this.list_rating = list_rating;
	}

	public Boolean getEmail_type_option() {
		return email_type_option;
	}

	public void setEmail_type_option(Boolean email_type_option) {
		this.email_type_option = email_type_option;
	}

	public String getSubscribe_url_short() {
		return subscribe_url_short;
	}

	public void setSubscribe_url_short(String subscribe_url_short) {
		this.subscribe_url_short = subscribe_url_short;
	}

	public String getSubscribe_url_long() {
		return subscribe_url_long;
	}

	public void setSubscribe_url_long(String subscribe_url_long) {
		this.subscribe_url_long = subscribe_url_long;
	}

	public String getBeamer_address() {
		return beamer_address;
	}

	public void setBeamer_address(String beamer_address) {
		this.beamer_address = beamer_address;
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

	public List<Links> get_links() {
		return _links;
	}

	public void set_links(List<Links> _links) {
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
		this.permission_reminder = permission_reminder;
		return this;
	}
	
	public ListMailChimp withCampaignDefault(final CampaignDefaults campaignDefaults) {
		this.campaign_defaults = campaignDefaults;
		return this;
	}
	
	public ListMailChimp withEmailTypeOption(final boolean emailTypeOption) {
		this.email_type_option = emailTypeOption;
		return this;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
}
