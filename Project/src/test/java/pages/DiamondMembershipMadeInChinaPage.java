package pages;

import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import uistore.MadeInChinaDiamondMembershipPageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class DiamondMembershipMadeInChinaPage {
    WebDriverHelper helper;
    ExtentTest test;
    /*
    * a. Method Name: DiamondMembershipMadeInChinaPage (Constructor)
    * b. Author Name: Krishna
    * c. Description: Initializes the DiamondMembershipMadeInChinaPage with WebDriverHelper and assigns the test instance.
    * d. Return Type: None (Constructor)
    * e. Parameter List: ExtentTest test - Instance for logging test results.
    */
    public DiamondMembershipMadeInChinaPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }
    /*
    * a. Method Name: clickPopUp
    * b. Author Name: Krishna
    * c. Description: Waits for the pop-up element to be visible and clicks on it.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickPopUp(){
        helper.waitForElementToBeVisible(MadeInChinaDiamondMembershipPageLocator.popUp, 10);
        helper.clickOnElement(MadeInChinaDiamondMembershipPageLocator.popUp);
    }
    /*
    * a. Method Name: clickOnSearchBar
    * b. Author Name: Krishna
    * c. Description: Waits for the search bar element to be visible and clicks on it.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnSearchBar(){
        helper.waitForElementToBeVisible(MadeInChinaDiamondMembershipPageLocator.searchBar, 10);
        helper.clickOnElement(MadeInChinaDiamondMembershipPageLocator.searchBar);
    }
    /*
    * a. Method Name: enterDataToSearchBar
    * b. Author Name: Krishna
    * c. Description: Enters data from an Excel sheet into the search bar and clicks the search icon.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void enterDataToSearchBar(){
        helper.sendKeys(MadeInChinaDiamondMembershipPageLocator.searchBar, ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 0, 1));
        helper.clickOnElement(MadeInChinaDiamondMembershipPageLocator.searchIcon);
    }
    /*
    * a. Method Name: verifyElectronics
    * b. Author Name: Krishna
    * c. Description: Retrieves the text of the verification element and asserts that it contains "Electronics".
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyElectronics(){
        String electronics = helper.getText(MadeInChinaDiamondMembershipPageLocator.verifyWord);
        Assert.assertTrue(electronics.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 1, 1)));
    }
    /*
    * a. Method Name: clickOnSupplierList
    * b. Author Name: Krishna
    * c. Description: Waits for the supplier list element to be visible and clicks on it.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnSupplierLIst(){
        helper.waitForElementToBeVisible(MadeInChinaDiamondMembershipPageLocator.supplierList,10);
        helper.clickOnElement(MadeInChinaDiamondMembershipPageLocator.supplierList);
    }
    /*
    * a. Method Name: clickOnConsumer
    * b. Author Name: Krishna
    * c. Description: Waits for the consumer electronics element to be visible and clicks on it.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnConsumer(){
        helper.waitForElementToBeVisible(MadeInChinaDiamondMembershipPageLocator.consumerElectronics,10);
        helper.clickOnElement(MadeInChinaDiamondMembershipPageLocator.consumerElectronics);
    }
    /*
    * a. Method Name: verifyConsumer
    * b. Author Name: Krishna
    * c. Description: Retrieves the text of the consumer electronics filter element and asserts that it contains "Consumer".
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyConsumer(){
        String consumer = helper.getText(MadeInChinaDiamondMembershipPageLocator.filterconsumerElectronics);
        Assert.assertTrue(consumer.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 1, 2)));
    }
    /*
    * a. Method Name: clickOnIs9000
    * b. Author Name: Krishna
    * c. Description: Waits for the IS9000 element to be visible and clicks on it.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnIs9000(){
        helper.waitForElementToBeVisible(MadeInChinaDiamondMembershipPageLocator.Is9000,10);
        helper.clickOnElement(MadeInChinaDiamondMembershipPageLocator.Is9000);
    }
    /*
    * a. Method Name: verifyIs9000
    * b. Author Name: Krishna
    * c. Description: Retrieves the text of the IS9000 filter element and asserts that it contains "9000".
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyIs9000(){
        String isfilter = helper.getText(MadeInChinaDiamondMembershipPageLocator.filterIs9000);
        Assert.assertTrue(isfilter.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/krishna.xlsx/", "Krishna", 1, 3)));
    }

    /*
    * a. Method Name: diamondMember
    * b. Author Name: Krishna
    * c. Description: Performs a series of interactions including clicking elements, searching, verifying content, and applying filters.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void diamondMember(){
        clickPopUp();
        clickOnSearchBar();
        enterDataToSearchBar();
        verifyElectronics();
        clickOnSupplierLIst();
        clickOnConsumer();
        verifyConsumer();
        clickOnIs9000();
        verifyIs9000();
    }
}
