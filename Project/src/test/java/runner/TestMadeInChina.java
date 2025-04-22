package runner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.MadeInChinaSignInPage;
import utils.Base;
import utils.Reporter;

public class TestMadeInChina extends Base{
    public static ExtentTest test;
    public static ExtentReports report;
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
     * a. Method Name: openTheBrowse
     * b. Author Name: Team_09
     * c. Description: Opens the browser before each test.
     * d. Return Type: void
     * e. Parameter List: None
     */
    @BeforeMethod
    public void openTheBrowser(){
        openBrowser();

    }
    @Test(priority = 2)
    public void testcase2(){
        test = report.createTest("signin");
        MadeInChinaSignInPage sp = new MadeInChinaSignInPage(test);
        sp.case1();
    }
    /*
     * a. Method Name: closeTheBrowser
     * b. Author Name: Team_09
     * c. Description: Closes the browser after each test.
     * d. Return Type: void
     * e. Parameter List: None
     */
    @AfterMethod
    public void closeTheBrowser(){
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
    public void finalizeReport(){
        report.flush();
    }
    
}
