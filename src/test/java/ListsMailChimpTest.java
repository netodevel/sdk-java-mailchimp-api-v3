import static org.junit.Assert.assertEquals;

import java.util.List;

import mailchimp.MailChimp;
import mailchimp.attributes.Authentication;
import mailchimp.attributes.CampaignDefaults;
import mailchimp.attributes.Contact;
import mailchimp.attributes.ListMailChimp;
import mailchimp.communicators.ProductionCommunicator;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ListsMailChimpTest {
	
	private static final String USER = "";
	private static final String KEY = "";
	private static ListMailChimp listMailChimp;
	private static MailChimp mailChimp = new MailChimp(new Authentication(USER,KEY), new ProductionCommunicator());
	
	@BeforeClass
	public static void init() {
		
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
		
		listMailChimp = new ListMailChimp().withEmailTypeOption(false).withName("List of Tests!").withPermissionReminder("Testing").withCampaignDefault(campaignDefaults).withContact(contact);
		listMailChimp = mailChimp.list().create(listMailChimp);
	}
	
	@Test
	public void testReadAllListNotBeNull() {
		List<ListMailChimp> listMailChimp = mailChimp.list().list();
		assertEquals(false, listMailChimp.isEmpty());
	}
	
	@Test
	public void testReadOneListNotBeNull() {
		final String id = listMailChimp.getId();
		ListMailChimp listMailChimp = mailChimp.list().readOne(id);
		Assert.assertNotNull("Should not be null", listMailChimp);
	}
	
	@AfterClass
	public static void testDeleteList() {
		mailChimp.list().delete(listMailChimp.getId());
	}

}
