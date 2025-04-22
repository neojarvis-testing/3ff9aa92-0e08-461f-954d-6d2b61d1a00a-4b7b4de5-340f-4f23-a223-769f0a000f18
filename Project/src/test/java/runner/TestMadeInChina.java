package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import pages.DiamondMembershipMadeInChinaPage;
import pages.MadeInChinaHotItemsPage;
import pages.MadeInChinaNavigationPage;
import pages.MadeInChinaProductDirectoryPage;
import utils.*;

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
	public void initializeReport() {
		report=Reporter.generateExtentReport("MADE_IN_CHINA_Report");
	}
	/*
     * a. Method Name: openTheBrowser
     * b. Author Name: Team_09
     * c. Description: Opens the browser before each test.
     * d. Return Type: void
     * e. Parameter List: None
     */
    @BeforeMethod
    public void openTheBrowser() {
        openBrowser();
    }
    /*
    * a. Method Name: diamond
    * b. Author Name: Krishna
    * c. Description: Executes the Diamond Membership test case by creating a test instance and invoking the membership method.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    @Test(priority = 1,enabled = true)
    public void diamond(){
        test = report.createTest("Diamond Membership");
        DiamondMembershipMadeInChinaPage diamond = new DiamondMembershipMadeInChinaPage(test);
        diamond.diamondMember();
    }
    /*
    * a. Method Name: hotItems
    * b. Author Name: Krishna
    * c. Description: Executes the Hot Items test case by creating a test instance and invoking the corresponding method.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    @Test(priority = 8,enabled = true)
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
    @Test(priority = 9)
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
	@Test(priority = 10)
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
