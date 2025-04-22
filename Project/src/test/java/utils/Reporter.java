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
    public static String takeScreenshotAsBase64() {
        String base64String = "";
        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent = FileUtils.readFileToByteArray(screenshotFile);
            base64String = Base64.getEncoder().encodeToString(fileContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return base64String;
    }
    public static void attachScreenshotToReportBase64(String reportName, ExtentTest test, String description) {
        try {
            String base64Screenshot = takeScreenshotAsBase64();
            if (!base64Screenshot.isEmpty()) {
                test.info(description, MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
            } else {
                test.log(Status.FAIL, "Screenshot capture failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
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
            e.printStackTrace();
        }
        return destPath;
    }
    
    public static void attachScreenshotToReport(String filename, ExtentTest test, String description) {
        try {
            test.log(Status.INFO, description, MediaEntityBuilder.createScreenCaptureFromPath(captureScreenShot(filename)).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
   
    }
    
 
}
 