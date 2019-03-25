package cieloecommerce.sdk.ecommerce.request;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

import com.google.gson.GsonBuilder;

import cieloecommerce.sdk.Environment;
import cieloecommerce.sdk.Merchant;
import cieloecommerce.sdk.ecommerce.ZeroAuth;

/**
 * Create any kind of sale
 */
public class ZeroAuthRequest extends AbstractSaleRequest<ZeroAuth, ZeroAuth> {
	public ZeroAuthRequest(Merchant merchant, Environment environment) {
		super(merchant, environment);
	}

	@Override
	public ZeroAuth execute(ZeroAuth param) throws IOException, CieloRequestException {
		String url = environment.getApiUrl() + "1/zeroauth";
		HttpPost request = new HttpPost(url);
		request.setEntity(new StringEntity(new GsonBuilder().create().toJson(param)));
		HttpResponse response = sendRequest(request);
		return readResponse(response, ZeroAuth.class);
	}
	
}
