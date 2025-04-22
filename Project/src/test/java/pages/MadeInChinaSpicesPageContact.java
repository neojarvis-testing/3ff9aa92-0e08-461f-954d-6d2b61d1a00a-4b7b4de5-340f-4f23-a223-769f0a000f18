package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.MadeInChinaSpicesPageContactLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class MadeInChinaSpicesPageContact {
     WebDriverHelper helper;
     ExtentTest test;

    public MadeInChinaSpicesPageContact(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }


    /*
     * a.Method Name: clickOnXmark
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the x mark.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnXmark(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.xmark, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.xmark);
            test.log(Status.PASS, "Clicked on the xmark");
            LoggerHandler.info("Clicked on the xmark");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the xmark");
            LoggerHandler.info("Not clicked on the xmark");
        }
    }

    /*
     * a.Method Name: clickOnSearchBar
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the search bar.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnSearchBar(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.searchBar, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.searchBar);
            test.log(Status.PASS, "Clicked on the search bar");
            LoggerHandler.info("Clicked on the search bar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the search bar");
            LoggerHandler.info("Not clicked on the search bar");
        }
    }
    
    /*
     * a.Method Name: sendData
     * b.Author Name: Shashank Kondur
     * c.Description: Method to sent the data to search bar.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void sendData(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.searchBar, 10);
            helper.SendKeys(MadeInChinaSpicesPageContactLocators.searchBar, "spices");
            test.log(Status.PASS, "Data sent to the search bar");
            LoggerHandler.info("Data sent to the search bar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Data not sent to the search bar");
            LoggerHandler.info("Data not sent to the search bar");
        }
    }

    /*
     * a.Method Name: enterData
     * b.Author Name: Shashank Kondur
     * c.Description: Method to perform enter action.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void enterData(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.searchBar, 10);
            helper.EnterAction(MadeInChinaSpicesPageContactLocators.searchBar);
            test.log(Status.PASS, "Enter action performed");
            LoggerHandler.info("Enter action performed");
        } catch (Exception e) {
            test.log(Status.FAIL, "Enter action not performed");
            LoggerHandler.info("Data not sent to the search bar");
        }
    }

    /*
     * a.Method Name: clickOnContactNow
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the contact now.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnContactNow(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.contactNow, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.contactNow);
            helper.switchToNewWindow();
            test.log(Status.PASS, "Clicked on the first contactNow");
            LoggerHandler.info("Clicked on the first contactNow");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the first contactNow");
            LoggerHandler.info("Not clicked on the first contactNow");
        }
    }

    /*
     * a.Method Name: clickOnFirstProduct
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clickOnFirstProduct.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnFirstProduct(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.firstProduct, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.firstProduct);
            helper.switchToNewWindow();
            test.log(Status.PASS, "Clicked on the first product");
            LoggerHandler.info("Clicked on the first product");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the first product");
            LoggerHandler.info("Not clicked on the first product");
        }
    }

    /*
     * a.Method Name: clickOnContactSupplier
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clickOnContactSupplier.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnContactSupplier(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.contactSeller, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.contactSeller);
            helper.switchToNewWindow();
            test.log(Status.PASS, "Clicked on the contactSupplier");
            LoggerHandler.info("Clicked on the contactSupplier");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the contactSupplier");
            LoggerHandler.info("Not clicked on the contactSupplier");
        }
    }


    /*
     * a.Method Name: clickOnTextArea
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clickOnTextArea.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnTextArea(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.textArea, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.textArea);
            test.log(Status.PASS, "Clicked on the textArea");
            LoggerHandler.info("Clicked on the textArea");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the textArea");
            LoggerHandler.info("Not clicked on the textArea");
        }
    }

    /*
     * a.Method Name: sendDataToTextArea
     * b.Author Name: Shashank Kondur
     * c.Description: Method to send the data to textArea.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void sendDataToTextArea(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.textArea, 10);
            helper.SendKeys(MadeInChinaSpicesPageContactLocators.textArea, "I want to know more details about the item. ");
            test.log(Status.PASS, "Data sent to the textArea");
            LoggerHandler.info("Data sent to the textArea");
        } catch (Exception e) {
            test.log(Status.FAIL, "Data not sent to the textArea");
            LoggerHandler.info("Data not sent to the textArea");
        }
    }

    /*
     * a.Method Name: clickOnEmailInput
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on clickOnEmailInput.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnEmailInput(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.emailInput, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.emailInput);
            test.log(Status.PASS, "Clicked on the emailInput");
            LoggerHandler.info("Clicked on the emailInput");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the emailInput");
            LoggerHandler.info("Not clicked on the emailInput");
        }
    }

    /*
     * a.Method Name: sendDataToEmailInput
     * b.Author Name: Shashank Kondur
     * c.Description: Method to send the data to emailInput.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void sendDataToEmailInput(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.emailInput, 10);
            helper.SendKeys(MadeInChinaSpicesPageContactLocators.emailInput, "testmic@gmail.com");
            test.log(Status.PASS, "Data sent to the emailInput");
            LoggerHandler.info("Data sent to the emailInput");
        } catch (Exception e) {
            test.log(Status.FAIL, "Data not sent to the emailInput");
            LoggerHandler.info("Data not sent to the emailInput");
        }
    }

    /*
     * a.Method Name: clickOnSendInquireNow
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clickOnSendInquireNow.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnSendInquireNow(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.sendInquryNow, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.sendInquryNow);
            test.log(Status.PASS, "Clicked on the sendInquryNow");
            LoggerHandler.info("Clicked on the sendInquryNow");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the sendInquryNow");
            LoggerHandler.info("Not clicked on the sendInquryNow");
        }
    }

    /*
     * a.Method Name: verifyTextSuccessfullySended
     * b.Author Name: Shashank Kondur
     * c.Description: Method to verify the text.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void verifyTextSuccessfullySended(){
        try {
            String text = helper.getText(MadeInChinaSpicesPageContactLocators.sentSuccessfully);
            Assert.assertEquals("text, Sent Successfully!", text);
            test.log(Status.PASS, "Text Verified");
            LoggerHandler.info("Text Verified");
        } catch (Exception e) {
            test.log(Status.PASS, "Text Not Verified");
            LoggerHandler.info("Text Not Verified");
        }
    }

    /*
     * a.Method Name: clickOnAccountPassword
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clickOnAccountPassword.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnAccountPassword(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.accountPassword, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.accountPassword);
            test.log(Status.PASS, "Clicked on the accountPassword");
            LoggerHandler.info("Clicked on the accountPassword");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the accountPassword");
            LoggerHandler.info("Not clicked on the accountPassword");
        }
    }

    /*
     * a.Method Name: sendDataToAccountPassword
     * b.Author Name: Shashank Kondur
     * c.Description: Method to send the data to account password.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void sendDataToAccountPassword(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.accountPassword, 10);
            helper.SendKeys(MadeInChinaSpicesPageContactLocators.accountPassword, "testadmin@123");
            test.log(Status.PASS, "Data sent to the accountPassword");
            LoggerHandler.info("Data sent to the emailInput");
        } catch (Exception e) {
            test.log(Status.FAIL, "Data not sent to the accountPassword");
            LoggerHandler.info("Data not sent to the accountPassword");
        }
    }

    /*
     * a.Method Name: clickOncheckBox
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clickOncheckBox.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOncheckBox(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.checkBox, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.checkBox);
            test.log(Status.PASS, "Clicked on the checkBox");
            LoggerHandler.info("Clicked on the checkBox");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the checkBox");
            LoggerHandler.info("Not clicked on the checkBox");
        }
    }

    /*
     * a.Method Name: clickOnVerifyEmail
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clickOnVerifyEmail.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnVerifyEmail(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.verifyEmail, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.verifyEmail);
            Screenshot.captureFullScreenshot("otp");
            Reporter.attachScreenshotToReport("otp page", test, "report of the otp page");
            test.log(Status.PASS, "Clicked on the verifyEmail");
            LoggerHandler.info("Clicked on the verifyEmail");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the verifyEmail");
            LoggerHandler.info("Not clicked on the verifyEmail");
        }
    }
    
    /*
     * a.Method Name: SpicesPageContactTestCase
     * b.Author Name: Shashank Kondur
     * c.Description: Method to run all the methods with in the page.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void SpicesPageContactTestCase(){
        clickOnXmark();
        clickOnSearchBar();
        sendData();
        enterData();
        clickOnContactNow();
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
