package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.MadeInChinaProductDirectoryPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class MadeInChinaProductDirectoryPage {
    WebDriverHelper helper;
    ExtentTest test;
    public MadeInChinaProductDirectoryPage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.test=test;
    }
    public void hoverOverBuyers(){
        helper.HoverOverElement(MadeInChinaProductDirectoryPageLocators.buyer);
    }
    public void clickOnProductDirectory(){
        helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.productDirectory);
        helper.switchToNewWindow();
    }
    public void clickOnMachineTools(){
        try {
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.machineTools);
            LoggerHandler.info("Successfully clicked on Machine Tools");
            test.log(Status.PASS, "Successfully clicked on Machine Tools");
        } catch (Exception e) {
            LoggerHandler.error("Successfully clicked on Machine Tools");
            test.log(Status.FAIL, "Successfully clicked on Machine Tools");
        }
    }
    public void clickOnEngineeringConstructionMachinery(){
        try {
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.engineeringConstructionMachinery);
            LoggerHandler.info("Successfully clicked on Engineering & Construction Machinery");
            test.log(Status.PASS, "Successfully clicked on Engineering & Construction Machinery");
        } catch (Exception e) {
            LoggerHandler.error("Successfully clicked on Engineering & Construction Machinery");
            test.log(Status.FAIL, "Successfully clicked on Engineering & Construction Machinery");
        }
    }
    public void clickOnWoodworkingMachinery(){
        try {
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.woodworkingMachinery);
            LoggerHandler.info("Successfully clicked on Woodworking Machinery");
            test.log(Status.PASS, "Successfully clicked on Woodworking Machinery");
        } catch (Exception e) {
            LoggerHandler.error("Successfully clicked on Woodworking Machinery");
            test.log(Status.FAIL, "Successfully clicked on Woodworking Machinery");
        }
    }
    public void clickOnPlasticMachinery(){
        try {
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.plasticMachinery);
            LoggerHandler.info("Successfully clicked on Plastic Machinery");
            test.log(Status.PASS, "Successfully clicked on Plastic Machinery");
        } catch (Exception e) {
            LoggerHandler.error("Successfully clicked on Plastic Machinery");
            test.log(Status.FAIL, "Successfully clicked on Plastic Machinery");
        }
    }
    public void clickOnMetallicProcessingMachinery(){
        try {
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.metallicProcessingMachinery);
            LoggerHandler.info("Successfully clicked on Metallic Processing Machinery");
            test.log(Status.PASS, "Successfully clicked on Metallic Processing Machinery");
        } catch (Exception e) {
            LoggerHandler.error("Successfully clicked on Metallic Processing Machinery");
            test.log(Status.FAIL, "Successfully clicked on Metallic Processing Machinery");
        }
    }
    public void clickOnMould(){
        try {
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.mould);
            LoggerHandler.info("Successfully clicked on Mould");
            test.log(Status.PASS, "Successfully clicked on Mould");
        } catch (Exception e) {
            LoggerHandler.error("Successfully clicked on Mould");
            test.log(Status.FAIL, "Successfully clicked on Mould");
        }
    }
    public void clickOnLaserEquipment(){
        try {
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.laserEquipment);
            LoggerHandler.info("Successfully clicked on Laser Equipment");
            test.log(Status.PASS, "Successfully clicked on Laser Equipment");
        } catch (Exception e) {
            LoggerHandler.error("Successfully clicked on Laser Equipment");
            test.log(Status.FAIL, "Successfully clicked on Laser Equipment");
        }
    }
    public void clickOnCastingForging(){
        try {
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.castingForging);
            LoggerHandler.info("Successfully clicked on Casting & Forging");
            test.log(Status.PASS, "Successfully clicked on Casting & Forging");
        } catch (Exception e) {
            LoggerHandler.error("Successfully clicked on Casting & Forging");
            test.log(Status.FAIL, "Successfully clicked on Casting & Forging");
        }
    }
    public void clickOnAgriculturalMachinery(){
        try {
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.agriculturalMachinery);
            LoggerHandler.info("Successfully clicked on Agricultural Machinery");
            test.log(Status.PASS, "Successfully clicked on Agricultural Machinery");
        } catch (Exception e) {
            LoggerHandler.error("Successfully clicked on Agricultural Machinery");
            test.log(Status.FAIL, "Successfully clicked on Agricultural Machinery");
        }
    }
    
}
