package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.MadeInChinaCategoriesPageLocators;
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
    
    /*
     * a.Method Name: clickOnCategory
     * b.Author Name: Pruthviraj Batti
     * c.Description: Method to click on a category and log the action.
     * d.Return Type: void
     * e.Parameter List: By path, String heading
     */

    public void clickOnCategory(By path ,String heading){
        try {
            helper.clickOnElement(MadeInChinaCategoriesPageLocators.popup);
            helper.waitForElementToBeVisible(path, 10);
            helper.clickOnElement(path);
            LoggerHandler.info("Successfully Clicked on the "+ heading);
            test.log(Status.PASS, "Successfully Clicked on the "+heading);
        } catch (Exception e) {
            LoggerHandler.error("Failed to Click on the "+ heading);
            test.log(Status.FAIL, "Failed to Click on the "+ heading);
        }
    }
    
    /*
     * a.Method Name: navigateBack
     * b.Author Name: Pruthviraj Batti
     * c.Description: Method to navigate back to the previous page and log the action.
     * d.Return Type: void
     * e.Parameter List: None
     */
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
    
    /*
     * a.Method Name: verifyheading
     * b.Author Name: Pruthviraj Batti
     * c.Description: Method to verify the heading of the current page and log the action.
     * d.Return Type: void
     * e.Parameter List: String heading
     */
    public void verifyheading(String heading){
        try {
            String text=helper .getText(MadeInChinaCategoriesPageLocators.title);
            Assert.assertEquals(text,heading);
            LoggerHandler.info("Successfully  verified the heading "+heading);
            test.log(Status.PASS,"Successfully verified the heading "+heading);
        } catch (Exception e) {
            LoggerHandler.info("Failed to verified the heading "+heading);
            test.log(Status.FAIL,"Failed to verified the heading "+heading);
        }
    }
    
    /*
     * a.Method Name: navigation
     * b.Author Name: Pruthviraj Batti
     * c.Description: Method to navigate through various categories and verify their headings.
     * d.Return Type: void
     * e.Parameter List: None
     */

    public void navigation(){
        clickOnCategory(MadeInChinaCategoriesPageLocators.Manufacturing,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 0, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 0, 0));
        navigateBack();
        clickOnCategory(MadeInChinaCategoriesPageLocators.consumerElectronics,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 1, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 1, 0));
        navigateBack();
        clickOnCategory(MadeInChinaCategoriesPageLocators.industrialEquipmentComponents,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 2, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 2, 0));
        navigateBack();
        clickOnCategory(MadeInChinaCategoriesPageLocators.electricalElectronics,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 3, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 3, 0));
        navigateBack();
        clickOnCategory(MadeInChinaCategoriesPageLocators.constructionDecoration,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 4, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 4, 0));
        navigateBack();
        clickOnCategory(MadeInChinaCategoriesPageLocators.lightIndustryDailyUse,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 5, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 5, 0));
        navigateBack();
        clickOnCategory(MadeInChinaCategoriesPageLocators.autoMotorcyclePartsAccessories,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 6, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 6, 0));
        navigateBack();
        clickOnCategory(MadeInChinaCategoriesPageLocators.apparelAccessories,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 7, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 7, 0));
        navigateBack();
        clickOnCategory(MadeInChinaCategoriesPageLocators.lightsLighting,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 8, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 8, 0));
        navigateBack();
        clickOnCategory(MadeInChinaCategoriesPageLocators.sportingGoodsRecreation,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 9, 0));
        verifyheading(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/pruthvi.xlsx", "pruthvi", 9, 0));
        
    }
}
