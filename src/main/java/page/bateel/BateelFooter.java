package page.bateel;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import common.UtilitiesCommon;
import enums.bateel.BateelFooterEnum;

public class BateelFooter {
	/**
	 * This method will click on Accept cookies button
	 * @param enumValue Enum Value
	 * @author Rammohan
	 * @lastmodifiedby Rammohan
	 */
	public static void Acceptcookies() {
		UtilitiesCommon.waitForElementIsPresent(BateelFooterEnum.BATEEL_Footer_cookiesAccept_ENUM_XPATH);
		UtilitiesCommon.getElement(BateelFooterEnum.BATEEL_Footer_cookiesAccept_ENUM_XPATH).click();
	}
	
	/*
	 * This method is to verify the Footer logo
	 * @param enumValue Enum Value
	 * @author Rammohan
	 * @lastmodifiedby Rammohan
	 */
	public static void footerlogocheck() throws InterruptedException {
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.scrolltillpageend();
		UtilitiesCommon.setupWebdriverWait(5000);
		boolean logocheck = UtilitiesCommon.isElementPresent(BateelFooterEnum.BATEEL_Footer_storeLogo_ENUM_XPATH);
		assertEquals(logocheck, true, "Footer section logo is missing");
	}
	
	/*
	 * This method is to verify the Footer CMS links navigation
	 * @param enumValue Enum Value
	 * @author Rammohan
	 * @lastmodifiedby Rammohan
	 */
	public static void footerCMSlinkscheck() throws InterruptedException {
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.scrolltillpageend();
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.waitForElementIsPresent(BateelFooterEnum.BATEEL_Footer_cmslikssection_ENUM_XPATH);
		WebElement footerCMSsection = UtilitiesCommon
				.getElement(BateelFooterEnum.BATEEL_Footer_cmslikssection_ENUM_XPATH);
		List<WebElement> footerelements = footerCMSsection.findElements(By.tagName("a"));
		System.out.println("Number of footer links" + footerelements.size());
		for (int i = 0; i < footerelements.size() - 7; i++) {
			footerelements.get(i).click();
			UtilitiesCommon.waitForElementIsPresent(BateelFooterEnum.BATEEL_Footer_cmslikssection_ENUM_XPATH);
			if (UtilitiesCommon.gettitle().contains("404")) {
				assertTrue(false, "CMS link navigated to 404");
			} else {
				assertTrue(true, "CMS page loaded properly" + UtilitiesCommon.gettitle());
			}
			UtilitiesCommon.scrolltillpageend();
			UtilitiesCommon.waitForElementIsPresent(BateelFooterEnum.BATEEL_Footer_cmslikssection_ENUM_XPATH);
			footerCMSsection = UtilitiesCommon.getElement(BateelFooterEnum.BATEEL_Footer_cmslikssection_ENUM_XPATH);
			footerelements = footerCMSsection.findElements(By.tagName("a"));
		}
	}
	
	/*
	 * This method is to verify the Footer social media link : Instagram
	 * @param enumValue Enum Value
	 * @author Rammohan
	 * @lastmodifiedby Rammohan
	 */
	public static void footerinstagramlinkcheck() throws InterruptedException {
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.scrolltillpageend();
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.click(BateelFooterEnum.Bateel_Footer_Footerinsta_ENUM_XPATH);
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.switchtoTab(1);
		UtilitiesCommon.waitForMilliseconds(3000);
		assertEquals(UtilitiesCommon.gettitle(), "Bateel (@bateelgourmet) • Instagram photos and videos",
				"instagram page title missmatch");
	}
	
	/*
	 * This method is to verify the Footer social media link : Facebook
	 * @param enumValue Enum Value
	 * @author Rammohan
	 * @lastmodifiedby Rammohan
	 */
	public static void footerfacebooklinkcheck() throws InterruptedException {
		UtilitiesCommon.waitForMilliseconds(2000);
		UtilitiesCommon.scrolltillpageend();
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.waitForMilliseconds(2000);
		UtilitiesCommon.click(BateelFooterEnum.Bateel_Footer_FooterFacebook_ENUM_XPATH);
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.switchtoTab(1);
		assertEquals(UtilitiesCommon.gettitle(),"Bateel International | Facebook", "Facebook page title missmatch");
	}
	
	/*
	 * This method is to verify the Footer social media link : Twitter
	 * @param enumValue Enum Value
	 * @author Rammohan
	 * @lastmodifiedby Rammohan
	 */
	public static void footertwitterlinkcheck() throws InterruptedException {
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.scrolltillpageend();
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.click(BateelFooterEnum.Bateel_Footer_Footertwitter_ENUM_XPATH);
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.switchtoTab(1);
		assertEquals(UtilitiesCommon.gettitle(), "Bateel International (@Bateelgourmet) / X", "Twitter page title missmatch");
	}
	
	/*
	 * This method is to verify the Footer social media link : Linkedin
	 * @param enumValue Enum Value
	 * @author Rammohan
	 * @lastmodifiedby Rammohan
	 */
	public static void footerlinkedinlinkcheck() throws InterruptedException {
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.scrolltillpageend();
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.click(BateelFooterEnum.Bateel_Footer_Footerlinkedin_ENUM_XPATH);
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.switchtoTab(1);
		assertEquals(UtilitiesCommon.gettitle(), "Bateel International | LinkedIn", "Linkedin page title missmatch");
	}
	
	/*
	 * This method is to verify the Footer social media link : Youtube
	 * @param enumValue Enum Value
	 * @author Rammohan
	 * @lastmodifiedby Rammohan
	 */
	public static void footeryoutubelinkcheck() throws InterruptedException {
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.scrolltillpageend();
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.click(BateelFooterEnum.Bateel_Footer_Footeryoutube_ENUM_XPATH);
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.switchtoTab(1);
		assertEquals(UtilitiesCommon.gettitle(), "Bateel International - YouTube", "Youtube page title missmatch");
	}
	
	/*
	 * This method is to verify the Footer Terms and conditions link
	 * @param enumValue Enum Value
	 * @author Rammohan
	 * @lastmodifiedby Rammohan
	 */
	public static void footertermsandconditionslinkcheck(){
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.scrolltillpageend();
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.click(BateelFooterEnum.Bateel_Footer_Footertermsandconditions_ENUM_XPATH);
		UtilitiesCommon.waitForMilliseconds(3000);
		assertEquals(UtilitiesCommon.gettitle(), "Terms & Conditions | Bateel", "Terms and conditions page title is not proper");
	}
	
	/*
	 * This method is to verify the Footer privacy policy
	 * @param enumValue Enum Value
	 * @author Rammohan
	 * @lastmodifiedby Rammohan
	 */
	public static void footerPrivacypolicylinkcheck(){
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.scrolltillpageend();
		UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.click(BateelFooterEnum.Bateel_Footer_Footerterprivacypolicy_ENUM_XPATH);
		UtilitiesCommon.waitForMilliseconds(3000);
		assertEquals(UtilitiesCommon.gettitle(), "Security & Privacy Policy | How We Use Data | Bateel", "Privacy policy page title is not proper");
	}
}
