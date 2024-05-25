package enums.bateel;

public enum BateelLoginCheckoutEnum {

	BATEEL_EMAIL_ID("customer-email"),
	BATEEL_PASSWORD_ID("customer-password"),
	BATEEL_SIGNIN_BUTTON_CSS("span[data-bind=\"i18n: 'Sign in'\"]"),
	BATEEL_LOGIN_FNAME_NAME("firstname"), 
	BATEEL_LOGIN_LNAME_NAME("lastname"),
	BATEEL_LOGIN_STREET_NAME("street[0]"),
	BATEEL_LOGIN_CITY_XPATH("//input[@class='input-text' and @name='city']"),
	BATEEL_LOGIN_COUNTRY_NAME("country_id"),
	BATEEL_LOGIN_POSTCODE_NAME("postcode"), 
	BATEEL_LOGIN_STATE_NAME("region_id"),
	BATEEL_LOGIN_TELEPHONE_NAME("telephone"), 
	BATEEL_LOGIN_AGREE_NAME("international_disclaimer"),
	BATEEL_LOGIN_PROCEEDTOBILLING_XPATH("//*[@id=\"shipping-method-buttons-container\"]/div/button"),
	BATEEL_LOGIN_PLACEORDER_XPATH("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button"),
	BATEEL_LOGIN_CONTINUESHOPPING_CSS("a[class='action primary continue'] span");

	private final String label;

	private BateelLoginCheckoutEnum(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return this.label;
	}
}
