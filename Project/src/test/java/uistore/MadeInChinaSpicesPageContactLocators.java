package uistore;

import org.openqa.selenium.By;

public class MadeInChinaSpicesPageContactLocators {
    private MadeInChinaSpicesPageContactLocators(){}
    public static final By xmark = By.cssSelector("span[class='campaign-pop-close J-campaign-pop-close']"); 
    public static final By searchBar = By.cssSelector("input[class='nail-search-input']");
    public static final By contactNow = By.xpath("(//a[@class='btn btn-main'])[1]");
    public static final By firstProduct = By.xpath("(//div[@class = 'prod-content']//h2[@class = 'product-name'])[1]");
    public static final By contactSeller = By.xpath("//div[@class = 'button-block contact-btn']//a[@class = 'btns button-link-contact']");
    public static final By seller = By.cssSelector("a[href='https://www.made-in-china.com/sendInquiry/prod_rOyAIfZJhvRU_kBoTFDdYniRt.html?plant=en&from=shrom&type=cs&style=3&page=p_detail&pv_id=1ipbq7ekkc61&faw_id=1ipbrdun9781&bv_id=1ipbrdunbbd2&pbv_id=1ipbq7cgm40d']");
    public static final By textArea = By.cssSelector("textarea[class='input-textarea span-18']");
    public static final By emailInput = By.id("senderMail");
    public static final By sendInquryNow = By.cssSelector("input[type='button']");
    public static final By removePopup = By.cssSelector("span[class='dlg-close']");
    public static final By sendInputSubmit = By.cssSelector("input[type='submit']");
    public static final By sentSuccessfully = By.cssSelector("div[class='ft-result__title J-msg-h1']");
    public static final By accountPassword = By.cssSelector("input[class='ft-input is-error']");
    public static final By checkBox = By.cssSelector("span[class='ft-checkbox-front']");
    public static final By verifyEmail = By.cssSelector("button[class='ft-btn ft-btn-primary join-free-btn']");
}

