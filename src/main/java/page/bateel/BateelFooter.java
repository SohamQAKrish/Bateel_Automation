package page.bateel;

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
}
