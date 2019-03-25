package cieloecommerce.sdk.ecommerce.request;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;

import cieloecommerce.sdk.Environment;
import cieloecommerce.sdk.Merchant;
import cieloecommerce.sdk.ecommerce.BINResponse;

/**
 * Query a Sale by it's paymentId
 */
public class QueryBINRequest extends AbstractSaleRequest<String, BINResponse> {
	
	public QueryBINRequest(Merchant merchant, Environment environment) {
		super(merchant, environment);
	}

	@Override
	public BINResponse execute(String bin) throws IOException, CieloRequestException {
		String url = environment.getApiQueryURL() + "1/cardbin/" + bin;

		HttpGet request = new HttpGet(url);
		HttpResponse response = sendRequest(request);

		return readResponse(response, BINResponse.class);
	}
}
