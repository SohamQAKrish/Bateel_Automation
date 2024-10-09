package enums.bateel;

public enum BateelCartPageEnum {
	BATEEL_CART_ICON_ENUM_CSS(".counter-number"), 
	BATEEL_CART_QTYUPDATE_ENUM_CSS(".more"),
	BATEEL_MAIN_CART_VIEW_ENUM_XPATH("//span[normalize-space()='View and Edit Cart']"),
	BATEEL_MAIN_CART_QTY_INCREASE_ENUM_XPATH("//span[@class='icon icon-plus']"),
	BATEEL_MAIN_CART_UPDATE_ENUM_XPATH("//span[normalize-space()='Update Cart']"),
	BATEEL_CART_CHECKOUT_ENUM_CSS("button[title='Proceed to Checkout'] span");

	// A private variable to store the label
	private final String label;

	// A private constructor that sets the label for each enum constant
	private BateelCartPageEnum(String label) {
		this.label = label;
	}

	// Override the toString() method to return the label
	@Override
	public String toString() {
		return this.label;
	}
}

