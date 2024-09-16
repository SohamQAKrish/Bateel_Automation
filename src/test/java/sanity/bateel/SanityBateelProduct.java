package sanity.bateel;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.UtilitiesCommon;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
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
		BateelPage.verifyBateelShopCategory();
		BateelPLPPage.clickProduct();
	}
}