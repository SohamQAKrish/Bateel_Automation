package enums.bateel;

public enum BateelFooterEnum {

    BATEEL_Footer_cookiesAccept_ENUM_XPATH("//*[@id='action-custom-css']/a[2]"),
    BATEEL_Footer_storeLogo_ENUM_XPATH("//img[@class='dark-logo']"),
	BATEEL_Footer_cmslikssection_ENUM_XPATH("//*[@id='html-body']/div[1]/footer/div/div[1]/div[2]/div[1]");
    
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
