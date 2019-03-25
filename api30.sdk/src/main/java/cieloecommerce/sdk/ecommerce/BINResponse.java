package cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gustavo.kruger
 */
public class BINResponse {

    @SerializedName("Status")
    private String status;

    @SerializedName("Provider")
    private String provider;

    @SerializedName("CardType")
    private String cardType;

    @SerializedName("ForeignCard")
    private String foreignCard;

    public BINResponse() {
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getForeignCard() {
		return foreignCard;
	}

	public void setForeignCard(String foreignCard) {
		this.foreignCard = foreignCard;
	}


}
