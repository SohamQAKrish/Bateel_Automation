package enums.bateel;

public enum BateelPDPPageEnum {
//	BATEEL_PDP_DRP_ENUM_CSS("#attribute157"), 
	BATEEL_PDP_QTY_ENUM_CSS(".icon.icon-plus"),
//	BATEEL_PDP_FILLING_ENUM_CSS("#attribute158"),
	BATEEL_PDP_ADDTOCART_ENUM_CSS("button[id='product-addtocart-button'] span");

	// A private variable to store the label
	private final String label;

	// A private constructor that sets the label for each enum constant
	private BateelPDPPageEnum(String label) {
		this.label = label;
	}

	// Override the toString() method to return the label
	@Override
	public String toString() {
		return this.label;
	}
}