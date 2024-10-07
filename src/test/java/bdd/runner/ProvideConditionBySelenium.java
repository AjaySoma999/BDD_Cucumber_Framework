package bdd.runner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class ProvideConditionBySelenium {
   /*   requirement
        ===========
        navigate to url
        enter user name and password
        click on login
        if home page is displayed.
        else throw the user given data in the test result.
        skip the else condition and execute the continue the flow*/

    public static boolean isElementPresent(WebElement locator) {
        try {
            locator.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static boolean ifCondition(WebElement element) {
        if (isElementPresent(element) == true) {
            System.out.println(element + " is Displayed as expectded");
        }
        return isElementPresent(element) == true;
    }

    public static boolean elseIfCondition(WebElement element, boolean previousCondition) {
        if (!previousCondition) {
        } else if (isElementPresent(element) == true) {
            System.out.println(element + " is Displayed as expectded");
        }
        return isElementPresent(element) == true;
    }

    public static void elseCondition(boolean previousCondition, Runnable elseAction) {
        if (!previousCondition) {
            elseAction.run();
        }
}
    public static void endCondition(boolean previousCondition, Runnable action) {
        if (previousCondition) {
            action.run();
        }
    }
  //  public static void main(String[] args) throws IOException {
    @Test
    public void testDemo(){
        try {
    //    ProvideConditionBySelenium selenium= new ProvideConditionBySelenium();
        WebDriverManager.chromedriver().setup();
       // System.setProperty("webdriver.chrome.drive","C:\\Users\\AjayKumarSoma-Kairos\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ajaykumar.s@kairostech.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Paqssword@1");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
   WebElement kitappage=driver.findElement(By.xpath("//div[text()='Kairos intelligent Test Automation Platform']"));

        boolean condition=ifCondition(kitappage);
        endCondition(condition,() ->
                driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ajaykumar.s@kairostech.com"));
    }catch (Exception  e){
            e.printStackTrace();
        }
}
}
