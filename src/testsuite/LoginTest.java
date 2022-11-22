package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.awt.font.ShapeGraphicAttribute;

public class LoginTest extends Utility {
    String baseUrl ="https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
       openBrowser(baseUrl);
    }
    public void clickOnElement(By by){
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }
     @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        clickOnElement(By.linkText("Log in"));
        //verify the text
        String expectedMessage ="Welcome, Please Sign In!";
        // WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome,Please Sign In!')]"));
        String actualMessage =getTextFromElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));

        // validate actual and expected message
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @Test
    public void verifyuserShouldlLoginSuccessfullyWithvalidCredentials(){
        // click on login link
        clickOnElement(By.linkText("Log in"));
        // Enter valid email
        sendTextToElement(By.id("Email"), "test234@gmail.com");
        // Enter valid password
        sendTextToElement(By.name("Password"),"Java90");
        // click on login button
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
        String expectedMessage ="Log out";
        String actualMessage = getTextFromElement(By.xpath("//a[@href='/logout']"));
        // validate actual and expected message
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @Test
    public void verifyTheErrorMessage(){
        // click on login link
        clickOnElement(By.linkText("Log in"));
        // Enter invalid username
        sendTextToElement(By.id("Email"),"jason@gamil.com");
        // Enter invalid password
        sendTextToElement(By.name("Password"),"samson98");
        // click on login button
        clickOnElement(By.xpath("button-1 login-button"));////button[@class='button-1 login-button']
        // verify error message
        String expectedMessage="Login was unsuccessful.Please correct the errors and try again.No customer account found";
        String actualMessage=getTextFromElement(By.xpath("//button[@class='button-1 login-button']"));
    }
    @After
    public void tearDown(){
      closeBrowser();
    }
}
