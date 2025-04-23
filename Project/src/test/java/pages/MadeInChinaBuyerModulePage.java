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
    ExtentTest test;
    WebDriverHelper helper;
    public MadeInChinaBuyerModulePage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.test = test;
    }
    /*
     * a.Method Name: close Pop Up
     * b.Author Name: Samhitha
     * c.Description: This method is used to close the pop up 
     * d.Return Type: void
     */
    public void closePopUp(){
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
    /*
     * a.Method Name: Hover Buyer
     * b.Author Name: Samhitha
     * c.Description: This method hovers on the buyer 
     * d.Return Type: void
     */
    public void hoverOnBuyer(){
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
    /*
     * a.Method Name: Click new user guide
     * b.Author Name: Samhitha
     * c.Description: This method is used to close the pop up 
     * d.Return Type: void
     */
    public void clickNewUserGuide(){
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
    /*
     * a.Method Name: Verify URL
     * b.Author Name: Samhitha
     * c.Description: This method is used to Verify the URL 
     * d.Return Type: void
     */
    public void verifyURLNewUser(){
        try {
            String url=Base.driver.getCurrentUrl();
            System.out.println(url);
            String NewUser=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/BuyerExcel.xlsx/", "Samhitha", 0, 0);
            Assert.assertTrue(url.contains(NewUser));
            test.log(Status.PASS, "URL Verified");
            LoggerHandler.info("URL Verified");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Url didn't match");
            LoggerHandler.error("Url didin't match");
        }
    }
    /*
     * a.Method Name: Verify Title
     * b.Author Name: Samhitha
     * c.Description: This method is used to Verify Title
     * d.Return Type: void
     */
    public void verifyTitleSourceProducts(){
        try{
            String title = Base.driver.getTitle();
            System.out.println(title);
            String value=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/BuyerExcel.xlsx/", "Samhitha", 1, 0);
            Assert.assertTrue(title.contains(value));
            test.log(Status.PASS, "Title verified successfully");
            LoggerHandler.info("Title verified successfully");
        }
        catch(AssertionError e){
            test.log(Status.FAIL, "Invalid Title");
            LoggerHandler.error("Invalid Title");
        }
    }
    /*
     * a.Method Name: Click Logo
     * b.Author Name: Samhitha
     * c.Description: This method is used to click on logo 
     * d.Return Type: void
     */
    public void clickLogo(){
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
    /*
     * a.Method Name: Click Audited Suppliers
     * b.Author Name: Samhitha
     * c.Description: This method is used to click on audited suppliers 
     * d.Return Type: void
     */
    public void clickAuditedSuppliers(){
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
    /*
     * a.Method Name: Verify Url2
     * b.Author Name: Samhitha
     * c.Description: This method is used to verify the url which contains audited supplier
     * d.Return Type: void
     */
    public void verifyURLSourceProducts(){
        try {
            String url2=Base.driver.getCurrentUrl();
            System.out.println(url2);
            String url=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/BuyerExcel.xlsx/", "Samhitha", 2, 0);
            Assert.assertTrue(url2.contains(url));
            test.log(Status.PASS, "Verified Audited Suppliers");
            LoggerHandler.info("Verified Audited Suppliers");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Invalid URL");
            LoggerHandler.error("Invalid URL");
        }
    }
    /*
     * a.Method Name: Verify Title
     * b.Author Name: Samhitha
     * c.Description: This method is used to Verify Title
     * d.Return Type: void
     */
    public void verifyTitleAuditedSupplier(){
        try {
            String title2=Base.driver.getTitle();
            System.out.println(title2);
            String text=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/BuyerExcel.xlsx/", "Samhitha", 3, 0);
            Assert.assertTrue(title2.contains(text));
            test.log(Status.PASS, "Audited Suppliers Verified Successfully");
            LoggerHandler.info("Audites Suppliers Verified Successfully");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Couldn't verify the title Audited Suppliers");
            LoggerHandler.error("Couldn't verify the title Audited Suppliers");
        }
    }
    /*
     * a.Method Name: Click Meet Suppliers
     * b.Author Name: Samhitha
     * c.Description: This method is used to click on Meet suppliers
     * d.Return Type: void
     */
    public void clickMeetSuppliers(){
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
    /*
     * a.Method Name: Verify Url
     * b.Author Name: Samhitha
     * c.Description: This method is used to verify the url which contains private sourcing meeting
     * d.Return Type: void
     */
    public void verifyURLPrivateSourcing(){
        try {
            String url3=Base.driver.getCurrentUrl();
            System.out.println(url3);
            String url=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/BuyerExcel.xlsx/", "Samhitha", 4, 0);
            Assert.assertTrue(url3.contains(url));
            test.log(Status.PASS, "Verified Private sourcing meeting url");
            LoggerHandler.info("Verified Private sourcing meeting url");
        } catch (Exception e) {
            test.log(Status.FAIL, "Invalid URL");
            LoggerHandler.error("Invalid URL");
        }
    }
    /*
     * a.Method Name: Verify Title
     * b.Author Name: Samhitha
     * c.Description: This method is used to Verify Title
     * d.Return Type: void
     */
    public void verifyTitleMeetSuppliers(){
        try {
            String title3=Base.driver.getTitle();
            System.out.println(title3);
            String title=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/BuyerExcel.xlsx/", "Samhitha", 5, 0);
            Assert.assertTrue(title3.contains(title));
            test.log(Status.PASS, "Meet Suppliers Verified Successfully");
            LoggerHandler.info("Meet Suppliers Verified Successfully");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Couldn't verify the title contains Meet Suppliers");
            LoggerHandler.error("Couldn't verify the title contains Meet Suppliers");
        }
    }
    public void testCase7(){
        closePopUp();
        hoverOnBuyer();
        clickNewUserGuide();
        verifyURLNewUser();
        verifyTitleSourceProducts();
        clickLogo();
        hoverOnBuyer();
        clickAuditedSuppliers();
        verifyURLSourceProducts();
        verifyTitleAuditedSupplier();
        clickLogo();
        hoverOnBuyer();
        clickMeetSuppliers();
        verifyURLPrivateSourcing();
        verifyTitleMeetSuppliers();
        clickLogo();
    }
}

