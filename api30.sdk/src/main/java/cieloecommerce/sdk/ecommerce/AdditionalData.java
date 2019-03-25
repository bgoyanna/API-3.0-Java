package cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gustavo.kruger
 */
public class AdditionalData {

    @SerializedName("EphemeralPublicKey")
    private String ephemeralPublicKey;
    @SerializedName("capturecode")
    private String capturecode;
    @SerializedName("signature")
    private String signature;

    

    public AdditionalData() {
    }

	public String getEphemeralPublicKey() {
		return ephemeralPublicKey;
	}

	public void setEphemeralPublicKey(String ephemeralPublicKey) {
		this.ephemeralPublicKey = ephemeralPublicKey;
	}

	public String getCapturecode() {
		return capturecode;
	}

	public void setCapturecode(String capturecode) {
		this.capturecode = capturecode;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	
    
}
