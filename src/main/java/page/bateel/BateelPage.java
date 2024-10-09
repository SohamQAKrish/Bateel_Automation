package page.bateel;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import common.UtilitiesCommon;
import enums.bateel.BateelHomePageEnum;

/**
 * @author Kdave
 * @lastmodifiedby Kdave 
 * This class will contain all the Home Page methods
 */
public class BateelPage {

	/**
	 * This method is used to verify Bateel page header Title.
	 * 
	 * @author Kdave
	 * @lastmodifiedby Kdave
	 */
	public static void verifyBateelPageHeaderTitle() {
		UtilitiesCommon.waitForElementIsPresent(BateelHomePageEnum.BATEEL_HOME_PAGE_TITLE_NAME);
		UtilitiesCommon.verifyText(BateelHomePageEnum.BATEEL_HOME_PAGE_TITLE_NAME, UtilitiesCommon.getTestData("BateelHeader"));
	}
	
	/**
	 * This method will click Profile Icon.
	 * 
	 * @author Kdave
	 * @lastmodifiedby Kdave
	 */
	public static void clickProfileIcon() {
        UtilitiesCommon.click(BateelHomePageEnum.BATEEL_HOME_PAGE_LOGIN_PROFILE_CSS);
    }
	
	/**
	 * Clicks on the "My Account" to navigate to the account page.
	 * 
	 * @author Kdave
	 * @lastmodifiedby Kdave
	 */
	public static void clickMyAccount() {
	    WebElement myAccountLink = UtilitiesCommon.getElement(BateelHomePageEnum.BATEEL_HOME_PAGE_LOGIN_MYACCOUNT_XPATH);
	    UtilitiesCommon.waitForElementIsClickable(myAccountLink);
	    myAccountLink.click();
	}

	/**
	 * This method is used to verify Bateel shop Category.
	 * 
	 * @author Kdave
	 * @throws InterruptedException
	 * @lastmodifiedby Kdave
	 */
	public static void verifyBateelShopCategory() throws InterruptedException {
	    String currentUrlBeforeClick = UtilitiesCommon.getCurrentUrl();
	    UtilitiesCommon.waitForElementIsPresent(BateelHomePageEnum.BATEEL_HOME_PAGE_SHOP_CATEGORY_ID);
		UtilitiesCommon.waitForMilliseconds(5000);
		UtilitiesCommon.click(BateelHomePageEnum.BATEEL_HOME_PAGE_SHOP_CATEGORY_ID);
	    String currentUrlAfterClick = UtilitiesCommon.getCurrentUrl();
	    Assert.assertNotEquals(currentUrlBeforeClick, currentUrlAfterClick, "Clicking on the shop category did not redirect to a different page");
	}

	/**
	 * Clicks the "Go" button to initiate the action. 
	 * 
	 * @author Kdave
	 * @throws InterruptedException
	 * @lastmodifiedby Kdave
	 */
	public static void clickGoButton() {
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.click(BateelHomePageEnum.BATEEL_HOME_PAGE_OK_BUTTON_XPATH);
	}
}

