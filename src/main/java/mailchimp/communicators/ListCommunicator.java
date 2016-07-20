package mailchimp.communicators;

import mailchimp.attributes.ListMailChimp;
import feign.Param;
import feign.RequestLine;

//TODO: EDIT and Count Lists
public interface ListCommunicator {
	
	@RequestLine("GET /lists")
	ListMailChimp readAll();
	
	@RequestLine("GET /lists/{list_id}")
	ListMailChimp readOne(@Param("list_id") String listId);
	
	@RequestLine("POST /lists")
	ListMailChimp create(ListMailChimp listMailChimp);

	@RequestLine("DELETE /lists/{list_id}")
	void delete(@Param("list_id") String listId);
}
