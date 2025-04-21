package uistore;

import org.openqa.selenium.By;

public class SignInPageLocator {
    public static By signintext = By.cssSelector("div[class='login-link'] span:nth-child(1)");
    public static By signinicon = By.cssSelector("i[class='ob-icon icon-personal nlr-icon']");
    public static By joinfree = By.cssSelector("div[class='join-link'] a:nth-child(1)");
    public static By email = By.cssSelector("input[name='email']");
    public static By checkbox = By.cssSelector("label[class='ft-checkbox'] span[class='ft-checkbox-front']");
    public static By verify = By.cssSelector("button[class]");
    public static By next = By.cssSelector("button[class='ft-btn ft-btn-primary submit-btn']");
    public static By verificationerror = By.cssSelector("div[class='verify-error']");
    


}
