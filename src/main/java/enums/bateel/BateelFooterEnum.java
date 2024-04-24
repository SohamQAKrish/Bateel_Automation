package enums.bateel;

public enum BateelFooterEnum {

    BATEEL_Footer_cookiesAccept_ENUM_XPATH("//*[@id='action-custom-css']/a[2]");
    
    private final String label;

    // A private constructor that sets the label for each enum constant
    private BateelFooterEnum(String label) {
        this.label = label;
    }
    
    @Override
    public String toString() {
        return this.label;
    }


}
