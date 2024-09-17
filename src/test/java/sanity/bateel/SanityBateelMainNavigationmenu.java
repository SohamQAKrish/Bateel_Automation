package sanity.bateel;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.UtilitiesCommon;
import io.qameta.allure.Description;
import page.bateel.BateelFooter;
import page.bateel.BateelHeader;
import page.bateel.BateelPage;

@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityBateelMainNavigationmenu {

	@Test(testName = " Main Navigation menu category links verification")
	@Description("This Test is used to Verify the Navigation to the Categories in category menu ")
	public void mainmenu() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.log("Application is launched successfully in the browser");
		UtilitiesCommon.setupWebdriverWait(30);	
		BateelPage.clickGoButton();
		UtilitiesCommon.log("User has successfully trigger the Go button");
		BateelFooter.Acceptcookies();
		UtilitiesCommon.log("Cookies accept button clicked successfully at the footer");
		BateelHeader.HoveronShopcategory();
		UtilitiesCommon.log("Mouse hover over on shop category for the highlight");
		BateelHeader.Verifymenucategorylinks();
		UtilitiesCommon.log("User successfully verified menu links.");
	}
}
