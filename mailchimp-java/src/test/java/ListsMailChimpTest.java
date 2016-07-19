import mailchimp.MailChimp;
import mailchimp.attributes.Authentication;
import mailchimp.attributes.CampaignDefaults;
import mailchimp.attributes.Contact;
import mailchimp.attributes.ListMailChimp;
import mailchimp.communicators.ProductionCommunicator;

public class ListsMailChimpTest {
	
	private static final String USER = "";
	private static final String KEY = "";
	
	public static void main(String[] args) {
		
		MailChimp mailChimp = new MailChimp(new Authentication(USER,KEY),	new ProductionCommunicator());
		
		System.out.println("READ ALL : GET /lists/");
		for (int i = 0; i < mailChimp.list().list().size(); i++) {
			System.out.println("Id: " + mailChimp.list().list().get(i).getId());
			System.out.println("Name: " + mailChimp.list().list().get(i).getName());
			break;
		}
		
		System.out.println("READ ONE : GET /lists/{list_id} ");
		final String id = "afa5bd9532";
		ListMailChimp listMailChimp = mailChimp.list().readOne(id);
		System.out.println("ID: " + listMailChimp.getId());

		System.out.println("CREATE : POST /lists");
		ListMailChimp listMailChimpToCreate = new ListMailChimp();

		/**
		 * Campos Obrigatórios
		 */
		Contact contact = new Contact();
		contact.setCompany("sed");
		contact.setAddress1("rua qualquer");
		contact.setCity("maceio");
		contact.setState("alagoas");
		contact.setZip("5700000");
		contact.setCountry("brazil");

		CampaignDefaults campaignDefaults = new CampaignDefaults();
		campaignDefaults.setFrom_email("josevieira.dev@gmail.com");
		campaignDefaults.setFrom_name("netinho");
		campaignDefaults.setSubject("email via API!");
		campaignDefaults.setLanguage("BR");

		ListMailChimp listToCreate = listMailChimpToCreate
				.withName("testando insert api 2")
				.withEmailTypeOption(true).withPermissionReminder("test api insert 2")
				.withContact(contact).withCampaignDefault(campaignDefaults);
		
		ListMailChimp listCreated = mailChimp.list().create(listToCreate);
		System.out.println(listCreated.getId());
	}

}
