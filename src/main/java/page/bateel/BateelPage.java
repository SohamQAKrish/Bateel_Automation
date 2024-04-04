package page.bateel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.UtilitiesCommon;
import enums.bateel.BateelHomePageEnum;
import enums.login.LoginPageEnum;

/**
 * @author spandit
 * @lastmodifiedby kdave 
 * This class will contain all the Home Page methods
 */
public class BateelPage {
	
	/**
	 * This method is used to verify Onitsuka Tiger's page Title.
	 * @author spandit
	 * @lastmodifiedby kdave
	 */
		public static void verifyBateelPageHeaderTitle() {
			
			UtilitiesCommon.waitForElementIsPresent(BateelHomePageEnum.BATEEL_HOME_PAGE_TITLE_NAME);
			UtilitiesCommon.verifyText(BateelHomePageEnum.BATEEL_HOME_PAGE_TITLE_NAME, UtilitiesCommon.getTestData("BateelHeader"));
		}
		
		/**
		 * This method is used to verify Onitsuka Tiger's Men Category.
		 * @author spandit
		 * @lastmodifiedby kdave
		 */
		public static void verifyBateelShopCategory() {
			UtilitiesCommon.waitForElementIsPresent(BateelHomePageEnum.BATEEL_HOME_PAGE_SHOP_CATEGORY_ID);
			UtilitiesCommon.click(BateelHomePageEnum.BATEEL_HOME_PAGE_SHOP_CATEGORY_ID);
		}
	
      
	public static void clickGoButton() {
        UtilitiesCommon.click(BateelHomePageEnum.BATEEL_HOME_PAGE_OK_BUTTON_XPATH);
    }
    
	public static void clickProfileIcon() {
        UtilitiesCommon.click(BateelHomePageEnum.BATEEL_HOME_PAGE_LOGIN_PROFILE_CSS);
    }
	public static void clickMyAccount() {
	    WebElement myAccountLink = UtilitiesCommon.getElement(BateelHomePageEnum.BATEEL_HOME_PAGE_LOGIN_MYACCOUNT_XPATH);
	    UtilitiesCommon.waitForElementIsClickable(myAccountLink);
	    myAccountLink.click();
	}

	}
