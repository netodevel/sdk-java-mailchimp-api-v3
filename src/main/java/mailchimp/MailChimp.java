package mailchimp;

import mailchimp.attributes.Authentication;
import mailchimp.clients.ListClient;
import mailchimp.communicators.Communicator;
import mailchimp.communicators.ListCommunicator;

public class MailChimp {

	private final Authentication authentication;
	private final Communicator communicator;

	public MailChimp(final Authentication authentication, final Communicator communicator){
		this.authentication = authentication;
		this.communicator = communicator;
	}
	
	/**
	 * Implementação de Lists
	 * @return
	 */
	public ListClient list() {
		ListCommunicator listCommunicator = communicator.build(ListCommunicator.class, authentication);
		return new ListClient(listCommunicator);
	}
	
}
