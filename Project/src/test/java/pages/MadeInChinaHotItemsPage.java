package pages;

import org.bouncycastle.x509.util.LDAPStoreHelper;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.MadeInChinaHotItemsPageLocator;
import utils.Base;
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
            //helper.clickOnElement(MadeInChinaHotItemsPageLocator.logo);
            helper.switchBackToWindow(0);
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
            Screenshot.captureFullScreenshot("Furniture");
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
            Screenshot.captureFullScreenshot("Apparel Clothing");
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
            Screenshot.captureFullScreenshot("Auto Parts");
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
            Screenshot.captureFullScreenshot("Bags Cases");
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
            String bagsTitle = helper.getTitle();
            Assert.assertTrue(bagsTitle.contains("Bags, Cases & Luggages"));
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
            Screenshot.captureFullScreenshot("Computer Products");
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
            String computerTitle = helper.getTitle();
            Assert.assertTrue(computerTitle.contains("Computer Products"));
            LoggerHandler.info("Verified Computer Products title");
            test.log(Status.PASS, "Verified Computer Products title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Computer Products title");
            test.log(Status.FAIL, "Not Verified Computer Products title");
        }
    }
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
    public void verifyConsumerElectronicsUrl(){
        try {
            String electronicsUrl = helper.getURL();
            Assert.assertTrue(electronicsUrl.contains("Consumer-Electronics.html"));
            LoggerHandler.info("Verified Consumer-Electronics.html");
            test.log(Status.PASS, "Verified Consumer-Electronics.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Consumer-Electronics.html");
            test.log(Status.FAIL, "Not Verified Consumer-Electronics.html");
        }
    }
    public void verifyConsumerElectronicsTitle(){
        try {
            String electronicsTitle = helper.getTitle();
            Assert.assertTrue(electronicsTitle.contains("Consumer Electronics"));
            LoggerHandler.info("Verified Consumer Electronics title");
            test.log(Status.PASS, "Verified Consumer Electronics title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Consumer Electronics title");
            test.log(Status.FAIL, "Not Verified Consumer Electronics title");
        }
    }
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
    public void verifyElectricalEquipmentUrl(){
        try {
            String electricalUrl = helper.getURL();
            Assert.assertTrue(electricalUrl.contains("Electrical-Equipments.html"));
            LoggerHandler.info("Verified Electrical-Equipments.html");
            test.log(Status.PASS, "Verified Electrical-Equipments.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Electrical-Equipments.html");
            test.log(Status.FAIL, "Not Verified Electrical-Equipments.html");
        }
    }
    public void verifyElectricalEquipmentTitle(){
        try {
            String electricalTitle = helper.getTitle();
            Assert.assertTrue(electricalTitle.contains("Electrical Equipment"));
            LoggerHandler.info("Verified Electrical Equipment title");
            test.log(Status.PASS, "Verified Electrical Equipment title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Electrical Equipment title");
            test.log(Status.FAIL, "Not Verified Electrical Equipment title");
        }
    }
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
    public void verifyElectronicComponentsUrl(){
        try {
            String componentsUrl = helper.getURL();
            Assert.assertTrue(componentsUrl.contains("Electronic-Components.html"));
            LoggerHandler.info("Verified Electronic-Components.html");
            test.log(Status.PASS, "Verified Electronic-Components.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Electronic-Components.html");
            test.log(Status.FAIL, "Not Verified Electronic-Components.html");
        }
    }
    public void verifyElectronicComponentsTitle(){
        try {
            String componentsTitle = helper.getTitle();
            Assert.assertTrue(componentsTitle.contains("Electronic Components"));
            LoggerHandler.info("Verified Electronic Components title");
            test.log(Status.PASS, "Verified Electronic Components title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Electronic Components title");
            test.log(Status.FAIL, "Not Verified Electronic Components title");
        }
    }
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
    public void verifyGiftsCraftsUrl(){
        try {
            String giftsUrl = helper.getURL();
            Assert.assertTrue(giftsUrl.contains("Gifts-Crafts-Collectibles.html"));
            LoggerHandler.info("Verified Gifts-Crafts-Collectibles.html");
            test.log(Status.PASS, "Verified Gifts-Crafts-Collectibles.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Gifts-Crafts-Collectibles.html");
            test.log(Status.FAIL, "Not Verified Gifts-Crafts-Collectibles.html");
        }
    }
    public void verifyGiftsCraftsTitle(){
        try {
            String giftTitle = helper.getTitle();
            Assert.assertTrue(giftTitle.contains("Gifts, Crafts & Collectibles"));
            LoggerHandler.info("Verified Gifts, Crafts & Collectibles title");
            test.log(Status.PASS, "Verified Gifts, Crafts & Collectibles title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Gifts, Crafts & Collectibles title");
            test.log(Status.FAIL, "Not Verified Gifts, Crafts & Collectibles title");
        }
    }
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
    public void verifyMotorCyclesUrl(){
        try {
            String motorCyclesUrl = helper.getURL();
            Assert.assertTrue(motorCyclesUrl.contains("Motorcycles-Scooters.html"));
            LoggerHandler.info("Verified Motorcycles-Scooters.html");
            test.log(Status.PASS, "Verified Motorcycles-Scooters.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Motorcycles-Scooters.html");
            test.log(Status.FAIL, "Not Verified Motorcycles-Scooters.html");
        }
    }
    public void verifyMotorCyclesTitle(){
        try {
            String motorCyclesTitle = helper.getTitle();
            Assert.assertTrue(motorCyclesTitle.contains("Motorcycles & Scooters"));
            LoggerHandler.info("Verified Motorcycles & Scooters title");
            test.log(Status.PASS, "Verified Motorcycles & Scooters title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Motorcycles & Scooters title");
            test.log(Status.FAIL, "Not Verified Motorcycles & Scooters title");
        }
    }
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
    public void verifySealingPackageUrl(){
        try {
            String sealingPackageUrl = helper.getURL();
            Assert.assertTrue(sealingPackageUrl.contains("Sealing-Packaging-Storage-Shelving.html"));
            LoggerHandler.info("Verified Sealing-Packaging-Storage-Shelving.html");
            test.log(Status.PASS, "Verified Sealing-Packaging-Storage-Shelving.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Sealing-Packaging-Storage-Shelving.html");
            test.log(Status.FAIL, "Not Verified Sealing-Packaging-Storage-Shelving.html");
        }
    }
    public void verifySealingPackageTitle(){
        try {
            String sealingPackageTitle = helper.getTitle();
            Assert.assertTrue(sealingPackageTitle.contains("Sealing, Packaging, Storage & Shelving"));
            LoggerHandler.info("Verified Sealing, Packaging, Storage & Shelving title");
            test.log(Status.PASS, "Verified Sealing, Packaging, Storage & Shelving title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Sealing, Packaging, Storage & Shelving title");
            test.log(Status.FAIL, "Not Verified Sealing, Packaging, Storage & Shelving title");
        }
    }
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
    public void verifyBuildingMaterialsUrl(){
        try {
            String sealingPackageUrl = helper.getURL();
            Assert.assertTrue(sealingPackageUrl.contains("Building-Materials-Supplies.html"));
            LoggerHandler.info("Verified Building-Materials-Supplies.html");
            test.log(Status.PASS, "Verified Building-Materials-Supplies.html");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Building-Materials-Supplies.html");
            test.log(Status.FAIL, "Not Verified Building-Materials-Supplies.html");
        }
    }
    public void verifyBuildingMaterialsTitle(){
        try {
            String sealingPackageTitle = helper.getTitle();
            Assert.assertTrue(sealingPackageTitle.contains("Building Materials & Supplies"));
            LoggerHandler.info("Verified Building Materials & Supplies title");
            test.log(Status.PASS, "Verified Building Materials & Supplies title");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Building Materials & Supplies title");
            test.log(Status.FAIL, "Not Verified Building Materials & Supplies title");
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
