package page.bateel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import common.UtilitiesCommon;
import enums.bateel.BateelCheckoutGuestPageEnum;
import enums.bateel.BateelLoginCheckoutEnum;
/**
 * This class will contain all the Checkout flow with valid & invalid card details
 * @author RShivam
 * @lastmodifiedby RShivam
 */
public class BateelLoginCheckoutPage {
	/**
	 * This method is used to Launch the Live Application and login with Valid Credentials
	 * @author KDave
	 * @lastmodifiedby KDave
	 */
	public static void loginCheckout(String usernameKey, String passwordKey) {
		String email = UtilitiesCommon.getEnvironmentData(usernameKey);
		String password = UtilitiesCommon.getEnvironmentData(passwordKey);
		UtilitiesCommon.log("Logging in with User name : " + email);
		UtilitiesCommon.enterValue(BateelLoginCheckoutEnum.BATEEL_EMAIL_ID, email);
		UtilitiesCommon.enterValue(BateelLoginCheckoutEnum.BATEEL_PASSWORD_ID,
		UtilitiesCommon.getDecryptedPassword(password));
		UtilitiesCommon.click(BateelLoginCheckoutEnum.BATEEL_SIGNIN_BUTTON_CSS);
	}
	/**
	 * This method is used to Click Select Country with UAE.
	 * @author KDave
	 * @lastmodifiedby KDave
	 */
	public static boolean verifyCountryAutoFilled(String expectedCountry) {
		WebElement countryField = UtilitiesCommon.getElement(BateelLoginCheckoutEnum.BATEEL_LOGIN_COUNTRY_NAME);
		String actualCountry = countryField.getAttribute("value");
		return actualCountry.equalsIgnoreCase(expectedCountry);
	}
	/**
	 * This method is used to Fill the Shipping Address.
	 * @author KDave
	 * @lastmodifiedby KDave
	 */
	public static void fillShippingAddressLoginCheckout() throws InterruptedException {
		UtilitiesCommon.waitForMilliseconds(5000);
		String firstName = UtilitiesCommon.getTestData("BateelGuestFname");
		String lastName = UtilitiesCommon.getTestData("BateelGuestLname");
		String streetAddress = UtilitiesCommon.getTestData("BateelGuestStreetname");
		String postcode = UtilitiesCommon.getTestData("BateelGuestPostcodeName");
		String state = UtilitiesCommon.getTestData("BateelGuestStateName");
		String phoneNo = UtilitiesCommon.getTestData("BateelGuestTelephoneName");
		UtilitiesCommon.enterValue(BateelLoginCheckoutEnum.BATEEL_LOGIN_FNAME_NAME, firstName);
		UtilitiesCommon.enterValue(BateelLoginCheckoutEnum.BATEEL_LOGIN_LNAME_NAME, lastName);
		UtilitiesCommon.enterValue(BateelLoginCheckoutEnum.BATEEL_LOGIN_STREET_NAME, streetAddress);
		UtilitiesCommon.enterValue(BateelLoginCheckoutEnum.BATEEL_LOGIN_POSTALCODE_XPATH, postcode);
		UtilitiesCommon.enterValue(BateelLoginCheckoutEnum.BATEEL_LOGIN_CITYAREA_XPATH, state);
		UtilitiesCommon.enterValue(BateelLoginCheckoutEnum.BATEEL_LOGIN_TELEPHONE_NUMBER_XPATH, phoneNo);
		BateelLoginCheckoutPage.clickAgreeCheckbox();
		BateelLoginCheckoutPage.proccedTOBilling();
	}
	/**
	 * This method is used to Accept the Agreement.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void clickAgreeCheckbox() throws InterruptedException {
		UtilitiesCommon.click(BateelCheckoutGuestPageEnum.BATEEL_GUEST_AGREE_ENUM_NAME);
		UtilitiesCommon.javaScriptWaitAndScroll(BateelCheckoutGuestPageEnum.BATEEL_GUEST_AGREE_ENUM_NAME);
	}
	/**
	 * This method is used to Click Proceed to Billing page.
	 * @author KDave
	 * @lastmodifiedby KDave
	 */
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
	/**
	 * This method is used to Click on Place Order button
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void clickPlaceOrderButtonWithLogin() throws InterruptedException {
		UtilitiesCommon.click(BateelLoginCheckoutEnum.BATEEL_LOGIN_PROCEED_XPATH);
		UtilitiesCommon.waitForMilliseconds(7000);
	}
	/**
	 * This method is used to Click on Continue Shopping Button
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void clickOnContinueShopButton() {
		UtilitiesCommon.click(BateelLoginCheckoutEnum.BATEEL_LOGIN_CONTINUESHOPPING_CSS);
	}
	/**
	 * This method is used to Enter Card Details
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void enterCardDetails() {	
		UtilitiesCommon.scrolltillpageend();
		String CreditCard = UtilitiesCommon.getTestData("CARDNUMBER");
		UtilitiesCommon.click(BateelLoginCheckoutEnum.BATEEL_LOGIN_CARDNUMBER_XPATH);
		UtilitiesCommon.enterValue(BateelLoginCheckoutEnum.BATEEL_LOGIN_CARDNUMBER_XPATH, CreditCard);
		
		String ExpiryDate = UtilitiesCommon.getTestData("CARDEXPIRY");
		UtilitiesCommon.click(BateelLoginCheckoutEnum.BATEEL_LOGIN_EXPIRYDATE_XPATH);
		UtilitiesCommon.enterValue(BateelLoginCheckoutEnum.BATEEL_LOGIN_EXPIRYDATE_XPATH, ExpiryDate);
		
		String CVV = UtilitiesCommon.getTestData("CARDCVV");
		UtilitiesCommon.click(BateelLoginCheckoutEnum.BATEEL_LOGIN_CVV_XPATH);
		UtilitiesCommon.enterValue(BateelLoginCheckoutEnum.BATEEL_LOGIN_CVV_XPATH, CVV);
		
		UtilitiesCommon.waitForMilliseconds(2000);
		UtilitiesCommon.click(BateelLoginCheckoutEnum.BATEEL_LOGIN_PROCEED_XPATH);
	}
	/**
	 * This method is used to click on Place Order button with Invalid Card Details
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void handleErrorMessage() {
		String expectedErrorMessage = "Your card details are incorrect."; 
		Assert.assertEquals(expectedErrorMessage, "The transaction could not be processed");
	}	
}