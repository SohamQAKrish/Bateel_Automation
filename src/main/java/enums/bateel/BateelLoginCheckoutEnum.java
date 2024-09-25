package enums.bateel;

import org.openqa.selenium.By;

public enum BateelLoginCheckoutEnum {
	BATEEL_EMAIL_ID("customer-email"),
	BATEEL_PASSWORD_ID("customer-password"),
	BATEEL_SIGNIN_BUTTON_CSS("span[data-bind=\"i18n: 'Sign in'\"]"),
	BATEEL_LOGIN_FNAME_NAME("firstname"), 
	BATEEL_LOGIN_LNAME_NAME("lastname"),
	BATEEL_LOGIN_STREET_NAME("street[0]"),
	BATEEL_LOGIN_CITY_XPATH("//select[@name='city']/option[@value='Abu Dhabi']"),
	BATEEL_LOGIN_COUNTRY_NAME("country_id"),
	//BATEEL_LOGIN_POSTCODE_NAME("postcode"), 
	BATEEL_LOGIN_POSTALCODE_XPATH("//input[@class='input-text' and @name='postcode' and @placeholder='12345' and @type='text']"),
	//BATEEL_LOGIN_STATE_NAME("region_id"),
	BATEEL_LOGIN_CITYAREA_XPATH("//input[@class='input-text' and @name='street[1]' and @aria-required='true' and @type='text']"),
	//BATEEL_LOGIN_TELEPHONE_NAME("telephone"), 
	BATEEL_LOGIN_TELEPHONE_NUMBER_XPATH("//input[@class='input-text' and @name='telephone' and @type='text' and @autocomplete='off' and @minlength='7' and @maxlength='9']"),
	BATEEL_LOGIN_AGREE_NAME("international_disclaimer"),
	BATEEL_LOGIN_PROCEEDTOBILLING_XPATH("//*[@id=\"shipping-method-buttons-container\"]/div/button"),
	BATEEL_LOGIN_CARDNUMBER_XPATH("//input[@name='cardnumber' and @placeholder='Card number']"),
	BATEEL_LOGIN_EXPIRYDATE_XPATH("//div[@class='payment-method-title field choice']//following::input[@name='checkout-frames-expiryDate'][1]"),
	BATEEL_LOGIN_CVV_XPATH("//div[@class='payment-method-title field choice']//following::input[@name='checkout-frames-cvv'][1]"),
	BATEEL_LOGIN_PROCEED_XPATH("//button[@id='checkoutcom_card_payment_btn']"),
	BATEEL_LOGIN_PLACEORDER_XPATH("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button"),
	BATEEL_LOGIN_CONTINUESHOPPING_CSS("a[class='action primary continue'] span"),
	BATEEL_LOGIN_TRANSACTIONFAILED_XPATH("//div[@data-ui-id='checkout-cart-validationmessages-message-error']");
	
	private final String label;

	// A private constructor that sets the label for each enum constant
	private BateelLoginCheckoutEnum(String label) {
		this.label = label;
	}

	// Override the toString() method to return the label
	@Override
	public String toString() {
		return this.label;
	}
}
