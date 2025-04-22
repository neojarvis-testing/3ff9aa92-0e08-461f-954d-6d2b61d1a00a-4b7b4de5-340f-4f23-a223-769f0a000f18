package utils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverHelper {
    WebDriver driver;
	public WebDriverHelper(WebDriver driver) {
		this.driver=driver;
	}
    List<String> list=new ArrayList<String>();
	public void clickOnElement(By path) {
		try {
			driver.findElement(path).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void sendKeys(By path, String value) {
		try {
			driver.findElement(path).sendKeys(value);
	    } catch (Exception e) {
			e.printStackTrace();
		}
	}
    public String getText(By path){
        return driver.findElement(path).getText();
    }
    public String getTitle(){
        return driver.getTitle();
    }
    public void navigateBack(){
        driver.navigate().back();
    }
    public void refresh(){
        driver.navigate().refresh();
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
	public void enterAction(By path){
		driver.findElement(path).sendKeys(Keys.ENTER);
	}
    public void clearText(By path){
        driver.findElement(path).clear();
    }
    public void waitForElementToBeVisible(By path, int seconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.visibilityOfElementLocated(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void waitForElementToBeClickable(By path, int seconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.elementToBeClickable(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	public void hoverOverElement(By path) {
		try {
			Actions action= new Actions(driver);
			WebElement webelement=driver.findElement(path);
			action.moveToElement(webelement).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void hoverAndClick(By path) {
		try {
			Actions action= new Actions(driver);
			WebElement webelement=driver.findElement(path);
			action.click(webelement).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public List<WebElement> getElementsByXPath(String path){
		return driver.findElements(By.xpath(path));
	}
	public List<WebElement> getElementsByPath(By path){
		return driver.findElements(path);
	}
    
	public void switchToAllTabs() {
	    try {
	        Set<String> set = driver.getWindowHandles(); // Get all open tabs/windows
	        for (String child : set) {
	            driver.switchTo().window(child); // Switch to each tab/window
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
    public void clickAndSwitch(By path){
        String parent=driver.getWindowHandle();
        clickOnElement(path);
        Set<String> set=driver.getWindowHandles();
        for (String child : set) {
            if (!child.equals(parent)) {
                driver.switchTo().window(child);
                list.add(child);
            } 
        }
    }
    public void switchToNewWindow() {
        try {
            Set<String> windowHandles = driver.getWindowHandles();
            for (String windowHandle : windowHandles) {
                if (!windowHandle.isEmpty()) {
                    driver.switchTo().window(windowHandle);
                    list.add(windowHandle);
                } else {
                    throw new Exception("New window could not be retrieved");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	public void scrollByPath(int path) {
        try {
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(0,"+ path +");");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
    public void scrollByPixel(int x ,int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(arguments[0],arguments[1]);", x,y);
    }
    public void javaScriptScrollToElement(By path) {
        try {
            WebElement element = driver.findElement(path);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView()", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void javascriptClick(By path) {
        try {
            WebElement element = driver.findElement(path);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void switchBackTowindow(int x){
       driver.switchTo().window(list.get(x));
    }
	public void selectDropDown(By path, String value) {
        try {
            WebElement element=driver.findElement(path);
            Select select= new Select(element);
            select.selectByVisibleText(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
    public void scrollToFooter(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
}
