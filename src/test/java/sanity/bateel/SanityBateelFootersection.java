package sanity.bateel;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.UtilitiesCommon;
import io.qameta.allure.Description;
import page.bateel.BateelFooter;
import page.bateel.BateelHeader;
import page.bateel.BateelPage;

@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityBateelFootersection {

	@Test(testName = "Footer section CMS links verification")
	@Description("This Test is used to Verify the Navigation of the CMS pages in Footersection")
	public void Footercmslinks() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.setupWebdriverWait(30);
		BateelPage.clickGoButton();
		BateelFooter.Acceptcookies();
		BateelFooter.footerCMSlinkscheck();
	}

	@Test(testName = "Footer section logo verification")
	@Description("This Test is used to Verify the logo in Footersection")
	public void Footerlogo() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.setupWebdriverWait(30);
		BateelPage.clickGoButton();
		BateelFooter.Acceptcookies();
		BateelFooter.footerlogocheck();
	}

	@Test(testName = "Footer section Social media instagram link verification")
	@Description("This Test is used to Verify the instagram social media link in Footersection")
	public void Footersocialmediainstagram() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.setupWebdriverWait(30);
		BateelPage.clickGoButton();
		BateelFooter.Acceptcookies();
		BateelFooter.footerinstagramlinkcheck();
	}
	@Test(testName = "Footer section Social media Facebook link verification")
	@Description("This Test is used to Verify the Facebook social media link in Footersection")
	public void FootersocialmediaFacebook() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.setupWebdriverWait(30);
		BateelPage.clickGoButton();
		BateelFooter.Acceptcookies();
		BateelFooter.footerfacebooklinkcheck();
	}
	@Test(testName = "Footer section Social media Twitter link verification")
	@Description("This Test is used to Verify the Twitter social media link in Footersection")
	public void FootersocialmediaTwitter() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.setupWebdriverWait(30);
		BateelPage.clickGoButton();
		BateelFooter.Acceptcookies();
		BateelFooter.footertwitterlinkcheck();
	}
	@Test(testName = "Footer section Social media Linkedin link verification")
	@Description("This Test is used to Verify the Linkedin social media link in Footersection")
	public void FootersocialmediaLinkedin() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.setupWebdriverWait(30);
		BateelPage.clickGoButton();
		BateelFooter.Acceptcookies();
		BateelFooter.footerlinkedinlinkcheck();
	}
	@Test(testName = "Footer section Social media Youtube link verification")
	@Description("This Test is used to Verify the Youtube social media link in Footersection")
	public void FootersocialmediaYoutube() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.setupWebdriverWait(30);
		BateelPage.clickGoButton();
		BateelFooter.Acceptcookies();
		BateelFooter.footeryoutubelinkcheck();
	}
	@Test(testName = "Footer section Terms and conditions link verification")
	@Description("This Test is used to Verify the Youtube social media link in Footersection")
	public void FooterTermsandconditionslink() {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.setupWebdriverWait(30);
		BateelPage.clickGoButton();
		BateelFooter.Acceptcookies();
		BateelFooter.footertermsandconditionslinkcheck();
	}
	@Test(testName = "Footer section Privacy policy link verification")
	@Description("This Test is used to Verify the Youtube social media link in Footersection")
	public void FooterPrivacypolicylink() {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.setupWebdriverWait(30);
		BateelPage.clickGoButton();
		BateelFooter.Acceptcookies();
		BateelFooter.footerPrivacypolicylinkcheck();
	}

}
