package mailchimp.communicators;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import mailchimp.attributes.Authentication;
import mailchimp.attributes.DataCenterMailChimp;
import mailchimp.util.FixedHeadersInterceptor;

/**
 * 
 * @author Jose
 * @since 0.1.5
 */

public class ProductionCommunicator implements Communicator {

	@Override
	public <T> T build(Class<T> clazz, Authentication authentication, DataCenterMailChimp dataCenterMailChimp) {
		Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
		return Feign
                .builder()
                .decoder(new GsonDecoder(gson)) 
                .errorDecoder(new mailchimp.exception.ErrorHandler()) 
                .requestInterceptor(new BasicAuthRequestInterceptor(authentication.getToken(), authentication.getSecret()))
                .requestInterceptor(new FixedHeadersInterceptor()) // adicão de Headers para todos os pedidos
                //.logger(new Logger.JavaLogger().appendToFile("C:\\Users\\Jose\\Desktop\\openSource-Projects\\http.log"))
                //.logLevel(Logger.Level.FULL)
                .encoder(new GsonEncoder(gson)) 
                .target(clazz, dataCenterMailChimp.getUrl()); //"https://us13.api.mailchimp.com/3.0"
	}
	
}
