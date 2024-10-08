package sanity.bateel;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.UtilitiesCommon;
import io.qameta.allure.Description;
import page.bateel.BateelFooter;
import page.bateel.BateelPage;

@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityBateelFootersection {	

	@Test(testName = "Footer section CMS links verification")
	@Description("This Test is used to Verify the Navigation of the CMS pages in Footersection")
	public void Footercmslinks() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.log("Application is launched successfully in the browser");
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.log("Set WebDriver wait time to 30 seconds");
		BateelPage.clickGoButton();
		UtilitiesCommon.log("User has successfully trigger the Go button");
		BateelFooter.Acceptcookies();
		UtilitiesCommon.log("Cookies accept button clicked successfully at the footer");
		BateelFooter.footerCMSlinkscheck();
		UtilitiesCommon.log("Successfully verified footer CMS links");
	}

	@Test(testName = "Footer section logo verification")
	@Description("This Test is used to Verify the logo in Footersection")
	public void Footerlogo() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.log("Application is launched successfully in the browser");
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.log("Set WebDriver wait time to 30 seconds");
		BateelPage.clickGoButton();
		UtilitiesCommon.log("User has successfully trigger the Go button");
		BateelFooter.Acceptcookies();
		UtilitiesCommon.log("Cookies accept button clicked successfully at the footer");
		BateelFooter.footerlogocheck();
		UtilitiesCommon.log("Verified footer logo");
	}

	@Test(testName = "Footer section Social media instagram link verification")
	@Description("This Test is used to Verify the instagram social media link in Footersection")
	public void Footersocialmediainstagram() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.log("Application is launched successfully in the browser");
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.log("Set WebDriver wait time to 30 seconds");
		BateelPage.clickGoButton();
		UtilitiesCommon.log("User has successfully trigger the Go button");
		BateelFooter.Acceptcookies();
		UtilitiesCommon.log("Cookies accept button clicked successfully at the footer");
		BateelFooter.footerinstagramlinkcheck();
		UtilitiesCommon.log("Verified footer instagram link");
	}
	
	@Test(testName = "Footer section Social media Facebook link verification")
	@Description("This Test is used to Verify the Facebook social media link in Footersection")
	public void FootersocialmediaFacebook() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.log("Application is launched successfully in the browser");
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.log("Set WebDriver wait time to 30 seconds");
		BateelPage.clickGoButton();
		UtilitiesCommon.log("User has successfully trigger the Go button");
		BateelFooter.Acceptcookies();
		UtilitiesCommon.log("Cookies accept button clicked successfully at the footer");
		BateelFooter.footerfacebooklinkcheck();
		UtilitiesCommon.log("Verified footer facebook link");
	}
	
	@Test(testName = "Footer section Social media Twitter link verification")
	@Description("This Test is used to Verify the Twitter social media link in Footersection")
	public void FootersocialmediaTwitter() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.log("Application is launched successfully in the browser");
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.log("Set WebDriver wait time to 30 seconds");
		BateelPage.clickGoButton();
		UtilitiesCommon.log("User has successfully trigger the Go button");
		BateelFooter.Acceptcookies();
		UtilitiesCommon.log("Cookies accept button clicked successfully at the footer");
		BateelFooter.footertwitterlinkcheck();
		UtilitiesCommon.log("Verified footer twitter link");
	}
	
	@Test(testName = "Footer section Social media Linkedin link verification")
	@Description("This Test is used to Verify the Linkedin social media link in Footersection")
	public void FootersocialmediaLinkedin() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.log("Application is launched successfully in the browser");
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.log("Set WebDriver wait time to 30 seconds");
		BateelPage.clickGoButton();
		UtilitiesCommon.log("User has successfully trigger the Go button");
		BateelFooter.Acceptcookies();
		UtilitiesCommon.log("Cookies accept button clicked successfully at the footer");
		BateelFooter.footerlinkedinlinkcheck();
		UtilitiesCommon.log("Verified footer linkedin link");
	}
	
	@Test(testName = "Footer section Social media Youtube link verification")
	@Description("This Test is used to Verify the Youtube social media link in Footersection")
	public void FootersocialmediaYoutube() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.log("Application is launched successfully in the browser");
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.log("Set WebDriver wait time to 30 seconds");
		BateelPage.clickGoButton();
		UtilitiesCommon.log("User has successfully trigger the Go button");
		BateelFooter.Acceptcookies();
		UtilitiesCommon.log("Cookies accept button clicked successfully at the footer");
		BateelFooter.footeryoutubelinkcheck();
		UtilitiesCommon.log("Verified footer youtube link");
	}
	
	@Test(testName = "Footer section Terms and conditions link verification")
	@Description("This Test is used to Verify the Youtube social media link in Footersection")
	public void FooterTermsandconditionslink() {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.log("Application is launched successfully in the browser");
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.log("Set WebDriver wait time to 30 seconds");
		BateelPage.clickGoButton();
		UtilitiesCommon.log("User has successfully trigger the Go button");
		BateelFooter.Acceptcookies();
		UtilitiesCommon.log("Cookies accept button clicked successfully at the footer");
		BateelFooter.footertermsandconditionslinkcheck();
		UtilitiesCommon.log("Verified footer terms and conditions link");
	}
	
	@Test(testName = "Footer section Privacy policy link verification")
	@Description("This Test is used to Verify the Youtube social media link in Footersection")
	public void FooterPrivacypolicylink() {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.log("Application is launched successfully in the browser");
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.log("Set WebDriver wait time to 30 seconds");
		BateelPage.clickGoButton();
		UtilitiesCommon.log("User has successfully trigger the Go button");
		BateelFooter.Acceptcookies();
		UtilitiesCommon.log("Cookies accept button clicked successfully at the footer");
		BateelFooter.footerPrivacypolicylinkcheck();
		UtilitiesCommon.log("Verified footer Privacy policy link");
	}
}
