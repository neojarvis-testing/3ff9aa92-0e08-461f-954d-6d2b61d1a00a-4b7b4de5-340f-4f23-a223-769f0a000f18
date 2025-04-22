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
    List<String>list= new ArrayList<String>();
    /*
     * Method name: Click on element
     * Author: Samhitha
     * Description: clicks on an element specified by given locator
     * Return type:Void
     */
	public void clickOnElement(By path) {
		try {
			driver.findElement(path).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    /*
     * Method name: sendKeys
     * Author: Samhitha
     * Description: send the text to an input field identified by locator
     * Return type:Void
     */
	public void sendKeys(By path, String value) {
		try {
			driver.findElement(path).sendKeys(value);
	    } catch (Exception e) {
			e.printStackTrace();
		}
	}
    /*
     * Method name: getText
     * Author: Samhitha
     * Description: Retrieves and returns the text content from an element
     * Return type:String
     */
    public String getText(By path){
        return driver.findElement(path).getText();
    }
    /*
     * Method name: getTitle
     * Author: Samhitha
     * Description: Retrieves the page Title
     * Return type:Void
     */
    public String getTitle(){
       return  driver.getTitle();
    }
    /*
     * Method name: navigateBack
     * Author: Samhitha
     * Description: Navigates back to previous page
     * Return type:Void
     */
    public void navigateBack(){
        driver.navigate().back();
    }
    /*
     * Method name: Refresh
     * Author: Samhitha
     * Description: Refreshes the page
     * Return type:Void
     */
    public void refresh(){
        driver.navigate().refresh();
    }
    /*
     * Method name: getURL
     * Author: Samhitha
     * Description: Returns the current page URL
     * Return type: String
     */
    public String getURL(){
        return driver.getCurrentUrl();
    }
    /*
     * Method name: enterAction
     * Author: Samhitha
     * Description: Send an enter key action to the input field
     * Return type: void
     */
	public void enterAction(By path){
		driver.findElement(path).sendKeys(Keys.ENTER);
	}
    /*
     * Method name: clearText
     * Author: Samhitha
     * Description: Clears the text in input field
     * Return type: void
     */
    public void clearText(By path){
        driver.findElement(path).clear();
    }
    /*
     * Method name: waitForElementToBeVisible
     * Author: Samhitha
     * Description: Waits for an element to become visible within specified time.
     * Return type: void
     */
    public void waitForElementToBeVisible(By path, int seconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.visibilityOfElementLocated(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * Method name: wait For Element to be clickble
     * Author: Samhitha
     * Description: waits for an element to be clickable
     * Return type: void
     */
    public void waitForElementToBeClickable(By path, int seconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.elementToBeClickable(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * Method name: hover on element
     * Author: Samhitha
     * Description:  moves the mouse curser over an element
     * Return type: void
     */
	public void hoverOverElement(By path) {
		try {
			Actions action= new Actions(driver);
			WebElement webelement=driver.findElement(path);
			action.moveToElement(webelement).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    /*
     * Method name: Hover and Click on element
     * Author: Samhitha
     * Description: Hovers over an element and clicks it
     * Return type: void
     */
	public void hoverAndClick(By path) {
		try {
			Actions action= new Actions(driver);
			WebElement webelement=driver.findElement(path);
			action.click(webelement).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    /*
     * Method name: getElementsByPath(String Path)
     * Author: Samhitha
     * Description: Returns the list of elements found using XPath
     * Return type: WebElement
     */
	public List<WebElement>getElementsByXPath(String path){
		return driver.findElements(By.xpath(path));
	}
    /*
     * Method name: getElementsByPath(By Path)
     * Author: Samhitha
     * Description: Returns the list of elements found using given locator
     * Return type: WebElement
     */
	public List<WebElement>getElementsByPath(By path){
		return driver.findElements(path);
	}
    /*
     * Method name: switchToAllTabs
     * Author: Samhitha
     * Description: Switches to a newly opened browser window.
     * Return type: void
     */
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
    /*
     * Method name: clickAndSwitch
     * Author: Samhitha
     * Description: Clicks on an element and switches to a newly opened window.
     * Return type: void
     */
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
    /*
     * Method name: switchToNewWindow
     * Author: Samhitha
     * Description: Switches to a newly opened browser window.
     * Return type: void
     */
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
    /*
     * Method name: scrollByPath
     * Author: Samhitha
     * Description: Scrolls down the page by the specified pixel value.
     * Return type: void
     */
	public void scrollByPath(int path) {
        try {
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(0,"+ path +");");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
    /*
     * Method name: scrollByPixel
     * Author: Samhitha
     * Description: Scrolls the page by the given x and y pixel values.
     * Return type: void
     */
    public void scrollByPixel(int x ,int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(arguments[0],arguments[1]);", x,y);
    }
    /*
     * Method name: javascriptScrollToElement
     * Author: Samhitha
     * Description: Scrolls directly to a specific element using JavaScript scroll.
     * Return type: void
     */
    public void javaScriptScrollToElement(By path) {
        try {
            WebElement element = driver.findElement(path);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView()", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * Method name: javascriptClick
     * Author: Samhitha
     * Description: Clicks an element using JavaScript execution.
     * Return type: void
     */
    public void javascriptClick(By path) {
        try {
            WebElement element = driver.findElement(path);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * Method name: switchBackTowindow
     * Author: Samhitha
     * Description: Switches back to a previously opened window indexed by x.
     * Return type: void
     */
    public void switchBackTowindow(int x){
        driver.switchTo().window(list.get(x));
    }
    /*
     * Method name: selectDropDown
     * Author: Samhitha
     * Description: Selects an option from a dropdown by visible text.
     * Return type: void
     */
	public void selectDropDown(By path, String value) {
        try {
            WebElement element=driver.findElement(path);
            Select select= new Select(element);
            select.selectByVisibleText(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
    /*
     * Method name: scrollToFooter
     * Author: Samhitha
     * Description: Scrolls to the bottom of the page.
     * Return type: void
     */
    public void scrollToFooter(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
}
