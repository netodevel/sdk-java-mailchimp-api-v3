package mailchimp.communicators;

import mailchimp.attributes.Authentication;
import mailchimp.attributes.DataCenterMailChimp;

/**
 * 
 * @author Jose
 * Interface responsável por autenticação HTTP BASIC AUTHENTICATION por cada requisição
 */
public interface Communicator {

	public <T> T build(final Class<T> clazz, final Authentication authentication, DataCenterMailChimp dataCenterMailChimp);

}
