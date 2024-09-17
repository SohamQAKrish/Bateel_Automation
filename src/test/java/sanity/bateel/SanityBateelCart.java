package sanity.bateel;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.UtilitiesCommon;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import page.bateel.BateelCartPage;
import page.bateel.BateelFooter;
import page.bateel.BateelPDPPage;
import page.bateel.BateelPLPPage;
import page.bateel.BateelPage;

@Listeners({ listeners.ScriptExecutionListener.class })

public class SanityBateelCart {

	@Test(testName = "Bateel product add to cart")
	@TmsLink("49700")
	@Description("This Test is used to add product into cart and click on checkout button")
	public void testBateeladdtocartitem() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		BateelPage.clickGoButton();
		BateelFooter.Acceptcookies();
		BateelPage.verifyBateelShopCategory();
		BateelPLPPage.clickProduct();
		BateelPDPPage.fillProductDetails();
		BateelCartPage.addToCart();
		UtilitiesCommon.log("User has successfully added a product into cart");
	}
}
