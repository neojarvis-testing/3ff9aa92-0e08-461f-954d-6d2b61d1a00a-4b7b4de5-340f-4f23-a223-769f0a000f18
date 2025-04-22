package pages;

import org.bouncycastle.x509.util.LDAPStoreHelper;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.MadeInChinaHotItemsPageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class MadeInChinaHotItemsPage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public MadeInChinaHotItemsPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }
    
    /*
    * a. Method Name: clickOnPopUp
    * b. Author Name: Krishna
    * c. Description: Waits for the pop-up to be visible and clicks on it, logging the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
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
    /*
    * a. Method Name: clickOnLogo
    * b. Author Name: Krishna
    * c. Description: Waits for the logo element to be visible and clicks on it, logging the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnLogo(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.logo,10);
            helper.clickOnElement(MadeInChinaHotItemsPageLocator.logo);
            //helper.switchBackToWindow(0);
            LoggerHandler.info("Clicked On logo");
            test.log(Status.PASS, "Clicked On logo");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On logo");
            test.log(Status.FAIL, "Not Clicked On logo");
        }
    }
    /*
    * a. Method Name: clickOnFurniture
    * b. Author Name: Krishna
    * c. Description: Scrolls to the furniture element, waits for its visibility, clicks on it, switches context, and captures a screenshot.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnFurniture(){
        try {
            helper.javascriptScroll(MadeInChinaHotItemsPageLocator.furniture);
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.furniture,10);
            helper.ClickAndSwitch(MadeInChinaHotItemsPageLocator.furniture);
            Screenshot.captureFullScreenshot("Furniture");
            LoggerHandler.info("Clicked On Furniture");
            test.log(Status.PASS, "Clicked On Furniture");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On Furniture");
            test.log(Status.FAIL, "Not Clicked On Furniture");
        }
    }
    /*
    * a. Method Name: verifyFurnitureUrl
    * b. Author Name: Krishna
    * c. Description: Retrieves the current URL, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyFurnitureUrl(){
        try {
            String furnitureUrl = helper.getURL();
            Assert.assertTrue(furnitureUrl.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 0, 0)));
            LoggerHandler.info("Verified Furniture.html");
            test.log(Status.PASS, "Verified Furniture.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Furniture.html");
            test.log(Status.FAIL, "Not Verified Furniture.html");
        }
    }
    /*
    * a. Method Name: verifyFurnitureTitle
    * b. Author Name: Krishna
    * c. Description: Retrieves the page title, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyFurnitureTitle(){
        try {
            String furnitureUrl = helper.getTitle();
            Assert.assertTrue(furnitureUrl.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 1, 0)));
            LoggerHandler.info("Verified Furniture title");
            test.log(Status.PASS, "Verified Furniture title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Furniture title");
            test.log(Status.FAIL, "Not Verified Furniture title");
        }
    }
    /*
    * a. Method Name: clickOnApparelClothing
    * b. Author Name: Krishna
    * c. Description: Scrolls to the apparel and clothing element, waits for its visibility, clicks on it, switches context, and captures a screenshot.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnApparelClothing(){
        try {
            helper.javascriptScroll(MadeInChinaHotItemsPageLocator.apparelAndClothing);
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.apparelAndClothing,10);
            helper.ClickAndSwitch(MadeInChinaHotItemsPageLocator.apparelAndClothing);
            Screenshot.captureFullScreenshot("Apparel Clothing");
            LoggerHandler.info("Clicked On Apparel Clothing");
            test.log(Status.PASS, "Clicked On Apparel Clothing");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On Apparel Clothing");
            test.log(Status.FAIL, "Not Clicked On Apparel Clothing");
        }
    }
    /*
    * a. Method Name: verifyApparelUrl
    * b. Author Name: Krishna
    * c. Description: Retrieves the current URL, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyApparelUrl(){
        try {
            String apparelAndClothingUrl = helper.getURL();
            Assert.assertTrue(apparelAndClothingUrl.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 2,0)));
            LoggerHandler.info("Verified Apparel-Clothing.html");
            test.log(Status.PASS, "Verified Apparel-Clothing.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Apparel-Clothing.html");
            test.log(Status.FAIL, "Not Verified Apparel-Clothing.html");
        }
    }
    /*
    * a. Method Name: verifyApparelTitle
    * b. Author Name: Krishna
    * c. Description: Retrieves the Title, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyApparelTitle(){
        try {
            String apparelAndClothingTitle = helper.getTitle();
            Assert.assertTrue(apparelAndClothingTitle.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna",3,0)));
            LoggerHandler.info("Verified Apparel Title");
            test.log(Status.PASS, "Verified Apparel Title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Apparel Title");
            test.log(Status.FAIL, "Not Verified Apparel Title");
        }
    }
    /*
    * a. Method Name: clickOnAutoParts
    * b. Author Name: Krishna
    * c. Description: Scrolls to the Auto Parts element, waits for its visibility, clicks on it, switches context, and captures a screenshot.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnAutoParts(){
        try {
            helper.javascriptScroll(MadeInChinaHotItemsPageLocator.autoParts);
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.autoParts,10);
            helper.ClickAndSwitch(MadeInChinaHotItemsPageLocator.autoParts);
            Screenshot.captureFullScreenshot("Auto Parts");
            LoggerHandler.info("Clicked On Auto Parts");
            test.log(Status.PASS, "Clicked On Auto Parts");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On Auto Parts");
            test.log(Status.FAIL, "Not Clicked On Auto Parts");
        }
    }
    /*
    * a. Method Name: verifyAutoPartsUrl
    * b. Author Name: Krishna
    * c. Description: Retrieves the current URL, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyAutoPartsUrl(){
        try {
            String autoPartsUrl = helper.getURL();
            Assert.assertTrue(autoPartsUrl.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 4,0)));
            LoggerHandler.info("Verified Auto-Parts-Accessories.html");
            test.log(Status.PASS, "Verified Auto-Parts-Accessories.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Auto-Parts-Accessories.html");
            test.log(Status.FAIL, "Not Verified Auto-Parts-Accessories.html");
        }
    }
    /*
    * a. Method Name: verifyAutoPartsTitle
    * b. Author Name: Krishna
    * c. Description: Retrieves the Auto Parts title, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyAutoPartsTitle(){
        try {
            String autoPartsTitle = helper.getTitle();
            Assert.assertTrue(autoPartsTitle.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 5,0)));
            LoggerHandler.info("Verified Auto Parts & Accessories Title");
            test.log(Status.PASS, "Verified Auto Parts & Accessories Title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Auto Parts & Accessories Title");
            test.log(Status.FAIL, "Not Verified Auto Parts & Accessories Title");
        }
    }
    /*
    * a. Method Name: clickOnBagsCases
    * b. Author Name: Krishna
    * c. Description: Scrolls to the Bags Cases element, waits for its visibility, clicks on it, switches context, and captures a screenshot.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnBagsCases(){
        try {
            helper.javascriptScroll(MadeInChinaHotItemsPageLocator.bagsCasesAndLuggages);
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.bagsCasesAndLuggages,10);
            helper.ClickAndSwitch(MadeInChinaHotItemsPageLocator.bagsCasesAndLuggages);
            Screenshot.captureFullScreenshot("Bags Cases");
            LoggerHandler.info("Clicked On Bags Cases");
            test.log(Status.PASS, "Clicked On Bags Cases");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On Bags Cases");
            test.log(Status.FAIL, "Not Clicked On Bags Cases");
        }
    }
    /*
    * a. Method Name: verifyBagsCasesUrl
    * b. Author Name: Krishna
    * c. Description: Retrieves the current URL, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyBagsCasesUrl(){
        try {
            String bagsUrl = helper.getURL();
            Assert.assertTrue(bagsUrl.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 6,0)));
            LoggerHandler.info("Verified Bags-Cases-Luggages.html");
            test.log(Status.PASS, "Verified Bags-Cases-Luggages.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Bags-Cases-Luggages.html");
            test.log(Status.FAIL, "Not Verified Bags-Cases-Luggages.html");
        }
    }
    /*
    * a. Method Name: verifyBagsCasesTitle
    * b. Author Name: Krishna
    * c. Description: Retrieves the Bags Cases title, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyBagsCasesTitle(){
        try {
            String bagsTitle = helper.getTitle();
            Assert.assertTrue(bagsTitle.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 7,0)));
            LoggerHandler.info("Verified Bags, Cases & Luggages title");
            test.log(Status.PASS, "Verified Bags, Cases & Luggages title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Bags, Cases & Luggages title");
            test.log(Status.FAIL, "Not Verified Bags, Cases & Luggages title");
        }
    }
    /*
    * a. Method Name: clickOnComputerProducts
    * b. Author Name: Krishna
    * c. Description: Scrolls to the Computer Products element, waits for its visibility, clicks on it, switches context, and captures a screenshot.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnComputerProducts(){
        try {
            helper.javascriptScroll(MadeInChinaHotItemsPageLocator.computerProducts);
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.computerProducts,10);
            helper.ClickAndSwitch(MadeInChinaHotItemsPageLocator.computerProducts);
            Screenshot.captureFullScreenshot("Computer Products");
            LoggerHandler.info("Clicked On Computer Products");
            test.log(Status.PASS, "Clicked On Computer Products");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On Computer Products");
            test.log(Status.FAIL, "Not Clicked On Computer Products");
        }
    }
    /*
    * a. Method Name: verifyComputerProductsUrl
    * b. Author Name: Krishna
    * c. Description: Retrieves the current URL, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyComputerProductsUrl(){
        try {
            String computerUrl = helper.getURL();
            Assert.assertTrue(computerUrl.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 8,0)));
            LoggerHandler.info("Verified Computer-Products.html");
            test.log(Status.PASS, "Verified Computer-Products.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Computer-Products.html");
            test.log(Status.FAIL, "Not Verified Computer-Products.html");
        }
    }
    /*
    * a. Method Name: verifyComputerProductsTitle
    * b. Author Name: Krishna
    * c. Description: Retrieves the page title, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyComputerProductsTitle(){
        try {
            String computerTitle = helper.getTitle();
            Assert.assertTrue(computerTitle.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 9,0)));
            LoggerHandler.info("Verified Computer Products title");
            test.log(Status.PASS, "Verified Computer Products title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Computer Products title");
            test.log(Status.FAIL, "Not Verified Computer Products title");
        }
    }
    /*
    * a. Method Name: clickOnConsumerElectronics
    * b. Author Name: Krishna
    * c. Description: Scrolls to the Consumer Electronics element, waits for its visibility, clicks on it, switches context, and captures a screenshot.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnConsumerElectronics(){
        try {
            helper.javascriptScroll(MadeInChinaHotItemsPageLocator.consumerElectronics);
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.consumerElectronics,10);
            helper.ClickAndSwitch(MadeInChinaHotItemsPageLocator.consumerElectronics);
            Screenshot.captureFullScreenshot("Consumer Electronics");
            LoggerHandler.info("Clicked On Consumer Electronic");
            test.log(Status.PASS, "Clicked On Consumer Electronic");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On Consumer Electronic");
            test.log(Status.FAIL, "Not Clicked On Consumer Electronic");
        }
    }
    /*
    * a. Method Name: verifyConsumerElectronicsUrl
    * b. Author Name: Krishna
    * c. Description: Retrieves the current URL, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyConsumerElectronicsUrl(){
        try {
            String electronicsUrl = helper.getURL();
            Assert.assertTrue(electronicsUrl.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 10,0)));
            LoggerHandler.info("Verified Consumer-Electronics.html");
            test.log(Status.PASS, "Verified Consumer-Electronics.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Consumer-Electronics.html");
            test.log(Status.FAIL, "Not Verified Consumer-Electronics.html");
        }
    }
    /*
    * a. Method Name: verifyConsumerElectronicsTitle
    * b. Author Name: Krishna
    * c. Description: Retrieves the page title, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyConsumerElectronicsTitle(){
        try {
            String electronicsTitle = helper.getTitle();
            Assert.assertTrue(electronicsTitle.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 11,0)));
            LoggerHandler.info("Verified Consumer Electronics title");
            test.log(Status.PASS, "Verified Consumer Electronics title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Consumer Electronics title");
            test.log(Status.FAIL, "Not Verified Consumer Electronics title");
        }
    }
    /*
    * a. Method Name: clickOnElectricalEquipment
    * b. Author Name: Krishna
    * c. Description: Scrolls to the Electrical Equipment element, waits for its visibility, clicks on it, switches context, and captures a screenshot.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnElectricalEquipment(){
        try {
            helper.javascriptScroll(MadeInChinaHotItemsPageLocator.electricalEquipment);
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.electricalEquipment,10);
            helper.ClickAndSwitch(MadeInChinaHotItemsPageLocator.electricalEquipment);
            Screenshot.captureFullScreenshot("Electrical Equipment");
            LoggerHandler.info("Clicked On Electrical Equipment");
            test.log(Status.PASS, "Clicked On Electrical Equipment");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On Electrical Equipment");
            test.log(Status.FAIL, "Not Clicked On Electrical Equipment");
        }
    }
    /*
    * a. Method Name: verifyElectricalEquipmentUrl
    * b. Author Name: Krishna
    * c. Description: Retrieves the current URL, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyElectricalEquipmentUrl(){
        try {
            String electricalUrl = helper.getURL();
            Assert.assertTrue(electricalUrl.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 12,0)));
            LoggerHandler.info("Verified Electrical-Equipments.html");
            test.log(Status.PASS, "Verified Electrical-Equipments.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Electrical-Equipments.html");
            test.log(Status.FAIL, "Not Verified Electrical-Equipments.html");
        }
    }
    /*
    * a. Method Name: verifyElectricalEquipmentTitle
    * b. Author Name: Krishna
    * c. Description: Retrieves the page title, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyElectricalEquipmentTitle(){
        try {
            String electricalTitle = helper.getTitle();
            Assert.assertTrue(electricalTitle.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 13,0)));
            LoggerHandler.info("Verified Electrical Equipment title");
            test.log(Status.PASS, "Verified Electrical Equipment title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Electrical Equipment title");
            test.log(Status.FAIL, "Not Verified Electrical Equipment title");
        }
    }
    /*
    * a. Method Name: clickOnElectronicComponents
    * b. Author Name: Krishna
    * c. Description: Scrolls to the Electronic Components element, waits for its visibility, clicks on it, switches context, and captures a screenshot.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnElectronicComponents(){
        try {
            helper.javascriptScroll(MadeInChinaHotItemsPageLocator.electricalCompents);
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.electricalCompents,10);
            helper.ClickAndSwitch(MadeInChinaHotItemsPageLocator.electricalCompents);
            Screenshot.captureFullScreenshot("Electronic Compents");
            LoggerHandler.info("Clicked On Electronic Components");
            test.log(Status.PASS, "Clicked On Electronic Components");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On Electronic Components");
            test.log(Status.FAIL, "Not Clicked On Electronic Components");
        }
    }
    /*
    * a. Method Name: verifyElectronicComponentsUrl
    * b. Author Name: Krishna
    * c. Description: Retrieves the current URL, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyElectronicComponentsUrl(){
        try {
            String componentsUrl = helper.getURL();
            Assert.assertTrue(componentsUrl.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 14,0)));
            LoggerHandler.info("Verified Electronic-Components.html");
            test.log(Status.PASS, "Verified Electronic-Components.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Electronic-Components.html");
            test.log(Status.FAIL, "Not Verified Electronic-Components.html");
        }
    }
    /*
    * a. Method Name: verifyElectronicComponentsTitle
    * b. Author Name: Krishna
    * c. Description: Retrieves the page title, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyElectronicComponentsTitle(){
        try {
            String componentsTitle = helper.getTitle();
            Assert.assertTrue(componentsTitle.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 15,0)));
            LoggerHandler.info("Verified Electronic Components title");
            test.log(Status.PASS, "Verified Electronic Components title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Electronic Components title");
            test.log(Status.FAIL, "Not Verified Electronic Components title");
        }
    }
    /*
    * a. Method Name: clickOnGiftsCrafts
    * b. Author Name: Krishna
    * c. Description: Scrolls to the Gifts Crafts element, waits for its visibility, clicks on it, switches context, and captures a screenshot.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnGiftsCrafts(){
        try {
            helper.javascriptScroll(MadeInChinaHotItemsPageLocator.giftsCrafts);
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.giftsCrafts,10);
            helper.ClickAndSwitch(MadeInChinaHotItemsPageLocator.giftsCrafts);
            Screenshot.captureFullScreenshot("Gifts Crafts");
            LoggerHandler.info("Clicked On Gift Crafts");
            test.log(Status.PASS, "Clicked On Gift Crafts");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On Gift Crafts");
            test.log(Status.FAIL, "Not Clicked On Gift Crafts");
        }
    }
    /*
    * a. Method Name: verifyGiftsCraftsUrl
    * b. Author Name: Krishna
    * c. Description: Retrieves the current URL, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyGiftsCraftsUrl(){
        try {
            String giftsUrl = helper.getURL();
            Assert.assertTrue(giftsUrl.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 16,0)));
            LoggerHandler.info("Verified Gifts-Crafts-Collectibles.html");
            test.log(Status.PASS, "Verified Gifts-Crafts-Collectibles.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Gifts-Crafts-Collectibles.html");
            test.log(Status.FAIL, "Not Verified Gifts-Crafts-Collectibles.html");
        }
    }
    /*
    * a. Method Name: verifyGiftsCraftsTitle
    * b. Author Name: Krishna
    * c. Description: Retrieves the page title, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyGiftsCraftsTitle(){
        try {
            String giftTitle = helper.getTitle();
            Assert.assertTrue(giftTitle.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 17,0)));
            LoggerHandler.info("Verified Gifts, Crafts & Collectibles title");
            test.log(Status.PASS, "Verified Gifts, Crafts & Collectibles title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Gifts, Crafts & Collectibles title");
            test.log(Status.FAIL, "Not Verified Gifts, Crafts & Collectibles title");
        }
    }
    /*
    * a. Method Name: clickOnMotorCycles
    * b. Author Name: Krishna
    * c. Description: Scrolls to the Motor Cycles element, waits for its visibility, clicks on it, switches context, and captures a screenshot.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnMotorCycles(){
        try {
            helper.javascriptScroll(MadeInChinaHotItemsPageLocator.motorCycles);
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.motorCycles,10);
            helper.ClickAndSwitch(MadeInChinaHotItemsPageLocator.motorCycles);
            Screenshot.captureFullScreenshot("Motor Cycles");
            LoggerHandler.info("Clicked On MotorCycles");
            test.log(Status.PASS, "Clicked On MotorCycles");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On MotorCycles");
            test.log(Status.FAIL, "Not Clicked On MotorCycles");
        }
    }
    /*
    * a. Method Name: verifyMotorCyclesUrl
    * b. Author Name: Krishna
    * c. Description: Retrieves the current URL, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyMotorCyclesUrl(){
        try {
            String motorCyclesUrl = helper.getURL();
            Assert.assertTrue(motorCyclesUrl.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 18,0)));
            LoggerHandler.info("Verified Motorcycles-Scooters.html");
            test.log(Status.PASS, "Verified Motorcycles-Scooters.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Motorcycles-Scooters.html");
            test.log(Status.FAIL, "Not Verified Motorcycles-Scooters.html");
        }
    }
    /*
    * a. Method Name: verifyMotorCyclesTitle
    * b. Author Name: Krishna
    * c. Description: Retrieves the page title, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyMotorCyclesTitle(){
        try {
            String motorCyclesTitle = helper.getTitle();
            Assert.assertTrue(motorCyclesTitle.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 19,0)));
            LoggerHandler.info("Verified Motorcycles & Scooters title");
            test.log(Status.PASS, "Verified Motorcycles & Scooters title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Motorcycles & Scooters title");
            test.log(Status.FAIL, "Not Verified Motorcycles & Scooters title");
        }
    }
    /*
    * a. Method Name: clickOnSealing Package
    * b. Author Name: Krishna
    * c. Description: Scrolls to the Sealing Package element, waits for its visibility, clicks on it, switches context, and captures a screenshot.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnSealingPackage(){
        try {
            helper.javascriptScroll(MadeInChinaHotItemsPageLocator.sealingPackaging);
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.sealingPackaging,10);
            helper.ClickAndSwitch(MadeInChinaHotItemsPageLocator.sealingPackaging);
            LoggerHandler.info("Clicked On Sealing Package");
            Screenshot.captureFullScreenshot("Sealing Package");
            test.log(Status.PASS, "Clicked On Sealing Package");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On Sealing Package");
            test.log(Status.FAIL, "Not Clicked On Sealing Package");
        }
    }
    /*
    * a. Method Name: verifySealingPackageUrl
    * b. Author Name: Krishna
    * c. Description: Retrieves the current URL, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifySealingPackageUrl(){
        try {
            String sealingPackageUrl = helper.getURL();
            Assert.assertTrue(sealingPackageUrl.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 20,0)));
            LoggerHandler.info("Verified Sealing-Packaging-Storage-Shelving.html");
            test.log(Status.PASS, "Verified Sealing-Packaging-Storage-Shelving.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Sealing-Packaging-Storage-Shelving.html");
            test.log(Status.FAIL, "Not Verified Sealing-Packaging-Storage-Shelving.html");
        }
    }
    /*
    * a. Method Name: verifySealingPackageTitle
    * b. Author Name: Krishna
    * c. Description: Retrieves the page title, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifySealingPackageTitle(){
        try {
            String sealingPackageTitle = helper.getTitle();
            Assert.assertTrue(sealingPackageTitle.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 21,0)));
            LoggerHandler.info("Verified Sealing, Packaging, Storage & Shelving title");
            test.log(Status.PASS, "Verified Sealing, Packaging, Storage & Shelving title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Sealing, Packaging, Storage & Shelving title");
            test.log(Status.FAIL, "Not Verified Sealing, Packaging, Storage & Shelving title");
        }
    }
    /*
    * a. Method Name: clickOnBuildingMaterials
    * b. Author Name: Krishna
    * c. Description: Scrolls to the Building Materials element, waits for its visibility, clicks on it, switches context, and captures a screenshot.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnBuildingMaterials(){
        try {
            helper.javascriptScroll(MadeInChinaHotItemsPageLocator.buildingMaterials);
            helper.WaitForElementToBeVisible(MadeInChinaHotItemsPageLocator.buildingMaterials,10);
            helper.ClickAndSwitch(MadeInChinaHotItemsPageLocator.buildingMaterials);
            Screenshot.captureFullScreenshot("Building Materials");
            LoggerHandler.info("Clicked On Building Materials");
            test.log(Status.PASS, "Clicked On Building Materials");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On Building Materials");
            test.log(Status.FAIL, "Not Clicked On Building Materials");
        }
    }
    /*
    * a. Method Name: verifyBuildingMaterialsUrl
    * b. Author Name: Krishna
    * c. Description: Retrieves the current URL, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyBuildingMaterialsUrl(){
        try {
            String sealingPackageUrl = helper.getURL();
            Assert.assertTrue(sealingPackageUrl.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 22,0)));
            LoggerHandler.info("Verified Building-Materials-Supplies.html");
            test.log(Status.PASS, "Verified Building-Materials-Supplies.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Building-Materials-Supplies.html");
            test.log(Status.FAIL, "Not Verified Building-Materials-Supplies.html");
        }
    }
    /*
    * a. Method Name: verifyBuildingMaterialsTitle
    * b. Author Name: Krishna
    * c. Description: Retrieves the page title, verifies its content from Excel data, and logs the result.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyBuildingMaterialsTitle(){
        try {
            String sealingPackageTitle = helper.getTitle();
            Assert.assertTrue(sealingPackageTitle.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 23,0)));
            LoggerHandler.info("Verified Building Materials & Supplies title");
            test.log(Status.PASS, "Verified Building Materials & Supplies title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Building Materials & Supplies title");
            test.log(Status.FAIL, "Not Verified Building Materials & Supplies title");
        }
    }

    /*
    * a. Method Name: hoteItems
    * b. Author Name: Krishna
    * c. Description: Navigates through various product categories, clicks on elements, verifies URLs and titles, and logs results.
    * d. Return Type: Void
    * e. Parameter List: None
    */
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
        clickOnComputerProducts();
        verifyComputerProductsUrl();
        verifyComputerProductsTitle();
        
        clickOnLogo();
        clickOnConsumerElectronics();
        verifyConsumerElectronicsUrl();
        verifyConsumerElectronicsTitle();

        clickOnLogo();
        clickOnElectricalEquipment();
        verifyElectricalEquipmentUrl();
        verifyElectricalEquipmentTitle();

        clickOnLogo();
        clickOnElectronicComponents();
        verifyElectronicComponentsUrl();
        verifyElectronicComponentsTitle();

        clickOnLogo();
        clickOnGiftsCrafts();
        verifyGiftsCraftsUrl();
        verifyGiftsCraftsTitle();

        clickOnLogo();
        clickOnMotorCycles();
        verifyMotorCyclesUrl();
        verifyMotorCyclesTitle();

        clickOnLogo();
        clickOnSealingPackage();
        verifySealingPackageUrl();
        verifySealingPackageTitle();

        clickOnLogo();
        clickOnBuildingMaterials();
        verifyBuildingMaterialsUrl();
        verifyBuildingMaterialsTitle();
    }
}
