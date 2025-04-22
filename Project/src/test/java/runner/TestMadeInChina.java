package runner;

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
     * method name: Before Class
     * Author: Samhitha
     * Description: This method generates reportwhich is imported from testng
     */
    @BeforeClass
    public void GenerateReport(){
        report=Reporter.generateExtentReport("MADE_IN_CHINA_Report");
    }
    /*
     * Method name: Before Method
     * Author: Samhitha
     * Description: This Method is used to open the browser imported from testng
     */
    @BeforeMethod
    public void open(){
        openBrowser();
    }
    /*
     * Method name: Test
     * Author: Samhitha
     * Description: This method will be used to run testcases 
     * 
     */
    @Test (priority = 7, enabled = true)
    public void testCase(){
        test=report.createTest("testCase7");
        MadeInChinaBuyerModulePage buyerModulePage=new MadeInChinaBuyerModulePage(test);
        buyerModulePage.testCase7();
    }
    /*
     * Method name: After Method
     * Author:  Samhitha
     * Description: This method will quit the browser
     */
    @AfterMethod
    public void close(){
        driver.quit();
    }
    /*
     * Method name: After Class
     * Author: Samhitha
     * Description: This method will flush the report
     */
    @AfterClass
    public void flush(){
        report.flush();
    }
}
