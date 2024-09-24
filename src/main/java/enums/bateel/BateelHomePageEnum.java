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
	BATEEL_HOME_PAGE_SHOP_CATEGORY_XPATH("//a[@id='ui-id-2']"),
	BATEEL_HOME_PAGE_LOGIN_PROFILE_CSS(".account-icon"),
	BATEEL_HOME_PAGE_SELECT_COUNTRY_CLICK_XPATH("//span[@class='IN_flag']"),
	BATEEL_HOME_PAGE_SELECT_COUNTRY_OPTION_XPATH("//ul[contains(@class, 'chosen-results')]//li[contains(text(), 'United Arab Emirates')]"),
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