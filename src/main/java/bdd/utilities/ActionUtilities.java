package bdd.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionUtilities {
    WebDriver driver;
    public ActionUtilities(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement waitForElement(WebElement element,long durationInSeconds) {
        WebElement webElement = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
            webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        }catch(Throwable e) {
            e.printStackTrace();
        }
        return webElement;
    }

    public void selectOptionInDropdown(WebElement element, String dropDownOption, long durationInSeconds) {

        WebElement webElement = waitForElement(element,durationInSeconds);
        Select select = new Select(webElement);
        select.selectByVisibleText(dropDownOption);

    }
    public  void  alertAccept() {
        try {
            Alert alert = driver.switchTo().alert();
            System.out.println();
            alert.accept();

        } catch (NoAlertPresentException e) {
            System.out.println("NoAlertPresentException");
            e.printStackTrace();
        }
    }
}


