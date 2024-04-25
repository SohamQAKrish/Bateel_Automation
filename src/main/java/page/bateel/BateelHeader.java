package page.bateel;

import static org.testng.Assert.assertTrue;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import common.UtilitiesCommon;
import enums.bateel.BateelHeaderEnum;

/*This class contains header methods to verify the category links navigation
 */
public class BateelHeader {
	public static void Verifymenucategorylinks() throws InterruptedException {
		UtilitiesCommon.waitForElementIsPresent(BateelHeaderEnum.BATEEL_Header_menucategorypanel_ENUM_XPATH);
		WebElement categorypanel = UtilitiesCommon
				.getElement(BateelHeaderEnum.BATEEL_Header_menucategorypanel_ENUM_XPATH);
		List<WebElement> elements = categorypanel.findElements(By.tagName("a"));
		for (int i = 0; i < elements.size() - 1; i++) {
			String categorylinktitle = elements.get(i).getText();
			System.out.println("link text" + categorylinktitle);
			elements.get(i).click();
			UtilitiesCommon.waitForElementIsPresent(BateelHeaderEnum.BATEEL_Header_shopmenulink_ENUM_XPATH);
			System.out.println("afterclick page title" + UtilitiesCommon.gettitle());
			if (UtilitiesCommon.gettitle().contains("404")) {
				assertTrue(false, "category link navigated to 404");
			} else {
				UtilitiesCommon.isElementPresent(BateelHeaderEnum.BATEEL_Header_shopmenulink_ENUM_XPATH);
				assertTrue(true, "category page loaded properly" + UtilitiesCommon.gettitle());
			}
			HoveronShopcategory();
			UtilitiesCommon.waitForElementIsPresent(BateelHeaderEnum.BATEEL_Header_menucategorypanel_ENUM_XPATH);
			UtilitiesCommon.scrollDownSlightly();
			categorypanel = UtilitiesCommon.getElement(BateelHeaderEnum.BATEEL_Header_menucategorypanel_ENUM_XPATH);
			elements = categorypanel.findElements(By.tagName("a"));
		}
	}

	public static void HoveronShopcategory() throws InterruptedException {
		// Thread.sleep(10000);
		UtilitiesCommon.waitForMilliseconds(10000);
		UtilitiesCommon.waitForElementIsPresent(BateelHeaderEnum.BATEEL_Header_shopmenulink_ENUM_XPATH);
		UtilitiesCommon.hoverOverElement(BateelHeaderEnum.BATEEL_Header_shopmenulink_ENUM_XPATH);
	}
}
