package mailchimp.communicators;

import feign.Param;
import feign.RequestLine;
import mailchimp.attributes.Member;

public interface MemberCommunicator {
	
	@RequestLine("GET /lists/{list_id}/members?count={count}")
	Member readAll(@Param("list_id") String listId, @Param("count") Integer count);
	
	@RequestLine("GET /lists/{list_id}/members")
	Member count(@Param("list_id") String listId);
	
	@RequestLine("GET /lists/{list_id}/members/{subscriber_hash}")
	Member readOne(@Param("list_id") String idList, @Param("subscriber_hash") String subscriberHash);

	@RequestLine("PUT /lists/{list_id}/members/{subscriber_hash}")
	Member update(@Param("list_id") String idList, @Param("subscriber_hash") String subscriberHash, Member member);

	@RequestLine("DELETE /lists/{list_id}/members/{subscriber_hash}")
	void delete(@Param("list_id") String idList, @Param("subscriber_hash") String subscriberHash);
	
	@RequestLine("POST /lists/{list_id}/members")
	Member create(@Param("list_id") String idList, Member members);
	
}
