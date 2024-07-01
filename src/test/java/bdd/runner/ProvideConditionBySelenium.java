package bdd.runner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class ProvideConditionBySelenium {
   static WebDriver driver;
   /*   requirement
        ===========
        navigate to url
        enter user name and password
        click on login
        if home page is displayed.
        else throw the user given data in the test result.
        skip the else condition and execute the continue the flow*/

    public StringBuilder ifCondition(WebDriver driver, WebElement element){
        driver=this.driver;
        StringBuilder result =new StringBuilder() ;
        boolean isDisplayed=element.isDisplayed();
        if (isDisplayed==true){
            System.out.println(element+" is Displayed as expectded");
            result.append(element).append(" is Displayed as expectded");
        }
        else {
            System.out.println(element+" is not Displayed as expected");
            Assert.assertTrue(isDisplayed);
            result.append(element).append(" is not Displayed as expected");
        }
        return result;
    }



    public static void main(String[] args) {
        ProvideConditionBySelenium selenium= new ProvideConditionBySelenium();
        WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();

        driver.get("http://20.59.29.222:81/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ajaykumar.s@kairostech.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password@1");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
   WebElement kitappage=driver.findElement(By.xpath("//div[text()='Kairos intelligent Test Automation Platform']"));

        StringBuilder output=selenium.ifCondition(driver,kitappage);


    }
}
