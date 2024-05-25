package enums.bateel;

public enum BateelPLPPageEnum {

	BATEEL_PLP_PAGE_ENUM_CSS("img[alt='Stella Green Tree Gift Box']");

	// A private variable to store the label
	private final String label;

	// A private constructor that sets the label for each enum constant
	private BateelPLPPageEnum(String label) {
		this.label = label;
	}

	// Override the toString() method to return the label
	@Override
	public String toString() {
		return this.label;
	}
}
