package bdd.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.D


public class ActionUtilities {

    WebDriver driver;
    public ActionUtilities(WebDriver driver) {
        this.driver = driver;

    }
   /*
   waitForElement :
   Wait operation for webelement by using explicet wait
   With provided durationInSeconds
   */
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
    /*
    selectOptionInDropdown:
    select the the dropdown field by selectByVisibleText method
    and also waitForElement is applyed
    */
    public void DropDown(WebElement element, String dropDownOption, long durationInSeconds) {

        WebElement webElement = waitForElement(element,durationInSeconds);
        Select select = new Select(webElement);
        select.selectByVisibleText(dropDownOption);

    }

   public void Click(WebElement element){



   }


}
