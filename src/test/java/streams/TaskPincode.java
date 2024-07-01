package streams;

import io.cucumber.java.zh_cn.而且;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v113.runtime.Runtime;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;
import java.util.Optional;

public class TaskPincode {
        /*WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        final String zipcodetext = "//span[contains(text(),'Zip codes')]";
        final String Zipnumberwithtaga = "//a[contains(text(),'5') or contains(text(),'1') or contains(text(),'0') or contains(text(),'2') or contains(text(),'3')]";
        final String Zipnumberwithtagdiv = "//div[contains(text(),'5') or contains(text(),'1') or contains(text(),'0') or contains(text(),'2') or contains(text(),'3')]";
        By ZIPCODEtaga = RelativeLocator.with(By.xpath(zipcodetext)).below(By.xpath(Zipnumberwithtaga));
        By ZIPCODEtagdiv = RelativeLocator.with(By.xpath(zipcodetext)).below(By.xpath(Zipnumberwithtagdiv));

        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Asia, India, Andhra Pradesh, Banganapalle zip code", Keys.ENTER);
try {

    WebElement ele1 = driver.findElement(ZIPCODEtaga);
    WebElement ele2 = driver.findElement(ZIPCODEtagdiv);

    if (ele1 != null && ele1.isDisplayed()) {
        String gettext = ele1.getText();
        System.out.println(gettext);
    } else if (ele2 != null && ele2.isDisplayed()) {
        String gettext = ele2.getText();
        System.out.println(gettext);
    } else {
        System.out.println("wrong xpath");
    }
}
catch (NoSuchElementException e){
    System.out.println("nosuchele" );
}
    }*/
        public static void main(String[] args) {

        }

}