package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.MadeInChinaLanguagePageLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class MadeInChinaLanguagePage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public MadeInChinaLanguagePage(ExtentTest test)
    {
        this.test = test;
        helper = new WebDriverHelper(Base.driver);
    }
    public void hoverOnSignIn(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaLanguagePageLocator.signIn,7);
            helper.HoverOverElement(MadeInChinaLanguagePageLocator.signIn);
            test.log(Status.PASS, "Hovered on SignIn");
            LoggerHandler.info("Hovered On SignIn");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not hover on SignIn");
            LoggerHandler.error("Did not hover over SignIn");
        }
    }
    public void clickOnJoinFree(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaLanguagePageLocator.joinFree,7);
            helper.clickOnElement(MadeInChinaLanguagePageLocator.joinFree);
            test.log(Status.PASS, "clicked on Join Free");
            LoggerHandler.info("clicked on Join Free");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on Join Free");
            LoggerHandler.error("Did not click on Join Free");
        }
    }
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
    public void clickOnSignInNow(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaLanguagePageLocator.signInNow,7);
            helper.clickOnElement(MadeInChinaLanguagePageLocator.signInNow);
            test.log(Status.PASS, "clicked on Sign in now");
            LoggerHandler.info("clicked on Sign in now");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on Sign in now");
            LoggerHandler.error("Did not click on Sign in now");
        }
    }
    public void verifySignInNow(){
        try {
            String text = helper.getText(MadeInChinaLanguagePageLocator.verifySignIn);
            Assert.assertEquals(text,"Sign in with Email Code");
            test.log(Status.PASS, "Verified that we are on sign in page");
            LoggerHandler.info("Verified that we are on sign in page");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not verified that we are on sign in page");
            LoggerHandler.error("Not verified that we are on sign in page");
        }
    }
    public void changeToSpanish(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaLanguagePageLocator.languageSelect,7);
            helper.HoverOverElement(MadeInChinaLanguagePageLocator.languageSelect);
            helper.clickOnElement(MadeInChinaLanguagePageLocator.spanish);
            test.log(Status.PASS, "clicked on spanish");
            LoggerHandler.info("clicked on spanish");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on spanish");
            LoggerHandler.error("Did not click on spanish");
        }
    }
    public void verifySpanish(){
        try {
            String text = helper.getText(MadeInChinaLanguagePageLocator.languageVerify);
            Assert.assertEquals(text,"Cuenta");
            Screenshot.captureFullScreenshot("Spanish");
            test.log(Status.PASS, "changed to spanish");
            LoggerHandler.info("changed to spanish");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not changed to spanish");
            LoggerHandler.error("Not changed to spanish");
        }
    }
    public void changeToGerman(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaLanguagePageLocator.languageSelect,7);
            helper.HoverOverElement(MadeInChinaLanguagePageLocator.languageSelect);
            helper.clickOnElement(MadeInChinaLanguagePageLocator.german);
            test.log(Status.PASS, "clicked on German");
            LoggerHandler.info("clicked on German");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on German");
            LoggerHandler.error("Did not click on German");
        }
    }
    public void verifyGerman(){
        try {
            String text = helper.getText(MadeInChinaLanguagePageLocator.languageVerify);
            Assert.assertEquals(text,"Konto");
            Screenshot.captureFullScreenshot("German");
            test.log(Status.PASS, "changed to German");
            LoggerHandler.info("changed to German");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not changed to German");
            LoggerHandler.error("Not changed to German");
        }
    }
    public void changeToFrench(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaLanguagePageLocator.languageSelect,7);
            helper.HoverOverElement(MadeInChinaLanguagePageLocator.languageSelect);
            helper.clickOnElement(MadeInChinaLanguagePageLocator.french);
            test.log(Status.PASS, "clicked on French");
            LoggerHandler.info("clicked on French");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on French");
            LoggerHandler.error("Did not click on French");
        }
    }
    public void verifyFrench(){
        try {
            String text = helper.getText(MadeInChinaLanguagePageLocator.languageVerify);
            Assert.assertEquals(text,"Compte");
            Screenshot.captureFullScreenshot("French");
            test.log(Status.PASS, "changed to French");
            LoggerHandler.info("changed to French");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not changed to French");
            LoggerHandler.error("Not changed to French");
        }
    }
    public void changeToRussian(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaLanguagePageLocator.languageSelect,7);
            helper.HoverOverElement(MadeInChinaLanguagePageLocator.languageSelect);
            helper.clickOnElement(MadeInChinaLanguagePageLocator.russian);
            test.log(Status.PASS, "clicked on Russian");
            LoggerHandler.info("clicked on Russian");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on Russian");
            LoggerHandler.error("Did not click on Russian");
        }
    }
    public void verifyRussian(){
        try {
            String text = helper.getText(MadeInChinaLanguagePageLocator.languageVerify);
            Assert.assertEquals(text,"Аккаунт");
            Screenshot.captureFullScreenshot("Russian");
            test.log(Status.PASS, "changed to Russian");
            LoggerHandler.info("changed to Russian");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not changed to Russian");
            LoggerHandler.error("Not changed to Russian");
        }
    }
    public void changeToJapanese(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaLanguagePageLocator.languageSelect,7);
            helper.HoverOverElement(MadeInChinaLanguagePageLocator.languageSelect);
            helper.clickOnElement(MadeInChinaLanguagePageLocator.japanese);
            test.log(Status.PASS, "clicked on Japanese");
            LoggerHandler.info("clicked on Japanese");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on Japanese");
            LoggerHandler.error("Did not click on Japanese");
        }
    }
    public void verifyJapanese(){
        try {
            String text = helper.getText(MadeInChinaLanguagePageLocator.languageVerify);
            Assert.assertEquals(text,"アカウント");
            Screenshot.captureFullScreenshot("Japanese");
            test.log(Status.PASS, "changed to Japanese");
            LoggerHandler.info("changed to Japanese");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not changed to Japanese");
            LoggerHandler.error("Not changed to Japanese");
        }
    }
    public void changeToEnglish(){
        try {
            helper.WaitForElementToBeVisible(MadeInChinaLanguagePageLocator.languageSelect,7);
            helper.HoverOverElement(MadeInChinaLanguagePageLocator.languageSelect);
            helper.clickOnElement(MadeInChinaLanguagePageLocator.english);
            test.log(Status.PASS, "clicked on English");
            LoggerHandler.info("clicked on English");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on English");
            LoggerHandler.error("Did not click on English");
        }
    }
    public void verifyEnglish(){
        try {
            String text = helper.getText(MadeInChinaLanguagePageLocator.languageVerify);
            Assert.assertEquals(text,"Account");
            Screenshot.captureFullScreenshot("English");
            test.log(Status.PASS, "changed to English");
            LoggerHandler.info("changed to English");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not changed to English");
            LoggerHandler.error("Not changed to English");
        }
    } 
    public void languageTestCases(){
        hoverOnSignIn();
        clickOnJoinFree();
        verifyCreateAccount();
        clickOnSignInNow();
        verifySignInNow();
        changeToSpanish();
        verifySpanish();
        changeToFrench();
        verifyFrench();
    }  
}
