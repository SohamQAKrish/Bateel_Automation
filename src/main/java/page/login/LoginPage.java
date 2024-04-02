package page.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.UtilitiesCommon;
import enums.login.LoginPageEnum;

/**
 * @author spandit
 * @lastmodifiedby spandit 
 * This class will contain all the Login page methods
 */
public class LoginPage {
	/**
	 * This method is used to Login into the application
	 * @param usernameKey
	 * @param passwordKey
	 * @author spandit
	 * @lastmodifiedby spandit
	 */
	public static void login(String emailKey, String passwordKey) {
		UtilitiesCommon.launchApplication();
//		String email = UtilitiesCommon.getEnvironmentData(emailKey);
//		String password = UtilitiesCommon.getEnvironmentData(passwordKey);
//		UtilitiesCommon.log("Logging in with Email : " + email);
//		UtilitiesCommon.enterValue(LoginPageEnum.LOGINPAGE_USERNAME_TEXT_BOX_NAME, email);
//		UtilitiesCommon.enterValue(LoginPageEnum.LOGINPAGE_PASSWORD_TEXT_BOX_NAME, UtilitiesCommon.getDecryptedPassword(password));
//		UtilitiesCommon.click(LoginPageEnum.LOGINPAGE_LOGIN_BUTTON_NAME);
//		
	}


	/**
	 * This method is used to re-Login into the application after Logout
	 * @param usernameKey
	 * @param passwordKey
	 * @author spandit
	 * @lastmodifiedby spandit
	 */
	public static void reloginAfterLogout(String usernameKey, String passwordKey) {
	   UtilitiesCommon.openUrl();
//		String email = UtilitiesCommon.getEnvironmentData(usernameKey);
//		String password = UtilitiesCommon.getEnvironmentData(passwordKey);
//		UtilitiesCommon.log("Logging in with Email  : " + email);
//		UtilitiesCommon.enterValue(LoginPageEnum.LOGINPAGE_USERNAME_TEXT_BOX_NAME, email);
//		UtilitiesCommon.enterValue(LoginPageEnum.LOGINPAGE_PASSWORD_TEXT_BOX_NAME,
//				UtilitiesCommon.getDecryptedPassword(password));
//		UtilitiesCommon.click(LoginPageEnum.LOGINPAGE_LOGIN_BUTTON_NAME);
	}
}