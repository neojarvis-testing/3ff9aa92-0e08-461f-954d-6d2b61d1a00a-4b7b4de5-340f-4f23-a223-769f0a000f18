package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.DiamondMembershipMadeInChinaPage;
import pages.MadeInChinaHotItemsPage;
import utils.Base;
import utils.Reporter;

public class TestMadeInChina extends Base{
    public static ExtentReports reports;
    public static ExtentTest test;

    @BeforeClass
    public void report(){
        reports = Reporter.generateExtentReport("MADE_IN_CHINA_Report");
    }
    @BeforeMethod
    public void open(){
        openBrowser();
    }
    @Test(priority = 8,enabled = true)
    public void hotItems(){
        test = reports.createTest("All Hot Items");
        MadeInChinaHotItemsPage hotItems = new MadeInChinaHotItemsPage(test);
        hotItems.hoteItems();
    }
    @Test(priority = 1,enabled = true)
    public void diamond(){
        test = reports.createTest("Diamond Membership");
        DiamondMembershipMadeInChinaPage diamond = new DiamondMembershipMadeInChinaPage(test);
        diamond.diamondMember();
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
