package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.MadeInChinaLanguagePageLocator;
import uistore.MadeInChinaLedLightLocator;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class MadeInChinaLedLightPage {
    WebDriverHelper helper;
    ExtentTest test;
    public MadeInChinaLedLightPage(ExtentTest test){
        this.test = test;
        helper = new WebDriverHelper(Base.driver);
    }
    /*
     * Method name: closePopUp.
     * AuthorName: Rishi Prashar.
     * Description: This method will help us to close the pop up.
     * Parameters: None.
     * return type: void.
     */
    public void closePopUp(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLanguagePageLocator.joinFree,3);
            helper.clickOnElement(MadeInChinaLanguagePageLocator.popup);
            test.log(Status.PASS, "closed pop up");
            LoggerHandler.info("closed pop up");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not close pop up");
            LoggerHandler.error("Did not close pop up");
        }
    }
    /*
     * Method name: clickAndSendData.
     * AuthorName: Rishi Prashar.
     * Description: This method will click and send data to search bar.
     * Parameters: None.
     * return type: void.
     */
    public void clickAndSendData(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightLocator.searchbar,3);
            helper.clickOnElement(MadeInChinaLedLightLocator.searchbar);
            String value=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "sheet1", 0, 0);
            helper.sendKeys(MadeInChinaLedLightLocator.searchbar,value);
            helper.enterAction(MadeInChinaLedLightLocator.searchbar);
            test.log(Status.PASS, "clicked and sent data to search bar");
            LoggerHandler.info("clicked and sent data to search bar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click and sent data to search bar");
            LoggerHandler.error("Did not click and sent data to search bar");
        }
    }
    /*
     * Method name: verifySearchResult.
     * AuthorName: Rishi Prashar.
     * Description: This method will verify the heading.
     * Parameters: None.
     * return type: void.
     */
    public void verifySearchResult(){
        try {
            String text = helper.getText(MadeInChinaLedLightLocator.verifyLed);
            Assert.assertTrue(text.contains("LED lights"));
            test.log(Status.PASS, "Search result verified");
            LoggerHandler.info("Search result verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "search result not verified");
            LoggerHandler.error("search result not verified");
        }
    }/*
     * Method name: clickOnMore.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on more button.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnMore(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightLocator.more,3);
            helper.clickOnElement(MadeInChinaLedLightLocator.more);
            test.log(Status.PASS, "clicked on more");
            LoggerHandler.info("clicked on more");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on more");
            LoggerHandler.error("Did not click on more");
        }
    }
    /*
     * Method name: clickOnLedStripLight.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on Led Strip Light.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnLedStripLight(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightLocator.ledStripFilter,3);
            helper.clickOnElement(MadeInChinaLedLightLocator.ledStripFilter);
            test.log(Status.PASS, "clicked on ledStripFilter");
            LoggerHandler.info("clicked on ledStripFilter");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on ledStripFilter");
            LoggerHandler.error("Did not click on ledStripFilter");
        }
    }
    /*
     * Method name: verifyFilter.
     * AuthorName: Rishi Prashar.
     * Description: This method will verify if the filter is applied.
     * Parameters: None.
     * return type: void.
     */
    public void verifyFilter(){
        try {
            String text = helper.getText(MadeInChinaLedLightLocator.verifyFilter);
            String value=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "sheet1", 11, 0);
            Assert.assertEquals(text,value);
            test.log(Status.PASS, "Filter result verified");
            LoggerHandler.info("Filter result verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "Filter result not verified");
            LoggerHandler.error("Filter result not verified");
        }
    }
    /*
     * Method name: clickOnContactNow.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on contact now button.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnContactNow(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightLocator.contactNow,3);
            helper.clickAndSwitch(MadeInChinaLedLightLocator.contactNow);
            test.log(Status.PASS, "clicked on contact Now");
            LoggerHandler.info("clicked on contact Now");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on contact Now");
            LoggerHandler.error("Did not click on contact Now");
        }
    }
    /*
     * Method name: verifyInquiry.
     * AuthorName: Rishi Prashar.
     * Description: This method will verify if the inquiry page.
     * Parameters: None.
     * return type: void.
     */
    public void verifyInquiry(){
        try {
            String text = helper.getText(MadeInChinaLedLightLocator.verifyInquiry);
            String value=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "sheet1", 12, 0);
            Assert.assertTrue(text.contains(value));
            test.log(Status.PASS, "Inquiry page is verified");
            LoggerHandler.info("Inquiry page is verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "Inquiry page is not verified");
            LoggerHandler.error("Inquiry page is not verified");
        }
    }
    /*
     * Method name: clickAndSendInquiry.
     * AuthorName: Rishi Prashar.
     * Description: This method will click and send the enquiry.
     * Parameters: None.
     * return type: void.
     */
    public void clickAndSendInquiry(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightLocator.content,3);
            helper.clickOnElement(MadeInChinaLedLightLocator.content);
            String value=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "sheet1", 1, 0);
            helper.sendKeys(MadeInChinaLedLightLocator.content,value);
            test.log(Status.PASS, "clicked and sent data to content field");
            LoggerHandler.info("clicked and sent data to content field");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click and sent data to content field");
            LoggerHandler.error("Did not click and sent data to content field");
        }
    }
     /*
     * Method name: clickAndSendInquiry.
     * AuthorName: Rishi Prashar.
     * Description: This method will click and send the email.
     * Parameters: None.
     * return type: void.
     */
    public void clickAndSendEmail(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightLocator.email,3);
            helper.clickOnElement(MadeInChinaLedLightLocator.email);
            String value=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "sheet1", 2, 0);
            helper.sendKeys(MadeInChinaLedLightLocator.email,value);
            test.log(Status.PASS, "clicked and sent data to email field");
            LoggerHandler.info("clicked and sent data to email field");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click and sent data to email field");
            LoggerHandler.error("Did not click and sent data to email field");
        }
    }
     /*
     * Method name: clickAndSendInquiry.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on send inquiry button.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnSendInquiryNow(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightLocator.sendEnquiry,3);
            helper.clickOnElement(MadeInChinaLedLightLocator.sendEnquiry);
            test.log(Status.PASS, "clicked on sendEnquiry");
            LoggerHandler.info("clicked on sendEnquiry");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on sendEnquiry");
            LoggerHandler.error("Did not click on sendEnquiry");
        }
    }
     /*
     * Method name: clickOnCrossMark.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on the cross mark.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnCrossMark(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightLocator.crossMark,3);
            helper.clickOnElement(MadeInChinaLedLightLocator.crossMark);
            test.log(Status.PASS, "clicked on crossMark");
            LoggerHandler.info("clicked on crossMark");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on crossMark");
            LoggerHandler.error("Did not click on crossMark");
        }
    }
    /*
     * Method name: clickOnCrossMark.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on the made in china logo.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnLogo(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightLocator.logo,3);
            helper.clickOnElement(MadeInChinaLedLightLocator.logo);
            test.log(Status.PASS, "clicked on logo");
            LoggerHandler.info("clicked on logo");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on logo");
            LoggerHandler.error("Did not click on logo");
        }
    }
    /*
     * Method name: verifyHomePage.
     * AuthorName: Rishi Prashar.
     * Description: This method will verify if we are in home page or not.
     * Parameters: None.
     * return type: void.
     */
    public void verifyHomePage(){
        try {
            String text = helper.getText(MadeInChinaLedLightLocator.verifyHomePage);
            String value=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "sheet1", 13, 0);
            Assert.assertTrue(text.contains(value));
            test.log(Status.PASS, "Home page is verified");
            LoggerHandler.info("Home page is verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "Home page is not verified");
            LoggerHandler.error("Home page is not verified");
        }
    }
    /*
     * Method name: hoverOnLigtsAndLightning.
     * AuthorName: Rishi Prashar.
     * Description: This method will hover on lights.
     * Parameters: None.
     * return type: void.
     */
    public void hoverOnLigtsAndLightning(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightLocator.lightsAndLighting,3);
            helper.hoverOverElement(MadeInChinaLedLightLocator.lightsAndLighting);
            test.log(Status.PASS, "Hovered on lights And Lighting ");
            LoggerHandler.info("Hovered On lights And Lighting");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not hover on lights And Lighting");
            LoggerHandler.error("Did not hover over lights And Lighting");
        }
    }
    /*
     * Method name: clickOnLedTube.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on led tube.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnLedTube(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightLocator.ledTube,3);
            helper.clickOnElement(MadeInChinaLedLightLocator.ledTube);
            test.log(Status.PASS, "clicked on ledTube");
            LoggerHandler.info("clicked on ledTube");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on ledTube");
            LoggerHandler.error("Did not click on ledTube");
        }
    }
    /*
     * Method name: verifyLedTube.
     * AuthorName: Rishi Prashar.
     * Description: This method will verify the led tube page.
     * Parameters: None.
     * return type: void.
     */
    public void verifyLedTube(){
        try {
            String text = helper.getText(MadeInChinaLedLightLocator.verifyLedTube);
            String value=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "sheet1",14 , 0);
            Assert.assertTrue(text.contains(value));
            test.log(Status.PASS, "LED Tube page is verified");
            LoggerHandler.info("LED Tube page is verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "LED Tube page is not verified");
            LoggerHandler.error("LED Tube page is not verified");
        }
    }
    /*
     * Method name: clickOnLedTubeFilter.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on led tube filter.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnLedTubeFilter(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightLocator.ledTubeLightFilter,3);
            helper.clickOnElement(MadeInChinaLedLightLocator.ledTubeLightFilter);
            test.log(Status.PASS, "clicked on ledTubeLightFilter");
            LoggerHandler.info("clicked on ledTubeLightFilter");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on ledTubeLightFilter");
            LoggerHandler.error("Did not click on ledTubeLightFilter");
        }
    }
    /*
     * Method name: clickOnColorTemprature.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on color temprature in led page.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnColorTemprature(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightLocator.colorTemp,3);
            helper.clickOnElement(MadeInChinaLedLightLocator.colorTemp);
            test.log(Status.PASS, "clicked on color Temprature");
            LoggerHandler.info("clicked on color Temprature");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on color Temprature");
            LoggerHandler.error("Did not click on color Temprature");
        }
    }
    /*
     * Method name: clickOnWarmWhite.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on Warm white filter.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnWarmWhite(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightLocator.warmwhite,3);
            helper.clickOnElement(MadeInChinaLedLightLocator.warmwhite);
            test.log(Status.PASS, "clicked on color warm white");
            LoggerHandler.info("clicked on color warm white");
        } catch (Exception e) {
            test.log(Status.FAIL, "Did not click on color warm white");
            LoggerHandler.error("Did not click on color warm white");
        }
    }
    /*
     * Method name: ledTestCases.
     * AuthorName: Rishi Prashar.
     * Description: This method will call all the methods.
     * Parameters: None.
     * return type: void.
     */ 
    public void ledTestCases(){
        closePopUp();
        clickAndSendData();
        verifySearchResult();
        clickOnMore();
        clickOnLedStripLight();
        verifyFilter();
        clickOnContactNow();
        verifyInquiry();
        clickAndSendInquiry();
        clickAndSendEmail();
        clickOnSendInquiryNow();
        clickOnCrossMark();
        clickOnLogo();
        verifyHomePage();
        hoverOnLigtsAndLightning();
        clickOnLedTube();
        verifyLedTube();
        clickOnLedTubeFilter();
        clickOnColorTemprature();
        clickOnWarmWhite();
    }
}
