package enums.bateel;

public enum BateelHomePageEnum {
	BATEEL_HOME_PAGE_TITLE_NAME("title"),
	BATEEL_HOME_PAGE_OK_BUTTON_XPATH("//button[contains(text(),'Go')]"),
	BATEEL_HOME_PAGE_SHOP_CATEGORY_ID("ui-id-3"),
	BATEEL_HOME_PAGE_LOGIN_PROFILE_XPATH("//i[@class='account-icon']"),
	BATEEL_HOME_PAGE_LOGIN_MYACCOUNT_XPATH("//a[contains(text(), 'My Account')]");

	// A private variable to store the label
	private final String label;

	// A private constructor that sets the label for each enum constant
	private BateelHomePageEnum(String label) {
		this.label = label;
	}

	// Override the toString() method to return the label
	@Override
	public String toString() {
		return this.label;
	}
}
