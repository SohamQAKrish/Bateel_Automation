package enums.bateel;

/**
 * This enum will store objects available on Bateel Home page.
 * 
 * @author kdave
 * @lastmodifiedby kdave
 */

public enum BateelHomePageEnum {
	BATEEL_HOME_PAGE_TITLE_NAME("title"),
	BATEEL_HOME_PAGE_OK_BUTTON_XPATH("//button[contains(text(),'Go')]"),
	BATEEL_HOME_PAGE_SHOP_CATEGORY_ID("ui-id-3"),
	BATEEL_HOME_PAGE_LOGIN_PROFILE_CSS(".account-icon"),
	BATEEL_HOME_PAGE_LOGIN_MYACCOUNT_XPATH("//*[@id=\"idC9LTvTLN\"]");

	@Override
	public String toString() {
		return this.label;
	}

	public final String label;

	BateelHomePageEnum(String label) {
		this.label = label;
	}
}