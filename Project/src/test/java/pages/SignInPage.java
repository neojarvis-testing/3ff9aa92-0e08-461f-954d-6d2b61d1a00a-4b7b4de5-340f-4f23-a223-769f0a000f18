package pages;



import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.SignInPageLocator;
import utils.WebDriverHelper;
import utils.Base;
import utils.LoggerHandler;
public class SignInPage {
    public static ExtentTest test;
    public static WebDriverHelper helper;
    public SignInPage(ExtentTest test){
        this.test = test;
        helper = new WebDriverHelper(Base.driver);
    }
    public void verifySignIn(){
        try {
            helper.WaitForElementToBeVisible(SignInPageLocator.popup,6);
            helper.clickOnElement(SignInPageLocator.popup);

            String text = helper.getText(SignInPageLocator.signintext);
            Assert.assertTrue(text.contains("Sign in "));
            test.log(Status.PASS,"scuuessfully verified Sign text");
            LoggerHandler.info("scuuessfully verified Sign text");
            
        } catch (AssertionError e) {
            test.log(Status.FAIL,"SignIn verification failed");
            LoggerHandler.error("SignIn verification failed");
        }
    }
    public void hoverSignIn(){
        try {
            helper.WaitForElementToBeVisible(SignInPageLocator.signinicon,6);
            helper.HoverOverElement(SignInPageLocator.signinicon);

            test.log(Status.PASS,"Hovering SignIn success");
            LoggerHandler.info("Hovering SignIn success");

        } catch (Exception e) {
            test.log(Status.FAIL,"Hovering SignIn failed");
            LoggerHandler.error("Hovering SignIn failed");
        }
    }
    public void clickSignIn(){
        try {
            helper.WaitForElementToBeVisible(SignInPageLocator.joinfree, 10);
            helper.clickOnElement(SignInPageLocator.joinfree);
            helper.switchToNewWindow();
            test.log(Status.PASS,"Clicking SignIn success");
            LoggerHandler.info("Clicking SignIn success");

            
        } catch (Exception e) {
            test.log(Status.FAIL,"Clicking SignIn failed");
            LoggerHandler.error("Clicking SignIn failed");
        }
    }
    // public void switchnewtab(){
    //     try {
    //         helper.switchToNewWindow();
    //         test.log(Status.PASS,"Switching new tab success");
    //         LoggerHandler.info("Switching new tab succes");
            
    //     } catch (Exception e) {
    //         test.log(Status.FAIL,"Switching new tab failed");
    //         LoggerHandler.error("Switching new tab failed");
    //     }
    // }
    public void clickemailbar(){
        try {
            helper.WaitForElementToBeClickable(SignInPageLocator.email,6);
            helper.clickOnElement(SignInPageLocator.email);
            test.log(Status.PASS,"Clicking email success");
            LoggerHandler.info("Clicking email success");

            
        } catch (Exception e) {
            test.log(Status.FAIL,"Clicking email failed");
            LoggerHandler.error("Clicking email failed");
        }
    }
    public void enterdatatoemail(){
        try {
            helper.SendKeys(SignInPageLocator.email,"sair27774@gmail.com");
            test.log(Status.PASS,"entering data to email success");
            LoggerHandler.info("entering data to email success");


            
        } catch (Exception e) {
            test.log(Status.FAIL,"entering data to email failed");
            LoggerHandler.error("entering data to email failed");
        }
    }
    public void clickIagree(){
        try {
            helper.clickOnElement(SignInPageLocator.checkbox);
            test.log(Status.PASS,"Clicking I agree to checkbox success");
            LoggerHandler.info("Clicking I agree to checkbox success");
            

            
        } catch (Exception e) {
            test.log(Status.FAIL,"Clicking I agree to checkbox failed");
            LoggerHandler.error("Clicking I agree to checkbox failed");
        }
    }
    public void clickverify(){
        try {
            helper.WaitForElementToBeVisible(SignInPageLocator.verify,6);
            helper.clickOnElement(SignInPageLocator.verify);
            test.log(Status.PASS,"Clicking verify box success");
            LoggerHandler.info("Clicking verify box success");

            
        } catch (Exception e) {
            test.log(Status.FAIL,"Clicking verify box  failed");
            LoggerHandler.error("Clicking verify box  failed");
        }
    }
    public void clicknext(){
        try {
            helper.clickOnElement(SignInPageLocator.next);
            test.log(Status.PASS,"Clicking next box success");
            LoggerHandler.info("Clicking next box success");
            
        } catch (Exception e) {

            test.log(Status.FAIL,"Clicking next box  failed");
            LoggerHandler.error("Clicking next box  failed");
        }


    }
    public void verifyverification(){
        try {
            String text = helper.getText(SignInPageLocator.verificationerror);
            Assert.assertTrue(text.contains("Please enter the verification code."));
            test.log(Status.PASS,"scuuessfully verified text");
            LoggerHandler.info("scuuessfully verified  text");
            
        } catch (AssertionError e) {
            test.log(Status.FAIL,"text verification failed");
            LoggerHandler.error("text verification failed");
        }

    }
    public void clicksignInNOw(){
        try {
            Base.driver.navigate().refresh();
            helper.WaitForElementToBeVisible(SignInPageLocator.signnow,6);
            helper.clickOnElement(SignInPageLocator.signnow);
            test.log(Status.PASS,"Clicking sign in success");
            LoggerHandler.info("Clicking sign in success");

        } catch (Exception e) {
            test.log(Status.FAIL,"Clicking sign in  failed");
            LoggerHandler.error("Clicking sign in failed");
        }
    }
    public void enteremailtologin(){
        try {
            helper.clickOnElement(SignInPageLocator.inputemail);
            helper.SendKeys(SignInPageLocator.inputemail,"rdfghjkjhg@gmail.com");
            test.log(Status.PASS,"entering data in email success");
            LoggerHandler.info("entering data in email success");
            
            
        } catch (Exception e) {
            test.log(Status.FAIL,"entering data in email  failed");
            LoggerHandler.error("entering data in email  failed");
        }
    }
    public void enterpasswordtologin(){
        try {
            helper.clickOnElement(SignInPageLocator.password);
            helper.SendKeys(SignInPageLocator.password,"rdfghjk");
            test.log(Status.PASS,"entering data in password success");
            LoggerHandler.info("entering data in password success");
                

        } catch (Exception e) {
            test.log(Status.FAIL,"entering data in password fail");
            LoggerHandler.error("entering data in password fail");
        }
    }
    public void clicklogin(){
        try {
            helper.clickOnElement(SignInPageLocator.signin);
            test.log(Status.PASS,"Clicking sign in success");
            LoggerHandler.info("Clicking sign in success");


        } catch (Exception e) {
            test.log(Status.FAIL,"Clicking sign in  failed");
            LoggerHandler.error("Clicking sign in failed");
        }
    }
    public void verifyaddress(){
        try {
            String text = helper.getText(SignInPageLocator.logionerror);
            Assert.assertTrue(text.contains("This Email Address is not yet registered"));
            test.log(Status.PASS,"scuuessfully verified text");
            LoggerHandler.info("scuuessfully verified  text");
            
        } catch (AssertionError e) {
            test.log(Status.FAIL,"text verification failed");
            LoggerHandler.error("text verification failed");
        }


    }
    public void clickonforgetpassword(){
        try {
            helper.clickOnElement(SignInPageLocator.forgetpassword);
            test.log(Status.PASS,"Clicking forget password in success");
            LoggerHandler.info("Clicking forget password success");


        } catch (Exception e) {
            test.log(Status.FAIL,"Clicking forget pasword in  failed");
            LoggerHandler.error("Clicking forget password failed");
        }

    }
    public void switchnewwindow1(){
        try {
            helper.switchToNewWindow();
            test.log(Status.PASS,"Switching new tab success");
            LoggerHandler.info("Switching new tab succes");

            
        } catch (Exception e) {
            test.log(Status.FAIL,"Switching new tab failed");
            LoggerHandler.error("Switching new tab failed");
        }

    }
    public void clickcontinue(){
        try {
            helper.clickOnElement(SignInPageLocator.continued);
            test.log(Status.PASS,"Clicking continu in success");
            LoggerHandler.info("Clicking continue success");


        } catch (Exception e) {
            test.log(Status.FAIL,"Clicking continue  failed");
            LoggerHandler.error("Clicking continue failed");
        }

    }
    public void verifyimage(){
        try {
            String text = helper.getText(SignInPageLocator.lasterror);
            Assert.assertTrue(text.contains("Please enter the text in the image"));
            test.log(Status.PASS,"scuuessfully verified text");
            LoggerHandler.info("scuuessfully verified  text");
            
        } catch (AssertionError e) {
            test.log(Status.FAIL,"text verification failed");
            LoggerHandler.error("text verification failed");
        }

    }
    public void testcase1(){
        verifySignIn();
        hoverSignIn();
        clickSignIn();
        // switchnewtab();
        // clickemailbar();
        enterdatatoemail();
        clickIagree();
        
        clickverify();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        clicknext();
        verifyverification();
        clicksignInNOw();
        enteremailtologin();
        enterpasswordtologin();
        clicklogin();
        verifyaddress();
        clickonforgetpassword();
        switchnewwindow1();
        clickcontinue();
        verifyimage();

    }
    
}
