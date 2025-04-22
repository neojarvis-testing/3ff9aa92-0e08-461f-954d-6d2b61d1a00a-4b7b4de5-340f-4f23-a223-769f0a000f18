package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.MadeInChinaSpicesPageContact;
import pages.MadeInChinaWiresAndFurniturePage;
import utils.Base;
import utils.Reporter;

public class TestMadeInChina extends Base{
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
    public void initializeReport() {
        report=Reporter.generateExtentReport("MADE_IN_CHINA_Report");
    }
    /*
     * a. Method Name: open
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
     * a. Method Name: testCaese3
     * b. Author Name: Shashank Kondur
     * c. Description: Method to run the testCase3.
     * d. Return Type: void
     * e. Parameter List: None
     */
    @Test(enabled = true,priority = 3)
    public void testCaese3(){
        test = report.createTest("testCase3");
        MadeInChinaSpicesPageContact spc = new MadeInChinaSpicesPageContact(test);
        spc.SpicesPageContactTestCase();
    }

    /*
     * a. Method Name: testCaese4
     * b. Author Name: Shashank Kondur
     * c. Description: Method to run the testCase4..
     * d. Return Type: void
     * e. Parameter List: None
     */
    @Test(enabled = true,priority = 4)
    public void testCaese4(){
        test = report.createTest("testCase4");
        MadeInChinaWiresAndFurniturePage wfp = new MadeInChinaWiresAndFurniturePage(test);
        wfp.WiresAndFurnitureTestCase();
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

