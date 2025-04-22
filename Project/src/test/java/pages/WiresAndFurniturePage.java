package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.SpicesPageContactLocators;
import uistore.WiresAndFurnitureLocatores;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class WiresAndFurniturePage {
    public static WebDriverHelper helper;
    public ExtentTest test;

    public WiresAndFurniturePage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    public void clickOnXmark(){
        try {
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.xmark, 10);
            helper.clickOnElement(SpicesPageContactLocators.xmark);
            test.log(Status.PASS, "Clicked on the xmark");
            LoggerHandler.info("Clicked on the xmark");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the xmark");
            LoggerHandler.info("Not clicked on the xmark");
        }
    }

    public void clickOnSearchBar(){
        try {
            helper.WaitForElementToBeVisible(WiresAndFurnitureLocatores.searchBar, 10);
            helper.clickOnElement(WiresAndFurnitureLocatores.searchBar);
            test.log(Status.PASS, "Clicked on the search bar");
            LoggerHandler.info("Clicked on the search bar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the search bar");
            LoggerHandler.info("Not clicked on the search bar");
        }
    }

    public void sendData(String value){
        try {
            helper.WaitForElementToBeVisible(WiresAndFurnitureLocatores.searchBar, 10);
            helper.SendKeys(WiresAndFurnitureLocatores.searchBar, value);
            test.log(Status.PASS, "Data sent to the search bar");
            LoggerHandler.info("Data sent to the search bar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Data not sent to the search bar");
            LoggerHandler.info("Data not sent to the search bar");
        }
    }

    public void enterData(){
        try {
            helper.WaitForElementToBeVisible(WiresAndFurnitureLocatores.searchBar, 10);
            helper.EnterAction(WiresAndFurnitureLocatores.searchBar);
            test.log(Status.PASS, "Enter action performed");
            LoggerHandler.info("Enter action performed");
        } catch (Exception e) {
            test.log(Status.FAIL, "Enter action not performed");
            LoggerHandler.info("Data not sent to the search bar");
        }
    }

    public void veirfyTextContainsWire(){
        try {
            String text = helper.getText(WiresAndFurnitureLocatores.firstProduct);
            Assert.assertTrue(text.contains("Wire"));
            test.log(Status.PASS, "Text Verified");
            LoggerHandler.info("Text Verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "Text Not Verified");
            LoggerHandler.info("Text Not Verified");
        }   
    }

    public void clickOnFirstProductWire(){
        try {
            helper.WaitForElementToBeVisible(WiresAndFurnitureLocatores.firstProduct, 10);
            helper.clickOnElement(WiresAndFurnitureLocatores.firstProduct);
            helper.switchToNewWindow();
            test.log(Status.PASS, "Clicked on the firstProduct");
            LoggerHandler.info("Clicked on the firstProduct");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the firstProduct");
            LoggerHandler.info("Not clicked on the firstProduct");
        }
    }

    public void verifyContactSupplier(){
        try {
            String contactText = helper.getText(WiresAndFurnitureLocatores.firstProduct);
            Assert.assertTrue(contactText.contains("Contact Supplier"));
            test.log(Status.PASS, "Text Verified");
            LoggerHandler.info("Text Verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "Text Not Verified");
            LoggerHandler.info("Text Not Verified");
        }
    }

    public void clickOnLogo(){
        try {
            helper.WaitForElementToBeVisible(WiresAndFurnitureLocatores.logo, 10);
            helper.clickOnElement(WiresAndFurnitureLocatores.logo);
            test.log(Status.PASS, "Clicked on the logo");
            LoggerHandler.info("Clicked on the logo");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the logo");
            LoggerHandler.info("Not clicked on the logo");
        }
    }

    public void veirfyTextContainsFurniture(){
        try {
            String text = helper.getText(WiresAndFurnitureLocatores.firstProduct);
            Assert.assertTrue(text.contains("Furniture"));
            test.log(Status.PASS, "Text Verified");
            LoggerHandler.info("Text Verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "Text Not Verified");
            LoggerHandler.info("Text Not Verified");
        }   
    }

    public void clikOnPagination2Page(){
        try {
            helper.ScrollByPixel(0, 5000);cd Project 
            Thread.sleep(3000);
            helper.WaitForElementToBeVisible(WiresAndFurnitureLocatores.clickOn2InPagination, 10);
            helper.javascriptClick(WiresAndFurnitureLocatores.clickOn2InPagination);
            test.log(Status.PASS, "Clicked on the clickOn2InPagination");
            LoggerHandler.info("Clicked on the clickOn2InPagination");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the clickOn2InPagination");
            LoggerHandler.info("Not clicked on the clickOn2InPagination");
        }
    }

    public void verifyHomePage(){
        try {
            String title = Base.driver.getTitle();
            Assert.assertTrue(title.contains("Made-in-China"));
            test.log(Status.PASS, "Title Verified");
            LoggerHandler.info("Title Verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "Title Not Verified");
            LoggerHandler.info("Title Not Verified");
        }  
    }

    public void WiresAndFurnitureTestCase(){
        clickOnXmark();
        clickOnSearchBar();
        sendData("Wires");
        enterData();
        veirfyTextContainsWire();
        clickOnFirstProductWire();
        clickOnLogo();
        clickOnSearchBar();
        sendData("Furniture");
        enterData();
        veirfyTextContainsFurniture();
        clikOnPagination2Page();
        clickOnLogo();
        verifyHomePage();

    }



}
