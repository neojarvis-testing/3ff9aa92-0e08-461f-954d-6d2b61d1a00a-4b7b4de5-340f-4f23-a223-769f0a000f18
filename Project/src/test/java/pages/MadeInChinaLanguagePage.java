package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.MadeInChinaLanguagePageLocator;
import utils.Base;
import utils.LoggerHandler;
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
            helper.HoverOverElement(MadeInChinaLanguagePageLocator.joinFree);
            test.log(Status.PASS, "clicked on Join Free");
            LoggerHandler.info("clicked on Join Free");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not clicke on Join Free");
            LoggerHandler.error("Did not clicke on Join Free");
        }
    }
    public void verifyCreateAccount(){
        try {
            String text = helper.getText(MadeInChinaLanguagePageLocator.verifyCreateAccount);
            Assert.assertEquals(text,"Create an account");
            test.log(Status.PASS, "clicked on Join Free");
            LoggerHandler.info("clicked on Join Free");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not clicke on Join Free");
            LoggerHandler.error("Did not clicke on Join Free");
        }
    }
}
