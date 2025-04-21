package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.MadeInChinaLanguagePage;
import pages.MadeInChinaLedLightPage;
import utils.Base;
import utils.Reporter;

public class MadeInChinaTest extends Base {
    public static ExtentTest test;
    public static ExtentReports report;
    @BeforeClass
    public void generate()
    {
        report = Reporter.generateExtentReport("Made In China Test Report");
    }
    @BeforeMethod
    public void open()
    {
        openBrowser();
    }
    // @Test
    // public void language()
    // {
    //     test = report.createTest("Test Case 5");
    //     MadeInChinaLanguagePage language = new MadeInChinaLanguagePage(test);
    //     language.languageTestCases();
    // }
    @Test
    public void lights()
    {
        test = report.createTest("Test Case 6");
        MadeInChinaLedLightPage led = new MadeInChinaLedLightPage(test);
        led.ledTestCases();
    }
    @AfterMethod
    public void close()
    {
        driver.quit();
    }
    @AfterClass
    public void flush()
    {
        report.flush();
    }
}
