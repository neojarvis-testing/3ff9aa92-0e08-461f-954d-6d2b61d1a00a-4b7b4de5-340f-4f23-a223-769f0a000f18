package uistore;

import org.openqa.selenium.By;

public class MadeInChinaLedLightLocator {
    public static By searchbar = By.cssSelector("input[class = 'nail-search-input']");
    public static By verifyLed = By.cssSelector("em[class = 'product_word']");
    public static By more = By.xpath("//a[@class = 'more-less']//span[text() = 'More']");
    public static By ledStripFilter = By.cssSelector("a[href='//www.made-in-china.com/multi-search/LED%2Blights/F1--PP_led%2Bstrip%2Blight/1.html']");
    public static By verifyFilter = By.xpath("//a[text()='Led Strip Light']");
    public static By contactNow = By.xpath("(//a[@class = 'btn btn-main'])[1]");
    public static By verifyInquiry = By.cssSelector("span[class = 'm-channel-name-content']");
    public static By content = By.id("content");
    public static By email = By.id("senderMail");
    public static By sendEnquiry = By.xpath("(//input[@class = 'btn btn-main btn-big'])[1]");
    public static By crossMark = By.cssSelector("span[class = 'dlg-close']");
    public static By logo = By.cssSelector("a[href='//www.made-in-china.com']");
    public static By verifyHomePage = By.xpath("//div[text()='Post My RFQ']");
    public static By lightsAndLighting = By.xpath("//span[text() = 'Lights & Lighting' and @class = 'fl cate-name J-first-cate-name']");
    public static By ledTube = By.xpath("//a[text()='LED Tube']");
    public static By verifyLedTube = By.xpath("//h1[contains(text(),'LED Tube')]");
    public static By ledTubeLightFilter = By.xpath("//a[text() = 'Led Light Tube']");
    public static By colorTemp = By.xpath("//span[text()='Color Temperature']");
    public static By warmwhite = By.xpath("//a[contains(text(),'Warm White')]");
}
