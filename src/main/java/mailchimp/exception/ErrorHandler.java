package mailchimp.exception;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import mailchimp.util.GsonDeserializer;
import feign.Response;
import feign.codec.ErrorDecoder;

public class ErrorHandler implements ErrorDecoder {

	@Override
	public Exception decode(String arg0, Response arg1) {
		if (arg1.body() == null) {
			String json = "{\"message\":\"Http Status 400 happened\", \"errors\": [{\"code\": \"UNKNOWN\", \"description\": \"Unknown error\"}]}";
			GsonDeserializer gson = new GsonDeserializer();
			ApiResponseError error = gson.deserialize(json,	ApiResponseError.class);
			throw new ApiResponseErrorException(error);
		}

		try {
			InputStream is = arg1.body().asInputStream();
			Scanner s = new Scanner(is).useDelimiter("\\A");
			String json = s.hasNext() ? s.next() : "";
			GsonDeserializer gson = new GsonDeserializer();
			ApiResponseError error = gson.deserialize(json, ApiResponseError.class);
			
			return new ApiResponseErrorException(error.getDetail());
		} catch (IOException e) {
			System.out.println("Error when parsin response" + e);
		}

		return new ApiResponseErrorException("Http Status 400 happened");
	}
}
