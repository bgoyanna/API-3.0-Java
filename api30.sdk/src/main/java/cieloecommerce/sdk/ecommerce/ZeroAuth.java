package cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

public class ZeroAuth {
	
	@SerializedName("CardType")
	private String cardType;

	@SerializedName("Valid")
	Boolean valid = false;
	
	@SerializedName("ReturnCode")
	String returnCode = null;
	
	@SerializedName("ReturnMessage")
	String returnMessage = null;
	
	@SerializedName("CardNumber")
	private String cardNumber;

	@SerializedName("Holder")
	private String holder;

	@SerializedName("ExpirationDate")
	private String expirationDate;

	@SerializedName("SecurityCode")
	private String securityCode;

	@SerializedName("SaveCard")
	private boolean saveCard = false;

	@SerializedName("Brand")
	private String brand;

	@SerializedName("CardToken")
	private String cardToken;

	public ZeroAuth() {
	}
	
	public ZeroAuth(String securityCode, String brand) {
		this.securityCode = securityCode;
		this.brand = brand;
		if (!"Master".equals(brand) && !"Visa".equals(brand)) {
			throw new IllegalArgumentException();
		}
	}
	
	public String getCardType() {
		return cardType;
	}

	public ZeroAuth setCardType(String cardType) {
		this.cardType = cardType;
		return this;
	}

	public Boolean getValid() {
		return valid;
	}

	public ZeroAuth setValid(Boolean valid) {
		this.valid = valid;
		return this;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public ZeroAuth setReturnCode(String returnCode) {
		this.returnCode = returnCode;
		return this;
	}

	public String getReturnMessage() {
		return returnMessage;
	}

	public ZeroAuth setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
		return this;
	}
	
	public String getBrand() {
		return brand;
	}

	public ZeroAuth setBrand(String brand) {
		this.brand = brand;
		return this;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public ZeroAuth setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
		return this;
	}

	public String getCardToken() {
		return cardToken;
	}

	public ZeroAuth setCardToken(String cardToken) {
		this.cardToken = cardToken;
		return this;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public ZeroAuth setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
		return this;
	}

	public String getHolder() {
		return holder;
	}

	public ZeroAuth setHolder(String holder) {
		this.holder = holder;
		return this;
	}

	public boolean isSaveCard() {
		return saveCard;
	}

	public ZeroAuth setSaveCard(boolean saveCard) {
		this.saveCard = saveCard;
		return this;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public ZeroAuth setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
		return this;
	}

	
}
