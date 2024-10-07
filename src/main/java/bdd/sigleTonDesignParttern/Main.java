package bdd.sigleTonDesignParttern;


import io.github.sukgu.Shadow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MySession.getInstance().setDriver("chrome");
        WebDriver driver = MySession.getInstance().getDriver();
        driver.get("https://books-pwakit.appspot.com/explore?q=");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Shadow shadow=new Shadow(driver);
        WebElement ele=shadow.findElementByXPath("//input[@aria-label='Search Books']");
        ele.sendKeys("Books");
        shadow.highlight(ele);
        Thread.sleep(2000);
        shadow.findElementByXPath("//div[@class='icon']").click();
        Thread.sleep(5000);
        driver.quit();

    }
}
