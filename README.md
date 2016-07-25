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

##Install
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
		
		<dependency>
		    <groupId>com.github.NetoDevel</groupId>
		    <artifactId>mailchimp-java</artifactId>
		    <version>0.1</version>
		</dependency>





##Usage

Simple use to create a list.

		MailChimp mailChimp = new MailChimp(new Authentication(YOURUSER, YOURKEY), new ProductionCommunicator());
		ListMailChimp listMailChimp = new ListMailChimp().withEmailTypeOption(true).withName("Test Name")
		                                   .withPermissionReminder("Testing")
										   .withCampaignDefault(campaignDefaults).withContact(contact);
		listMailChimpToCreated = mailChimp.list().create(listMailChimp);

Create a member

		Member members = new Member();
		members.setEmailAddress("EMAIL_ADRESS");
		members.setStatus("subscribed");
		MergeFields mergeField = new MergeFields("FNAME", "LNAME");
		members.setMergeFields(mergeField);
	
		memberCreated = mailChimp.member().create(listMailChimpToCreated.getId(), members);


##Create by 

 	SED - 2016(http://www.sedengenharia.com.br/)


