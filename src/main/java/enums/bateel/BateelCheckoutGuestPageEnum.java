package enums.bateel;

public enum BateelCheckoutGuestPageEnum {

	BATEEL_GUEST_BUTTON_ENUM_XPATH("//span[contains(text(),'CONTINUE WITHOUT AN ACCOUNT')]"),
    BATEEL_GUEST_FNAME_ENUM_NAME("firstname"),
    BATEEL_GUEST_LNAME_ENUM_NAME("lastname"),
    BATEEL_GUEST_STREET_ENUM_NAME("street[0]"),
//    BATEEL_GUEST_CITY_ENUM_XPATH("//input[@class='input-text' and @aria-describedby='error-DNH3BD8' and @name='city']"),
  BATEEL_GUEST_CITY_ENUM_XPATH("//input[@class='input-text' and @name='city']"),
  BATEEL_GUEST_COUNTRY_ENUM_NAME("country_id"),
    BATEEL_GUEST_POSTCODE_ENUM_NAME("postcode"),
    BATEEL_GUEST_STATE_ENUM_NAME("region_id"),
    BATEEL_GUEST_TELEPHONE_ENUM_NAME("telephone"),
    BATEEL_GUEST_AGREE_ENUM_NAME("international_disclaimer"),
    BATEEL_GUEST_TRACKEMAIL_ENUM_ID("guest-email"),
  //  BATEEL_GUEST_PROCEEDTOBILLING_ENUM_XPATH("//input[@class='button action continue primary' and @type='submit']");
    BATEEL_GUEST_PROCEEDTOBILLING_ENUM_XPATH("//*[@id=\"shipping-method-buttons-container\"]/div/button"),
    
    BATEEL_GUEST_PLACEORDER_ENUM_XPATH("//span[contains(text(),'Place Order') and not(ancestor::div[contains(@style, 'display: none')])]");

	
   
	    private final String label;

	    // A private constructor that sets the label for each enum constant
	    private BateelCheckoutGuestPageEnum(String label) {
	        this.label = label;
	    }

	    // Override the toString() method to return the label
	    @Override
	    public String toString() {
	        return this.label;
	    }
	}

