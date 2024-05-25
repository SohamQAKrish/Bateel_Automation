package page.bateel;

import org.testng.Assert;
import common.UtilitiesCommon;
import enums.bateel.BateelHomePageEnum;

/**
 * @author kdave
 * @lastmodifiedby kdave 
 * This class will contain all the Home Page methods
 */
public class BateelPage {

	/**
	 * This method is used to verify Bateel page header Title.
	 * 
	 * @author kdave
	 * @lastmodifiedby kdave
	 */
	public static void verifyBateelPageHeaderTitle() {

		UtilitiesCommon.waitForElementIsPresent(BateelHomePageEnum.BATEEL_HOME_PAGE_TITLE_NAME);
		UtilitiesCommon.verifyText(BateelHomePageEnum.BATEEL_HOME_PAGE_TITLE_NAME, UtilitiesCommon.getTestData("BateelHeader"));
	}

	/**
	 * This method is used to verify Bateel shop Category.
	 * 
	 * @author kdave
	 * @throws InterruptedException
	 * @lastmodifiedby kdave
	 */
	public static void verifyBateelShopCategory() throws InterruptedException {
	    String currentUrlBeforeClick = UtilitiesCommon.getCurrentUrl();

		UtilitiesCommon.waitForElementIsPresent(BateelHomePageEnum.BATEEL_HOME_PAGE_SHOP_CATEGORY_ID);
		UtilitiesCommon.setupWebdriverWait(60);
		UtilitiesCommon.waitForMilliseconds(5000);
		UtilitiesCommon.click(BateelHomePageEnum.BATEEL_HOME_PAGE_SHOP_CATEGORY_ID);
	    String currentUrlAfterClick = UtilitiesCommon.getCurrentUrl();
	    Assert.assertNotEquals(currentUrlBeforeClick, currentUrlAfterClick, "Clicking on the shop category did not redirect to a different page");
	}

	public static void clickGoButton() {
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.click(BateelHomePageEnum.BATEEL_HOME_PAGE_OK_BUTTON_XPATH);
	}
}

