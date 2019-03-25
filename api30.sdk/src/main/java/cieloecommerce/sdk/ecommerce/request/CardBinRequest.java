package cieloecommerce.sdk.ecommerce.request;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;

import cieloecommerce.sdk.Environment;
import cieloecommerce.sdk.Merchant;
import cieloecommerce.sdk.ecommerce.CardBin;

/**
 * Create any kind of sale
 */
public class CardBinRequest extends AbstractSaleRequest<String, CardBin> {
	
	public CardBinRequest(Merchant merchant, Environment environment) {
		super(merchant, environment);
	}

	@Override
	public CardBin execute(String BIN) throws IOException, CieloRequestException {
		String url = environment.getApiUrl() + "1/cardBin/"+BIN;
		HttpGet request = new HttpGet(url);
		HttpResponse response = sendRequest(request);
		return readResponse(response, CardBin.class);
	}
	
}
