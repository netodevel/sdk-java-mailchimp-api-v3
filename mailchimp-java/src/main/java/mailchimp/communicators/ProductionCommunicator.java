package mailchimp.communicators;

import mailchimp.attributes.Authentication;
import mailchimp.util.FixedHeadersInterceptor;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import feign.Feign;
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
		
		/**
		 * APLICA POLITICA DE NOMECLATURA ESPECIFICA PARA O CAMPO DE UM OBJETO NA SERIALIZACAO E DESSERIALIZACAO
		 */
		Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
		
		return Feign
                .builder()
                .decoder(new GsonDecoder(gson)) // decodifica a resposta da requisição ao seu tipo de retorno no caso JSON
                .encoder(new GsonEncoder(gson)) // codifica o objeto em um corpo de solicitação HTTP. usado quando não existe nenhum @param
                .errorDecoder(new mailchimp.exception.ErrorHandler()) //tratamento de erro
                .requestInterceptor(new BasicAuthRequestInterceptor(authentication.getToken(), authentication.getSecret()))
                .requestInterceptor(new FixedHeadersInterceptor()) // adicão de Headers para todos os pedidos
                .target(clazz, "https://us11.api.mailchimp.com/3.0");
	}
	
}
