package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

public class Base {
    public static WebDriver driver;
    public static FileInputStream file;
    public static Properties prop;

    /*
    * a. Method Name: loadProperties
    * b. Author Name: Krishna
    * c. Description: Loads the browser properties from the configuration file.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void loadProperties() throws IOException {
        String propertiesPath = System.getProperty("user.dir") + "/config/browser.properties";
        try {
            file = new FileInputStream(propertiesPath);
            prop = new Properties();
            prop.load(file);
        } catch (FileNotFoundException e) {
            LoggerHandler.error("File Not Found fot loadProperties in base");
        }
    }

    /*
    * a. Method Name: openBrowser
    * b. Author Name: Krishna
    * c. Description: Initializes the WebDriver based on browser configuration.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void openBrowser() {
        try {
            loadProperties();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            LoggerHandler.error("IoException in openBrowser method");
        }
        String executionType = prop.getProperty("executiontype");
        String browserName = prop.getProperty("browser");
        if ("remote".equalsIgnoreCase(executionType)) {
            URL gridUrl;
            try {
                gridUrl = new URL(prop.getProperty("gridurl"));
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                driver = new RemoteWebDriver(gridUrl, new ChromeOptions());    
            } catch (MalformedURLException e) {
                LoggerHandler.error("MalformedURLException for chromeOptions");
            }
        } else if ("local".equalsIgnoreCase(executionType)) {
            switch (browserName.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                default:
                    System.err.println("Unsupported browser: " + browserName);
                    break;
            }
        } else {
            System.err.println("Invalid execution type: " + executionType);
        }
        if (driver != null)
        {
            driver.manage().window().maximize();
            driver.get(prop.getProperty("url"));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
        // Dont remove the listener Object
        WebDriverListener listener = new EventHandler();
        driver = new EventFiringDecorator<>(listener).decorate(driver);
    }
}
