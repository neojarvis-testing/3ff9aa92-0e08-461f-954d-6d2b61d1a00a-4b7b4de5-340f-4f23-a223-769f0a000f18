package uistore;

import org.openqa.selenium.By;

public class MadeInChinaLanguagePageLocator {
    //HomePageLocators
    public static By popup = By.xpath("//span[@class='campaign-pop-close J-campaign-pop-close']");
    public static By signIn = By.xpath("//span[text()='Sign in']");
    public static By joinFree = By.cssSelector("div[class='join-link'] a[class='nail-btn']");

    //SignInPageLocators
    public static By verifyCreateAccount = By.xpath("//div[@class='register-form-title']");
    public static By signInNow = By.cssSelector("div[class='title-tip'] a[ads-data='st:131']");

    //LanguagePageLocators
    public static By verifySignIn = By.id("logonWithEmailCode");
    public static By languageSelect = By.cssSelector("div[class='language-switch pc-show']");
    public static By spanish = By.xpath("(//a[text()='Español'])[1]");
    public static By french = By.xpath("(//a[text()='Français'])[1]");
    public static By german = By.xpath("(//a[text()='Deutsch'])[1]");
    public static By russian = By.xpath("(//a[text()='Русский язык'])[1]");
    public static By japanese = By.xpath("(//a[text()='日本語'])[1]");
    public static By english = By.xpath("(//a[text()='English'])[1]");
    public static By languageVerify = By.xpath("//div[@class='form-item']/child::label[@class='form-label']");
}
