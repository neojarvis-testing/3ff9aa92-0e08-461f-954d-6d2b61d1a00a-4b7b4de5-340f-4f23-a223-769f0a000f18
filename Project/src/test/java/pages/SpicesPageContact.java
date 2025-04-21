package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.SpicesPageContactLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class SpicesPageContact {
    public static WebDriverHelper helper;
    public ExtentTest test;

    public SpicesPageContact(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    public void clickOnSearchBar(){
        try {
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.searchBar, 10);
            helper.clickOnElement(SpicesPageContactLocators.searchBar);
            test.log(Status.INFO, "Clicked on the search bar");
            LoggerHandler.info("Clicked on the search bar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the search bar");
            LoggerHandler.info("Not clicked on the search bar");
        }
    }

    public void sendData(){
        try {
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.searchBar, 10);
            helper.SendKeys(SpicesPageContactLocators.searchBar, "spices");
            test.log(Status.INFO, "Data sent to the search bar");
            LoggerHandler.info("Data sent to the search bar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Data not sent to the search bar");
            LoggerHandler.info("Data not sent to the search bar");
        }
    }

    public void enterData(){
        try {
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.searchBar, 10);
            helper.EnterAction(SpicesPageContactLocators.searchBar);
            test.log(Status.INFO, "Enter action performed");
            LoggerHandler.info("Enter action performed");
        } catch (Exception e) {
            test.log(Status.FAIL, "Enter action not performed");
            LoggerHandler.info("Data not sent to the search bar");
        }
    }

    public void clickOnFirstProduct(){
        try {
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.firstProduct, 10);
            helper.clickOnElement(SpicesPageContactLocators.firstProduct);
            helper.switchToNewWindow();
            test.log(Status.INFO, "Clicked on the first product");
            LoggerHandler.info("Clicked on the first product");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the first product");
            LoggerHandler.info("Not clicked on the first product");
        }
    }

    public void clickOnContactSupplier(){
        try {
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.contactSeller, 10);
            helper.clickOnElement(SpicesPageContactLocators.contactSeller);
            helper.switchToNewWindow();
            test.log(Status.INFO, "Clicked on the contactSupplier");
            LoggerHandler.info("Clicked on the contactSupplier");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the contactSupplier");
            LoggerHandler.info("Not clicked on the contactSupplier");
        }
    }


    public void clickOnTextArea(){
        try {
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.textArea, 10);
            helper.clickOnElement(SpicesPageContactLocators.textArea);
            test.log(Status.INFO, "Clicked on the textArea");
            LoggerHandler.info("Clicked on the textArea");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the textArea");
            LoggerHandler.info("Not clicked on the textArea");
        }
    }

    public void sendDataToTextArea(){
        try {
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.textArea, 10);
            helper.SendKeys(SpicesPageContactLocators.textArea, "I want to know more details about the item. ");
            test.log(Status.INFO, "Data sent to the textArea");
            LoggerHandler.info("Data sent to the textArea");
        } catch (Exception e) {
            test.log(Status.FAIL, "Data not sent to the textArea");
            LoggerHandler.info("Data not sent to the textArea");
        }
    }

    public void clickOnEmailInput(){
        try {
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.emailInput, 10);
            helper.clickOnElement(SpicesPageContactLocators.emailInput);
            test.log(Status.INFO, "Clicked on the emailInput");
            LoggerHandler.info("Clicked on the emailInput");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the emailInput");
            LoggerHandler.info("Not clicked on the emailInput");
        }
    }

    public void sendDataToEmailInput(){
        try {
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.emailInput, 10);
            helper.SendKeys(SpicesPageContactLocators.textArea, "testmic@gmail.com");
            test.log(Status.INFO, "Data sent to the emailInput");
            LoggerHandler.info("Data sent to the emailInput");
        } catch (Exception e) {
            test.log(Status.FAIL, "Data not sent to the emailInput");
            LoggerHandler.info("Data not sent to the emailInput");
        }
    }

    public void clickOnSendInquireNow(){
        try {
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.sendInquryNow, 10);
            helper.clickOnElement(SpicesPageContactLocators.sendInquryNow);
            test.log(Status.INFO, "Clicked on the sendInquryNow");
            LoggerHandler.info("Clicked on the sendInquryNow");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the sendInquryNow");
            LoggerHandler.info("Not clicked on the sendInquryNow");
        }
    }

    



}
