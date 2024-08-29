package enums.bateel;

public enum BateelFooterEnum {
    BATEEL_Footer_cookiesAccept_ENUM_XPATH("//*[@id='action-custom-css']/a[2]"),
    BATEEL_Footer_storeLogo_ENUM_XPATH("//img[@class='dark-logo']"),
	BATEEL_Footer_cmslikssection_ENUM_XPATH("//*[@id='html-body']/div[1]/footer/div/div[1]/div[2]/div[1]"),
	Bateel_Footer_Footerinsta_ENUM_XPATH("//*[@class='icon-social icon-instagram']"),
	Bateel_Footer_FooterFacebook_ENUM_XPATH("//*[@class='icon-social icon-facebook']"),
	Bateel_Footer_Footertwitter_ENUM_XPATH("//*[@class='icon-social icon-twitter']"),
	Bateel_Footer_Footerlinkedin_ENUM_XPATH("//*[@class='icon-social icon-linkedin']"),
	Bateel_Footer_Footeryoutube_ENUM_XPATH("//*[@class='icon-social icon-blogger']"),
	Bateel_Footer_Footertermsandconditions_ENUM_XPATH("//div[@class='footer-container']//*[text()='Terms & Conditions']"),
	Bateel_Footer_Footerterprivacypolicy_ENUM_XPATH("//div[@class='footer-container']//*[text()='Security & Privacy Policy']");

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
