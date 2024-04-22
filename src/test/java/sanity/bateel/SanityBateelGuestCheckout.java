package sanity.bateel;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.UtilitiesCommon;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import page.bateel.BateelCartPage;
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

		BateelPage.clickGoButton();
		BateelPage.verifyBateelShopCategory();
		BateelPLPPage.clickProduct();
		BateelPDPPage.fillProductDetails();
		BateelCartPage.addToCart();
		BateelGuestCheckoutPage.clickGuestCheckoutButton();
		BateelGuestCheckoutPage.fillShippingAddress();
		BateelGuestCheckoutPage.proccedTOBilling();
		BateelGuestCheckoutPage.clickPlaceOrderButtonWithoutWaitingForMask();
		BateelGuestCheckoutPage.clickOnContinueShopButton();

	}
}
