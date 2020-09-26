package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
//import selenium driver
    private WebDriver driver;
//import chrome driver
 public void setUp()throws InterruptedException{
     System.setProperty ("webdriver.chrome.driver","resources/chromedriver.exe");
     driver = new ChromeDriver ();
 //input Project URL = Postman
    driver.get("https://identity.getpostman.com/login?addAccount=1");
 //wait to load page
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//maximize project page
     driver.manage().window().maximize();
 //Get project page Title
    System.out.println(driver.getTitle());
 //Locate username field
    driver.findElement(By.id("username")).sendKeys("MOUNTAINTESTER");
 //Locate password field
 driver.findElement(By.id ("password")).sendKeys("MOUNTAIN12");
 //CLICK ON SIGN IN BUTTON
     driver.findElement(By.id("sign-in-btn")).click();
 //wait
 Thread.sleep(10000);
 //close window
     driver.quit();

 }
 //initiate
    public static void main(String args[]) throws InterruptedException {
     LoginTests tests = new LoginTests();
     tests.setUp();
    }
}
