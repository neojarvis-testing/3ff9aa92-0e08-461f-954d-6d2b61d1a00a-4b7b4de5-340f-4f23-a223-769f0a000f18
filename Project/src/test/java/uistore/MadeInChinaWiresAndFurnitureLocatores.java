package uistore;

import org.openqa.selenium.By;

public class MadeInChinaWiresAndFurnitureLocatores {
    private MadeInChinaWiresAndFurnitureLocatores(){}
    public static final By searchBar = By.cssSelector("input[class = 'nail-search-input']");
    public static final By searIcon = By.id("J-nail-search-submit");
    public static final By wireResult = By.cssSelector("em[class = 'product_word']");
    public static final By firstProduct =By.xpath("(//div[@class = 'prod-content']//h2[@class = 'product-name']//a)[1]");
    public static final By contactSupplier = By.cssSelector("div[class = 'button-block contact-btn'] a[class = 'btns button-link-contact']");
    public static final By clickOn2InPagination = By.xpath("//a[text() = '2']");
    public static final By logo = By.cssSelector("a[href='//www.made-in-china.com']");
}
