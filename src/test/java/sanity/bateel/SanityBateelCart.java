package sanity.bateel;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.UtilitiesCommon;
import enums.bateel.BateelHomePageEnum;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import page.bateel.BateelCartPage;
import page.bateel.BateelPDPPage;
import page.bateel.BateelPLPPage;
import page.bateel.BateelPage;
import page.login.LoginPage;

@Listeners({ listeners.ScriptExecutionListener.class })

public class SanityBateelCart {

	public class SanityBateelAddToCart {

		@Test(testName = "Bateel product add to cart")
		@TmsLink("49700")
		@Description("This Test is used to add product into cart and click on checkout button")
		public void testBateeladdtocartitem() throws InterruptedException {
			LoginPage.login("Email", "Password");
			UtilitiesCommon.getDriver();
			UtilitiesCommon.setupWebdriverWait(30);
			BateelPage.clickGoButton();
			WebElement element = UtilitiesCommon.getElement(BateelHomePageEnum.BATEEL_HOME_PAGE_SHOP_CATEGORY_ID);
			UtilitiesCommon.waitForElementIsClickable(element);
			Thread.sleep(5000);
			BateelPage.verifyBateelShopCategory();
			UtilitiesCommon.setupWebdriverWait(60);
			BateelPLPPage.clickProduct();
			BateelPDPPage.fillProductDetails();
			BateelCartPage.addToCart();
		}
	}
}