[![](https://jitpack.io/v/NetoDevel/mailchimp-java.svg)](https://jitpack.io/#NetoDevel/mailchimp-java)

# Mailchimp-java
MailChimp API v3.0 wrapper for Java

#### About
is a library in MailChimp development built in Java to consume the api 3.0 MailChimp

##Features implemented
  * List
  * Members

##TODO:
<b>Documentation:</b> http://developer.mailchimp.com/documentation/mailchimp/reference/overview/


##Examples:


###Create List
<pre>
MailChimp mailChimp = new MailChimp(new Authentication(USER, KEY), new ProductionCommunicator());

ListMailChimp listMailChimp = new ListMailChimp().withEmailTypeOption(true).
  withName("Test Name").withPermissionReminder("Testing").
  withCampaignDefault(campaignDefaults).withContact(contact);

listMailChimpToCreated = mailChimp.list().create(listMailChimp);
</pre>


###Create Member
<pre>
Member members = new Member();
members.setEmailAddress("EMAIL_ADRESS");
members.setStatus("subscribed");
MergeFields mergeField = new MergeFields("FNAME", "LNAME");
members.setMergeFields(mergeField);

memberCreated = mailChimp.member().create(listMailChimpToCreated.getId(), members);

</pre>
