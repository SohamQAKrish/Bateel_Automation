package sanity.bateel;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.UtilitiesCommon;
import page.bateel.BateelFooter;
import page.bateel.BateelPage;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;

@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityBateelLoginAndNavigationTest {

	@Test(testName = "Bateel Shop Category Navigation")
	@TmsLink("49700")
	@Description("This Test is used to Verify the Navigation to the Shop Category")
	public void testBateelShopCategoryNavigation() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.log("Application is launched successfully in the browser");
	    UtilitiesCommon.setupWebdriverWait(60);
		BateelPage.clickGoButton();
		UtilitiesCommon.log("User has successfully trigger the Go button");
		BateelFooter.Acceptcookies();
		UtilitiesCommon.log("Cookies accept button clicked successfully at the footer");
		BateelPage.verifyBateelShopCategory();
		UtilitiesCommon.log("Successfully clicked on 'Shop' category from the menu and opened the category page");
		UtilitiesCommon.log("Verify workflow allure report logs");
	}
}