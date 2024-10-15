package sanity.bateel;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.UtilitiesCommon;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import page.bateel.BateelFooter;
import page.bateel.BateelPDPPage;
import page.bateel.BateelPLPPage;
import page.bateel.BateelPage;

@Listeners({ listeners.ScriptExecutionListener.class })

public class SanityBateelProductDetails {

	@Test(testName = "Bateel product details")
	@TmsLink("49703")
	@Description("This test validates the process of filling in product details")
	public void testBateelproductfilldetails() throws InterruptedException {
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
	}		
}

