package mailchimp;

import mailchimp.attributes.Authentication;
import mailchimp.attributes.DataCenterMailChimp;
import mailchimp.clients.ListClient;
import mailchimp.clients.MemberClient;
import mailchimp.communicators.Communicator;
import mailchimp.communicators.ListCommunicator;
import mailchimp.communicators.MemberCommunicator;

/**
 * 
 * @author Jose
 * @since 0.1.5
 */
public class MailChimp {

	private final Authentication authentication;
	private final Communicator communicator;
	private final DataCenterMailChimp dataCenterMailChimp;

	public MailChimp(final Authentication authentication, final Communicator communicator, final DataCenterMailChimp dataCenterMailChimp){
		this.authentication = authentication;
		this.communicator = communicator;
		this.dataCenterMailChimp = dataCenterMailChimp;
	}
	
	public ListClient list() {
		ListCommunicator listCommunicator = communicator.build(ListCommunicator.class, authentication, dataCenterMailChimp);
		return new ListClient(listCommunicator);
	}
	
	public MemberClient member() {
		MemberCommunicator memberCommunicator = communicator.build(MemberCommunicator.class, authentication, dataCenterMailChimp);
		return new MemberClient(memberCommunicator);
	}
}
