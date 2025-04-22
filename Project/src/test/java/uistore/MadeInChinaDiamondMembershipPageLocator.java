package uistore;

import org.openqa.selenium.By;

public class MadeInChinaDiamondMembershipPageLocator {
    public static By logo = By.cssSelector("a[class = 'logo-link']");
    public static By searchBar = By.cssSelector("input[class = 'nail-search-input']");
    public static By searchIcon = By.cssSelector("button[class = 'nail-search-btn']");
    public static By verifyWord = By.cssSelector("em[class = 'product_word']");
    public static By supplierList = By.cssSelector("a[href='//www.made-in-china.com/companysearch.do?subaction=hunt&mode=and&code=0&style=b&isOpenCorrection=1&word=Electronics&comProvice=nolimit']");
    public static By consumerElectronics = By.cssSelector("a[href='//www.made-in-china.com/company-search/Electronics/C1--CD_Consumer-Electronics-Catalog/1.html']");
    public static By filterconsumerElectronics = By.cssSelector("span[class = 'refine-selected']");
    public static By Is9000 = By.cssSelector("a[href = '//www.made-in-china.com/company-search/Electronics/C1--CD_Consumer-Electronics-Catalog--MC_9/1.html']");
    public static By filterIs9000 = By.xpath("//span[text() = 'ISO 9000']");
    public static By popUp = By.cssSelector("span[class = 'campaign-pop-close J-campaign-pop-close']");
}
