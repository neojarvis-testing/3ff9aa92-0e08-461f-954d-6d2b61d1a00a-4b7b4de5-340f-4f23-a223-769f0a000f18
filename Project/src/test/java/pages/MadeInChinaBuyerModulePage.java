package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.MadeInChinaBuyerModulePageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
public class MadeInChinaBuyerModulePage {
    public static ExtentTest test;
    public static WebDriverHelper helper;
    public MadeInChinaBuyerModulePage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.test = test;
    }
    public void ClosePopUp(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaBuyerModulePageLocator.ClosePopUp, 10);
            helper.clickOnElement(MadeInChinaBuyerModulePageLocator.ClosePopUp);
            test.log(Status.PASS, "pop up closed");
            LoggerHandler.info("pop up closed");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to close the pop up");
            LoggerHandler.error("Failed to close the pop up");
        }
    }
    public void HoverBuyer(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaBuyerModulePageLocator.HoverOnBuyer, 10);
            helper.hoverOverElement(MadeInChinaBuyerModulePageLocator.HoverOnBuyer);
            Screenshot.captureFullScreenshot("Buyer Services");
            Reporter.attachScreenshotToReport("Buyer Services", test, "Screenshot Attached to the report");
            test.log(Status.PASS, "Hovered on Buyer");
            LoggerHandler.info("Hovered on  Buyer");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to locate the element to be hovered");
            LoggerHandler.error("Failed to locate the element to be hovered");
        }
    }
    public void ClickNewUserGuide(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaBuyerModulePageLocator.ClickNewUserGuide, 10);
            helper.clickOnElement(MadeInChinaBuyerModulePageLocator.ClickNewUserGuide);
            helper.switchToAllTabs();
            Screenshot.captureFullScreenshot("New User Guide");
            Reporter.attachScreenshotToReport("New User guide", test, "Screenshot attached to the NewUserGuide Report");
            test.log(Status.PASS, "Clicked on new user guide");
            LoggerHandler.info("Clicked on new user guide");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldn't click on New User Guide");
            LoggerHandler.error("Couldn't click on new user guide");
        }
    }
    public void VerifyURL(){
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertTrue(url.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/BuyerExcel.xlsx/", "Samhitha", 1, 0)));
            test.log(Status.PASS, "URL Verified");
            LoggerHandler.info("URL Verified");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Url didn't match");
            LoggerHandler.error("Url didin't match");
        }
    }
    public void VerifyTitle(){
        try{
            String title = Base.driver.getTitle();
            Assert.assertTrue(title.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/BuyerExcel.xlsx/", "Samhitha", 2, 0)));
            test.log(Status.PASS, "Title verified successfully");
            LoggerHandler.info("Title verified successfully");
        }
        catch(AssertionError e){
            test.log(Status.FAIL, "Invalid Title");
            LoggerHandler.error("Invalid Title");
        }
    }
    public void ClickLogo(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaBuyerModulePageLocator.ClickLogo, 10);
            helper.clickOnElement(MadeInChinaBuyerModulePageLocator.ClickLogo);
            Screenshot.captureFullScreenshot("Made in china Logo");
            Reporter.attachScreenshotToReport("Made in china Logo", test, "Screentshot attached to the logo report");
            test.log(Status.PASS, "Clicked on Logo ");
            LoggerHandler.info("Clicked on logo");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldn't click on logo");
            LoggerHandler.error("Couldn't click on logo");
        }
    }
    public void ClickAuditedSuppliers(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaBuyerModulePageLocator.ClickAuditedSuppliers, 10);
            helper.clickOnElement(MadeInChinaBuyerModulePageLocator.ClickAuditedSuppliers);
            helper.switchToNewWindow();
            Screenshot.captureFullScreenshot("Audited Suppliers");
            Reporter.attachScreenshotToReport("Audited Suppliers", test, " Audited Suppliers ScreenShot Attached to the report");
            test.log(Status.PASS, "Clicked on Audited Suppliers");
            LoggerHandler.info("Clicked on Audited Suppliers");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldn't click on Audited Suupliers");
            LoggerHandler.error("Couldn't click on Audited Suppliers");
        }
    }
    public void VerifyURL2(){
        try {
            String url2=Base.driver.getCurrentUrl();
            Assert.assertTrue(url2.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/BuyerExcel.xlsx/", "Samhitha", 3, 0)));
            test.log(Status.PASS, "Verified Audited Suppliers");
            LoggerHandler.info("Verified Audited Suppliers");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Invalid URL");
            LoggerHandler.error("Invalid URL");
        }
    }
    public void VerifyTitle2(){
        try {
            String title2=Base.driver.getTitle();
            Assert.assertTrue(title2.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/BuyerExcel.xlsx/", "Samhitha", 4, 0)));
            test.log(Status.PASS, "Audited Suppliers Verified Successfully");
            LoggerHandler.info("Audites Suppliers Verified Successfully");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Couldn't verify the title Audited Suppliers");
            LoggerHandler.error("Couldn't verify the title Audited Suppliers");
        }
    }
    public void ClickMeetSuppliers(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaBuyerModulePageLocator.ClickMeetSupplier, 10);
            helper.clickOnElement(MadeInChinaBuyerModulePageLocator.ClickMeetSupplier);
            helper.switchToAllTabs();
            Screenshot.captureFullScreenshot("Meet Suppliers");
            Reporter.attachScreenshotToReport("Meet suppliers", test, "Meet suppliers ScreenShot Attached to report");
            test.log(Status.PASS, "Clicked on Meet suppliers link");
            LoggerHandler.info("Clicked on Meet suppliers link");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldn't find meet suppliers link");
            LoggerHandler.error("Clicked on Meet suppliers link");
        }
    }
    public void VerifyURL3(){
        try {
            String url3=Base.driver.getCurrentUrl();
            Assert.assertTrue(url3.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/BuyerExcel.xlsx/", "Samhitha", 5, 0)));
            test.log(Status.PASS, "Verified Private sourcing meeting url");
            LoggerHandler.info("Verified Private sourcing meeting url");
        } catch (Exception e) {
            test.log(Status.FAIL, "Invalid URL");
            LoggerHandler.error("Invalid URL");
        }
    }
    public void VerifyTitle3(){
        try {
            String title3=Base.driver.getTitle();
            Assert.assertTrue(title3.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/BuyerExcel.xlsx/", "Samhitha", 6, 0)));
            test.log(Status.PASS, "Meet Suppliers Verified Successfully");
            LoggerHandler.info("Meet Suppliers Verified Successfully");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Couldn't verify the title contains Meet Suppliers");
            LoggerHandler.error("Couldn't verify the title contains Meet Suppliers");
        }
    }
    public void testCase7(){
        ClosePopUp();
        HoverBuyer();
        ClickNewUserGuide();
        VerifyURL();
        VerifyTitle();
        ClickLogo();
        HoverBuyer();
        ClickAuditedSuppliers();
        VerifyURL2();
        VerifyTitle2();
        ClickLogo();
        HoverBuyer();
        ClickMeetSuppliers();
        VerifyURL3();
        VerifyTitle3();
        ClickLogo();
    }
}

