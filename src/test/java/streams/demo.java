package streams;

import bdd.utilities.ActionUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.devtools.v113.runtime.Runtime;
import java.time.Duration;
import java.util.List;
import java.util.Optional;

public class demo {
    WebDriver driver;

    ActionUtilities actions;
    public static void scrollToMiddleOfElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        int windowHeight = driver.manage().window().getSize().getHeight();
        int elementPosition = element.getLocation().getY();
        int yOffset = elementPosition - (windowHeight / 2);
        js.executeScript("window.scrollTo(0, arguments[0]);", yOffset);
    }
    @Test
    public void KitapActionmethods() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://20.59.29.222:81/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kitap2@kairostech.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password@1");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
         actions=new ActionUtilities(driver);
        WebElement confirm =driver.findElement(By.xpath("//button[text()='Confirm']"));
        actions.waitForElement(confirm, 15);
        confirm.click();
        driver.findElement(By.xpath("//p[text()='WEB']")).click();
        driver.findElement(By.xpath("(//span[text()='Test Cases']//ancestor::div[@class=\"ag-root ag-unselectable ag-layout-normal\"]//descendant::div[@col-id=\"noOfTestCases\"]//a)[1]")).click();
        driver.findElement(By.xpath("(//button[@aria-label=\"Edit\"]//*[@data-testid=\"EditOutlinedIcon\" and name()='svg'])[1]")).click();
        Actions act=new Actions(driver);
        WebElement click_click=driver.findElement(By.xpath("(//div[text()='Open Browser'])[2]"));
        actions.waitForElement(click_click,10);
        act.doubleClick(click_click).perform();

        List<WebElement> element= driver.findElements(By.xpath("//div[@class=\"ag-rich-select-row\" and @role=\"presentation\"]//div"));
        for(WebElement l:element ){

    System.out.println("data list : "+l.getText());

        }

    }

   /* public static void main(String []args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement field2=driver.findElement(By.xpath("//input[@id='field2']"));
        Thread.sleep(5000);
       JavascriptExecutor js = (JavascriptExecutor) driver;
     //   js.executeScript("arguments[0].scrollIntoView();", field1);

        scrollToMiddleOfElement(driver,field1);
        Thread.sleep(5000);
        String data1=field1.getAttribute("value");
        System.out.println("GetVlaueAttribute data "+data1);
        field2.sendKeys("ajay");
        String data2=field2.getAttribute("value");
        if (data2==null && data2=="") {
            System.out.println("null");
        }
        else {
            System.out.println("GetVlaueAttribute data " + data2);
        }
        driver.findElement(By.xpath("//input[@id='field2']"));
        driver.quit();

    }*/
    @Test
    public void asdsd(){

  System.setProperty("webdriver.chrome.driver", "C:\\Users\\AjayKumarSoma-Kairos\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--auto-open-devtools-for-tabs");
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver(options);
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();
        // Navigate to a webpage
        driver.get("http://20.59.29.222:81/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        // User input: element tag and text
        String elementTag = "input";
        String elementText = "Email Address";

        // JavaScript to find the element and get nearby elements
        String script = String.format(
                "var elements = document.querySelectorAll('%s');" +
                        "for (var i = 0; i < elements.length; i++) {" +
                        "    if (elements[i].value.includes('%s') || elements[i].textContent.includes('%s')) {" +
                        "        var element = elements[i];" +
                        "        var previous = element.previousElementSibling ? element.previousElementSibling.outerHTML : 'None';" +
                        "        var next = element.nextElementSibling ? element.nextElementSibling.outerHTML : 'None';" +
                        "        return {previous: previous, next: next};" +
                        "    }" +
                        "}" +
                        "return {previous: 'None', next: 'None'};",
                elementTag, elementText, elementText
        );

        // Execute the script using Runtime.evaluate
        Runtime.EvaluateResponse response = devTools.send(
                Runtime.evaluate(script,  Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty()));
        // Get the result
        String result = response.getResult().getValue().toString();
        System.out.println("Nearby Elements: " + result);

        // Clean up
      //  driver.quit();

    }
}
 /* public static void main(String[] args) {
       // Set up Chrome options
    //   System.setProperty("webdriver.chrome.driver", "C:\\Users\\AjayKumarSoma-Kairos\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       ChromeOptions options = new ChromeOptions();
       options.addArguments("--auto-open-devtools-for-tabs");
       // Initialize WebDriver
       WebDriver driver = new ChromeDriver(options);


       DevTools devTools = ((HasDevTools) driver).getDevTools();
       devTools.createSession();

       // Navigate to a webpage
       driver.get("http://20.59.29.222:81/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       // User input: element tag and text
       String elementTag = "input";
       String elementText = "Email Address";

       // JavaScript to find the element and get nearby elements
       String script = String.format(
               "var elements = document.querySelectorAll('%s');" +
                       "for (var i = 0; i < elements.length; i++) {" +
                       "    if (elements[i].value.includes('%s') || elements[i].textContent.includes('%s')) {" +
                       "        var element = elements[i];" +
                       "        var previous = element.previousElementSibling ? element.previousElementSibling.outerHTML : 'None';" +
                       "        var next = element.nextElementSibling ? element.nextElementSibling.outerHTML : 'None';" +
                       "        return {previous: previous, next: next};" +
                       "    }" +
                       "}" +
                       "return {previous: 'None', next: 'None'};",
               elementTag, elementText, elementText
       );

       // Execute the script using Runtime.evaluate
       Runtime.EvaluateResponse response = devTools.send(
               Runtime.evaluate(script,  Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty()));
       // Get the result
       String result = response.getResult().getValue().toString();
       System.out.println("Nearby Elements: " + result);

       // Clean up
       driver.quit();
   }
   }
*/