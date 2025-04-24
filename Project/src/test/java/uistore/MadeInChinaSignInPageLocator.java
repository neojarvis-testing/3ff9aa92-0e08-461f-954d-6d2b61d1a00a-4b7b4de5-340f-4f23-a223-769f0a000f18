package uistore;

import org.openqa.selenium.By;

public class MadeInChinaSignInPageLocator {
    private MadeInChinaSignInPageLocator(){}
    public static final By popup=By.cssSelector("span[class='campaign-pop-close J-campaign-pop-close']");
    public static final By signintext = By.xpath("//span[text()='Sign in']");
    public static final By signinicon = By.cssSelector("i[class='ob-icon icon-personal nlr-icon']");
    public static final By joinfree = By.cssSelector("div[class='join-link']");
    public static final By email = By.cssSelector("input[name='email']");
    public static final By checkbox = By.cssSelector("label[class='ft-checkbox'] span[class='ft-checkbox-front']");
    public static final By verify = By.xpath("//button[text()='Verify Email']");
    public static final By next = By.cssSelector("button[class='ft-btn ft-btn-primary submit-btn']");
    public static final By verificationerror = By.xpath("//div[text()='Please enter the Verification Code.']");
    public static final By signnow = By.xpath("//a[text()='Sign in now']");
    public static final By inputemail = By.cssSelector("input[id='logonInfo.logUserName']");
    public static final By password = By.xpath("//input[@id='logonInfo.logPassword']");
    public static final By signin = By.xpath("//button[@id='sign-in-submit']");
    public static final By logionerror = By.xpath("//label[text()='This Email Address is not yet registered. ']");
    public static final By forgetpassword = By.cssSelector("a[id='forgot_pwd_link']");
    public static final By continued = By.cssSelector("button[id='continue-submit']");
    public static final By lasterror = By.xpath("//label[contains(text(),'Please enter the text in the image.')]");



}
