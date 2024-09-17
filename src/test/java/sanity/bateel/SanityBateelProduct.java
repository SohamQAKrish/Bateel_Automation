package sanity.bateel;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.UtilitiesCommon;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import page.bateel.BateelFooter;
import page.bateel.BateelPLPPage;
import page.bateel.BateelPage;

@Listeners({ listeners.ScriptExecutionListener.class })

public class SanityBateelProduct {

	@Test(testName = "Bateel click product")
	@TmsLink("49701")
	@Description("This Test is used to click product")
	public void testBateelclickproduct() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		BateelPage.clickGoButton();
		BateelFooter.Acceptcookies();
		BateelPage.verifyBateelShopCategory();
		BateelPLPPage.clickProduct();
		UtilitiesCommon.log("User has successfully clicked on the product from the PLP");
	}
}