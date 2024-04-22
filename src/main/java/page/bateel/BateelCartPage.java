package page.bateel;


import common.UtilitiesCommon;
import enums.bateel.BateelCartPageEnum;

public class BateelCartPage {

	public static void addToCart() {
		
		UtilitiesCommon.waitForElementIsPresent(BateelCartPageEnum.BATEEL_CART_ICON_ENUM_CSS);
		UtilitiesCommon.click(BateelCartPageEnum.BATEEL_CART_ICON_ENUM_CSS);
		
		UtilitiesCommon.waitForElementIsPresent(BateelCartPageEnum.BATEEL_CART_QTYUPDATE_ENUM_CSS);
		UtilitiesCommon.click(BateelCartPageEnum.BATEEL_CART_QTYUPDATE_ENUM_CSS);
		
		UtilitiesCommon.waitForElementIsPresent(BateelCartPageEnum.BATEEL_CART_CHECKOUT_ENUM_CSS);
		UtilitiesCommon.click(BateelCartPageEnum.BATEEL_CART_CHECKOUT_ENUM_CSS);
}
	
	
}