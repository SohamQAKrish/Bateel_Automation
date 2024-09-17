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
		UtilitiesCommon.click(BateelCartPageEnum.BATEEL_CART_QTYUPDATE_ENUM_CSS);
		UtilitiesCommon.waitForMilliseconds(5000);
		int updatedQtyCount = UtilitiesCommon.getCartCount();
		System.out.println("Updated qty count: " + updatedQtyCount);
		Assert.assertEquals(updatedQtyCount, initialQtyCount + 1, "Product was not updated to the cart successfully.");
		UtilitiesCommon.waitForElementIsPresent(BateelCartPageEnum.BATEEL_CART_CHECKOUT_ENUM_CSS);
		UtilitiesCommon.click(BateelCartPageEnum.BATEEL_CART_CHECKOUT_ENUM_CSS);
	}
}