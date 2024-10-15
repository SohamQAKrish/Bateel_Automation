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
import page.login.LoginPage;

@Listeners({ listeners.ScriptExecutionListener.class })

public class SanityBateelLogin {

	@Test(testName = "Bateel login functionality")
	@TmsLink("49700")
	@Description("This Test is for customer login")
	public void customerlogintest() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.log("Application is launched successfully in the browser");
		BateelPage.clickGoButton();
		UtilitiesCommon.log("User has successfully trigger the Go button");
		BateelFooter.Acceptcookies();
		UtilitiesCommon.log("Cookies accept button clicked successfully at the footer");
		UtilitiesCommon.setupWebdriverWait(30);
		BateelPage.clickProfileIcon();
		UtilitiesCommon.log("Clicked on Profile icon");
		UtilitiesCommon.setupWebdriverWait(30);
		BateelPage.clickMyAccount();
		UtilitiesCommon.log("Clicked on My Account link");
		UtilitiesCommon.setupWebdriverWait(30);
		LoginPage.login("Email", "Password");
		UtilitiesCommon.log("Customer successfully logged in, redirected to my account page");
		BateelPage.clickProfileIcon();
		UtilitiesCommon.log("Customer again click on the profile icon");
		LoginPage.logout();
		UtilitiesCommon.log("Customer successfully logged out");
	}
}
