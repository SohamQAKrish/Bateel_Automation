package page.bateel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.UtilitiesCommon;
import enums.bateel.BateelPDPPageEnum;

public class BateelPDPPage {

	public static void fillProductDetails() {
		UtilitiesCommon.waitForElementIsPresent(BateelPDPPageEnum.BATEEL_PDP_DRP_ENUM_CSS);
	    WebElement dropdownElement = UtilitiesCommon.getElement(BateelPDPPageEnum.BATEEL_PDP_DRP_ENUM_CSS);

	    // Use the Select class to interact with the dropdown
	    Select dropdown = new Select(dropdownElement);

	    dropdown.selectByVisibleText("Small");
	    
	    UtilitiesCommon.waitForElementIsPresent(BateelPDPPageEnum.BATEEL_PDP_FILLING_ENUM_CSS);
	    WebElement dropdownElementfill = UtilitiesCommon.getElement(BateelPDPPageEnum.BATEEL_PDP_FILLING_ENUM_CSS);

	    // Use the Select class to interact with the dropdown
	    Select filldetail = new Select(dropdownElementfill);

	    // Use filldetail to select an option from the second dropdown
	    filldetail.selectByVisibleText("Assorted Dates");
	    
	    UtilitiesCommon.waitForElementIsPresent(BateelPDPPageEnum.BATEEL_PDP_ADDTOCART_ENUM_CSS);
		UtilitiesCommon.click(BateelPDPPageEnum.BATEEL_PDP_ADDTOCART_ENUM_CSS);
		
	}
}
