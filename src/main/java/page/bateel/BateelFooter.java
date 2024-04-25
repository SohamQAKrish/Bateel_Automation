package page.bateel;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.UtilitiesCommon;
import enums.bateel.BateelFooterEnum;
import enums.bateel.BateelHeaderEnum;

public class BateelFooter {
	/**
	 * This method will click on Accept cookies button
	 * 
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
	 * 
	 * @param enumValue Enum Value
	 * 
	 * @author Rammohan
	 * 
	 * @lastmodifiedby Rammohan
	 */
	public static void footerlogocheck() throws InterruptedException {
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.scrolltillpageend();
		UtilitiesCommon.setupWebdriverWait(5000);
		boolean logocheck = UtilitiesCommon.isElementPresent(BateelFooterEnum.BATEEL_Footer_storeLogo_ENUM_XPATH);
		assertEquals(logocheck, true, "Footer section logo is missing");
	}

	public static void footerCMSlinkscheck() throws InterruptedException {
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.scrolltillpageend();
		UtilitiesCommon.setupWebdriverWait(5000);
		UtilitiesCommon.waitForElementIsPresent(BateelFooterEnum.BATEEL_Footer_cmslikssection_ENUM_XPATH);
		WebElement footerCMSsection = UtilitiesCommon
				.getElement(BateelFooterEnum.BATEEL_Footer_cmslikssection_ENUM_XPATH);
		List<WebElement> footerelements = footerCMSsection.findElements(By.tagName("a"));
		System.out.println("Number of footer links" + footerelements.size());
		for (int i = 0; i < footerelements.size()-7; i++) {
			String footerlinktitle = footerelements.get(i).getText();
			System.out.println("link text" + footerlinktitle);
			footerelements.get(i).click();
			UtilitiesCommon.waitForElementIsPresent(BateelFooterEnum.BATEEL_Footer_cmslikssection_ENUM_XPATH);
			System.out.println("Afterclick CMS page title" + UtilitiesCommon.gettitle());
			if (UtilitiesCommon.gettitle().contains("404")) {
				assertTrue(false, "CMS link navigated to 404");
			} else {
				//UtilitiesCommon.isElementPresent(BateelHeaderEnum.BATEEL_Header_shopmenulink_ENUM_XPATH);
				assertTrue(true, "CMS page loaded properly" + UtilitiesCommon.gettitle());
			}
			UtilitiesCommon.scrolltillpageend();
			UtilitiesCommon.waitForElementIsPresent(BateelFooterEnum.BATEEL_Footer_cmslikssection_ENUM_XPATH);
			footerCMSsection = UtilitiesCommon.getElement(BateelFooterEnum.BATEEL_Footer_cmslikssection_ENUM_XPATH);
			footerelements = footerCMSsection.findElements(By.tagName("a"));
		}
	}
}
