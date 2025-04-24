package pages;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.MadeInChinaSignInPageLocator;
import utils.WebDriverHelper;
import utils.Base;
import utils.LoggerHandler;
public class MadeInChinaSignInPage {
    ExtentTest test;
    WebDriverHelper helper;
    public MadeInChinaSignInPage(ExtentTest test){
        this.test = test;
        helper = new WebDriverHelper(Base.driver);
    }
    /*
   * MethodName: verifySignIn
   * AuthorName: SaiRohith
   * Description: This method is used to verify the text of signin logo
   * Parameters: None
   * ReturnType: void
   */
    public void verifySignIn(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSignInPageLocator.popup,6);
            helper.clickOnElement(MadeInChinaSignInPageLocator.popup);
            String text = helper.getText(MadeInChinaSignInPageLocator.signintext);
            Assert.assertTrue(text.contains("Sign"));
            test.log(Status.PASS,"scuuessfully verified Sign text");
            LoggerHandler.info("scuuessfully verified Sign text");           
        } catch (AssertionError e) {
            test.log(Status.FAIL,"SignIn verification failed");
            LoggerHandler.error("SignIn verification failed");
       }
    }
   /*
   * MethodName: hoverSignIn
   * AuthorName: SaiRohith
   * Description: This method is used to hover the sign in option
   * Parameters: None
   * ReturnType: void
   */
    public void hoverSignIn(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSignInPageLocator.signintext,6);
            helper.hoverOverElement(MadeInChinaSignInPageLocator.signintext);
            test.log(Status.PASS,"Hovering SignIn success");
            LoggerHandler.info("Hovering SignIn success");
        } catch (Exception e) {
            test.log(Status.FAIL,"Hovering SignIn failed");
            LoggerHandler.error("Hovering SignIn failed");
        }
    }
   /*
   * MethodName: clickJoinFree
   * AuthorName: SaiRohith
   * Description: This method is used to click on joinfree option
   * Parameters: None
   * ReturnType: void
   */
    public void clickJoinFree(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSignInPageLocator.joinfree, 10);
            helper.clickOnElement(MadeInChinaSignInPageLocator.joinfree);
            helper.switchToNewWindow();
            test.log(Status.PASS,"Clicking SignIn success");
            LoggerHandler.info("Clicking SignIn success");            
        } catch (Exception e) {
            test.log(Status.FAIL,"Clicking SignIn failed");
            LoggerHandler.error("Clicking SignIn failed");
         }
    }
    /*
   * MethodName: clickOnEmailBar
   * AuthorName: SaiRohith
   * Description: This method is used to click on email bar
   * Parameters: None
   * ReturnType: void
   */
    public void clickOnEmailBar(){
        try {
            helper.waitForElementToBeClickable(MadeInChinaSignInPageLocator.email,6);
            helper.clickOnElement(MadeInChinaSignInPageLocator.email);
            test.log(Status.PASS,"Clicking email success");
            LoggerHandler.info("Clicking email success");            
        } catch (Exception e) {
            test.log(Status.FAIL,"Clicking email failed");
            LoggerHandler.error("Clicking email failed");
        }
    }
    /*
   * MethodName: enterDataToEmail
   * AuthorName: SaiRohith
   * Description: This method is used to enter data to email bar
   * Parameters: None
   * ReturnType: void
   */
    public void enterDataToEmail(){
        try {
            helper.sendKeys(MadeInChinaSignInPageLocator.email,"sair27774@gmail.com");
            test.log(Status.PASS,"entering data to email success");
            LoggerHandler.info("entering data to email success");            
        } catch (Exception e) {
            test.log(Status.FAIL,"entering data to email failed");
            LoggerHandler.error("entering data to email failed");
        }
    }
     /*
   * MethodName: clickOnIagree
   * AuthorName: SaiRohith
   * Description: This method is used to click on I agree button
   * Parameters: None
   * ReturnType: void
   */
    public void clickOnIagree(){
        try {
            helper.clickOnElement(MadeInChinaSignInPageLocator.checkbox);
            test.log(Status.PASS,"Clicking I agree to checkbox success");
            LoggerHandler.info("Clicking I agree to checkbox success");
            Thread.sleep(1000);            
        } catch (Exception e) {
            test.log(Status.FAIL,"Clicking I agree to checkbox failed");
            LoggerHandler.error("Clicking I agree to checkbox failed");
        }
    }
     /*
   * MethodName: clickOnVerify
   * AuthorName: SaiRohith
   * Description: This method is used to click on verify button
   * Parameters: None
   * ReturnType: void
   */
    public void clickOnVerify(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSignInPageLocator.verify,6);
            helper.clickOnElement(MadeInChinaSignInPageLocator.verify);
            helper.switchToNewWindow();
            test.log(Status.PASS,"Clicking verify box success");
            LoggerHandler.info("Clicking verify box success");           
        } catch (Exception e) {
            test.log(Status.FAIL,"Clicking verify box  failed");
            LoggerHandler.error("Clicking verify box  failed");
        }
    }
    /*
   * MethodName: clickOnNext
   * AuthorName: SaiRohith
   * Description: This method is used to click on next button
   * Parameters: None
   * ReturnType: void
   */
    public void clickOnNext(){
        try {
            helper.clickOnElement(MadeInChinaSignInPageLocator.next);
            test.log(Status.PASS,"Clicking next box success");
            LoggerHandler.info("Clicking next box success");           
        } catch (Exception e) {
            test.log(Status.FAIL,"Clicking next box  failed");
            LoggerHandler.error("Clicking next box  failed");
        }
    }
    /*
   * MethodName: verifyVerificationCode
   * AuthorName: SaiRohith
   * Description: This method is used to click on next button
   * Parameters: None
   * ReturnType: void
   */
    public void verifyVerificationCode(){
        try {
            String text = helper.getText(MadeInChinaSignInPageLocator.verificationerror);
            Assert.assertTrue(text.contains("Please enter the verification code."));
            test.log(Status.PASS,"scuuessfully verified text");
            LoggerHandler.info("scuuessfully verified  text");            
        } catch (AssertionError e) {
            test.log(Status.FAIL,"text verification failed");
            LoggerHandler.error("text verification failed");
        }
    }
    /*
   * MethodName: clickOnSignInNOw
   * AuthorName: SaiRohith
   * Description: This method is used to click on signinnow
   * Parameters: None
   * ReturnType: void
   */
    public void clickOnSignInNOw(){
        try {
            Base.driver.navigate().refresh();
            helper.waitForElementToBeVisible(MadeInChinaSignInPageLocator.signnow,6);
            helper.clickOnElement(MadeInChinaSignInPageLocator.signnow);
            test.log(Status.PASS,"Clicking sign in success");
            LoggerHandler.info("Clicking sign in success");
        } catch (Exception e) {
            test.log(Status.FAIL,"Clicking sign in  failed");
            LoggerHandler.error("Clicking sign in failed");
        }
    }
     /*
   * MethodName: enterEmailToLogin
   * AuthorName: SaiRohith
   * Description: This method is used to enter an email in email bar
   * Parameters: None
   * ReturnType: void
   */
    public void enterEmailToLogin(){
        try {
            helper.clickOnElement(MadeInChinaSignInPageLocator.inputemail);
            helper.sendKeys(MadeInChinaSignInPageLocator.inputemail,"rdfghjkjhg@gmail.com");
            test.log(Status.PASS,"entering data in email success");
            LoggerHandler.info("entering data in email success");     
        } catch (Exception e) {
            test.log(Status.FAIL,"entering data in email  failed");
            LoggerHandler.error("entering data in email  failed");
        }
    }
     /*
   * MethodName: enterPasswordtoLogin
   * AuthorName: SaiRohith
   * Description: This method is used to enter an password in email bar
   * Parameters: None
   * ReturnType: void
   */
    public void enterPasswordToLogin(){
        try {
            helper.clickOnElement(MadeInChinaSignInPageLocator.password);
            helper.sendKeys(MadeInChinaSignInPageLocator.password,"rdfghjk");
            test.log(Status.PASS,"entering data in password success");
            LoggerHandler.info("entering data in password success");                
        } catch (Exception e) {
            test.log(Status.FAIL,"entering data in password fail");
            LoggerHandler.error("entering data in password fail");
        }
    }
    /*
   * MethodName: clickOnLogin
   * AuthorName: SaiRohith
   * Description: This method is used to click on login button
   * Parameters: None
   * ReturnType: void
   */
    public void clickOnLogin(){
        try {
            helper.clickOnElement(MadeInChinaSignInPageLocator.signin);
            test.log(Status.PASS,"Clicking sign in success");
            LoggerHandler.info("Clicking sign in success");
        } catch (Exception e) {
            test.log(Status.FAIL,"Clicking sign in  failed");
            LoggerHandler.error("Clicking sign in failed");
                }
    }
    /*
   * MethodName: verifyEmailErrorMessage
   * AuthorName: SaiRohith
   * Description: This method is used to  verify the error message of email when logined
   * Parameters: None
   * ReturnType: void
   */
    public void verifyEmailErrorMessage(){
        try {
            String text = helper.getText(MadeInChinaSignInPageLocator.logionerror);
            Assert.assertTrue(text.contains("This Email Address is not yet registered"));
            test.log(Status.PASS,"scuuessfully verified text");
            LoggerHandler.info("scuuessfully verified  text");           
        } catch (AssertionError e) {
            test.log(Status.FAIL,"text verification failed");
            LoggerHandler.error("text verification failed");
        }
    }
        /*
   * MethodName: clickOnForgetPassword
   * AuthorName: SaiRohith
   * Description: This method is used to  click on forget password
   * Parameters: None
   * ReturnType: void
   */
    public void clickOnForgetPassword(){
        try {
            helper.clickOnElement(MadeInChinaSignInPageLocator.forgetpassword);
            test.log(Status.PASS,"Clicking forget password in success");
            LoggerHandler.info("Clicking forget password success");
        } catch (Exception e) {
            test.log(Status.FAIL,"Clicking forget pasword in  failed");
            LoggerHandler.error("Clicking forget password failed");
        }
    }
    /*
   * MethodName: clickOnContinue
   * AuthorName: SaiRohith
   * Description: This method is used click on continue
   * Parameters: None
   * ReturnType: void
   */
    public void clickOnContinue(){
        try {
            helper.clickOnElement(MadeInChinaSignInPageLocator.continued);
            test.log(Status.PASS,"Clicking continu in success");
            LoggerHandler.info("Clicking continue success");
        } catch (Exception e) {
            test.log(Status.FAIL,"Clicking continue  failed");
            LoggerHandler.error("Clicking continue failed");
                }
    }
  /*
   * MethodName: verifyOnImageText
   * AuthorName: SaiRohith
   * Description: This method is used to verify the error text after clicking continue button
   * Parameters: None
   * ReturnType: void
   */
    public void verifyOnImageText(){
        try {
            String text = helper.getText(MadeInChinaSignInPageLocator.lasterror);
            Assert.assertTrue(text.contains("Please enter the text in the image"));
            test.log(Status.PASS,"scuuessfully verified text");
            LoggerHandler.info("scuuessfully verified  text");           
        } catch (AssertionError e) {
            test.log(Status.FAIL,"text verification failed");
            LoggerHandler.error("text verification failed");
        }
    }
    public void case1(){
        verifySignIn();
        hoverSignIn();
        clickJoinFree();
        clickOnEmailBar();
        enterDataToEmail();
        clickOnIagree();
        clickOnVerify();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {            
            e.printStackTrace();
        }
        // switchnewwindow1();
        // clicknext();
        // verifyverification();
        // // Base.driver.navigate().refresh();
        // clicksignInNOw();
        // enteremailtologin();
        // enterpasswordtologin();
        // clicklogin();
        // verifyaddress();
        // clickonforgetpassword();
        // switchnewwindow1();
        // clickcontinue();
        // verifyimage();
    }
    
}
