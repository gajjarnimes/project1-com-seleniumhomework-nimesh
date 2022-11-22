package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class TopMenuTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        // click on the 'Coumputers'tab
        clickOnElement(By.linkText("Computers"));
        //Verify the text'Computers'
        clickOnElement(By.xpath("//a[@href='/computers']"));
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        // click on the 'Electronics' Tab
        clickOnElement(By.linkText("Electronics"));
        // Verify the text'Electronics'
        clickOnElement(By.xpath("//a[@href='/electronics']"));
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfull(){
        // click on the 'Apparel' tab
        clickOnElement(By.linkText("Apparel"));
        // Verify the text'Apparel'
        clickOnElement(By.xpath("//a[@ href='/apparel']"));
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull(){
        // click on the 'Digital Download' tab
        clickOnElement(By.linkText("Digital downloads"));
        // Verify the text'Digital Download'
        clickOnElement(By.xpath("//a[@ href='/digital-downloads']"));
    }
    @Test
    public void userShouldNavigateToBookPageSuccessfully(){
        // click on the'Books' tab
        clickOnElement(By.linkText("Books"));
        // Verify the text'Books'
        clickOnElement(By.xpath("//a[@ href='/books']"));
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        // click on the 'Jewelry' tab
        clickOnElement(By.linkText("Jewelry"));
        // Verify the text'Jewelry'
        clickOnElement(By.xpath("//a[@ href='/jewelry']"));
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        // click on the 'Gift cards' tab
        clickOnElement(By.linkText("Gift Cards"));
        // Verify the text'Gift cards'
        clickOnElement(By.xpath("//a[@href='/gift-cards']"));
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
