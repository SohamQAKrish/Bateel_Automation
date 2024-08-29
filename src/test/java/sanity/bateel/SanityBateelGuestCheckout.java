package sanity.bateel;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.UtilitiesCommon;
import enums.bateel.BateelHomePageEnum;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import page.bateel.BateelCartPage;
import page.bateel.BateelGuestCheckoutPage;
import page.bateel.BateelPDPPage;
import page.bateel.BateelPLPPage;
import page.bateel.BateelPage;
import page.login.LoginPage;

@Listeners({ listeners.ScriptExecutionListener.class })

public class SanityBateelGuestCheckout {

	@Test(testName = "Bateel guest checkout")
	@TmsLink("49700")
	@Description("This Test is used to do guest checkout")
	public void testguestcheckout() throws InterruptedException {
		LoginPage.login("Email", "Password");
		UtilitiesCommon.getDriver();
		UtilitiesCommon.setupWebdriverWait(30);
		BateelPage.clickGoButton();
		WebElement element = UtilitiesCommon.getElement(BateelHomePageEnum.BATEEL_HOME_PAGE_SHOP_CATEGORY_ID);
		UtilitiesCommon.waitForElementIsClickable(element);
		Thread.sleep(5000);
		BateelPage.verifyBateelShopCategory();
		UtilitiesCommon.setupWebdriverWait(60);
		BateelPLPPage.clickProduct();
		BateelPDPPage.fillProductDetails();
		BateelCartPage.addToCart();
		UtilitiesCommon.setupWebdriverWait(60);

		
		BateelGuestCheckoutPage.clickGuestCheckoutButton();

		String firstName = UtilitiesCommon.getTestData("BateelGuestFname");
		BateelGuestCheckoutPage.enterFirstName(firstName);

		String lastName = UtilitiesCommon.getTestData("BateelGuestLname");
		BateelGuestCheckoutPage.enterLastName(lastName);
		UtilitiesCommon.setupWebdriverWait(30);

		String streetAddress = UtilitiesCommon.getTestData("BateelGuestStreetname");
		BateelGuestCheckoutPage.enterStreetAddress(streetAddress);
//			UtilitiesCommon.setupWebdriverWait(30);

		String cityadd = UtilitiesCommon.getTestData("BateelGuestCityxpath");
		BateelGuestCheckoutPage.enterCity(cityadd);

		UtilitiesCommon.setupWebdriverWait(30);

		String country = UtilitiesCommon.getTestData("BateelGuestCountryName");
		BateelGuestCheckoutPage.verifyCountryAutoFilled(country);

		String code = UtilitiesCommon.getTestData("BateelGuestPostcodeName");
		BateelGuestCheckoutPage.enterPostcode(code);

		String state = UtilitiesCommon.getTestData("BateelGuestStateName");
		BateelGuestCheckoutPage.selectState(state);

		String phoneNo = UtilitiesCommon.getTestData("BateelGuestTelephoneName");
		BateelGuestCheckoutPage.enterTelephone(phoneNo);
		UtilitiesCommon.setupWebdriverWait(30);

		BateelGuestCheckoutPage.clickagreecheckbox();
		UtilitiesCommon.setupWebdriverWait(60);
		String trackemail = UtilitiesCommon.getTestData("BateelGuestTrackEmailId");
		BateelGuestCheckoutPage.enterTrackEmail(trackemail);
		
		BateelGuestCheckoutPage.proccedTOBilling();
		UtilitiesCommon.setupWebdriverWait(60);

		BateelGuestCheckoutPage.clickPlaceOrderButton();
		System.out.println("Customer has successfully place an order");

	}
}
