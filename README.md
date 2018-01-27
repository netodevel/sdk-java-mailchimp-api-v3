[![](https://jitpack.io/v/NetoDevel/mailchimp-java.svg)](https://jitpack.io/#NetoDevel/mailchimp-java)


# SDK Java MailChimp API V3 
MailChimp API v3.0 

#### About
It is a library for consuming the api v3 from mailchimp built in java. This library makes it easy to integrate with java projects.

### Alert
In development. Help us! Make a fork!

## Features implemented
  * List
  * Members

## TODO

[Documentation](http://developer.mailchimp.com/documentation/mailchimp/reference/overview/)
	
## Install
```xml
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>

	<dependency>
	    <groupId>com.github.NetoDevel</groupId>
	    <artifactId>mailchimp-java</artifactId>
	    <version>0.1.5</version>
	</dependency>
```


## Usage

Simple use to create a list.
```java
	MailChimp mailChimp = new MailChimp(new Authentication(YOURUSER, YOURKEY), 
					new ProductionCommunicator(),
					new DataCenterMailChimp("13"));
	ListMailChimp listMailChimp = new ListMailChimp().withEmailTypeOption(true).withName("Test Name")
				   	.withPermissionReminder("Testing")
				   	.withCampaignDefault(campaignDefaults).withContact(contact);
	listMailChimpToCreated = mailChimp.list().create(listMailChimp);

```
Create a member
```java
	Member members = new Member();
	members.setEmailAddress("EMAIL_ADRESS");
	members.setStatus("subscribed");
	MergeFields mergeField = new MergeFields("FNAME", "LNAME");
	members.setMergeFields(mergeField);

	memberCreated = mailChimp.member().create(listMailChimpToCreated.getId(), members);
```

## Create by 

[SED](http://www.sedengenharia.com.br/)	


### License

	The MIT License (MIT)

	Copyright (c) 2017 SED

	Permission is hereby granted, free of charge, to any person obtaining a 
	copy of this software and associated documentation files (the "Software"), 
	to deal in the Software without restriction, including without limitation 
	the rights to use, copy, modify, merge, publish, distribute, sublicense, 
	and/or sell copies of the Software, and to permit persons to whom the Software is 
	furnished to do so, subject to the following conditions:

	The above copyright notice and this permission notice shall be included 
	in all copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
	INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR 
	PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE 
	FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
	ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

