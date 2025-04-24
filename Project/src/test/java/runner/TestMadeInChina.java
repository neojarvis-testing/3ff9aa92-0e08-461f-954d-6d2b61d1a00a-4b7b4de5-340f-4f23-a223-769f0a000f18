package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.Base;
import utils.Reporter;

import pages.DiamondMembershipMadeInChinaPage;
import pages.MadeInChinaBuyerModulePage;
import pages.MadeInChinaHotItemsPage;
import pages.MadeInChinaLanguagePage;
import pages.MadeInChinaLedLightPage;
import pages.MadeInChinaNavigationPage;
import pages.MadeInChinaProductDirectoryPage;
import pages.MadeInChinaSignInPage;
import pages.MadeInChinaSpicesPageContact;
import pages.MadeInChinaWiresAndFurniturePage;


public class TestMadeInChina extends Base{
    ExtentReports report;
    ExtentTest test;
    /*
     * a.Method Name: initializeReport
     * b.Author Name: Team_09
     * c.Description: Intializes the ExtentReport before the tests execution.
     * d.Return Type: void
     * e.Paramenter List:none
     */
    @BeforeClass
    public void initializeReport(){
        report = Reporter.generateExtentReport("MADE_IN_CHINA_Report");

    }
    /*
     * a. Method Name: openTheBrowser
     * b. Author Name: Team_09
     * c. Description: Opens the browser before each test.
     * d. Return Type: void
     * e. Parameter List: None
     */
    @BeforeMethod
    public void openTheBrowser(){
        openBrowser();

    }
     /*
     * a. Method Name: signInTest
     * b. Author Name: SaiRohith
     * c. Description: Executes the SignIn test case by registering and undergoing regestration and signin process
     * d. Return Type: void
     * e. Parameter List: None
     */
    @Test(priority = 2,enabled = false)
    public void signInTest(){
        test = report.createTest("signin");
        MadeInChinaSignInPage signin = new MadeInChinaSignInPage(test);
        signin.case1();
    }
    
    /*
    * a. Method Name: languageTests
    * b. Author Name: Rishi Prashar
    * c. Description: Executes the language page test cases.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    @Test(priority = 5, enabled = false)
    public void languageTests()
    {
        test = report.createTest("Test Case 5");
        MadeInChinaLanguagePage language = new MadeInChinaLanguagePage(test);
        language.languageTestCases();
    }
    /*
    * a. Method Name: lightsTests
    * b. Author Name: Rishi Prashar
    * c. Description: Executes the led light page test cases.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    @Test(priority = 6, enabled = false)
    public void lightsTests()
    {
        test = report.createTest("Test Case 6");
        MadeInChinaLedLightPage led = new MadeInChinaLedLightPage(test);
        led.ledTestCases();
    }
    /*
    * a. Method Name: buyer Module
    * b. Author Name: Samhitha 
    * c. Description: Executes the Buyer Module  test case by creating a test instance
    * d. Return Type: Void
    * e. Parameter List: None
    */
    @Test (priority = 7, enabled = true)
    public void buyerModule(){
        test=report.createTest("testCase7");
        MadeInChinaBuyerModulePage buyerModulePage=new MadeInChinaBuyerModulePage(test);
        buyerModulePage.testCase7();
    }
    /*
    * a. Method Name: diamond
    * b. Author Name: Krishna
    * c. Description: Executes the Diamond Membership test case by creating a test instance and invoking the membership method.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    @Test(priority = 1,enabled = false)
    public void diamond(){
        test = report.createTest("Diamond Membership");
        DiamondMembershipMadeInChinaPage diamond = new DiamondMembershipMadeInChinaPage(test);
        diamond.diamondMember();
    }
    /*
     * a. Method Name: spicesContact
     * b. Author Name: Shashank Kondur
     * c. Description: Method to run the SpicesContact.
     * d. Return Type: void
     * e. Parameter List: None
     */
    @Test(priority = 3, enabled = false)
    public void spicesContact(){
        test = report.createTest("SpicesContact");
        MadeInChinaSpicesPageContact spc = new MadeInChinaSpicesPageContact(test);
        spc.spicesPageContactTestCase();
    }
    /*
     * a. Method Name: wiresAndFurniture
     * b. Author Name: Shashank Kondur
     * c. Description: Method to run the WiresAndFurniture.
     * d. Return Type: void
     * e. Parameter List: None
     */
    @Test(priority = 4, enabled = false)
    public void wiresAndFurniture(){
        test = report.createTest("WiresAndFurniture");
        MadeInChinaWiresAndFurniturePage wfp = new MadeInChinaWiresAndFurniturePage(test);
        wfp.wiresAndFurnitureTestCase();
    }
    /*
    * a. Method Name: hotItems
    * b. Author Name: Krishna
    * c. Description: Executes the Hot Items test case by creating a test instance and invoking the corresponding method.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    @Test(priority = 8,enabled = false)
    public void hotItems(){
        test = report.createTest("All Hot Items");
        MadeInChinaHotItemsPage hotItems = new MadeInChinaHotItemsPage(test);
        hotItems.hoteItems();
    }
   /*
    * a.Method Name: navigation
    * b.Author Name: Pruthviraj Batti
    * c.Description: Test method to verify navigation between categories.
    * d.Return Type: void
    * e.Parameter List: None
    */
    @Test(priority = 9,enabled = false)
    public void navigation(){
        test=report.createTest("Navigation Between Categories");
        MadeInChinaNavigationPage madeInChinaNavigationPage=new MadeInChinaNavigationPage(test);
        madeInChinaNavigationPage.navigation();
    }
   /*
    * a.Method Name: productCategory
    * b.Author Name: Pruthviraj Batti
    * c.Description: Test method to verify product category navigation.
    * d.Return Type: void
    * e.Parameter List: None
    */
    @Test(priority = 10,enabled = false)
	public void productCategory(){
		test=report.createTest("Product Category");
		MadeInChinaProductDirectoryPage madeInChinaProductDirectoryPage=new MadeInChinaProductDirectoryPage(test);
		madeInChinaProductDirectoryPage.productDirectory();
	}
	/*
     * a. Method Name: closeTheBrowser
     * b. Author Name: Team_09
     * c. Description: Closes the browser after each test.
     * d. Return Type: void
     * e. Parameter List: None
     */
    @AfterMethod
    public void closeTheBrowser() {
        driver.quit();
    }
    /*
     * a.Method Name: finalizeReport
     * b.Author Name: Team_09
     * c.Description: Flushes the ExtentReport after the tests execution.
     * d.Return Type: void
     * e.Paramenter List:none
     */
	@AfterClass
	public void finalizeReport() {
		report.flush();
    }
}
