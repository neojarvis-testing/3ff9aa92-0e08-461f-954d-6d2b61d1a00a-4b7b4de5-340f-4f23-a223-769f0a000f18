package uistore;

import org.openqa.selenium.By;

public class SpicesPageContactLocators {
    public static By searchBar = By.cssSelector("input[class='nail-search-input']");
    public static By firstProduct = By.cssSelector("a[href='https://hzjiaronghe.en.made-in-china.com/?pv_id=1ipbp3rje3a7&faw_id=1ipbp52j48b5&bv_id=1ipbp52j7cbe']");
    public static By seller = By.cssSelector("a[href='https://www.made-in-china.com/sendInquiry/prod_rOyAIfZJhvRU_kBoTFDdYniRt.html?plant=en&from=shrom&type=cs&style=3&page=p_detail&pv_id=1ipbq7ekkc61&faw_id=1ipbrdun9781&bv_id=1ipbrdunbbd2&pbv_id=1ipbq7cgm40d']");
    public static By textArea = By.cssSelector("textarea[class='input-textarea span-18']");
    public static By emailInput = By.id("senderMail");
    public static By sendInquryNow = By.cssSelector("input[type='button']");
    public static By sendInputSubmit = By.cssSelector("input[type='submit']");
    public static By sentSuccessfully = By.cssSelector("div[class='ft-result__title J-msg-h1']");
}

