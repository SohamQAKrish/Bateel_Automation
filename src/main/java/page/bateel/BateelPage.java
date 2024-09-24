package page.bateel;

import java.util.List;

import org.openqa.selenium.WebElement;
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
	
	public static void clickProfileIcon() {
        UtilitiesCommon.click(BateelHomePageEnum.BATEEL_HOME_PAGE_LOGIN_PROFILE_CSS);
    }
	public static void clickMyAccount() {
	    WebElement myAccountLink = UtilitiesCommon.getElement(BateelHomePageEnum.BATEEL_HOME_PAGE_LOGIN_MYACCOUNT_XPATH);
	    UtilitiesCommon.waitForElementIsClickable(myAccountLink);
	    myAccountLink.click();
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
	    UtilitiesCommon.waitForElementIsPresent(BateelHomePageEnum.BATEEL_HOME_PAGE_SHOP_CATEGORY_XPATH);
		//UtilitiesCommon.setupWebdriverWait(60);
		UtilitiesCommon.waitForMilliseconds(5000);
		UtilitiesCommon.click(BateelHomePageEnum.BATEEL_HOME_PAGE_SHOP_CATEGORY_XPATH);
	    String currentUrlAfterClick = UtilitiesCommon.getCurrentUrl();
	    Assert.assertNotEquals(currentUrlBeforeClick, currentUrlAfterClick, "Clicking on the shop category did not redirect to a different page");
	}

	public static void clickGoButton() {
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.click(BateelHomePageEnum.BATEEL_HOME_PAGE_OK_BUTTON_XPATH);
	}
	public static void selectCountry(String country) {
	    UtilitiesCommon.setupWebdriverWait(50);
	    UtilitiesCommon.click(BateelHomePageEnum.BATEEL_HOME_PAGE_SELECT_COUNTRY_CLICK_XPATH);
	  	 UtilitiesCommon.setupWebdriverWait(30); 
	    List<WebElement> options = UtilitiesCommon.getElements(BateelHomePageEnum.BATEEL_HOME_PAGE_SELECT_COUNTRY_OPTION_XPATH);
	    for (WebElement option : options) {
	        if (option.getText().equalsIgnoreCase(country)) {
	            option.click(); // Click the matching country option
	            break; // Exit after clicking
	        }
	    }
  }
}

