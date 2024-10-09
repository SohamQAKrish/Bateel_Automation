package page.bateel;

import common.UtilitiesCommon;
import enums.bateel.BateelPLPPageEnum;

public class BateelPLPPage {

	/**
	 * @author Kdave
	 * @lastmodifiedby Kdave 
	 * Handles interactions for clicking on a product within the Product Listing Page (PLP).
	 */
	public static void clickProduct() {
		 UtilitiesCommon.waitForElementIsPresent(BateelPLPPageEnum.BATEEL_PLP_PAGE_ENUM_XPATH);
	     UtilitiesCommon.click(BateelPLPPageEnum.BATEEL_PLP_PAGE_ENUM_XPATH);       
	}
}