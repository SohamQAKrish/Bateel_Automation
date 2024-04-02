package enums.login;

/**
 * This enum will store objects available on Login page.
 * @author spandit
 * @lastmodifiedby spandit
 */

/*
 * Note: Enum key should be in capital case and should end with either of below
 * locator types: ID, XPATH, LINKTEXT, PARTIALLINKTEXT, CSS, NAME, TAGNAME, CLASSNAME 
 */
/**
 * @author spandit
 * @lastmodifiedby spandit 
 * This class will contain all the Enums for Login Page
 */
public enum LoginPageEnum {
	
	 	LOGINPAGE_USERNAME_TEXT_BOX_NAME("login[username]"),
	    LOGINPAGE_PASSWORD_TEXT_BOX_NAME("login[password]"),
	    LOGINPAGE_LOGIN_BUTTON_NAME("send");
	

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