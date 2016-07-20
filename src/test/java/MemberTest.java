import static org.junit.Assert.assertEquals;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import mailchimp.MailChimp;
import mailchimp.attributes.Authentication;
import mailchimp.attributes.CampaignDefaults;
import mailchimp.attributes.Contact;
import mailchimp.attributes.ListMailChimp;
import mailchimp.attributes.Member;
import mailchimp.attributes.MergeFields;
import mailchimp.communicators.ProductionCommunicator;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MemberTest {

	private static final String USER = "";
	private static final String KEY = "";

	private static ListMailChimp listMailChimpToCreated;
	private static Member memberCreated;
	private static MailChimp mailChimp = new MailChimp(new Authentication(USER, KEY), new ProductionCommunicator());
	
	@BeforeClass
	public static void init() {
		// Create List
		CampaignDefaults campaignDefaults = new CampaignDefaults();
		campaignDefaults.setFromEmail("josevieira.dev@gmail.com");
		campaignDefaults.setFromName("Neto");
		campaignDefaults.setLanguage("BR");
		campaignDefaults.setSubject("E-mail Test");
		Contact contact = new Contact();
		contact.setAddress1("rua");
		contact.setAddress2("J");
		contact.setCity("Maceió");
		contact.setCompany("SED");
		contact.setCountry("Brazil");
		contact.setFone("3333-3333");
		contact.setState("AL");
		contact.setZip("5700000");
		ListMailChimp listMailChimp = new ListMailChimp().withEmailTypeOption(true).withName("List of Tests!").withPermissionReminder("Testing").withCampaignDefault(campaignDefaults).withContact(contact);
		listMailChimpToCreated = mailChimp.list().create(listMailChimp);
		
		// Create Member
		Member members = new Member();
		members.setEmailAddress("josevieira.dev@gmail.com");
		members.setStatus("subscribed");
		MergeFields mergeField = new MergeFields("José", "neto");
		members.setMergeFields(mergeField);
		memberCreated = mailChimp.member().create(listMailChimpToCreated.getId(), members);
	}
	

	@Test
	public void testReadAllMembersNotBeIsEmpty() {
		String idList = listMailChimpToCreated.getId();
		Integer count = mailChimp.member().countMembersList(idList);
		List<Member> listMember = mailChimp.member().list(idList, count);
		assertEquals(false, listMember.isEmpty());
	}
	
	@Test
	public void testReadOneMemberNotBeNull() throws NoSuchAlgorithmException {
		String idList = listMailChimpToCreated.getId(); 
		String email = memberCreated.getEmailAddress();
		Member member = mailChimp.member().readOne(idList, email);
		Assert.assertNotNull("Should not be null", member);
	}
	
	@Test
	public void testUpdateOneMemberNotBeNull() throws NoSuchAlgorithmException {
		String idList = listMailChimpToCreated.getId(); 
		String email = memberCreated.getEmailAddress(); 
		
		Member memberToUpdate = mailChimp.member().readOne(idList, email);
		MergeFields mergeFields = new MergeFields("Maria", "");
		memberToUpdate.setMergeFields(mergeFields);
		
		Member memberUpdated = mailChimp.member().update(idList, email, memberToUpdate);
		Assert.assertNotNull("Should not be null", memberUpdated);
	}
	
	@AfterClass
	public static void testeDeleteAll() throws NoSuchAlgorithmException {
		String idList = listMailChimpToCreated.getId();
		String email = memberCreated.getEmailAddress(); 
		mailChimp.member().delete(idList, email);
		mailChimp.list().delete(idList);
	}

}
