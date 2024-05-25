package sanity.bateel;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.UtilitiesCommon;
import page.bateel.BateelPage;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;

/**
 * @author kdave
 * @lastmodifiedby kdave This class will contain all Sanity tests related to
 *                 Login and Navigations to different modules across the Bateel
 *                 application.
 */
@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityBateelLoginAndNavigationTest {

	@Test(testName = "Bateel Shop Category Navigation")
	@TmsLink("49700")
	@Description("This Test is used to Verify the Navigation to the Shop Category")
	public void testBateelShopCategoryNavigation() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		BateelPage.clickGoButton();
		BateelPage.verifyBateelShopCategory();
	}
}