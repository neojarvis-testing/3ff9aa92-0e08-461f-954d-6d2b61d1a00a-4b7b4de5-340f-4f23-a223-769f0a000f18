package uistore;

import org.openqa.selenium.By;

public class MadeInChinaSignInPageLocator {
    public static By popup=By.cssSelector("span[class='campaign-pop-close J-campaign-pop-close']");
    public static By signintext = By.xpath("//span[text()='Sign in']");
    public static By signinicon = By.cssSelector("i[class='ob-icon icon-personal nlr-icon']");
    public static By joinfree = By.cssSelector("div[class='join-link']");
    public static By email = By.cssSelector("input[name='email']");
    public static By checkbox = By.cssSelector("label[class='ft-checkbox'] span[class='ft-checkbox-front']");
    public static By verify = By.xpath("//button[text()='Verify Email']");
     public static By next = By.cssSelector("button[class='ft-btn ft-btn-primary submit-btn']");
    public static By verificationerror = By.xpath("//div[text()='Please enter the Verification Code.']");
    public static By signnow = By.xpath("//a[text()='Sign in now']");
    public static By inputemail = By.cssSelector("input[id='logonInfo.logUserName']");
    public static By password = By.xpath("//input[@id='logonInfo.logPassword']");
    public static By signin = By.xpath("//button[@id='sign-in-submit']");
    public static By logionerror = By.xpath("//label[text()='This Email Address is not yet registered. ']");
    public static By forgetpassword = By.cssSelector("a[id='forgot_pwd_link']");
    public static By continued = By.cssSelector("button[id='continue-submit']");
    public static By lasterror = By.xpath("//label[contains(text(),'Please enter the text in the image.')]");



}
