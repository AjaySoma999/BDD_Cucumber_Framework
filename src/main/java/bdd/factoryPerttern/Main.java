package bdd.factoryPerttern;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.openqa.selenium.WebDriver;

import java.nio.file.Paths;

public class Main {
   public static WebDriver driver=null;
    public static void main(String[] args) throws InterruptedException {
        /*ChromeDriverFactory factory=new ChromeDriverFactory();
        driver=factory.getDriver("chrome");
        driver.get("https://google.com");
        Thread.sleep(5000);
        driver.quit();*/
        Playwright playwright = Playwright.create();
        try (Browser browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false))) { // Set headless to false to see the browser
            Page page = browser.newPage();
            page.navigate("http://localhost:3000/login"); // Replace with the URL you want to test

            // Wait for a specific element to be visible (optional)
         //   page.waitForSelector(".some-selector", new Page.WaitForSelectorOptions().setTimeout(5000));

            // Interact with elements on the page
            page.fill("#email","ajaykumar.s@kairostech.com");
            page.fill("input[id=':r1:']", "Passwor1");
            page.click("button[id=':r2:']");

            //  page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshot.png")));

            // Wait for some time (optional)
            Thread.sleep(2000);

            page.close();
        } finally {
            playwright.close();
        }
    }
}
