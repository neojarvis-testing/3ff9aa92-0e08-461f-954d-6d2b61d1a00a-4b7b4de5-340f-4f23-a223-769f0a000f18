package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.SpicesPageContactLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SpicesPageContact {
    public static WebDriverHelper helper;
    public ExtentTest test;

    public SpicesPageContact(ExtentTest test){
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

    public void sendData(){
        try {
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.searchBar, 10);
            helper.SendKeys(SpicesPageContactLocators.searchBar, "spices");
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

    public void clickOnFirstProduct(){
        try {
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.firstProduct, 10);
            helper.clickOnElement(SpicesPageContactLocators.firstProduct);
            helper.switchToNewWindow();
            test.log(Status.PASS, "Clicked on the first product");
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
            test.log(Status.PASS, "Clicked on the contactSupplier");
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
            test.log(Status.PASS, "Clicked on the textArea");
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
            test.log(Status.PASS, "Data sent to the textArea");
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
            test.log(Status.PASS, "Clicked on the emailInput");
            LoggerHandler.info("Clicked on the emailInput");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the emailInput");
            LoggerHandler.info("Not clicked on the emailInput");
        }
    }

    public void sendDataToEmailInput(){
        try {
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.emailInput, 10);
            helper.SendKeys(SpicesPageContactLocators.emailInput, "testmic@gmail.com");
            test.log(Status.PASS, "Data sent to the emailInput");
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
            test.log(Status.PASS, "Clicked on the sendInquryNow");
            LoggerHandler.info("Clicked on the sendInquryNow");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the sendInquryNow");
            LoggerHandler.info("Not clicked on the sendInquryNow");
        }
    }

    public void verifyTextSuccessfullySended(){
        try {
            String text = helper.getText(SpicesPageContactLocators.sentSuccessfully);
            Assert.assertEquals("text, Sent Successfully!", text);
            test.log(Status.PASS, "Text Verified");
            LoggerHandler.info("Text Verified");
        } catch (Exception e) {
            test.log(Status.PASS, "Text Not Verified");
            LoggerHandler.info("Text Not Verified");
        }
    }

    public void clickOnAccountPassword(){
        try {
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.accountPassword, 10);
            helper.clickOnElement(SpicesPageContactLocators.accountPassword);
            test.log(Status.PASS, "Clicked on the accountPassword");
            LoggerHandler.info("Clicked on the accountPassword");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the accountPassword");
            LoggerHandler.info("Not clicked on the accountPassword");
        }
    }

    public void sendDataToAccountPassword(){
        try {
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.accountPassword, 10);
            helper.SendKeys(SpicesPageContactLocators.accountPassword, "testadmin@123");
            test.log(Status.PASS, "Data sent to the accountPassword");
            LoggerHandler.info("Data sent to the emailInput");
        } catch (Exception e) {
            test.log(Status.FAIL, "Data not sent to the accountPassword");
            LoggerHandler.info("Data not sent to the accountPassword");
        }
    }

    public void clickOncheckBox(){
        try {
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.checkBox, 10);
            helper.clickOnElement(SpicesPageContactLocators.checkBox);
            test.log(Status.PASS, "Clicked on the checkBox");
            LoggerHandler.info("Clicked on the checkBox");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the checkBox");
            LoggerHandler.info("Not clicked on the checkBox");
        }
    }

    public void clickOnVerifyEmail(){
        try {
            helper.WaitForElementToBeVisible(SpicesPageContactLocators.verifyEmail, 10);
            helper.clickOnElement(SpicesPageContactLocators.verifyEmail);
            Screenshot.captureFullScreenshot("otp");
            Reporter.attachScreenshotToReport("otp page", test, "report of the otp page");
            test.log(Status.PASS, "Clicked on the verifyEmail");
            LoggerHandler.info("Clicked on the verifyEmail");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the verifyEmail");
            LoggerHandler.info("Not clicked on the verifyEmail");
        }
    }
    
    public void SpicesPageContactTestCase(){
        clickOnXmark();
        clickOnSearchBar();
        sendData();
        enterData();
        clickOnFirstProduct();
        clickOnContactSupplier();
        clickOnTextArea();
        sendDataToTextArea();
        clickOnEmailInput();
        sendDataToEmailInput();
        clickOnSendInquireNow();
        verifyTextSuccessfullySended();
        clickOnAccountPassword();
        sendDataToAccountPassword();
        clickOncheckBox();
        clickOnVerifyEmail();
    }



}
