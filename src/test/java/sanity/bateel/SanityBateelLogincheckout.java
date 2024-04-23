package sanity.bateel;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.UtilitiesCommon;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import page.bateel.BateelCartPage;
import page.bateel.BateelLoginCheckoutPage;
import page.bateel.BateelPDPPage;
import page.bateel.BateelPLPPage;
import page.bateel.BateelPage;

@Listeners({ listeners.ScriptExecutionListener.class })

public class SanityBateelLogincheckout {

	@Test(testName = "Bateel product add to cart and place an order with login user flow")
	@TmsLink("49710")
	@Description("This Test is used to add product into cart and logged in checkout process flow end-to-end")
	public void testBateeladdtocartitemloginuser() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		BateelPage.clickGoButton();
		BateelPage.verifyBateelShopCategory();
		BateelPLPPage.clickProduct();
		BateelPDPPage.fillProductDetails();
		BateelCartPage.addToCart();
		BateelLoginCheckoutPage.loginCheckout("Email", "Password");
		BateelLoginCheckoutPage.fillShippingAddressLoginCheckout();
		BateelLoginCheckoutPage.proccedTOBilling();
		BateelLoginCheckoutPage.clickPlaceOrderButtonWithLogin();
		BateelLoginCheckoutPage.clickOnContinueShopButton();
	}
}
