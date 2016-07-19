package mailchimp.clients;

import java.util.List;

import mailchimp.attributes.ListMailChimp;
import mailchimp.communicators.ListCommunicator;

public class ListClient {

	private ListCommunicator listCommunicator;
	
	public ListClient(){
	}
	
	public ListClient(final ListCommunicator listCommunicator){
		this.listCommunicator = listCommunicator;
	}

	public List<ListMailChimp> list() {
		ListMailChimp listMailChimp = listCommunicator.readAll();
		return listMailChimp.getLists();
	}
	
	public ListMailChimp readOne(String list_id) {
		ListMailChimp listMailChimp = listCommunicator.readOne(list_id);
		return listMailChimp;
	}
	
	public ListMailChimp create(ListMailChimp listMailChimp) {
		return listCommunicator.create(listMailChimp);
	}
	
}
