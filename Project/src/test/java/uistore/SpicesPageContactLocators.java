package uistore;

import org.openqa.selenium.By;

public class SpicesPageContactLocators {
    public static By xmark = By.cssSelector("span[class='campaign-pop-close J-campaign-pop-close']"); 
    public static By searchBar = By.cssSelector("input[class='nail-search-input']");
    public static By contactNow = By.cssSelector("a[faw-id='1ipdrja7h129']");
    public static By firstProduct = By.xpath("(//div[@class = 'prod-content']//h2[@class = 'product-name'])[1]");
    public static By contactSeller = By.xpath("//div[@class = 'button-block contact-btn']//a[@class = 'btns button-link-contact']");
    public static By seller = By.cssSelector("a[href='https://www.made-in-china.com/sendInquiry/prod_rOyAIfZJhvRU_kBoTFDdYniRt.html?plant=en&from=shrom&type=cs&style=3&page=p_detail&pv_id=1ipbq7ekkc61&faw_id=1ipbrdun9781&bv_id=1ipbrdunbbd2&pbv_id=1ipbq7cgm40d']");
    public static By textArea = By.cssSelector("textarea[class='input-textarea span-18']");
    public static By emailInput = By.id("senderMail");
    public static By sendInquryNow = By.cssSelector("input[type='button']");
    public static By sendInputSubmit = By.cssSelector("input[type='submit']");
    public static By sentSuccessfully = By.cssSelector("div[class='ft-result__title J-msg-h1']");
    public static By accountPassword = By.cssSelector("input[class='ft-input is-error']");
    public static By checkBox = By.cssSelector("span[class='ft-checkbox-front']");
    public static By verifyEmail = By.cssSelector("button[class='ft-btn ft-btn-primary join-free-btn']");
}

