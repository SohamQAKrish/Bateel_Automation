package page.bateel;

import common.UtilitiesCommon;
import enums.bateel.BateelPLPPageEnum;

public class BateelPLPPage {

	public static void clickProduct() {
		UtilitiesCommon.waitForElementIsPresent(BateelPLPPageEnum.BATEEL_PLP_PAGE_ENUM_CSS);
		UtilitiesCommon.click(BateelPLPPageEnum.BATEEL_PLP_PAGE_ENUM_CSS);
	}

	
}
