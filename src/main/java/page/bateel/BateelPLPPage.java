package page.bateel;

import org.testng.Assert;
import common.UtilitiesCommon;
import enums.bateel.BateelPLPPageEnum;

public class BateelPLPPage {

	public static void clickProduct() {
	    String expectedProductName = "Stella Green Tree Gift Box";
	    UtilitiesCommon.waitForElementIsPresent(BateelPLPPageEnum.BATEEL_PLP_PAGE_ENUM_CSS);
		UtilitiesCommon.click(BateelPLPPageEnum.BATEEL_PLP_PAGE_ENUM_CSS);
	    String actualProductName = UtilitiesCommon.getTextFromElement(BateelPLPPageEnum.BATEEL_PLP_PAGE_ENUM_CSS);
	    Assert.assertEquals(actualProductName, expectedProductName, "Expected product name '" + expectedProductName + "' does not match actual product name on the redirected page");
	}
}
