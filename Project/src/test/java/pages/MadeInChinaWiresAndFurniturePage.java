package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.MadeInChinaSpicesPageContactLocators;
import uistore.MadeInChinaWiresAndFurnitureLocatores;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class MadeInChinaWiresAndFurniturePage {
    private static final String directory = "user.dir";
    private static final String excelPath = "/testdata/Shashank.xlsx";
    private static final String sheetName = "Sheet1";
    WebDriverHelper helper;
    ExtentTest test;

    public MadeInChinaWiresAndFurniturePage(ExtentTest test){
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
            helper.waitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.xmark, 10);
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
     * c.Description: Method to click on the clickOnSearchBar.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnSearchBar(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaWiresAndFurnitureLocatores.searchBar, 10);
            helper.clickOnElement(MadeInChinaWiresAndFurnitureLocatores.searchBar);
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
     * c.Description: Method to send the data.
     * d.Return Type: String
     * e.Paramenter List: String value
     */
    public void sendDataToSearchBar(String value){
        try {
            helper.waitForElementToBeVisible(MadeInChinaWiresAndFurnitureLocatores.searchBar, 10);
            helper.sendKeys(MadeInChinaWiresAndFurnitureLocatores.searchBar, value);
            test.log(Status.PASS, "Data sent to the search bar");
            LoggerHandler.info("Data sent to the search bar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Data not sent to the search bar");
            LoggerHandler.info("Data did not sent to the search bar");
        }
    }

    /*
     * a.Method Name: enterData
     * b.Author Name: Shashank Kondur
     * c.Description: Method to perform enter action.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void enterDataToSearchBar(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaWiresAndFurnitureLocatores.searchBar, 10);
            helper.enterAction(MadeInChinaWiresAndFurnitureLocatores.searchBar);
            test.log(Status.PASS, "Enter action performed");
            LoggerHandler.info("Enter action performed");
        } catch (Exception e) {
            test.log(Status.FAIL, "Enter action not performed");
            LoggerHandler.info("Data not sent to the search bar");
        }
    }

    /*
     * a.Method Name: veirfyTextContainsWire
     * b.Author Name: Shashank Kondur
     * c.Description: Method to verify the text.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void veirfyTextContainsWire(){
        try {
            String text = helper.getText(MadeInChinaWiresAndFurnitureLocatores.firstProduct);
            Assert.assertTrue(text.contains(ExcelReader.readData(System.getProperty(directory)+excelPath, sheetName, 0, 0)));
            test.log(Status.PASS, "Text Verified");
            LoggerHandler.info("Text Verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "Text Not Verified");
            LoggerHandler.info("Text did not Verified");
        }   
    }

    /*
     * a.Method Name: clickOnFirstProductWire
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clickOnFirstProductWire.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnFirstProductWire(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaWiresAndFurnitureLocatores.firstProduct, 10);
            helper.clickOnElement(MadeInChinaWiresAndFurnitureLocatores.firstProduct);
            helper.switchToNewWindow();
            test.log(Status.PASS, "Clicked on the firstProduct");
            LoggerHandler.info("Clicked on the firstProduct");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the firstProduct");
            LoggerHandler.info("Not clicked on the firstProduct");
        }
    }

    /*
     * a.Method Name: verifyContactSupplier
     * b.Author Name: Shashank Kondur
     * c.Description: Method to verify the text.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void verifyContactSupplier(){
        try {
            String contactText = helper.getText(MadeInChinaWiresAndFurnitureLocatores.firstProduct);
            System.out.println(contactText);
            Assert.assertTrue(contactText.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Shashank.xlsx", "Sheet1", 1, 0)));
            test.log(Status.PASS, "Text Verified");
            LoggerHandler.info("Text is Verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "Text Not Verified");
            LoggerHandler.info("Text did not Verified");
        }
    }

    /*
     * a.Method Name: clickOnLogo
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clickOnLogo.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnLogo(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaWiresAndFurnitureLocatores.logo, 10);
            helper.clickOnElement(MadeInChinaWiresAndFurnitureLocatores.logo);
            test.log(Status.PASS, "Clicked on the logo");
            LoggerHandler.info("Clicked on the logo");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the logo");
            LoggerHandler.info("Not clicked on the logo");
        }
    }

    /*
     * a.Method Name: veirfyTextContainsFurniture
     * b.Author Name: Shashank Kondur
     * c.Description: Method to Method to verify the text.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void veirfyTextContainsFurniture(){
        try {
            String text = helper.getText(MadeInChinaWiresAndFurnitureLocatores.firstProduct);
            Assert.assertTrue(text.contains(ExcelReader.readData(System.getProperty(directory)+excelPath, sheetName, 2, 0)));
            test.log(Status.PASS, "Text Verified");
            LoggerHandler.info("Text Verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "Text Not Verified");
            LoggerHandler.info("Text is Not Verified");
        }   
    }

    /*
     * a.Method Name: clikOnPagination2Page
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clikOnPagination2Page.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clikOnPagination2Page(){
        try {
            helper.clickOnElement(MadeInChinaWiresAndFurnitureLocatores.clickOn2InPagination);
            test.log(Status.PASS, "Clicked on the clickOn2InPagination");
            LoggerHandler.info("Clicked on the clickOn2InPagination");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on the clickOn2InPagination");
            LoggerHandler.info("Not clicked on the clickOn2InPagination");
        }
    }

    /*
     * a.Method Name: verifyHomePage
     * b.Author Name: Shashank Kondur
     * c.Description: Method to verify the Home Page.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void verifyHomePage(){
        try {
            String title = Base.driver.getTitle();
            Assert.assertTrue(title.contains(ExcelReader.readData(System.getProperty(directory)+excelPath, sheetName, 3, 0)));
            test.log(Status.PASS, "Title Verified");
            LoggerHandler.info("Title Verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "Title Not Verified");
            LoggerHandler.info("Title is Not Verified");
        }  
    }

    /*
     * a.Method Name: WiresAndFurnitureTestCase
     * b.Author Name: Shashank Kondur
     * c.Description: Method to run all the methods with in the page.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void wiresAndFurnitureTestCase(){
        clickOnXmark();
        clickOnSearchBar();
        sendDataToSearchBar("Wires");
        enterDataToSearchBar();
        veirfyTextContainsWire();
        clickOnFirstProductWire();
        clickOnLogo();
        clickOnSearchBar();
        sendDataToSearchBar("Furniture");
        enterDataToSearchBar();
        veirfyTextContainsFurniture();
        clikOnPagination2Page();
        clickOnLogo();
        verifyHomePage();

    }



}
