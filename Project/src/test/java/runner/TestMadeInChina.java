package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.MadeInChinaNavigationPage;
import pages.MadeInChinaProductDirectoryPage;
import utils.Base;
import utils.Reporter;

public class TestMadeInChina extends Base{
   ExtentReports report;
	ExtentTest test;
	@BeforeClass
	public void initializeReport() {
		report=Reporter.generateExtentReport("MADE_IN_CHINA_Report");
        
	}
	@BeforeMethod
	public void open() {
		openBrowser();
        
	}
    // @Test(priority = 9)
    // public void navigation(){
    //     test=report.createTest("Navigation Between Categories");
    //     MadeInChinaNavigationPage madeInChinaNavigationPage=new MadeInChinaNavigationPage(test);
    //     madeInChinaNavigationPage.navigation();
    // }
	@Test(priority = 10)
	public void productCategory(){
		test=report.createTest("Product Category");
		MadeInChinaProductDirectoryPage madeInChinaProductDirectoryPage=new MadeInChinaProductDirectoryPage(test);
		madeInChinaProductDirectoryPage.productDirectory();
	}
    @AfterMethod
	public void close() {
		driver.quit();
	}
	@AfterClass
	public void flushReport() {
		report.flush();
    }
}
