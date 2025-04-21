package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.SpicesPageContact;
import pages.WiresAndFurniturePage;
import utils.Base;
import utils.Reporter;

public class TestSample extends Base{
    public static ExtentReports report;
    public static ExtentTest test;
    
    @BeforeClass
    public void report(){
        report = Reporter.generateExtentReport("Made In China");
    }

    @BeforeMethod
    public void open(){
        openBrowser();
    }

    @Test(enabled = true)
    public void testCaese3(){
        test = report.createTest("testCase3");
        SpicesPageContact spc = new SpicesPageContact(test);
        spc.SpicesPageContactTestCase();
    }

    @Test(enabled = false)
    public void testCaese4(){
        test = report.createTest("testCase4");
        WiresAndFurniturePage wfp = new WiresAndFurniturePage(test);
        wfp.WiresAndFurnitureTestCase();
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
