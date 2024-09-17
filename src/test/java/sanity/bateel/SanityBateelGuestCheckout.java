package sanity.bateel;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.UtilitiesCommon;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import page.bateel.BateelCartPage;
import page.bateel.BateelFooter;
import page.bateel.BateelGuestCheckoutPage;
import page.bateel.BateelPDPPage;
import page.bateel.BateelPLPPage;
import page.bateel.BateelPage;

@Listeners({ listeners.ScriptExecutionListener.class })

public class SanityBateelGuestCheckout {

	@Test(testName = "Bateel guest checkout")
	@TmsLink("49700")
	@Description("This Test is used to do guest checkout")
	public void testguestcheckout() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.log("Application is launched successfully in the browser");
		BateelPage.clickGoButton();
		UtilitiesCommon.log("User has successfully trigger the Go button");
		BateelFooter.Acceptcookies();
		UtilitiesCommon.log("Cookies accept button clicked successfully at the footer");
		BateelPage.verifyBateelShopCategory();
		UtilitiesCommon.log("Successfully clicked on 'Shop' category from the menu and opened the category page");
		BateelPLPPage.clickProduct();
		UtilitiesCommon.log("User has successfully clicked on the product from the PLP");
		BateelPDPPage.fillProductDetails();
		UtilitiesCommon.log("User has successfully verified product detail");
		BateelCartPage.addToCart();
		UtilitiesCommon.log("Product successfully added to the cart");
		UtilitiesCommon.setupWebdriverWait(30);
		BateelGuestCheckoutPage.clickGuestCheckoutButton();
		UtilitiesCommon.log("Successfully clicked guest checkout button for the guest customer flow");
		BateelGuestCheckoutPage.fillShippingAddress();
		UtilitiesCommon.log("Filled all the required shipping address fields information");
		BateelGuestCheckoutPage.proccedTOBilling();
		UtilitiesCommon.log("Clicked on Proceed to billing button");
		BateelGuestCheckoutPage.clickPlaceOrderButtonWithoutWaitingForMask();
		UtilitiesCommon.log("Clicked on the place order button successfully");
		BateelGuestCheckoutPage.clickOnContinueShopButton();
		UtilitiesCommon.log("Clicked on the continue shopping button after place an order");
	}
}
