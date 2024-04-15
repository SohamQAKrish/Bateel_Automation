package page.bateel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.UtilitiesCommon;
import enums.bateel.BateelCheckoutGuestPageEnum;
import enums.bateel.BateelHomePageEnum;

public class BateelGuestCheckoutPage {

	
	public static void clickGuestCheckoutButton() {
		WebElement buttonElement = UtilitiesCommon.getElement(BateelCheckoutGuestPageEnum.BATEEL_GUEST_BUTTON_ENUM_XPATH);
	    UtilitiesCommon.javaScriptWaitAndScroll(BateelCheckoutGuestPageEnum.BATEEL_GUEST_BUTTON_ENUM_XPATH); // Scroll into view if necessary
	    UtilitiesCommon.waitForElementIsClickable(buttonElement); 
	    UtilitiesCommon.click(BateelCheckoutGuestPageEnum.BATEEL_GUEST_BUTTON_ENUM_XPATH);
        }
		
	public static void enterFirstName(String firstName) {
        UtilitiesCommon.enterValue(BateelCheckoutGuestPageEnum.BATEEL_GUEST_FNAME_ENUM_NAME, firstName);

    }

    // Method to send keys to the last name field
	public static void enterLastName(String lastName) {
	    UtilitiesCommon.enterValue(BateelCheckoutGuestPageEnum.BATEEL_GUEST_LNAME_ENUM_NAME, lastName);
	    WebElement lastNameInput = UtilitiesCommon.getElement(BateelCheckoutGuestPageEnum.BATEEL_GUEST_LNAME_ENUM_NAME);
	    lastNameInput.sendKeys(Keys.TAB); // Pressing the tab key after entering the last name
	}

    public static void enterStreetAddress(String street) {
    	 WebElement streetInput = UtilitiesCommon.getElement(BateelCheckoutGuestPageEnum.BATEEL_GUEST_STREET_ENUM_NAME);
    	    streetInput.sendKeys(street); // Enter the street address
    	    streetInput.sendKeys(Keys.TAB);
    }
    // Method to send keys to the city field
    public static void enterCity(String city) {

    	 WebElement cityInput = UtilitiesCommon.getElement(BateelCheckoutGuestPageEnum.BATEEL_GUEST_CITY_ENUM_XPATH);
    	 cityInput.sendKeys(city);
    	 cityInput.sendKeys(Keys.TAB);
 	    
//    	UtilitiesCommon.enterValue(BateelCheckoutGuestPageEnum.BATEEL_GUEST_CITY_ENUM_XPATH, city);
//        WebElement cityInput = UtilitiesCommon.getElement(BateelCheckoutGuestPageEnum.BATEEL_GUEST_CITY_ENUM_XPATH);
//        cityInput.sendKeys(Keys.TAB);
    }
    public static boolean verifyCountryAutoFilled(String expectedCountry) {
        WebElement countryField = UtilitiesCommon.getElement(BateelCheckoutGuestPageEnum.BATEEL_GUEST_COUNTRY_ENUM_NAME);
        String actualCountry = countryField.getAttribute("value");
        return actualCountry.equalsIgnoreCase(expectedCountry);
    }
    // Method to send keys to the postcode field
    public static void enterPostcode(String postcode) {
        UtilitiesCommon.enterValue(BateelCheckoutGuestPageEnum.BATEEL_GUEST_POSTCODE_ENUM_NAME, postcode);

    }

    public static void selectState(String state) {
        WebElement stateDropdown = UtilitiesCommon.getElement(BateelCheckoutGuestPageEnum.BATEEL_GUEST_STATE_ENUM_NAME);
        Select select = new Select(stateDropdown);
        select.selectByVisibleText(state);
    }
    // Method to send keys to the telephone field
    public static void enterTelephone(String telephone) {
        UtilitiesCommon.enterValue(BateelCheckoutGuestPageEnum.BATEEL_GUEST_TELEPHONE_ENUM_NAME, telephone);
        UtilitiesCommon.javaScriptWaitAndScroll(BateelCheckoutGuestPageEnum.BATEEL_GUEST_TELEPHONE_ENUM_NAME);

    }
   

	public static void clickagreecheckbox() {
        UtilitiesCommon.click(BateelCheckoutGuestPageEnum.BATEEL_GUEST_AGREE_ENUM_NAME);
        UtilitiesCommon.javaScriptWaitAndScroll(BateelCheckoutGuestPageEnum.BATEEL_GUEST_AGREE_ENUM_NAME);

    }
	   public static void enterTrackEmail(String email) {
	        UtilitiesCommon.enterValue(BateelCheckoutGuestPageEnum.BATEEL_GUEST_TRACKEMAIL_ENUM_ID, email);

	    }
    public static void proccedTOBilling() {
        UtilitiesCommon.click(BateelCheckoutGuestPageEnum.BATEEL_GUEST_PROCEEDTOBILLING_ENUM_XPATH);

    }
    public static void clickPlaceOrderButton() {
        UtilitiesCommon.javaScriptWaitAndScroll(BateelCheckoutGuestPageEnum.BATEEL_GUEST_PLACEORDER_ENUM_XPATH);

        UtilitiesCommon.click(BateelCheckoutGuestPageEnum.BATEEL_GUEST_PLACEORDER_ENUM_XPATH);

    }
    public static void clickOnContinueShopButton() {

        UtilitiesCommon.click(BateelCheckoutGuestPageEnum.BATEEL_GUEST_CONTINUESHOPPING_ENUM_CSS);

    }
}