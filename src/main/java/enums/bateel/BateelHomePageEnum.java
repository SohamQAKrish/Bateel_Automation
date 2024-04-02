package enums.bateel;

/**This enum will store objects available on Onitsuka Home page.
@author spandit
@lastmodifiedby spandit
*/

/* Note: Enum key should be in capital case and should end with either of below locator types:
ID, XPATH, LINKTEXT, PARTIALLINKTEXT, CSS, NAME, TAGNAME, CLASSNAME */

public enum BateelHomePageEnum {
	 BATEEL_HOME_PAGE_TITLE_NAME("title"),
	  //  BATEEL_HOME_PAGE_SHOP_DETAILS_CSS(".column.main"),
	    BATEEL_HOME_PAGE_OK_BUTTON_XPATH("//button[contains(text(),'Go')]"),
	    BATEEL_HOME_PAGE_SHOP_CATEGORY_ID("ui-id-2"),
	    BATEEL_HOME_PAGE_LOGIN_PROFILE_CSS(".account-icon"),
	    BATEEL_HOME_PAGE_LOGIN_MYACCOUNT_XPATH("//*[@id=\"idC9LTvTLN\"]");
	/**
	 * Override the toString() method to return the label instead of the declared name.
	 */
	@Override
	public String toString() {
		return this.label;
	}
	
	
	/**
	 * A final variable to store the label, which can't be changed.
	 */
	public final String label;

	/**
	 * A private constructor that sets the label.
	 * @param label
	 */
	BateelHomePageEnum(String label) {
		this.label = label;
	}
}