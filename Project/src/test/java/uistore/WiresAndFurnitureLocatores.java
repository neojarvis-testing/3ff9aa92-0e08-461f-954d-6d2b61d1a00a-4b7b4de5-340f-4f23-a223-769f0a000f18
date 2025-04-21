package uistore;

import org.openqa.selenium.By;

public class WiresAndFurnitureLocatores {
    public static By searchBar = By.cssSelector("input[class = 'nail-search-input']");
    public static By searIcon = By.id("J-nail-search-submit");
    public static By wireResult = By.cssSelector("em[class = 'product_word']");
    public static By firstProduct =By.xpath("(//div[@class = 'prod-content']//h2[@class = 'product-name']//a)[1]");
    public static By contactSupplier = By.cssSelector("div[class = 'button-block contact-btn'] a[class = 'btns button-link-contact']");
    public static By clickOn2InPagination = By.xpath("(//a[@href = '//www.made-in-china.com/multi-search/Wires/F1/2.html'])[1]");
    public static By logo = By.cssSelector("a[href='//www.made-in-china.com']");
}



// Searchbar : 

// searchIcon : By id   :   
// 	     By class  :   nail-search-btn
// 	     By css    : button[type = 'submit'] i[class = 'ob-icon icon-search']
// wire result  : em[class = 'product_word']

// first product : (//div[@class = 'prod-content']//h2[@class = 'product-name']//a)[1]

// contact supplier : div[class = 'button-block contact-btn'] a[class = 'btns button-link-contact']

// click on 2 in pagination : (//a[@href = '//www.made-in-china.com/multi-search/Wires/F1/2.html'])[1]

// logo : a[href='//www.made-in-china.com']