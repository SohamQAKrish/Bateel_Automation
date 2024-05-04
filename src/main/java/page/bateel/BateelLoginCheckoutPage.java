package page.bateel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import common.UtilitiesCommon;
import enums.bateel.BateelCheckoutGuestPageEnum;
import enums.bateel.BateelLoginCheckoutEnum;

public class BateelLoginCheckoutPage {

	public static void loginCheckout(String usernameKey, String passwordKey) {
		String email = UtilitiesCommon.getEnvironmentData(usernameKey);
		String password = UtilitiesCommon.getEnvironmentData(passwordKey);
		UtilitiesCommon.log("Logging in with User name : " + email);
		UtilitiesCommon.enterValue(BateelLoginCheckoutEnum.BATEEL_EMAIL_ID, email);
		UtilitiesCommon.enterValue(BateelLoginCheckoutEnum.BATEEL_PASSWORD_ID,
		UtilitiesCommon.getDecryptedPassword(password));
		UtilitiesCommon.click(BateelLoginCheckoutEnum.BATEEL_SIGNIN_BUTTON_CSS);
	}
	
	public static void fillShippingAddressLoginCheckout() throws InterruptedException {
		UtilitiesCommon.waitForMilliseconds(5000);
		String firstName = UtilitiesCommon.getTestData("BateelGuestFname");
		String lastName = UtilitiesCommon.getTestData("BateelGuestLname");
		String streetAddress = UtilitiesCommon.getTestData("BateelGuestStreetname");
		String city = UtilitiesCommon.getTestData("BateelGuestCityxpath");
		String country = UtilitiesCommon.getTestData("BateelGuestCountryName");
		String postcode = UtilitiesCommon.getTestData("BateelGuestPostcodeName");
		String state = UtilitiesCommon.getTestData("BateelGuestStateName");
		String phoneNo = UtilitiesCommon.getTestData("BateelGuestTelephoneName");
		UtilitiesCommon.enterValue(BateelLoginCheckoutEnum.BATEEL_LOGIN_FNAME_NAME, firstName);
		UtilitiesCommon.enterValue(BateelLoginCheckoutEnum.BATEEL_LOGIN_LNAME_NAME, lastName);
		UtilitiesCommon.enterValue(BateelLoginCheckoutEnum.BATEEL_LOGIN_STREET_NAME, streetAddress);
		UtilitiesCommon.enterValue(BateelLoginCheckoutEnum.BATEEL_LOGIN_CITY_XPATH, city);
		BateelGuestCheckoutPage.verifyCountryAutoFilled(country);
		UtilitiesCommon.enterValue(BateelLoginCheckoutEnum.BATEEL_LOGIN_POSTCODE_NAME, postcode);
		BateelGuestCheckoutPage.selectState(state);
		UtilitiesCommon.enterValue(BateelLoginCheckoutEnum.BATEEL_LOGIN_TELEPHONE_NAME, phoneNo);
		UtilitiesCommon.javaScriptWaitAndScroll(BateelLoginCheckoutEnum.BATEEL_LOGIN_TELEPHONE_NAME);
		BateelLoginCheckoutPage.clickAgreeCheckbox();
		BateelLoginCheckoutPage.proccedTOBilling();
	}

	public static boolean verifyCountryAutoFilled(String expectedCountry) {
		WebElement countryField = UtilitiesCommon.getElement(BateelLoginCheckoutEnum.BATEEL_LOGIN_COUNTRY_NAME);
		String actualCountry = countryField.getAttribute("value");
		return actualCountry.equalsIgnoreCase(expectedCountry);
	}

	public static void selectState(String state) {
		UtilitiesCommon.selectByVisibleText(BateelLoginCheckoutEnum.BATEEL_LOGIN_STATE_NAME, state);
	}

	public static void clickAgreeCheckbox() throws InterruptedException {
		UtilitiesCommon.click(BateelCheckoutGuestPageEnum.BATEEL_GUEST_AGREE_ENUM_NAME);
		UtilitiesCommon.javaScriptWaitAndScroll(BateelCheckoutGuestPageEnum.BATEEL_GUEST_AGREE_ENUM_NAME);
	}

	public static void proccedTOBilling() throws InterruptedException {
		try {
			UtilitiesCommon.waitForElementIsNotVisible(By.cssSelector(".loading-mask"));
			WebElement buttonElement = UtilitiesCommon.getElement(BateelLoginCheckoutEnum.BATEEL_LOGIN_PROCEEDTOBILLING_XPATH);
			UtilitiesCommon.javaScriptWaitAndScroll(BateelLoginCheckoutEnum.BATEEL_LOGIN_PROCEEDTOBILLING_XPATH);
			UtilitiesCommon.waitForElementIsClickable(buttonElement);
			UtilitiesCommon.click(BateelLoginCheckoutEnum.BATEEL_LOGIN_PROCEEDTOBILLING_XPATH);
		} catch (Exception e) {
			System.out.println("Loading state might have interfered. Proceeding anyway.");
		}
	}

	public static void clickPlaceOrderButtonWithLogin() throws InterruptedException {
		UtilitiesCommon.click(BateelLoginCheckoutEnum.BATEEL_LOGIN_PLACEORDER_XPATH);
		UtilitiesCommon.waitForMilliseconds(6000);
	}

	public static void clickOnContinueShopButton() {
		UtilitiesCommon.click(BateelLoginCheckoutEnum.BATEEL_LOGIN_CONTINUESHOPPING_CSS);
	}
}
		
