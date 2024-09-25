package sanity.bateel;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.UtilitiesCommon;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import page.bateel.BateelCartPage;
import page.bateel.BateelFooter;
import page.bateel.BateelLoginCheckoutPage;
import page.bateel.BateelPDPPage;
import page.bateel.BateelPLPPage;
import page.bateel.BateelPage;
/**
 * This class will contain all Sanity tests related to Checkout with Invalid Card Details
 * @author RShivam
 * @lastmodifiedby RShivam 
 */
@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityBateelLiveCheckoutWithInvalidCardDetails {
	@Test(testName = "Bateel live checkout with Invalid Card Details")
	@TmsLink("49700")
	@Description("This test is use for the live checkout customer flow with online payment with Invalid Card Details")
	public void testBateelLiveCheckoutWithInvalidCard() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.log("Application is launched successfully in the browser");
		BateelPage.selectCountry("United Arab Emirates");
		UtilitiesCommon.log("Selected country from the list");
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
		UtilitiesCommon.log("User has successfully added a product into cart");
		BateelCartPage.viewANDEditCart();
		UtilitiesCommon.log("Updated main cart");
		BateelLoginCheckoutPage.loginCheckout("Email", "Password");
		UtilitiesCommon.log("User logged-in on the checkout");
		BateelLoginCheckoutPage.fillShippingAddressLoginCheckout();
		UtilitiesCommon.log("User has successfully filled shipping address on the checkout page");
		BateelLoginCheckoutPage.proccedTOBilling();
		UtilitiesCommon.log("Clicked on proceed to billing button");
		BateelLoginCheckoutPage.enterCardDetails();
		UtilitiesCommon.log("User has successfully entered card details");
		BateelLoginCheckoutPage.handleErrorMessage();    
	}
}