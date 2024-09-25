package enums.bateel;
/**
 * This enum will store objects available on Checkout Screen.
 * @author RShivam
 * @lastmodifiedby RShivam
 */
/*
 * Note: Enum key should be in capital case and should end with either of below
 * locator types: ID, XPATH, LINKTEXT, PARTIALLINKTEXT, CSS, NAME, TAGNAME, CLASSNAME
 */
public enum BateelLoginCheckoutEnum {
	BATEEL_EMAIL_ID("customer-email"),
	BATEEL_PASSWORD_ID("customer-password"),
	BATEEL_SIGNIN_BUTTON_CSS("span[data-bind=\"i18n: 'Sign in'\"]"),
	BATEEL_LOGIN_FNAME_NAME("firstname"), 
	BATEEL_LOGIN_LNAME_NAME("lastname"),
	BATEEL_LOGIN_STREET_NAME("street[0]"),
	BATEEL_LOGIN_CITY_XPATH("//select[@name='city']/option[@value='Abu Dhabi']"),
	BATEEL_LOGIN_COUNTRY_NAME("country_id"),
	BATEEL_LOGIN_POSTALCODE_XPATH("//input[@class='input-text' and @name='postcode' and @placeholder='12345' and @type='text']"),
	BATEEL_LOGIN_CITYAREA_XPATH("//input[@class='input-text' and @name='street[1]' and @aria-required='true' and @type='text']"),
	BATEEL_LOGIN_TELEPHONE_NUMBER_XPATH("//input[@class='input-text' and @name='telephone' and @type='text' and @autocomplete='off' and @minlength='7' and @maxlength='9']"),
	BATEEL_LOGIN_AGREE_NAME("international_disclaimer"),
	BATEEL_LOGIN_PROCEEDTOBILLING_XPATH("//*[@id=\"shipping-method-buttons-container\"]/div/button"),
	BATEEL_LOGIN_CARDNUMBER_XPATH("//div[@class='payment-method-title field choice']/following::input[@name='checkout-frames-cardNumber'][1]"),
	BATEEL_LOGIN_EXPIRYDATE_XPATH("//div[@class='payment-method-title field choice']//following::input[@name='checkout-frames-expiryDate'][1]"),
	BATEEL_LOGIN_CVV_XPATH("//div[@class='payment-method-title field choice']//following::input[@name='checkout-frames-cvv'][1]"),
	BATEEL_LOGIN_PROCEED_XPATH("//button[@id='checkoutcom_card_payment_btn']"),
	BATEEL_LOGIN_CONTINUESHOPPING_CSS("a[class='action primary continue'] span"),
	BATEEL_LOGIN_TRANSACTIONFAILED_XPATH("//div[@data-ui-id='checkout-cart-validationmessages-message-error']");
	/**
	 * A final variable to store the label, which can't be changed.*/
	private final String label;
	/**
	 * A constructor that sets the label.
	 * @param label
	 */
	private BateelLoginCheckoutEnum(String label) {
		this.label = label;
	}
	/**
	 * Override the toString() method to return the label instead of the declared name.*/
	@Override
	public String toString() {
		return this.label;
	}
}