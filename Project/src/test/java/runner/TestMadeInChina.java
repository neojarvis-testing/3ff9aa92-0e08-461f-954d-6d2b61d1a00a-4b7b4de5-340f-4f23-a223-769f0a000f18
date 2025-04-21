package runner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.SignInPage;
import utils.Base;
import utils.Reporter;

public class TestMadeInChina extends Base{
    public static ExtentTest test;
    public static ExtentReports report;
    @BeforeClass
    public void generatemethod(){
        report = Reporter.generateExtentReport("signin");

    }
    @BeforeMethod
    public void startmethod(){
        openBrowser();

    }
    @Test
    public void case1(){
        test = report.createTest("signin");
        SignInPage sp = new SignInPage(test);
        sp.testcase1();
    }
    @AfterMethod
    public void stopmethod(){
        driver.quit();
    }
    @AfterClass
    public void flushmethod(){
        report.flush();
    }
    
}
