package page.bateel;

import org.testng.Assert;
import common.UtilitiesCommon;
import enums.bateel.BateelPDPPageEnum;

public class BateelPDPPage {

	public static void fillProductDetails() {
		UtilitiesCommon.waitForElementIsPresent(BateelPDPPageEnum.BATEEL_PDP_DRP_ENUM_CSS);
		UtilitiesCommon.selectByVisibleText(BateelPDPPageEnum.BATEEL_PDP_DRP_ENUM_CSS, "Small");
		UtilitiesCommon.selectByVisibleText(BateelPDPPageEnum.BATEEL_PDP_FILLING_ENUM_CSS, "Assorted Dates");
		UtilitiesCommon.waitForElementIsPresent(BateelPDPPageEnum.BATEEL_PDP_ADDTOCART_ENUM_CSS);
		UtilitiesCommon.click(BateelPDPPageEnum.BATEEL_PDP_ADDTOCART_ENUM_CSS);
		int initialCartCount = UtilitiesCommon.getCartCount();
	    UtilitiesCommon.waitForMilliseconds(5000);
	    int updatedCartCount = UtilitiesCommon.getCartCount();
	    Assert.assertEquals(updatedCartCount, initialCartCount + 1, "Product was not added to the cart successfully.");
	}
}
