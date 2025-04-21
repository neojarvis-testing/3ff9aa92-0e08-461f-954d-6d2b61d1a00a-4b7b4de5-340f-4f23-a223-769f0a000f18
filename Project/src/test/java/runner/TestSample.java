package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.BuyerModulePage;
import utils.Base;
import utils.Reporter;

public class TestSample extends Base {
    public static ExtentReports report;
    public static ExtentTest test;
    @BeforeClass
    public void GenerateReport(){
        report=Reporter.generateExtentReport("MADE_IN_CHINA_Report");
    }
    @BeforeMethod
    public void open(){
        openBrowser();
    }
    @Test
    public void testCase(){
        test=report.createTest("testCase7");
        BuyerModulePage buyerModulePage=new BuyerModulePage(test);
        buyerModulePage.testCase7();
    }
    @AfterMethod
    public void close(){
        driver.quit();
    }
    @AfterClass
    public void flush(){
        report.flush();
    }
}
