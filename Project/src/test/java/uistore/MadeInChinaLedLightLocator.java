package uistore;

import org.openqa.selenium.By;

public class MadeInChinaLedLightLocator {
    private MadeInChinaLedLightLocator(){}
    public static final By searchbar = By.cssSelector("input[class = 'nail-search-input']");
    public static final By verifyLed = By.cssSelector("em[class = 'product_word']");
    public static final By more = By.xpath("//a[@class = 'more-less']//span[text() = 'More']");
    public static final By ledStripFilter = By.cssSelector("a[href='//www.made-in-china.com/multi-search/LED%2Blights/F1--PP_led%2Bstrip%2Blight/1.html']");
    public static final By verifyFilter = By.xpath("//a[text()='Led Strip Light']");
    public static final By contactNow = By.xpath("(//a[@class = 'btn btn-main'])[1]");
    public static final By verifyInquiry = By.cssSelector("span[class = 'm-channel-name-content']");
    public static final By content = By.id("content");
    public static final By email = By.id("senderMail");
    public static final By sendEnquiry = By.xpath("(//input[@class = 'btn btn-main btn-big'])[1]");
    public static final By crossMark = By.cssSelector("span[class = 'dlg-close']");
    public static final By logo = By.cssSelector("a[href='//www.made-in-china.com']");
    public static final By verifyHomePage = By.xpath("//div[text()='Post My RFQ']");
    public static final By lightsAndLighting = By.xpath("//span[text() = 'Lights & Lighting' and @class = 'fl cate-name J-first-cate-name']");
    public static final By ledTube = By.xpath("//a[text()='LED Tube']");
    public static final By verifyLedTube = By.xpath("//h1[contains(text(),'LED Tube')]");
    public static final By ledTubeLightFilter = By.xpath("//a[text() = 'Led Light Tube']");
    public static final By colorTemp = By.xpath("//span[text()='Color Temperature']");
    public static final By warmwhite = By.xpath("//a[contains(text(),'Warm White')]");
}
