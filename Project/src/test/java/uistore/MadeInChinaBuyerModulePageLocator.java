package uistore;

import org.openqa.selenium.By;

public class MadeInChinaBuyerModulePageLocator {
    private MadeInChinaBuyerModulePageLocator(){}
    public static final By ClosePopUp=By.xpath("//span[@class='campaign-pop-close J-campaign-pop-close']");
    public static final By HoverOnBuyer=By.xpath("//a[text()='Buyer']");
    public static final By ClickNewUserGuide=By.xpath("//a[text()='New User Guide']");
    public static final By ClickLogo=By.className("m-logo");
    public static final By ClickAuditedSuppliers=By.xpath("//a[contains(text(),'Audited')]");
    public static final By ClickMeetSupplier=By.xpath("//a[text()='Meet Suppliers']");
}
