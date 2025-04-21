package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.MadeInChinaHomePageLocators;
import uistore.MadeInChinaProductDirectoryPageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class MadeInChinaProductDirectoryPage {
    WebDriverHelper helper;
    ExtentTest test;
    public MadeInChinaProductDirectoryPage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.test=test;
    }
    public void clickOnPopUp(){
        helper.clickOnElement(MadeInChinaHomePageLocators.popup);
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
            helper.WaitForElementToBeVisible(MadeInChinaProductDirectoryPageLocators.machineTools, 10);
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.machineTools);
            helper.switchToNewWindow();
            LoggerHandler.info("Successfully clicked on Machine Tools");
            test.log(Status.PASS, "Successfully clicked on Machine Tools");
        } catch (Exception e) {
            LoggerHandler.error("Successfully clicked on Machine Tools");
            test.log(Status.FAIL, "Successfully clicked on Machine Tools");
        }
    }
    public void clickOnEngineeringConstructionMachinery(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaProductDirectoryPageLocators.engineeringConstructionMachinery, 10);
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.engineeringConstructionMachinery);
            helper.switchToNewWindow();
            LoggerHandler.info("Successfully clicked on Engineering & Construction Machinery");
            test.log(Status.PASS, "Successfully clicked on Engineering & Construction Machinery");
        } catch (Exception e) {
            LoggerHandler.error("Successfully clicked on Engineering & Construction Machinery");
            test.log(Status.FAIL, "Successfully clicked on Engineering & Construction Machinery");
        }
    }
    public void clickOnWoodworkingMachinery(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaProductDirectoryPageLocators.woodworkingMachinery, 10);
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.woodworkingMachinery);
            helper.switchToNewWindow();
            LoggerHandler.info("Successfully clicked on Woodworking Machinery");
            test.log(Status.PASS, "Successfully clicked on Woodworking Machinery");
        } catch (Exception e) {
            LoggerHandler.error("Successfully clicked on Woodworking Machinery");
            test.log(Status.FAIL, "Successfully clicked on Woodworking Machinery");
        }
    }
    public void clickOnPlasticMachinery(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaProductDirectoryPageLocators.plasticMachinery, 10);
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.plasticMachinery);
            helper.switchToNewWindow();
            LoggerHandler.info("Successfully clicked on Plastic Machinery");
            test.log(Status.PASS, "Successfully clicked on Plastic Machinery");
        } catch (Exception e) {
            LoggerHandler.error("Successfully clicked on Plastic Machinery");
            test.log(Status.FAIL, "Successfully clicked on Plastic Machinery");
        }
    }
    public void clickOnMetallicProcessingMachinery(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaProductDirectoryPageLocators.metallicProcessingMachinery, 10);
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.metallicProcessingMachinery);
            helper.switchToNewWindow();
            LoggerHandler.info("Successfully clicked on Metallic Processing Machinery");
            test.log(Status.PASS, "Successfully clicked on Metallic Processing Machinery");
        } catch (Exception e) {
            LoggerHandler.error("Successfully clicked on Metallic Processing Machinery");
            test.log(Status.FAIL, "Successfully clicked on Metallic Processing Machinery");
        }
    }
    public void clickOnMould(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaProductDirectoryPageLocators.mould, 10);
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.mould);
            helper.switchToNewWindow();
            LoggerHandler.info("Successfully clicked on Mould");
            test.log(Status.PASS, "Successfully clicked on Mould");
        } catch (Exception e) {
            LoggerHandler.error("Successfully clicked on Mould");
            test.log(Status.FAIL, "Successfully clicked on Mould");
        }
    }
    public void clickOnLaserEquipment(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaProductDirectoryPageLocators.laserEquipment, 10);
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.laserEquipment);
            helper.switchToNewWindow();
            LoggerHandler.info("Successfully clicked on Laser Equipment");
            test.log(Status.PASS, "Successfully clicked on Laser Equipment");
        } catch (Exception e) {
            LoggerHandler.error("Successfully clicked on Laser Equipment");
            test.log(Status.FAIL, "Successfully clicked on Laser Equipment");
        }
    }
    public void clickOnCastingForging(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaProductDirectoryPageLocators.castingForging, 10);
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.castingForging);
            helper.switchToNewWindow();
            LoggerHandler.info("click on casting");
            test.log(Status.PASS, "click on casting");
            LoggerHandler.info("Successfully clicked on Casting & Forging");
            test.log(Status.PASS, "Successfully clicked on Casting & Forging");
        } catch (Exception e) {
            LoggerHandler.error("Successfully clicked on Casting & Forging");
            test.log(Status.FAIL, "Successfully clicked on Casting & Forging");
        }
    }
    public void clickOnAgriculturalMachinery(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaProductDirectoryPageLocators.agriculturalMachinery, 10);
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.agriculturalMachinery);
            helper.switchToNewWindow();
            LoggerHandler.info("Successfully clicked on Agricultural Machinery");
            test.log(Status.PASS, "Successfully clicked on Agricultural Machinery");
        } catch (Exception e) {
            LoggerHandler.error("Successfully clicked on Agricultural Machinery");
            test.log(Status.FAIL, "Successfully clicked on Agricultural Machinery");
        }
    }
    public void navigateBack(){
        try {

            helper.switchBackTowindow(1);
            LoggerHandler.info("Successfully  navigated Back");
            test.log(Status.PASS,"Successfully navigated Back");
        } catch (Exception e) {
            LoggerHandler.info("Failed to navigated Back");
            test.log(Status.PASS,"Failed to navigated Back");
        }
    }
    public void verifyurl(String url){
        try {
            String text=helper.getURL();
            Assert.assertTrue(text.contains(url));
            // System.out.println(text);
            // System.out.println(url);
            LoggerHandler.info("Successfully  verified the url "+url);
            test.log(Status.PASS,"Successfully verified the url  "+url );
        } catch (Exception e) {
            LoggerHandler.info("Failed to verified the url  "+url );
            test.log(Status.FAIL,"Failed to verified the url  "+url );
        }
       
        
    }
    public void productDirectory(){
            clickOnPopUp();
            hoverOverBuyers();
            clickOnProductDirectory();
            clickOnMachineTools();
            verifyurl(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Pruthvi", 0, 1));
            navigateBack();
            clickOnEngineeringConstructionMachinery();
            verifyurl(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Pruthvi", 1, 1));
            navigateBack();
            clickOnWoodworkingMachinery();
            verifyurl(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 2, 1));
            navigateBack();
            clickOnPlasticMachinery();
            verifyurl(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 3, 1));
            navigateBack();
            clickOnMetallicProcessingMachinery();
            verifyurl(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 4, 1));
            navigateBack();
            clickOnMould();
            verifyurl(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 5, 1));
            navigateBack();
            clickOnLaserEquipment();
            verifyurl(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 6, 1));
            navigateBack();
            clickOnCastingForging();
            verifyurl(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 7, 1));   
            navigateBack();
            clickOnAgriculturalMachinery();
            verifyurl(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 8, 1));
            
    }
    
}
