package enums.bateel;

public enum BateelHeaderEnum {
	BATEEL_Header_menucategorypanel_ENUM_XPATH("//*[@id='ui-id-4']"),
	BATEEL_Header_shopmenulink_ENUM_XPATH("//*[@id='ui-id-3']");

	// A private variable to store the label
    private final String label;

    // A private constructor that   sets the label for each enum constant  
    private BateelHeaderEnum(String label) {
        this.label = label;
    }

    // Override the toString() method to return the label
    @Override
    public String toString() {
        return this.label;
    }
}
