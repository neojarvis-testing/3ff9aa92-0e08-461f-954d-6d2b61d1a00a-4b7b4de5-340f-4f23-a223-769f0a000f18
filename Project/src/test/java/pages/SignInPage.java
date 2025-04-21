package pages;

import com.aventstack.extentreports.ExtentTest;

import uistore.SignInPageLocator;
import utils.WebDriverHelper;
import utils.Base;
public class SignInPage {
    public static ExtentTest test;
    public static WebDriverHelper helper;
    public SignInPage(ExtentTest test){
        this.test = test;
        helper = new WebDriverHelper(Base.driver);
    }
    public void verifySignIn(){
        try {
            String text = helper.getText(SignInPageLocator.signintext);
            
            
        } catch (AssertionError e) {
            // TODO: handle exception
        }
    }
    
}
