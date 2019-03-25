package cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gustavo.kruger
 */
public class Wallet {

	public enum Type {
		ApplePay,
		VisaCheckout,
		Masterpass,
		SamsungPay,
		AndroidPay
	}
	
    @SerializedName("Type")
    private String type;

    @SerializedName("WalletKey")
    private String walletKey;

    @SerializedName("AdditionalData")
    private Object additionalData;

    @SerializedName("Eci")
    private String eci;
    
    @SerializedName("Cavv")
    private String cavv;

    
    public Wallet() {
    }

    public Wallet(Type type, String walletKey, String publicKey) {
        this.type = type.name();
        this.walletKey = walletKey;
        if (publicKey != null) {
            AdditionalData addData = new AdditionalData();
            if (type == Type.ApplePay) {
            	addData.setEphemeralPublicKey(publicKey);
            } else if (type == Type.Masterpass) {
            	addData.setCapturecode(publicKey);
            } else if (type == Type.AndroidPay) {
            	addData.setSignature(publicKey);
            }
            this.additionalData = addData;
        }
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWalletKey() {
		return walletKey;
	}

	public void setWalletKey(String walletKey) {
		this.walletKey = walletKey;
	}

	public Object getAdditionalData() {
		return additionalData;
	}

	public void setAdditionalData(Object additionalData) {
		this.additionalData = additionalData;
	}

    
    
    
}
