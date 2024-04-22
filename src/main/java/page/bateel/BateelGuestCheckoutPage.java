package page.bateel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import common.UtilitiesCommon;
import enums.bateel.BateelCheckoutGuestPageEnum;

public class BateelGuestCheckoutPage {

	public static void clickGuestCheckoutButton() throws InterruptedException {
		UtilitiesCommon.waitForMilliseconds(5000);
		WebElement buttonElement = UtilitiesCommon.getElement(BateelCheckoutGuestPageEnum.BATEEL_GUEST_BUTTON_ENUM_XPATH);
		UtilitiesCommon.javaScriptWaitAndScroll(BateelCheckoutGuestPageEnum.BATEEL_GUEST_BUTTON_ENUM_XPATH);
		UtilitiesCommon.waitForElementIsClickable(buttonElement);
		UtilitiesCommon.click(BateelCheckoutGuestPageEnum.BATEEL_GUEST_BUTTON_ENUM_XPATH);
	}

	public static void fillShippingAddress() throws InterruptedException {
		UtilitiesCommon.waitForMilliseconds(5000);
		String firstName = UtilitiesCommon.getTestData("BateelGuestFname");
		String lastName = UtilitiesCommon.getTestData("BateelGuestLname");
		String streetAddress = UtilitiesCommon.getTestData("BateelGuestStreetname");
		String city = UtilitiesCommon.getTestData("BateelGuestCityxpath");
		String country = UtilitiesCommon.getTestData("BateelGuestCountryName");
		String postcode = UtilitiesCommon.getTestData("BateelGuestPostcodeName");
		String state = UtilitiesCommon.getTestData("BateelGuestStateName");
		String phoneNo = UtilitiesCommon.getTestData("BateelGuestTelephoneName");
		String trackemail = UtilitiesCommon.getTestData("BateelGuestTrackEmailId");

		UtilitiesCommon.enterValue(BateelCheckoutGuestPageEnum.BATEEL_GUEST_FNAME_ENUM_NAME, firstName);
		UtilitiesCommon.enterValue(BateelCheckoutGuestPageEnum.BATEEL_GUEST_LNAME_ENUM_NAME, lastName);
		UtilitiesCommon.enterValue(BateelCheckoutGuestPageEnum.BATEEL_GUEST_STREET_ENUM_NAME, streetAddress);
		UtilitiesCommon.enterValue(BateelCheckoutGuestPageEnum.BATEEL_GUEST_CITY_ENUM_XPATH, city);
		BateelGuestCheckoutPage.verifyCountryAutoFilled(country);
		UtilitiesCommon.enterValue(BateelCheckoutGuestPageEnum.BATEEL_GUEST_POSTCODE_ENUM_NAME, postcode);
		BateelGuestCheckoutPage.selectState(state);
		UtilitiesCommon.enterValue(BateelCheckoutGuestPageEnum.BATEEL_GUEST_TELEPHONE_ENUM_NAME, phoneNo);
		UtilitiesCommon.javaScriptWaitAndScroll(BateelCheckoutGuestPageEnum.BATEEL_GUEST_TELEPHONE_ENUM_NAME);

		BateelGuestCheckoutPage.clickAgreeCheckbox();
		UtilitiesCommon.enterValue(BateelCheckoutGuestPageEnum.BATEEL_GUEST_TRACKEMAIL_ENUM_ID, trackemail);

		BateelGuestCheckoutPage.proccedTOBilling();

	}

	public static boolean verifyCountryAutoFilled(String expectedCountry) {
		WebElement countryField = UtilitiesCommon.getElement(BateelCheckoutGuestPageEnum.BATEEL_GUEST_COUNTRY_ENUM_NAME);
		String actualCountry = countryField.getAttribute("value");
		return actualCountry.equalsIgnoreCase(expectedCountry);
	}

	public static void selectState(String state) {
		UtilitiesCommon.selectByVisibleText(BateelCheckoutGuestPageEnum.BATEEL_GUEST_STATE_ENUM_NAME, state);

	}

	public static void clickAgreeCheckbox() throws InterruptedException {
		UtilitiesCommon.click(BateelCheckoutGuestPageEnum.BATEEL_GUEST_AGREE_ENUM_NAME);
		UtilitiesCommon.javaScriptWaitAndScroll(BateelCheckoutGuestPageEnum.BATEEL_GUEST_AGREE_ENUM_NAME);

	}

	public static void proccedTOBilling() throws InterruptedException {
		try {
			UtilitiesCommon.waitForElementIsNotVisible(By.cssSelector(".loading-mask"));

			WebElement buttonElement = UtilitiesCommon.getElement(BateelCheckoutGuestPageEnum.BATEEL_GUEST_PROCEEDTOBILLING_ENUM_XPATH);
			UtilitiesCommon.javaScriptWaitAndScroll(BateelCheckoutGuestPageEnum.BATEEL_GUEST_PROCEEDTOBILLING_ENUM_XPATH);
			UtilitiesCommon.waitForElementIsClickable(buttonElement);
			UtilitiesCommon.click(BateelCheckoutGuestPageEnum.BATEEL_GUEST_PROCEEDTOBILLING_ENUM_XPATH);
		} catch (Exception e) {
			System.out.println("Loading state might have interfered. Proceeding anyway.");
		}
	}

	public static void clickPlaceOrderButtonWithoutWaitingForMask() throws InterruptedException {
		UtilitiesCommon.click(BateelCheckoutGuestPageEnum.BATEEL_GUEST_PLACEORDER_ENUM_CSS);
		UtilitiesCommon.waitForMilliseconds(6000);

	}

	public static void clickOnContinueShopButton() {
		UtilitiesCommon.click(BateelCheckoutGuestPageEnum.BATEEL_GUEST_CONTINUESHOPPING_ENUM_CSS);
	}
}
		
	
