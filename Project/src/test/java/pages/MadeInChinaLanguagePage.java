package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.MadeInChinaLanguagePageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class MadeInChinaLanguagePage {
    WebDriverHelper helper;
    ExtentTest test;
    public MadeInChinaLanguagePage(ExtentTest test){
        this.test = test;
        helper = new WebDriverHelper(Base.driver);
    }
    /*
     * Method name: closePopUp.
     * AuthorName: Rishi Prashar.
     * Description: This method will help us to close the pop up.
     * Parameters: None.
     * return type: void.
     */
    public void closePopUp(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLanguagePageLocator.joinFree,3);
            helper.clickOnElement(MadeInChinaLanguagePageLocator.popup);
            test.log(Status.PASS, "closed pop up");
            LoggerHandler.info("closed pop up");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not close pop up");
            LoggerHandler.error("Did not close pop up");
        }
    }
    /*
     * Method name: hoverOnSignIn.
     * AuthorName: Rishi Prashar.
     * Description: This method will over to SignIn.
     * Parameters: None.
     * return type: void.
     */
    public void hoverOnSignIn(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLanguagePageLocator.signIn,3);
            helper.hoverOverElement(MadeInChinaLanguagePageLocator.signIn);
            test.log(Status.PASS, "Hovered on SignIn");
            LoggerHandler.info("Hovered On SignIn");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not hover on SignIn");
            LoggerHandler.error("Did not hover over SignIn");
        }
    }
     /*
     * Method name: clickOnJoinFree.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on Join Free.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnJoinFree(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLanguagePageLocator.joinFree,3);
            helper.clickAndSwitch(MadeInChinaLanguagePageLocator.joinFree);
            test.log(Status.PASS, "clicked on Join Free");
            LoggerHandler.info("clicked on Join Free");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on Join Free");
            LoggerHandler.error("Did not click on Join Free");
        }
    }
     /*
     * Method name: verifyCreateAccount.
     * AuthorName: Rishi Prashar.
     * Description: This method will verify the heading.
     * Parameters: None.
     * return type: void.
     */
    public void verifyCreateAccount(){
        try {
            String text = helper.getText(MadeInChinaLanguagePageLocator.verifyCreateAccount);
            Assert.assertEquals(text,"Create an account");
            test.log(Status.PASS, "Create account is displayed");
            LoggerHandler.info("Create account is displayed");
        } catch (Exception e) {
            test.log(Status.FAIL, "Create account is not displayed");
            LoggerHandler.error("Create account is not displayed");
        }
    }
     /*
     * Method name: clickOnSignInNow.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on Sign in Now.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnSignInNow(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLanguagePageLocator.signInNow,3);
            helper.clickOnElement(MadeInChinaLanguagePageLocator.signInNow);
            test.log(Status.PASS, "clicked on Sign in now");
            LoggerHandler.info("clicked on Sign in now");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on Sign in now");
            LoggerHandler.error("Did not click on Sign in now");
        }
    }
     /*
     * Method name: verifySignInNow.
     * AuthorName: Rishi Prashar.
     * Description: This method will verify Sign In Now Page.
     * Parameters: None.
     * return type: void.
     */
    public void verifySignInNow(){
        try {
            String text = helper.getText(MadeInChinaLanguagePageLocator.verifySignIn);
            String value=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "sheet1", 3, 0);
            Assert.assertEquals(text,value);
            test.log(Status.PASS, "Verified that we are on sign in page");
            LoggerHandler.info("Verified that we are on sign in page");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not verified that we are on sign in page");
            LoggerHandler.error("Not verified that we are on sign in page");
        }
    }
     /*
     * Method name: hoverOnSignIn.
     * AuthorName: Rishi Prashar.
     * Description: This method will over to SignIn.
     * Parameters: None.
     * return type: void.
     */
    public void changeToSpanish(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLanguagePageLocator.languageSelect,3);
            helper.hoverOverElement(MadeInChinaLanguagePageLocator.languageSelect);
            helper.clickOnElement(MadeInChinaLanguagePageLocator.spanish);
            test.log(Status.PASS, "clicked on spanish");
            LoggerHandler.info("clicked on spanish");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on spanish");
            LoggerHandler.error("Did not click on spanish");
        }
    }
    /*
     * Method name: verifySpanish.
     * AuthorName: Rishi Prashar.
     * Description: This method will verify the changed language.
     * Parameters: None.
     * return type: void.
     */
    public void verifySpanish(){
        try {
            String text = helper.getText(MadeInChinaLanguagePageLocator.languageVerify);
            String value=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "sheet1", 4, 0);
            Assert.assertEquals(text,value);
            Screenshot.captureFullScreenshot("Spanish");
            test.log(Status.PASS, "changed to spanish");
            LoggerHandler.info("changed to spanish");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not changed to spanish");
            LoggerHandler.error("Not changed to spanish");
        }
    }
    /*
     * Method name: changeToGerman.
     * AuthorName: Rishi Prashar.
     * Description: This method will change the language.
     * Parameters: None.
     * return type: void.
     */
    public void changeToGerman(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLanguagePageLocator.languageSelect,3);
            helper.hoverOverElement(MadeInChinaLanguagePageLocator.languageSelect);
            helper.clickOnElement(MadeInChinaLanguagePageLocator.german);
            test.log(Status.PASS, "clicked on German");
            LoggerHandler.info("clicked on German");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on German");
            LoggerHandler.error("Did not click on German");
        }
    }
    /*
     * Method name: verifyGerman.
     * AuthorName: Rishi Prashar.
     * Description: This method will verify the changed language.
     * Parameters: None.
     * return type: void.
     */
    public void verifyGerman(){
        try {
            String text = helper.getText(MadeInChinaLanguagePageLocator.languageVerify);
            String value=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "sheet1", 5, 0);
            Assert.assertEquals(text,value);
            Screenshot.captureFullScreenshot("German");
            test.log(Status.PASS, "changed to German");
            LoggerHandler.info("changed to German");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not changed to German");
            LoggerHandler.error("Not changed to German");
        }
    }
    /*
     * Method name: changeToFrench.
     * AuthorName: Rishi Prashar.
     * Description: This method will change the language.
     * Parameters: None.
     * return type: void.
     */
    public void changeToFrench(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLanguagePageLocator.languageSelect,3);
            helper.hoverOverElement(MadeInChinaLanguagePageLocator.languageSelect);
            helper.clickOnElement(MadeInChinaLanguagePageLocator.french);
            test.log(Status.PASS, "clicked on French");
            LoggerHandler.info("clicked on French");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on French");
            LoggerHandler.error("Did not click on French");
        }
    }
    /*
     * Method name: verifyFrench.
     * AuthorName: Rishi Prashar.
     * Description: This method will verify the changed language.
     * Parameters: None.
     * return type: void.
     */
    public void verifyFrench(){
        try {
            String text = helper.getText(MadeInChinaLanguagePageLocator.languageVerify);
            String value=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "sheet1", 6, 0);
            Assert.assertEquals(text,value);
            Screenshot.captureFullScreenshot("French");
            test.log(Status.PASS, "changed to French");
            LoggerHandler.info("changed to French");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not changed to French");
            LoggerHandler.error("Not changed to French");
        }
    }
    /*
     * Method name: changeToRussian.
     * AuthorName: Rishi Prashar.
     * Description: This method will change the language.
     * Parameters: None.
     * return type: void.
     */
    public void changeToRussian(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLanguagePageLocator.languageSelect,3);
            helper.hoverOverElement(MadeInChinaLanguagePageLocator.languageSelect);
            helper.clickOnElement(MadeInChinaLanguagePageLocator.russian);
            test.log(Status.PASS, "clicked on Russian");
            LoggerHandler.info("clicked on Russian");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on Russian");
            LoggerHandler.error("Did not click on Russian");
        }
    }
    /*
     * Method name: verifyRussian.
     * AuthorName: Rishi Prashar.
     * Description: This method will verify the changed language.
     * Parameters: None.
     * return type: void.
     */
    public void verifyRussian(){
        try {
            String text = helper.getText(MadeInChinaLanguagePageLocator.languageVerify);
            String value=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "sheet1", 7, 0);
            Assert.assertEquals(text,value);
            Screenshot.captureFullScreenshot("Russian");
            test.log(Status.PASS, "changed to Russian");
            LoggerHandler.info("changed to Russian");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not changed to Russian");
            LoggerHandler.error("Not changed to Russian");
        }
    }
    /*
     * Method name: changeToJapanese.
     * AuthorName: Rishi Prashar.
     * Description: This method will change the language.
     * Parameters: None.
     * return type: void.
     */
    public void changeToJapanese(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLanguagePageLocator.languageSelect,3);
            helper.hoverOverElement(MadeInChinaLanguagePageLocator.languageSelect);
            helper.clickOnElement(MadeInChinaLanguagePageLocator.japanese);
            test.log(Status.PASS, "clicked on Japanese");
            LoggerHandler.info("clicked on Japanese");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on Japanese");
            LoggerHandler.error("Did not click on Japanese");
        }
    }
    /*
     * Method name: verifyJapanese.
     * AuthorName: Rishi Prashar.
     * Description: This method will verify the changed language.
     * Parameters: None.
     * return type: void.
     */
    public void verifyJapanese(){
        try {
            String text = helper.getText(MadeInChinaLanguagePageLocator.languageVerify);
            String value=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "sheet1", 8, 0);
            Assert.assertEquals(text,value);
            Screenshot.captureFullScreenshot("Japanese");
            test.log(Status.PASS, "changed to Japanese");
            LoggerHandler.info("changed to Japanese");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not changed to Japanese");
            LoggerHandler.error("Not changed to Japanese");
        }
    }
    /*
     * Method name: changeToEnglish.
     * AuthorName: Rishi Prashar.
     * Description: This method will change the language.
     * Parameters: None.
     * return type: void.
     */
    public void changeToEnglish(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLanguagePageLocator.languageSelect,3);
            helper.hoverOverElement(MadeInChinaLanguagePageLocator.languageSelect);
            helper.clickOnElement(MadeInChinaLanguagePageLocator.english);
            test.log(Status.PASS, "clicked on English");
            LoggerHandler.info("clicked on English");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on English");
            LoggerHandler.error("Did not click on English");
        }
    }
    /*
     * Method name: verifyEnglish.
     * AuthorName: Rishi Prashar.
     * Description: This method will verify the changed language.
     * Parameters: None.
     * return type: void.
     */
    public void verifyEnglish(){
        try {
            String text = helper.getText(MadeInChinaLanguagePageLocator.languageVerify);
            String value=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "sheet1", 9, 0);
            Assert.assertEquals(text,value);
            Screenshot.captureFullScreenshot("English");
            test.log(Status.PASS, "changed to English");
            LoggerHandler.info("changed to English");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not changed to English");
            LoggerHandler.error("Not changed to English");
        }
    }
    /*
     * Method name: languageTestCases.
     * AuthorName: Rishi Prashar.
     * Description: This method will call all the methods.
     * Parameters: None.
     * return type: void.
     */ 
    public void languageTestCases(){
        closePopUp();
        hoverOnSignIn();
        clickOnJoinFree();
        verifyCreateAccount();
        clickOnSignInNow();
        verifySignInNow();
        changeToSpanish();
        verifySpanish();
        changeToFrench();
        verifyFrench();
        changeToGerman();
        verifyGerman();
        changeToRussian();
        verifyRussian();
        changeToJapanese();
        verifyJapanese();
        changeToEnglish();
        verifyEnglish();
    }  
}
