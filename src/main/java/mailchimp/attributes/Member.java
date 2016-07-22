package mailchimp.attributes;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Member {

    private String id;
    private String emailAddress;
    private String uniqueEmailId;
    private String emailType;
    private String status;
    private String statusIfNew;
    
    @SerializedName("merge_fields")
    private MergeFields mergeFields;
    
    @SerializedName("interests")
    private Interests interests; //TODO: não está vindo carregado
    
    private Stats stats;
    private String ipSignup;
    private String timestampSignup;
    private String ipOpt;
    private String timestampOpt;
    private Integer memberRating;
    private String lastChanged;
    private String language;
    private Boolean vip;
    private String emailClient;
    private Location location;
    private String listId;
    private List<Link> links = new ArrayList<Link>();
    private List<Member> members;
    private Integer totalItems;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Member() {
    }

    /**
     * 
     * @param lastChanged
     * @param location
     * @param status
     * @param interests
     * @param stats
     * @param ipOpt
     * @param memberRating
     * @param emailAddress
     * @param links
     * @param ipSignup
     * @param timestampOpt
     * @param id
     * @param vip
     * @param statusIfNew
     * @param emailType
     * @param mergeFields
     * @param emailClient
     * @param listId
     * @param timestampSignup
     * @param language
     * @param uniqueEmailId
     */
    public Member(String id, String emailAddress, String uniqueEmailId, String emailType, String status, String statusIfNew, MergeFields mergeFields, Interests interests, Stats stats, String ipSignup, String timestampSignup, String ipOpt, String timestampOpt, Integer memberRating, String lastChanged, String language, Boolean vip, String emailClient, Location location, String listId, List<Link> links) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.uniqueEmailId = uniqueEmailId;
        this.emailType = emailType;
        this.status = status;
        this.statusIfNew = statusIfNew;
        this.mergeFields = mergeFields;
        this.interests = interests;
        this.stats = stats;
        this.ipSignup = ipSignup;
        this.timestampSignup = timestampSignup;
        this.ipOpt = ipOpt;
        this.timestampOpt = timestampOpt;
        this.memberRating = memberRating;
        this.lastChanged = lastChanged;
        this.language = language;
        this.vip = vip;
        this.emailClient = emailClient;
        this.location = location;
        this.listId = listId;
        this.links = links;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public Member withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * 
     * @param emailAddress
     *     The email_address
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Member withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * 
     * @return
     *     The uniqueEmailId
     */
    public String getUniqueEmailId() {
        return uniqueEmailId;
    }

    /**
     * 
     * @param uniqueEmailId
     *     The unique_email_id
     */
    public void setUniqueEmailId(String uniqueEmailId) {
        this.uniqueEmailId = uniqueEmailId;
    }

    public Member withUniqueEmailId(String uniqueEmailId) {
        this.uniqueEmailId = uniqueEmailId;
        return this;
    }

    /**
     * 
     * @return
     *     The emailType
     */
    public String getEmailType() {
        return emailType;
    }

    /**
     * 
     * @param emailType
     *     The email_type
     */
    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    public Member withEmailType(String emailType) {
        this.emailType = emailType;
        return this;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public Member withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 
     * @return
     *     The statusIfNew
     */
    public String getStatusIfNew() {
        return statusIfNew;
    }

    /**
     * 
     * @param statusIfNew
     *     The status_if_new
     */
    public void setStatusIfNew(String statusIfNew) {
        this.statusIfNew = statusIfNew;
    }

    public Member withStatusIfNew(String statusIfNew) {
        this.statusIfNew = statusIfNew;
        return this;
    }

    /**
     * 
     * @return
     *     The mergeFields
     */
    public MergeFields getMergeFields() {
        return mergeFields;
    }

    /**
     * 
     * @param mergeFields
     *     The merge_fields
     */
    public void setMergeFields(MergeFields mergeFields) {
        this.mergeFields = mergeFields;
    }

    public Member withMergeFields(MergeFields mergeFields) {
        this.mergeFields = mergeFields;
        return this;
    }

    /**
     * 
     * @return
     *     The interests
     */
    public Interests getInterests() {
        return interests;
    }

    /**
     * 
     * @param interests
     *     The interests
     */
    public void setInterests(Interests interests) {
        this.interests = interests;
    }

    public Member withInterests(Interests interests) {
        this.interests = interests;
        return this;
    }

    /**
     * 
     * @return
     *     The stats
     */
    public Stats getStats() {
        return stats;
    }

    /**
     * 
     * @param stats
     *     The stats
     */
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Member withStats(Stats stats) {
        this.stats = stats;
        return this;
    }

    /**
     * 
     * @return
     *     The ipSignup
     */
    public String getIpSignup() {
        return ipSignup;
    }

    /**
     * 
     * @param ipSignup
     *     The ip_signup
     */
    public void setIpSignup(String ipSignup) {
        this.ipSignup = ipSignup;
    }

    public Member withIpSignup(String ipSignup) {
        this.ipSignup = ipSignup;
        return this;
    }

    /**
     * 
     * @return
     *     The timestampSignup
     */
    public String getTimestampSignup() {
        return timestampSignup;
    }

    /**
     * 
     * @param timestampSignup
     *     The timestamp_signup
     */
    public void setTimestampSignup(String timestampSignup) {
        this.timestampSignup = timestampSignup;
    }

    public Member withTimestampSignup(String timestampSignup) {
        this.timestampSignup = timestampSignup;
        return this;
    }

    /**
     * 
     * @return
     *     The ipOpt
     */
    public String getIpOpt() {
        return ipOpt;
    }

    /**
     * 
     * @param ipOpt
     *     The ip_opt
     */
    public void setIpOpt(String ipOpt) {
        this.ipOpt = ipOpt;
    }

    public Member withIpOpt(String ipOpt) {
        this.ipOpt = ipOpt;
        return this;
    }

    /**
     * 
     * @return
     *     The timestampOpt
     */
    public String getTimestampOpt() {
        return timestampOpt;
    }

    /**
     * 
     * @param timestampOpt
     *     The timestamp_opt
     */
    public void setTimestampOpt(String timestampOpt) {
        this.timestampOpt = timestampOpt;
    }

    public Member withTimestampOpt(String timestampOpt) {
        this.timestampOpt = timestampOpt;
        return this;
    }

    /**
     * 
     * @return
     *     The memberRating
     */
    public Integer getMemberRating() {
        return memberRating;
    }

    /**
     * 
     * @param memberRating
     *     The member_rating
     */
    public void setMemberRating(Integer memberRating) {
        this.memberRating = memberRating;
    }

    public Member withMemberRating(Integer memberRating) {
        this.memberRating = memberRating;
        return this;
    }

    /**
     * 
     * @return
     *     The lastChanged
     */
    public String getLastChanged() {
        return lastChanged;
    }

    /**
     * 
     * @param lastChanged
     *     The last_changed
     */
    public void setLastChanged(String lastChanged) {
        this.lastChanged = lastChanged;
    }

    public Member withLastChanged(String lastChanged) {
        this.lastChanged = lastChanged;
        return this;
    }

    /**
     * 
     * @return
     *     The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    public Member withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 
     * @return
     *     The vip
     */
    public Boolean getVip() {
        return vip;
    }

    /**
     * 
     * @param vip
     *     The vip
     */
    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public Member withVip(Boolean vip) {
        this.vip = vip;
        return this;
    }

    /**
     * 
     * @return
     *     The emailClient
     */
    public String getEmailClient() {
        return emailClient;
    }

    /**
     * 
     * @param emailClient
     *     The email_client
     */
    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public Member withEmailClient(String emailClient) {
        this.emailClient = emailClient;
        return this;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    public Member withLocation(Location location) {
        this.location = location;
        return this;
    }

    /**
     * 
     * @return
     *     The listId
     */
    public String getListId() {
        return listId;
    }

    /**
     * 
     * @param listId
     *     The list_id
     */
    public void setListId(String listId) {
        this.listId = listId;
    }

    public Member withListId(String listId) {
        this.listId = listId;
        return this;
    }

    /**
     * 
     * @return
     *     The links
     */
    public List<Link> getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The _links
     */
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public Member withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public Integer getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((emailAddress == null) ? 0 : emailAddress.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		return true;
	}

}
