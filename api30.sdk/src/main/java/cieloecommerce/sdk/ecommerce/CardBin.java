package cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gustavo.kruger
 */
public class CardBin {

    @SerializedName("Status")
    private String status;

    @SerializedName("Provider")
    private String provider;

    @SerializedName("CardType")
    private Object cardType;

    @SerializedName("ForeingCard")
    private String foreingCard;
    
    
    public CardBin() {
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


	public Object getCardType() {
		return cardType;
	}


	public void setCardType(Object cardType) {
		this.cardType = cardType;
	}


	public String getForeingCard() {
		return foreingCard;
	}


	public void setForeingCard(String foreingCard) {
		this.foreingCard = foreingCard;
	}

    public String getDescription() {
    	if ("00".equals(getStatus())) {
    		return "Analise autorizada";
    	}
    	if ("01".equals(getStatus())) {
    		return "Bandeira não suportada";
    	}
    	if ("02".equals(getStatus())) {
    		return "Cartão não suportado na consulta de bin";
    	}
    	if ("73".equals(getStatus())) {
    		return "Filiaçao bloqueada";
    	}
    	return null;
    }
    
    
    public boolean isValid() {
    	return "00".equals(getStatus());
    }
    
    
}
