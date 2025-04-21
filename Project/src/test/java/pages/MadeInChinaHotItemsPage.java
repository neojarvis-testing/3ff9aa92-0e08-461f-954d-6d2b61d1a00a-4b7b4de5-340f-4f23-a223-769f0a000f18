package pages;

import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.MadeInChinaHotItemsPageLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class MadeInChinaHotItemsPage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public MadeInChinaHotItemsPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }
    
    public void clickOnPopUp(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.popUp, 10);
            helper.clickOnElement(MadeInChinaHotItemsPageLocator.popUp);
            LoggerHandler.info("Clicked On popUp");
            test.log(Status.PASS, "Clicked On popUp");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On popUp");
            test.log(Status.FAIL, "Not Clicked On popUp");
        }
    }
    public void clickOnLogo(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.logo,10);
            helper.clickOnElement(MadeInChinaHotItemsPageLocator.logo);
            LoggerHandler.info("Clicked On logo");
            test.log(Status.PASS, "Clicked On logo");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On logo");
            test.log(Status.FAIL, "Not Clicked On logo");
        }
    }
    
    public void clickOnFurniture(){
        try {
            helper.javascriptScroll(MadeInChinaHotItemsPageLocator.furniture);
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.furniture,10);
            helper.ClickAndSwitch(MadeInChinaHotItemsPageLocator.furniture);
            LoggerHandler.info("Clicked On Furniture");
            test.log(Status.PASS, "Clicked On Furniture");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On Furniture");
            test.log(Status.FAIL, "Not Clicked On Furniture");
        }
    }
    public void verifyFurnitureUrl(){
        try {
            String furnitureUrl = helper.getURL();
            Assert.assertTrue(furnitureUrl.contains("Furniture.html"));
            LoggerHandler.info("Verified Furniture.html");
            test.log(Status.PASS, "Verified Furniture.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Furniture.html");
            test.log(Status.FAIL, "Not Verified Furniture.html");
        }
    }
    public void verifyFurnitureTitle(){
        try {
            String furnitureUrl = helper.getTitle();
            Assert.assertTrue(furnitureUrl.contains("Furniture"));
            LoggerHandler.info("Verified Furniture title");
            test.log(Status.PASS, "Verified Furniture title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Furniture title");
            test.log(Status.FAIL, "Not Verified Furniture title");
        }
    }
    public void clickOnApparelClothing(){
        try {
            helper.javascriptScroll(MadeInChinaHotItemsPageLocator.apparelAndClothing);
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.apparelAndClothing,10);
            helper.ClickAndSwitch(MadeInChinaHotItemsPageLocator.apparelAndClothing);
            LoggerHandler.info("Clicked On Apparel Clothing");
            test.log(Status.PASS, "Clicked On Apparel Clothing");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On Apparel Clothing");
            test.log(Status.FAIL, "Not Clicked On Apparel Clothing");
        }
    }
    public void verifyApparelUrl(){
        try {
            String apparelAndClothingUrl = helper.getURL();
            Assert.assertTrue(apparelAndClothingUrl.contains("Apparel-Clothing.html"));
            LoggerHandler.info("Verified Apparel-Clothing.html");
            test.log(Status.PASS, "Verified Apparel-Clothing.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Apparel-Clothing.html");
            test.log(Status.FAIL, "Not Verified Apparel-Clothing.html");
        }
    }
    public void verifyApparelTitle(){
        try {
            String apparelAndClothingTitle = helper.getTitle();
            Assert.assertTrue(apparelAndClothingTitle.contains("Apparel & Clothing"));
            LoggerHandler.info("Verified Apparel Title");
            test.log(Status.PASS, "Verified Apparel Title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Apparel Title");
            test.log(Status.FAIL, "Not Verified Apparel Title");
        }
    }
    public void clickOnAutoParts(){
        try {
            helper.javascriptScroll(MadeInChinaHotItemsPageLocator.autoParts);
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.autoParts,10);
            helper.ClickAndSwitch(MadeInChinaHotItemsPageLocator.autoParts);
            LoggerHandler.info("Clicked On Auto Parts");
            test.log(Status.PASS, "Clicked On Auto Parts");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On Auto Parts");
            test.log(Status.FAIL, "Not Clicked On Auto Parts");
        }
    }
    public void verifyAutoPartsUrl(){
        try {
            String autoPartsUrl = helper.getURL();
            Assert.assertTrue(autoPartsUrl.contains("Auto-Parts-Accessories.html"));
            LoggerHandler.info("Verified Auto-Parts-Accessories.html");
            test.log(Status.PASS, "Verified Auto-Parts-Accessories.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Auto-Parts-Accessories.html");
            test.log(Status.FAIL, "Not Verified Auto-Parts-Accessories.html");
        }
    }
    public void verifyAutoPartsTitle(){
        try {
            String autoPartsTitle = helper.getTitle();
            Assert.assertTrue(autoPartsTitle.contains("Auto Parts & Accessories"));
            LoggerHandler.info("Verified Auto Parts & Accessories Title");
            test.log(Status.PASS, "Verified Auto Parts & Accessories Title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Auto Parts & Accessories Title");
            test.log(Status.FAIL, "Not Verified Auto Parts & Accessories Title");
        }
    }
    public void clickOnBagsCases(){
        try {
            helper.javascriptScroll(MadeInChinaHotItemsPageLocator.bagsCasesAndLuggages);
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.bagsCasesAndLuggages,10);
            helper.ClickAndSwitch(MadeInChinaHotItemsPageLocator.bagsCasesAndLuggages);
            LoggerHandler.info("Clicked On Bags Cases");
            test.log(Status.PASS, "Clicked On Bags Cases");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On Bags Cases");
            test.log(Status.FAIL, "Not Clicked On Bags Cases");
        }
    }
    public void verifyBagsCasesUrl(){
        try {
            String bagsUrl = helper.getURL();
            Assert.assertTrue(bagsUrl.contains("Bags-Cases-Luggages.html"));
            LoggerHandler.info("Verified Bags-Cases-Luggages.html");
            test.log(Status.PASS, "Verified Bags-Cases-Luggages.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Bags-Cases-Luggages.html");
            test.log(Status.FAIL, "Not Verified Bags-Cases-Luggages.html");
        }
    }
    public void verifyBagsCasesTitle(){
        try {
            String bagsUrl = helper.getTitle();
            Assert.assertTrue(bagsUrl.contains("Bags, Cases & Luggages"));
            LoggerHandler.info("Verified Bags, Cases & Luggages title");
            test.log(Status.PASS, "Verified Bags, Cases & Luggages title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Bags, Cases & Luggages title");
            test.log(Status.FAIL, "Not Verified Bags, Cases & Luggages title");
        }
    }
    public void clickOnComputerProducts(){
        try {
            helper.javascriptScroll(MadeInChinaHotItemsPageLocator.computerProducts);
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.computerProducts,10);
            helper.ClickAndSwitch(MadeInChinaHotItemsPageLocator.computerProducts);
            LoggerHandler.info("Clicked On Computer Products");
            test.log(Status.PASS, "Clicked On Computer Products");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On Computer Products");
            test.log(Status.FAIL, "Not Clicked On Computer Products");
        }
    }
    public void verifyComputerProductsUrl(){
        try {
            String computerUrl = helper.getURL();
            Assert.assertTrue(computerUrl.contains("Computer-Products.html"));
            LoggerHandler.info("Verified Computer-Products.html");
            test.log(Status.PASS, "Verified Computer-Products.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Computer-Products.html");
            test.log(Status.FAIL, "Not Verified Computer-Products.html");
        }
    }
    public void verifyComputerProductsTitle(){
        try {
            String computerUrl = helper.getTitle();
            Assert.assertTrue(computerUrl.contains("Computer Products"));
            LoggerHandler.info("Verified Computer Products title");
            test.log(Status.PASS, "Verified Computer Products title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Computer Products title");
            test.log(Status.FAIL, "Not Verified Computer Products title");
        }
    }

    public void hoteItems(){
        clickOnPopUp();

        clickOnFurniture();
        verifyFurnitureUrl();
        verifyFurnitureTitle();

        clickOnLogo();
        clickOnApparelClothing();
        verifyApparelUrl();
        verifyApparelTitle();

        clickOnLogo();
        clickOnAutoParts();
        verifyAutoPartsUrl();
        verifyAutoPartsTitle();

        clickOnLogo();
        clickOnBagsCases();
        verifyBagsCasesUrl();
        verifyBagsCasesTitle();

        clickOnLogo();
        
    }
}