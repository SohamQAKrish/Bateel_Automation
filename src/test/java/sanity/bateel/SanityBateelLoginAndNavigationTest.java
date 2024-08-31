package sanity.bateel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page.login.LoginPage;

import common.UtilitiesCommon;
import enums.bateel.BateelHomePageEnum;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import page.bateel.BateelPage;

/**
 * @author spandit
 * @lastmodifiedby kdave
 * This class will contain all Sanity tests related to Login and Navigations to different modules across the Onitsuka application.
 */
@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityBateelLoginAndNavigationTest {
	/**
	 * @author spandit
	 * @lastmodifiedby kdave
	 */
//	@Test(testName = "Bateel Web Application Navigation")
//	@TmsLink("49700")
//	@Description("This Test is used to Verify the header title of Bateel Web Application Home Page")
//	public void testBateelPageHeaderTitle() {
//		LoginPage.login("Email", "Password");
//		BateelPage.verifyBateelPageHeaderTitle();
//	}
	
	/**`
	 * @author spandit
	 * @throws InterruptedException 
	 * @lastmodifiedby kdave
	 */
	@Test(testName = "Bateel Shop Category Navigation")
	@TmsLink("49700")
	@Description("This Test is used to Verify the Navigation to the Shop Category")
	public void testBateelShopCategoryNavigation() throws InterruptedException {

	
		WebDriver driver = UtilitiesCommon.getDriver(); // Get the driver instance from UtilitiesCommon or wherever it's initialized
	    UtilitiesCommon.setupWebdriverWait(30); // Increase wait time to 30 seconds
		BateelPage.clickGoButton();
		WebElement element = UtilitiesCommon.getElement(BateelHomePageEnum.BATEEL_HOME_PAGE_SHOP_CATEGORY_ID);
		UtilitiesCommon.waitForElementIsClickable(element);	
		Thread.sleep(5000);
		BateelPage.verifyBateelShopCategory();
	    UtilitiesCommon.setupWebdriverWait(60); 
//	    BateelPage.clickProfileIcon();
//	    UtilitiesCommon.setupWebdriverWait(30); 
//	    
//	    WebDriverWait wait = new WebDriverWait(driver, 30);
//	    WebElement dropdownMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dropdown switcher-dropdown")));
//
//	    // Perform mouse hover action on the dropdown menu
//	    Actions actions = new Actions(driver);
//	    actions.moveToElement(dropdownMenu).perform();
//
//	    // Get the My Account link and click on it
//	    WebElement myAccountLink = driver.findElement(By.id("idC9LTvTLN"));
//
//	    // Wait for the My Account link to be clickable and visible
//	    wait.until(ExpectedConditions.elementToBeClickable(myAccountLink));
//
//	    // Click on the My Account link
//	    myAccountLink.click();

	}
}