package page.bateel;

import org.testng.Assert;
import common.UtilitiesCommon;
import enums.bateel.BateelCartPageEnum;

public class BateelCartPage {

	public static void addToCart() {
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.waitForElementIsPresent(BateelCartPageEnum.BATEEL_CART_ICON_ENUM_CSS);
		UtilitiesCommon.click(BateelCartPageEnum.BATEEL_CART_ICON_ENUM_CSS);
		UtilitiesCommon.waitForElementIsPresent(BateelCartPageEnum.BATEEL_CART_QTYUPDATE_ENUM_CSS);
		int initialQtyCount = UtilitiesCommon.getCartCount();
	    System.out.println("Initial qty count: " + initialQtyCount);
	    UtilitiesCommon.click(BateelCartPageEnum.BATEEL_CART_QTYUPDATE_ENUM_CSS);
	    UtilitiesCommon.waitForMilliseconds(1000);
	    int updatedQtyCount = UtilitiesCommon.getCartCount();
	    System.out.println("Updated qty count: " + updatedQtyCount);
	    Assert.assertEquals(updatedQtyCount, initialQtyCount + 1, "Product was not updated to the cart successfully.");
	    UtilitiesCommon.waitForElementIsPresent(BateelCartPageEnum.BATEEL_MAIN_CART_VIEW_ENUM_XPATH);
	    UtilitiesCommon.click(BateelCartPageEnum.BATEEL_MAIN_CART_VIEW_ENUM_XPATH);
	}

	public static void viewANDEditCart() {
		UtilitiesCommon.waitForElementIsPresent(BateelCartPageEnum.BATEEL_MAIN_CART_QTY_INCREASE_ENUM_XPATH);
		UtilitiesCommon.click(BateelCartPageEnum.BATEEL_MAIN_CART_QTY_INCREASE_ENUM_XPATH);
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.waitForElementIsPresent(BateelCartPageEnum.BATEEL_MAIN_CART_UPDATE_ENUM_XPATH);
		UtilitiesCommon.click(BateelCartPageEnum.BATEEL_MAIN_CART_UPDATE_ENUM_XPATH);
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.click(BateelCartPageEnum.BATEEL_CART_CHECKOUT_ENUM_CSS);

	}
}