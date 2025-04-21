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

public class TestMadeInChina extends Base{
    public static ExtentReports reports;
    public static ExtentTest test;

    @BeforeClass
    public void report(){
        reports = Reporter.generateExtentReport("Hot Items");
    }
    @BeforeMethod
    public void open(){
        openBrowser();
    }
    @Test
    public void hotItems(){

    }
    @AfterMethod
    public void close(){
        driver.quit();
    }
    @AfterClass
    public void generate(){
        reports.flush();
    }
    
}
