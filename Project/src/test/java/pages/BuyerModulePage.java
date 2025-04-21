package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.BuyerModulePageLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class BuyerModulePage {
    public static ExtentTest test;
    public static WebDriverHelper helper;
    public BuyerModulePage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
    }
    public void ClosePopUp(){
        try {
            helper.WaitForElementToBeVisible(BuyerModulePageLocator.ClosePopUp, 10);
            helper.clickOnElement(BuyerModulePageLocator.ClosePopUp);
            test.log(Status.PASS, "pop up closed");
            LoggerHandler.info("pop up closed");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to close the pop up");
            LoggerHandler.error("Failed to close the pop up");
        }
    }
    public void HoverBuyer(){
        try {
            helper.WaitForElementToBeVisible(BuyerModulePageLocator.HoverOnBuyer, 10);
            helper.HoverOverElement(BuyerModulePageLocator.HoverOnBuyer);
            test.log(Status.PASS, "Hovered on Buyer");
            LoggerHandler.info("Hovered on  Buyer");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to locate the element to be hovered");
            LoggerHandler.error("Failed to locate the element to be hovered");
        }
    }
    public void ClickNewUserGuide(){
        try {
            helper.WaitForElementToBeVisible(BuyerModulePageLocator.ClickNewUserGuide, 10);
            helper.clickOnElement(BuyerModulePageLocator.ClickNewUserGuide);
            helper.switchToAllTabs();
            test.log(Status.PASS, "Clicked on new user guide");
            LoggerHandler.info("Clicked on new user guide");
        } catch (Exception e) {
            // TODO: handle exception
            test.log(Status.FAIL, "Couldn't click on New User Guide");
            LoggerHandler.error("Couldn't click on new user guide");
        }
    }
    public void VerifyURL(){
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertTrue(url.contains( "how-to-source-products-on-made-in-china-com"));
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
            Assert.assertTrue(title.contains("How to Source Products from China"));
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
            helper.WaitForElementToBeVisible(BuyerModulePageLocator.ClickLogo, 10);
            helper.clickOnElement(BuyerModulePageLocator.ClickLogo);
            test.log(Status.PASS, "Clicked on Logo ");
            LoggerHandler.info("Clicked on logo");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldn't click on logo");
            LoggerHandler.error("Couldn't click on logo");
        }
    }
    public void ClickAuditedSuppliers(){
        try {
            helper.WaitForElementToBeVisible(BuyerModulePageLocator.ClickAuditedSuppliers, 10);
            helper.clickOnElement(BuyerModulePageLocator.ClickAuditedSuppliers);
            helper.switchToNewWindow();
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
            Assert.assertTrue(url2.contains("audited-suppliers"));
            test.log(Status.PASS, "Verified Audited Suppliers");
            LoggerHandler.info("Verified Audited Suppliers");
        } catch (Exception e) {
            test.log(Status.FAIL, "Invalid URL");
            LoggerHandler.error("Invalid URL");
        }
    }
    public void VerifyTitle2(){
        try {
            String title2=Base.driver.getTitle();
            Assert.assertTrue(title2.contains("Audited Suppliers | Choose the Reliable"));
            test.log(Status.PASS, "Audited Suppliers Verified Successfully");
            LoggerHandler.info("Audites Suppliers Verified Successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldn't verify the title Audited Suppliers");
            LoggerHandler.error("Couldn't verify the title Audited Suppliers");
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






    }
}

