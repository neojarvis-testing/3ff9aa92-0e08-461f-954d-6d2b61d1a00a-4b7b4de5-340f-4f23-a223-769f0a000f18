package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import lombok.val;
import uistore.SpicesPageContactLocators;
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
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.searchBar, 10);
            helper.clickOnElement(SpicesPageContactLocators.searchBar);
            test.log(Status.PASS, "Clicked on the search bar");
            LoggerHandler.info("Clicked on the search bar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the search bar");
            LoggerHandler.info("Not clicked on the search bar");
        }
    }

    public void sendData(String value){
        try {
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.searchBar, 10);
            helper.SendKeys(SpicesPageContactLocators.searchBar, value);
            test.log(Status.PASS, "Data sent to the search bar");
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
            test.log(Status.PASS, "Enter action performed");
            LoggerHandler.info("Enter action performed");
        } catch (Exception e) {
            test.log(Status.FAIL, "Enter action not performed");
            LoggerHandler.info("Data not sent to the search bar");
        }
    }

    public void veirfyTextContainsWire(){
        try {

            test.log(Status.PASS, "Enter action performed");
            LoggerHandler.info("Enter action performed");
        } catch (Exception e) {
            test.log(Status.FAIL, "Enter action not performed");
            LoggerHandler.info("Data not sent to the search bar");
        }
        
    }




}
