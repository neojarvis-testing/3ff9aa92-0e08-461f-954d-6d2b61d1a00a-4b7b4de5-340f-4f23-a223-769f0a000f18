package utils;
 
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import com.google.common.io.Files;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.Transport;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import jakarta.mail.BodyPart;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.activation.DataHandler;
import jakarta.activation.DataSource;
import jakarta.activation.FileDataSource;
import jakarta.mail.Multipart;
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
        File extentReportFile = new File(reportName);
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
        extentReport.attachReporter(sparkReporter);
        return extentReport;
    }

    /*
     * a.Method Name: captureScreenShot
     * b.Author Name: Shashank Kondur
     * c.Description: Capture the Screenshot and saves it with given report name.
     * d.Return Type: String
     * e.Paramenter List: String filename
     */
    public static String captureScreenshot(String filename) {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
        String destPath = "./" + name;
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

    /*
     * a.Method Name: attachScreenshotToReport
     * b.Author Name: Shashank Kondur
     * c.Description: Attach the screenshot with  ExtentReport with the given name.
     * d.Return Type: void
     * e.Paramenter List: String filename, ExtentTest test, String description
     */
    public static void attachScreenshotToReport(String filename, ExtentTest test, String description) {
        try {
            test.log(Status.INFO, description, MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(filename)).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    * Method Name   : sendEmailWithReport
    * Author Name   : Shashank Kondur
    * Description   : Sends an email with the attached test report.
    * Return Type   : void
    * Parameter List: reportFilePath (String): Path to the report file to be attached.
    */
    public static void sendEmailWithReport(String reportFilePath) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
 
        Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("rajaram225773@gmail.com", "lizfdfgnpvwberzt");
            }
        });
 
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("rajaram225773@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("sooryavanshibhai@gmail.com"));
            message.setSubject("Automated Test Report");
 
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Please find the attached test report.");
 
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
 
            // Attach the report
            messageBodyPart = new MimeBodyPart();
            DataSource source = new FileDataSource(reportFilePath);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(reportFilePath);
            multipart.addBodyPart(messageBodyPart);
 
            // Combine message parts
            message.setContent(multipart);
 
            // Send the email
            Transport.send(message);
 
            System.out.println("Email sent successfully with the report attached.");
 
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
 