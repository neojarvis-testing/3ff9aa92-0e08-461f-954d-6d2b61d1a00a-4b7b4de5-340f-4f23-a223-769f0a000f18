package uistore;

import org.openqa.selenium.By;

public class WiresAndFurnitureLocatores {
    public static By searchBar = By.cssSelector("input[class = 'nail-search-input']");
    public static By searIcon = By.id("J-nail-search-submit");
    public static By wireResult = By.cssSelector("em[class = 'product_word']");
    public static By firstProduct =By.xpath("(//div[@class = 'prod-content']//h2[@class = 'product-name']//a)[1]");
    public static By contactSupplier = By.cssSelector("div[class = 'button-block contact-btn'] a[class = 'btns button-link-contact']");
    public static By clickOn2InPagination = By.xpath("//a[text() = '2']");
    public static By logo = By.cssSelector("a[href='//www.made-in-china.com']");
}
