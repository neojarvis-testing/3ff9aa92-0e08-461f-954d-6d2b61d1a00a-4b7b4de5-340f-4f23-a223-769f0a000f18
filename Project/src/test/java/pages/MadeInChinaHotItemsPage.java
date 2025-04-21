package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.MadeInChinaHotItemsPageLocator;
import utils.Base;
import utils.WebDriverHelper;

public class MadeInChinaHotItemsPage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public MadeInChinaHotItemsPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    // Click on the 'Furniture' link and verify the redirection. Check that the URL contains "Furniture.html" and the page title matches "Furniture".

    public void clickOnFurniture(){
        helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.furniture,10);
        helper.javascriptScroll(MadeInChinaHotItemsPageLocator.furniture);
        helper.clickOnElement(MadeInChinaHotItemsPageLocator.furniture);
    }
    public void verifyFurnitureUrl(){
        String furnitureUrl = helper.getURL();
        Assert.assertTrue(furnitureUrl.contains("Furniture.html"));
    }
    public void verifyFurnitureTitle(){
        String furnitureUrl = helper.getTitle();
        Assert.assertTrue(furnitureUrl.contains("Furniture"));
    }
    public void clickOnLogo(){
        helper.clickOnElement(MadeInChinaHotItemsPageLocator.logo);
    }
    public void clickOnApparelClothing(){
        helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.apparelAndClothing,10);
        helper.javascriptScroll(MadeInChinaHotItemsPageLocator.apparelAndClothing);
        helper.clickOnElement(MadeInChinaHotItemsPageLocator.apparelAndClothing);
    }
    public void verifyApparelUrl(){
        String apparelAndClothingUrl = helper.getURL();
        Assert.assertTrue(apparelAndClothingUrl.contains("Apparel-Clothing.html"));
    }
    public void verifyApparelTitle(){
        String apparelAndClothingTitle = helper.getTitle();
        Assert.assertTrue(apparelAndClothingTitle.contains("Apparel & Clothing"));
    }
    public void clickOnAutoParts(){
        helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.autoParts,10);
        helper.javascriptScroll(MadeInChinaHotItemsPageLocator.autoParts);
        helper.clickOnElement(MadeInChinaHotItemsPageLocator.autoParts);
    }
    public void verifyAutoPartsUrl(){
        String autoPartsUrl = helper.getURL();
        Assert.assertTrue(autoPartsUrl.contains("Apparel-Clothing.html"));
    }
    public void verifyAutoPartsTitle(){
        String autoPartsTitle = helper.getTitle();
        Assert.assertTrue(autoPartsTitle.contains("Apparel & Clothing"));
    }

    public void hoteItems(){
        clickOnFurniture();
        verifyFurnitureUrl();
        verifyFurnitureTitle();
        clickOnLogo();
        clickOnApparelClothing();
        verifyApparelUrl();
        verifyApparelTitle();
        clickOnLogo();
        clickOnAutoParts();
    }
}
