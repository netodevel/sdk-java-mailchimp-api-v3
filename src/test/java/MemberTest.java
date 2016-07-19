import static org.junit.Assert.assertEquals;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import mailchimp.MailChimp;
import mailchimp.attributes.Authentication;
import mailchimp.attributes.Member;
import mailchimp.communicators.ProductionCommunicator;

import org.junit.Assert;
import org.junit.Test;

public class MemberTest {

	private static final String USER = "Jose vieira";
	private static final String KEY = "9fefd9702d24ac6762b2cbfe69c2238a-us11";
	
	@Test
	public void testReadAllMembersNotBeIsEmpty() {
		MailChimp mailChimp = new MailChimp(new Authentication(USER, KEY), new ProductionCommunicator());
		String idList = "c7afb44090";
		Integer count = mailChimp.member().countMembersList(idList);
		List<Member> listMember = mailChimp.member().list(idList, count);
		assertEquals(false, listMember.isEmpty());
	}
	
	@Test
	public void testReadOneMemberNotBeNull() throws NoSuchAlgorithmException {
		MailChimp mailChimp = new MailChimp(new Authentication(USER, KEY), new ProductionCommunicator());
		String idList = "c7afb44090";
		String email = "gleopardi98@hotmail.com";
		Member member = mailChimp.member().readOne(idList, email);
		Assert.assertNotNull("Should not be null", member);
	}
	
	@Test
	public void testUpdateOneMemberNotBeNull() throws NoSuchAlgorithmException {
		MailChimp mailChimp = new MailChimp(new Authentication(USER, KEY), new ProductionCommunicator());
		String idList = "c7afb44090";
		String email = "gleopardi98@hotmail.com";
		
		Member memberToUpdate = mailChimp.member().readOne(idList, email);
		memberToUpdate.setIpOpt("192.168.0.28");
		
		Member memberUpdated = mailChimp.member().update(idList, email, memberToUpdate);
		Assert.assertNotNull("Should not be null", memberUpdated);
	}
	
	

}
