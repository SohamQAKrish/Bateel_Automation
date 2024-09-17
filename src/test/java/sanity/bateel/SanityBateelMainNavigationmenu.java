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
		UtilitiesCommon.setupWebdriverWait(30);	
		BateelPage.clickGoButton();
		BateelFooter.Acceptcookies();
		BateelHeader.HoveronShopcategory();
		BateelHeader.Verifymenucategorylinks();
		UtilitiesCommon.log("User has verified menu links successfully");
	}
}
