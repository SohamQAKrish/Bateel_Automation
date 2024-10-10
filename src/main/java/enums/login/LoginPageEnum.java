package enums.login;

public enum LoginPageEnum {
	LOGINPAGE_USERNAME_TEXT_BOX_NAME("login[username]"), 
	LOGINPAGE_PASSWORD_TEXT_BOX_NAME("login[password]"),
	LOGINPAGE_LOGIN_BUTTON_NAME("send"), 
	LOGINPAGE_LOGOUT_BUTTON_XPATH("//a[normalize-space()='Sign Out']");

	// Store the label for each enum constant
	private final String label;

	// Constructor to initialize the label for each enum constant
	LoginPageEnum(String label) {
		this.label = label;
	}

	// Override the toString() method to return the label
	@Override
	public String toString() {
		return this.label;
	}
}