package enums.bateel;

public enum BateelCartPageEnum {
	
	BATEEL_CART_ICON_ENUM_CSS(".counter-number"), BATEEL_CART_QTYUPDATE_ENUM_CSS(".more"),
	BATEEL_CART_CHECKOUT_ENUM_CSS("#top-cart-btn-checkout");

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

