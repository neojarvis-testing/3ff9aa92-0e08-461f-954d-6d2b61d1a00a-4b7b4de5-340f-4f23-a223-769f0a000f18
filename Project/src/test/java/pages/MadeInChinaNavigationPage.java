package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.MadeInChinaHomePageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class MadeInChinaNavigationPage {
    WebDriverHelper helper;
    ExtentTest test;
    public MadeInChinaNavigationPage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.test=test;
    }
    public void clickOnCategory(By path ,String heading){
        try {
            helper.clickOnElement(MadeInChinaHomePageLocators.popup);
            helper.WaitForElementToBeVisible(path, 10);
            helper.clickOnElement(path);
            LoggerHandler.info("Successfully Clicked on the "+ heading);
            test.log(Status.PASS, "Successfully Clicked on the "+heading);
        } catch (Exception e) {
            LoggerHandler.error("Failed to Click on the "+ heading);
            test.log(Status.FAIL, "Failed to Click on the "+ heading);
        }
    }
    public void navigateBack(){
        try {

            helper.navigateBack();
            LoggerHandler.info("Successfully  navigated Back");
            test.log(Status.PASS,"Successfully navigated Back");
        } catch (Exception e) {
            LoggerHandler.info("Failed to navigated Back");
            test.log(Status.PASS,"Failed to navigated Back");
        }
    }
    public void verifyheading(String heading){
        try {
            String text=helper .getText(MadeInChinaHomePageLocators.title);
            Assert.assertEquals(text,heading);
            LoggerHandler.info("Successfully  verified the heading "+heading);
            test.log(Status.PASS,"Successfully verified the heading "+heading);
        } catch (Exception e) {
            LoggerHandler.info("Failed to verified the heading "+heading);
            test.log(Status.FAIL,"Failed to verified the heading "+heading);
        }
        
        
    }
    public void navigation(){
        
        clickOnCategory(MadeInChinaHomePageLocators.Manufacturing,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 0, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 0, 0));
        navigateBack();
        clickOnCategory(MadeInChinaHomePageLocators.consumerElectronics,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 1, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 1, 0));
        navigateBack();
        clickOnCategory(MadeInChinaHomePageLocators.industrialEquipmentComponents,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 2, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 2, 0));
        navigateBack();
        clickOnCategory(MadeInChinaHomePageLocators.electricalElectronics,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 3, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 3, 0));
        navigateBack();
        clickOnCategory(MadeInChinaHomePageLocators.constructionDecoration,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 4, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 4, 0));
        navigateBack();
        clickOnCategory(MadeInChinaHomePageLocators.lightIndustryDailyUse,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 5, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 5, 0));
        navigateBack();
        clickOnCategory(MadeInChinaHomePageLocators.autoMotorcyclePartsAccessories,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 6, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 6, 0));
        navigateBack();
        clickOnCategory(MadeInChinaHomePageLocators.apparelAccessories,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 7, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 7, 0));
        navigateBack();
        clickOnCategory(MadeInChinaHomePageLocators.lightsLighting,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 8, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 8, 0));
        navigateBack();
        clickOnCategory(MadeInChinaHomePageLocators.sportingGoodsRecreation,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 9, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "pruthvi", 9, 0));
        
    }
}
