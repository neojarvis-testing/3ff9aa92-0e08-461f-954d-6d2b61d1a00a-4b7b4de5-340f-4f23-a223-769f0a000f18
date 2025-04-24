package utils;
 
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
 
import com.google.common.io.Files;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
 
public class Reporter extends Base {
    public static TakesScreenshot ts;
    
    /*
     * a.Method Name: generateExtentReport
     * b.Author Name: Shashank Kondur
     * c.Description: Generate the ExtentReport with the given name.
     * d.Return Type: ExtentReports
     * e.Paramenter List: String reportName
     */
    public static ExtentReports generateExtentReport(String reportName) {
        ExtentReports extentReport = new ExtentReports();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        String timestamp = dateFormat.format(new Date());
        String reportFilePath = System.getProperty("user.dir") + "/reports/";
        reportFilePath += reportName + "_" + timestamp + ".html";
        File extentReportFile = new File(reportFilePath);
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
        extentReport.attachReporter(sparkReporter);
        return extentReport;
    }

    /*
     * a.Method Name: takeScreenshotAsBase64
     * b.Author Name: Shashank Kondur
     * c.Description: Takes the Screenshot as Base64 format.
     * d.Return Type: String
     * e.Paramenter List: String reportName
     */
    public static String takeScreenshotAsBase64() {
        String base64String = "";
        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent = FileUtils.readFileToByteArray(screenshotFile);
            base64String = Base64.getEncoder().encodeToString(fileContent);
        } catch (Exception e) {
            LoggerHandler.error("takeScreenshotAsBase64 not working");
        }
        return base64String;
    }

    /*
     * a.Method Name: takeScreenshotAsBase64
     * b.Author Name: Shashank Kondur
     * c.Description: Attach the Screenshot to report in base64 format.
     * d.Return Type: void
     * e.Paramenter List: String reportName, ExtentTest test, String description
     */
    public static void attachScreenshotToReportBase64(String reportName, ExtentTest test, String description) {
        try {
            String base64Screenshot = takeScreenshotAsBase64();
            if (!base64Screenshot.isEmpty()) {
                test.info(description, MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
            } else {
                test.log(Status.FAIL, "Screenshot capture failed.");
            }
        } catch (Exception e) {
            LoggerHandler.error("attachScreenshotToReportBase64 not working");
        }
    }

    /*
     * a.Method Name: captureScreenShot
     * b.Author Name: Shashank Kondur
     * c.Description: Capture the Screenshot and saves it with given report name.
     * d.Return Type: String
     * e.Paramenter List: String filename
     */
    public static String captureScreenShot(String filename) {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
        String destPath =  "./"+name;
        ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        File screenshotsDir = new File(System.getProperty("user.dir") + "/reports");
       
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            LoggerHandler.error("captureScreenShot not working");
        }
        return destPath;
    }


    /*
     * a.Method Name: attachScreenshotToReport
     * b.Author Name: Shashank Kondur
     * c.Description: Attach the screenshot with  ExtentReport with the given name.
     * d.Return Type: void
     * e.Paramenter List: String filename, ExtentTest test, String description
     */
    public static void attachScreenshotToReport(String filename, ExtentTest test, String description) {
        try {
            test.log(Status.INFO, description, MediaEntityBuilder.createScreenCaptureFromPath(captureScreenShot(filename)).build());
        } catch (Exception e) {
            LoggerHandler.error("attachScreenshotToReport not working");
        }
   
    }
    

}
 