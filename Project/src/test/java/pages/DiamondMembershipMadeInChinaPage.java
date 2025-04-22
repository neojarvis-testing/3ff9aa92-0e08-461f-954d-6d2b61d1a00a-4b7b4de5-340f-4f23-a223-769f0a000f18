package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.DiamondMembershipMadeInChinaPageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class DiamondMembershipMadeInChinaPage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public DiamondMembershipMadeInChinaPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }
    public void clickPopUp(){
        helper.WaitForElementToBeVisible(DiamondMembershipMadeInChinaPageLocator.popUp, 10);
        helper.clickOnElement(DiamondMembershipMadeInChinaPageLocator.popUp);
    }
    public void clickOnSearchBar(){
        helper.WaitForElementToBeVisible(DiamondMembershipMadeInChinaPageLocator.searchBar, 10);
        helper.clickOnElement(DiamondMembershipMadeInChinaPageLocator.searchBar);
    }
    public void enterDataToSearchBar(){
        helper.SendKeys(DiamondMembershipMadeInChinaPageLocator.searchBar, ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx/", "Krishna", 0, 1));
        helper.clickOnElement(DiamondMembershipMadeInChinaPageLocator.searchIcon);
    }
    public void verifyElectronics(){
        String electronics = helper.getText(DiamondMembershipMadeInChinaPageLocator.verifyWord);
        Assert.assertTrue(electronics.contains("Electronics"));
    }
    public void clickOnSupplierLIst(){
        helper.WaitForElementToBeVisible(DiamondMembershipMadeInChinaPageLocator.supplierList,10);
        helper.clickOnElement(DiamondMembershipMadeInChinaPageLocator.supplierList);
    }
    public void clickOnConsumer(){
        helper.WaitForElementToBeVisible(DiamondMembershipMadeInChinaPageLocator.consumerElectronics,10);
        helper.clickOnElement(DiamondMembershipMadeInChinaPageLocator.consumerElectronics);
    }
    public void verifyConsumer(){
        String consumer = helper.getText(DiamondMembershipMadeInChinaPageLocator.filterconsumerElectronics);
        Assert.assertTrue(consumer.contains("Consumer"));
    }
    public void clickOnIs9000(){
        helper.WaitForElementToBeVisible(DiamondMembershipMadeInChinaPageLocator.Is9000,10);
        helper.clickOnElement(DiamondMembershipMadeInChinaPageLocator.Is9000);
    }
    public void verifyIs9000(){
        String isfilter = helper.getText(DiamondMembershipMadeInChinaPageLocator.filterIs9000);
        Assert.assertTrue(isfilter.contains("9000"));
    }


    public void diamondMember(){
        clickPopUp();
        clickOnSearchBar();
        enterDataToSearchBar();
        verifyElectronics();
        clickOnSupplierLIst();
        clickOnConsumer();
        verifyConsumer();
        clickOnIs9000();
        verifyIs9000();
    }
}
