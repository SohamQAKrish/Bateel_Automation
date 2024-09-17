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
	@Description("This Test is used to fill product details")
	public void testBateelproductfilldetails() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		BateelPage.clickGoButton();
		BateelFooter.Acceptcookies();
		BateelPage.verifyBateelShopCategory();
		BateelPLPPage.clickProduct();
		BateelPDPPage.fillProductDetails();
		UtilitiesCommon.log("User has successfully verified product detail");
	}		
}

