import static org.junit.Assert.assertEquals;

import java.util.List;

import mailchimp.MailChimp;
import mailchimp.attributes.Authentication;
import mailchimp.attributes.ListMailChimp;
import mailchimp.communicators.ProductionCommunicator;

import org.junit.Assert;
import org.junit.Test;

public class ListsMailChimpTest {
	
	private static final String USER = "";
	private static final String KEY = "";
	
	
	@Test
	public void testReadAllListNotBeNull() {
		MailChimp mailChimp = new MailChimp(new Authentication(USER,KEY), new ProductionCommunicator());
		List<ListMailChimp> listMailChimp = mailChimp.list().list();
		assertEquals(false, listMailChimp.isEmpty());
	}
	
	@Test
	public void testReadOneListNotBeNull() {
		MailChimp mailChimp = new MailChimp(new Authentication(USER,KEY), new ProductionCommunicator());
		final String id = "afa5bd9532";
		ListMailChimp listMailChimp = mailChimp.list().readOne(id);
		Assert.assertNotNull("Should not be null", listMailChimp);
	}

}
