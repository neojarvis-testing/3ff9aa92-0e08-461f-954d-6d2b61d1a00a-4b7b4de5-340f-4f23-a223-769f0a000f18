package uistore;

import org.openqa.selenium.By;

public class MadeInChinaLanguagePageLocator {
    private MadeInChinaLanguagePageLocator(){}
    public static final By popup = By.xpath("//span[@class='campaign-pop-close J-campaign-pop-close']");
    public static final By signIn = By.xpath("//span[text()='Sign in']");
    public static final By joinFree = By.cssSelector("div[class='join-link'] a[class='nail-btn']");
    public static final By verifyCreateAccount = By.xpath("//div[@class='register-form-title']");
    public static final By signInNow = By.cssSelector("div[class='title-tip'] a[ads-data='st:131']");
    public static final By verifySignIn = By.id("logonWithEmailCode");
    public static final By languageSelect = By.cssSelector("div[class='language-switch pc-show']");
    public static final By spanish = By.xpath("(//a[text()='Español'])[1]");
    public static final By french = By.xpath("(//a[text()='Français'])[1]");
    public static final By german = By.xpath("(//a[text()='Deutsch'])[1]");
    public static final By russian = By.xpath("(//a[text()='Русский язык'])[1]");
    public static final By japanese = By.xpath("(//a[text()='日本語'])[1]");
    public static final By english = By.xpath("(//a[text()='English'])[1]");
    public static final By languageVerify = By.xpath("//div[@class='form-item']/child::label[@class='form-label']");
}
