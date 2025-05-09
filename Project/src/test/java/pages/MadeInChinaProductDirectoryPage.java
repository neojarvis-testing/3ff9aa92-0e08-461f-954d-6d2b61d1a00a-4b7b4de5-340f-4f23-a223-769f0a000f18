package pages;

import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.MadeInChinaCategoriesPageLocators;
import uistore.MadeInChinaProductDirectoryPageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class MadeInChinaProductDirectoryPage {
    private static final String directory = "user.dir";
    private static final String excelPath = "/testdata/pruthvi.xlsx";
    private static final String sheetName = "pruthvi";
    WebDriverHelper helper;
    ExtentTest test;
    /*
     * a. Method Name: MadeInChinaProductDirectoryPage
     * b. Author Name: Pruthviraj Batti
     * c. Description: Initializes the MadeInChinaProductDirectoryPage class by setting up the WebDriverHelper 
     *    instance and associating the test instance for logging.
     * d. Return Type: Constructor (no return type)
     * e. Parameter List: ExtentTest test - The test instance used for logging actions.
     */
    public MadeInChinaProductDirectoryPage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.test=test;
    }   
    /*
     * a. Method Name: clickOnPopUp
     * b. Author Name: Pruthviraj Batti
     * c. Description: This method attempts to click on the popup element and logs the action's success or failure.
     * d. Return Type: void
     * e. Parameter List: None
     */
    public void clickOnPopUp(){
        try {
            helper.clickOnElement(MadeInChinaCategoriesPageLocators.popup);
            LoggerHandler.info("Successfully clicked on popup");
            test.log(Status.PASS, "Successfully clicked on popup");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on popup");
            test.log(Status.FAIL, "Failed to click on popup");
        }
    }
    /*
     * a. Method Name: hoverOverBuyers
     * b. Author Name: Pruthviraj Batti
     * c. Description: This method attempts to hover over the Buyer element and logs the action's success or failure.
     * d. Return Type: void
     * e. Parameter List: None
     */
    public void hoverOverBuyers(){
        try {
            helper.hoverOverElement(MadeInChinaProductDirectoryPageLocators.buyer);
            LoggerHandler.info("Successfully  hovered over the Buyer");
            test.log(Status.PASS, "Successfully  hovered over the Buyer");
        } catch (Exception e) {
            LoggerHandler.error("Failed to hovered over the Buyer");
            test.log(Status.FAIL, "Failed to hovered over the Buyer");
        }
    }
    /*
     * a. Method Name: clickOnProductDirectory
     * b. Author Name: Pruthviraj Batti
     * c. Description: This method attempts to click on the Product Directory element, switches to a new window, 
     *    and logs the action's success or failure.
     * d. Return Type: void
     * e. Parameter List: None
     */
    public void clickOnProductDirectory(){
        try {
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.productDirectory);
            helper.switchToNewWindow();
            LoggerHandler.info("Successfully clicked on Product Directory");
            test.log(Status.PASS, "Successfully clicked on Product Directory");
        } catch (Exception e) {
            LoggerHandler.error("Failed  to click on Product Directory");
            test.log(Status.FAIL, "Failed  to click on Product Directory");
        }
    }
    /*
     * a. Method Name: clickOnMachineTools
     * b. Author Name: Pruthviraj Batti
     * c. Description: This method waits for the Machine Tools element to be visible, clicks on it, switches to a new window,
     *    captures a screenshot, and logs the action's success or failure.
     * d. Return Type: void
     * e. Parameter List: None
     */
    public void clickOnMachineTools(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaProductDirectoryPageLocators.machineTools, 10);
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.machineTools);
            helper.switchToNewWindow();
            LoggerHandler.info("Successfully clicked on Machine Tools");
            test.log(Status.PASS, "Successfully clicked on Machine Tools");
            Reporter.attachScreenshotToReport("Machine Tools", test, "Machine Tools");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Machine Tools");
            test.log(Status.FAIL, "Failed to click on Machine Tools");
        }
    }
    /*
     * a. Method Name: clickOnEngineeringConstructionMachinery
     * b. Author Name: Pruthviraj Batti
     * c. Description: This method waits for the Engineering & Construction Machinery element to be visible, 
     *    clicks on it, switches to a new window, captures a screenshot, and logs the action's success or failure.
     * d. Return Type: void
     * e. Parameter List: None
     */
    public void clickOnEngineeringConstructionMachinery(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaProductDirectoryPageLocators.engineeringConstructionMachinery, 10);
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.engineeringConstructionMachinery);
            helper.switchToNewWindow();
            LoggerHandler.info("Successfully clicked on Engineering & Construction Machinery");
            test.log(Status.PASS, "Successfully clicked on Engineering & Construction Machinery");
            Reporter.attachScreenshotToReport("Construction Machinery ", test, "Construction Machinery");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Engineering & Construction Machinery");
            test.log(Status.FAIL, "Failed to click on Engineering & Construction Machinery");
        }
    }
    /*
     * a. Method Name: clickOnWoodworkingMachinery
     * b. Author Name: Pruthviraj Batti
     * c. Description: This method waits for the Woodworking Machinery element to be visible, clicks on it, 
     *    switches to a new window, and logs the action's success or failure.
     * d. Return Type: void
     * e. Parameter List: None
     */
    public void clickOnWoodworkingMachinery(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaProductDirectoryPageLocators.woodworkingMachinery, 10);
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.woodworkingMachinery);
            helper.switchToNewWindow();
            LoggerHandler.info("Successfully clicked on Woodworking Machinery");
            test.log(Status.PASS, "Successfully clicked on Woodworking Machinery");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Woodworking Machinery");
            test.log(Status.FAIL, "Failed to click on Woodworking Machinery");
        }
    }
    /*
     * a. Method Name: clickOnPlasticMachinery
     * b. Author Name: Pruthviraj Batti
     * c. Description: This method waits for the Plastic Machinery element to be visible, clicks on it, 
     *    switches to a new window, and logs the action's success or failure.
     * d. Return Type: void
     * e. Parameter List: None
     */
    public void clickOnPlasticMachinery(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaProductDirectoryPageLocators.plasticMachinery, 10);
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.plasticMachinery);
            helper.switchToNewWindow();
            LoggerHandler.info("Successfully clicked on Plastic Machinery");
            test.log(Status.PASS, "Successfully clicked on the Plastic Machinery");
        } catch (Exception e) {
            LoggerHandler.error("Didn't Successfully clicked on Plastic Machinery");
            test.log(Status.FAIL, "Not Successfully clicked on Plastic Machinery");
        }
    }
    /*
     * a. Method Name: clickOnMetallicProcessingMachinery
     * b. Author Name: Pruthviraj Batti
     * c. Description: This method waits for the Metallic Processing Machinery element to be visible, 
     *    clicks on it, switches to a new window, and logs the action's success or failure.
     * d. Return Type: void
     * e. Parameter List: None
     */
    public void clickOnMetallicProcessingMachinery(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaProductDirectoryPageLocators.metallicProcessingMachinery, 10);
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.metallicProcessingMachinery);
            helper.switchToNewWindow();
            LoggerHandler.info("Successfully clicked on Metallic Processing Machinery");
            test.log(Status.PASS, "Successfully clicked on the Metallic Processing Machinery");
        } catch (Exception e) {
            LoggerHandler.error("Not Successfully clicked on Metallic Processing Machinery");
            test.log(Status.FAIL, "Didn't Successfully clicked on Metallic Processing Machinery");
        }
    }
    /*
     * a. Method Name: clickOnMould
     * b. Author Name: Pruthviraj Batti
     * c. Description: This method waits for the Mould element to be visible, clicks on it, 
     *    switches to a new window, and logs the action's success or failure.
     * d. Return Type: void
     * e. Parameter List: None
     */
    public void clickOnMould(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaProductDirectoryPageLocators.mould, 10);
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.mould);
            helper.switchToNewWindow();
            LoggerHandler.info("Successfully clicked on Mould");
            test.log(Status.PASS, "Successfully clicked the on Mould");
        } catch (Exception e) {
            LoggerHandler.error("Didn't Successfully clicked on Mould");
            test.log(Status.FAIL, "Not Successfully clicked on Mould");
        }
    }
    /*
     * a. Method Name: clickOnLaserEquipment
     * b. Author Name: Pruthviraj Batti
     * c. Description: This method waits for the Laser Equipment element to be visible, clicks on it, 
     *    switches to a new window, and logs the action's success or failure.
     * d. Return Type: void
     * e. Parameter List: None
     */
    public void clickOnLaserEquipment(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaProductDirectoryPageLocators.laserEquipment, 10);
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.laserEquipment);
            helper.switchToNewWindow();
            LoggerHandler.info("Successfully clicked on the Laser Equipment");
            test.log(Status.PASS, "Successfully clicked on Laser Equipment");
        } catch (Exception e) {
            LoggerHandler.error("Didn't Successfully clicked on Laser Equipment");
            test.log(Status.FAIL, "Not Successfully clicked on Laser Equipment");
        }
    }
    /*
     * a. Method Name: clickOnCastingForging
     * b. Author Name: Pruthviraj Batti
     * c. Description: This method waits for the Casting & Forging element to be visible, clicks on it, 
     *    switches to a new window, and logs the action's success or failure.
     * d. Return Type: void
     * e. Parameter List: None
     */
    public void clickOnCastingForging(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaProductDirectoryPageLocators.castingForging, 10);
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.castingForging);
            helper.switchToNewWindow();
            LoggerHandler.info("click on casting");
            test.log(Status.PASS, "click on casting");
            LoggerHandler.info("Successfully clicked on Casting & Forging");
            test.log(Status.PASS, "Successfully clicked on the Casting & Forging");
        } catch (Exception e) {
            LoggerHandler.error("Did not Successfully clicked on Casting & Forging");
            test.log(Status.FAIL, "Not Successfully clicked on Casting & Forging");
        }
    }
    /*
     * a. Method Name: clickOnAgriculturalMachinery
     * b. Author Name: Pruthviraj Batti
     * c. Description: This method waits for the Agricultural Machinery element to be visible, highlights it for 
     *    a screenshot, clicks on it, switches to a new window, attaches screenshots to the report, and logs 
     *    the action's success or failure.
     * d. Return Type: void
     * e. Parameter List: None
     */
    public void clickOnAgriculturalMachinery(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaProductDirectoryPageLocators.agriculturalMachinery, 10);
            Screenshot.captureHighlightedElementScreenshot(MadeInChinaProductDirectoryPageLocators.agriculturalMachinery, "Highlighted_Agricultural_Machinery");
            helper.clickOnElement(MadeInChinaProductDirectoryPageLocators.agriculturalMachinery);
            helper.switchToNewWindow();
            LoggerHandler.info("Successfully clicked on Agricultural Machinery");
            test.log(Status.PASS, "Successfully clicked on the Agricultural Machinery");
            Reporter.attachScreenshotToReport("agricultural_machinery", test, "agricultural_machinerys");
            Screenshot.captureFullScreenshot("agricultural_machinery");
           
        } catch (Exception e) {
            LoggerHandler.error("Not Successfully clicked on Agricultural Machinery");
            test.log(Status.FAIL, "Didn't Successfully clicked on Agricultural Machinery");
        }
    }
    /*
     * a. Method Name: navigateBack
     * b. Author Name: Pruthviraj Batti
     * c. Description: This method switches back to the specified window index, logs the navigation action, 
     *    and records its success or failure.
     * d. Return Type: void
     * e. Parameter List: None
     */
    public void navigateBack(){
        try {
            helper.switchBackTowindow(1);
            LoggerHandler.info("navigate back to product directory");
            test.log(Status.PASS,"navigated back to product directory");
            LoggerHandler.info("Successfully navigated Back");
            test.log(Status.PASS,"Successfully navigate back");
        } catch (Exception e) {
            LoggerHandler.info("Failed to navigate Back");
            test.log(Status.PASS,"Not navigated back");
        }
    }
    /*
     * a. Method Name: verifyurl
     * b. Author Name: Pruthviraj Batti
     * c. Description: This method retrieves the current page URL, verifies if it contains the expected URL substring, 
     *    and logs the verification status.
     * d. Return Type: void
     * e. Parameter List: String url - The expected URL substring to verify.
     */
    public void verifyurl(String url){
        try {
            String text=helper.getURL();
            Assert.assertTrue(text.contains(url));
            LoggerHandler.info("Successfully verified url "+url);
            test.log(Status.PASS,"Successfully verified the url  "+url );
        } catch (Exception e) {
            LoggerHandler.info("Failed to verified the url  "+url );
            test.log(Status.FAIL,"Didn't verified the url  "+url );
        }  
    }
    /*
     * a. Method Name: productDirectory
     * b. Author Name: Pruthviraj Batti
     * c. Description: This method navigates through various product directories by clicking on elements, 
     *    verifying URLs against test data, and handling navigation back to the main page.
     * d. Return Type: void
     * e. Parameter List: None
     */
    public void productDirectory(){
            clickOnPopUp();
            hoverOverBuyers();
            clickOnProductDirectory();
            clickOnMachineTools();
            verifyurl(ExcelReader.readData(System.getProperty(directory)+excelPath, sheetName, 0, 1));
            navigateBack();
            clickOnEngineeringConstructionMachinery();
            verifyurl(ExcelReader.readData(System.getProperty(directory)+excelPath, sheetName, 1, 1));
            navigateBack();
            clickOnWoodworkingMachinery();
            verifyurl(ExcelReader.readData(System.getProperty(directory)+excelPath, sheetName, 2, 1));
            navigateBack();
            clickOnPlasticMachinery();
            verifyurl(ExcelReader.readData(System.getProperty(directory)+excelPath, sheetName, 3, 1));
            navigateBack();
            clickOnMetallicProcessingMachinery();
            verifyurl(ExcelReader.readData(System.getProperty(directory)+excelPath, sheetName, 4, 1));
            navigateBack();
            clickOnMould();
            verifyurl(ExcelReader.readData(System.getProperty(directory)+excelPath, sheetName, 5, 1));
            navigateBack();
            clickOnLaserEquipment();
            verifyurl(ExcelReader.readData(System.getProperty(directory)+excelPath, sheetName, 6, 1));
            navigateBack();
            clickOnCastingForging();
            verifyurl(ExcelReader.readData(System.getProperty(directory)+excelPath, sheetName, 7, 1));   
            navigateBack();
            clickOnAgriculturalMachinery();
            verifyurl(ExcelReader.readData(System.getProperty("user.dir")+excelPath, sheetName, 8, 1));  
    }
    
}
