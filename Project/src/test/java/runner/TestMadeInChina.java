package runner;

import java.lang.module.ModuleDescriptor.Opens;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.MadeInChinaBuyerModulePage;
import utils.Base;
import utils.Reporter;

public class TestMadeInChina extends Base {
    public static ExtentReports report;
    public static ExtentTest test;
   /*
     * a.Method Name: initializeReport
     * b.Author Name: Team_09
     * c.Description: Intializes the ExtentReport before the tests execution.
     * d.Return Type: void
     * e.Paramenter List:none
     */
    @BeforeClass
    public void GenerateReport(){
        report=Reporter.generateExtentReport("MADE_IN_CHINA_Report");
    }
    /* a. Method Name: open
     * b. Author Name: Team_09
     * c. Description: Opens the browser before each test.
     * d. Return Type: void
     * e. Parameter List: None
     */
    @BeforeMethod
    public void open(){
        openBrowser();
    }
    @Test (priority = 7, enabled = true)
    public void testCase(){
        test=report.createTest("testCase7");
        MadeInChinaBuyerModulePage buyerModulePage=new MadeInChinaBuyerModulePage(test);
        buyerModulePage.testCase7();
    }
    /*
     * a. Method Name: closeTheBrowser
     * b. Author Name: Team_09
     * c. Description: Closes the browser after each test.
     * d. Return Type: void
     * e. Parameter List: None
     */
    @AfterMethod
    public void close(){
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
    public void flush(){
        report.flush();
    }
}
