package mailchimp.communicators;

import mailchimp.attributes.ListMailChimp;
import feign.Param;
import feign.RequestLine;

public interface ListCommunicator {
	
	@RequestLine("GET /lists")
	ListMailChimp readAll();
	
	@RequestLine("GET /lists/{list_id}")
	ListMailChimp readOne(@Param("list_id") String listId);
	
	@RequestLine("POST /lists")
	ListMailChimp create(ListMailChimp listMailChimp);

}
