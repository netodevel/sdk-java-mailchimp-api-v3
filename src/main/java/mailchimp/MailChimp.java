package mailchimp;

import mailchimp.attributes.Authentication;
import mailchimp.clients.ListClient;
import mailchimp.clients.MemberClient;
import mailchimp.communicators.Communicator;
import mailchimp.communicators.ListCommunicator;
import mailchimp.communicators.MemberCommunicator;

public class MailChimp {

	private final Authentication authentication;
	private final Communicator communicator;

	public MailChimp(final Authentication authentication, final Communicator communicator){
		this.authentication = authentication;
		this.communicator = communicator;
	}
	
	public ListClient list() {
		ListCommunicator listCommunicator = communicator.build(ListCommunicator.class, authentication);
		return new ListClient(listCommunicator);
	}
	
	public MemberClient member() {
		MemberCommunicator memberCommunicator = communicator.build(MemberCommunicator.class, authentication);
		return new MemberClient(memberCommunicator);
	}
	
}
