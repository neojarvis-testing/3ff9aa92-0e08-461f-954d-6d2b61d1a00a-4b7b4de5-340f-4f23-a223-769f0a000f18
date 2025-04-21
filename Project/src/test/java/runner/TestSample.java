package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import utils.Base;

public class TestSample extends Base {
    public static ExtentReports report;
    @BeforeClass
    public void GenerateReport(){

    }
    @BeforeMethod
    public void open(){
        openBrowser();
    }
    @Test
    public void testCase7(){
        Buy
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
