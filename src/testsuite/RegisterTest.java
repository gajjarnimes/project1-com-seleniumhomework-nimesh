package testsuite;

import javafx.util.converter.ByteStringConverter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class RegisterTest  extends Utility {


    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    public void clickOnElement(By by){
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        // click on the 'Register' link
        clickOnElement(By.linkText("Register"));
        // Verify the text 'Register'
        clickOnElement(By.xpath("//a[@href='/register?returnUrl=%2F']"));
    }
    @Test
    public void userShouldRegisterAccountSuccessfully() {
        // click on the 'Register' link
        clickOnElement(By.linkText("Register"));
        // Select gender radio button
        clickOnElement(By.id("gender"));
        // Enter First name
        clickOnElement(By.name("FirstName"));
        // Enter Last name
        clickOnElement(By.name("LastName"));
        // Select Day Month and Year
        clickOnElement(By.name("DateOfBirthDay"));
        clickOnElement(By.name("DateOfBirthMonth"));
        clickOnElement(By.name("DateOfBirthYear"));
        // Enter Email address
        clickOnElement(By.id("Email"));
        // Enter Password
        clickOnElement(By.name("Password"));
        // Enter Confirm password
        clickOnElement(By.xpath("//input[@name='ConfirmPassword']"));
        // Click on Register button
        driver.findElement(By.xpath("//button[@id='register-button']"));
        // Verify the text'Your registration completed'
        String expectedMessage = "Your registration completed";
        String actualMessage = getTextFromElement(By.xpath("//button[@id='register-button']"));

    }
    @After
    public void tearDown(){
        closeBrowser();
    }


}
