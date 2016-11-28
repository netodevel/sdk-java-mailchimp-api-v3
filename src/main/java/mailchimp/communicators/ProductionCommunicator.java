package mailchimp.communicators;

import mailchimp.attributes.Authentication;
import mailchimp.util.FixedHeadersInterceptor;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import feign.Feign;
import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

/**
 * 
 * @author Jose
 * 
 */

public class ProductionCommunicator implements Communicator {

	@Override
	public <T> T build(Class<T> clazz, Authentication authentication) {
		Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
		return Feign
                .builder()
                .decoder(new GsonDecoder(gson)) 
                .errorDecoder(new mailchimp.exception.ErrorHandler()) 
                .requestInterceptor(new BasicAuthRequestInterceptor(authentication.getToken(), authentication.getSecret()))
                .requestInterceptor(new FixedHeadersInterceptor()) // adicão de Headers para todos os pedidos
               // .logger(new Logger.JavaLogger().appendToFile("C:\\Users\\Jose\\Desktop\\openSource-Projects\\http.log"))
                .logLevel(Logger.Level.FULL)
                .encoder(new GsonEncoder(gson)) 
                .target(clazz, "https://us11.api.mailchimp.com/3.0");
	}
	
}
