package bdd.hooks;

import bdd.factory.DriverFactory;
import bdd.utilities.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Properties;

public class MyHooks {

    WebDriver driver;

    @Before
    public void setup(){
        ConfigReader configReader=new ConfigReader();
     Properties properties= configReader.intializeProperties();
        driver= DriverFactory.initializeBrowser(properties.getProperty("browserName"));
        driver.get(properties.getProperty("applicationUrl"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(configReader.implicitWait));
    }
    @After
    public void teardown(Scenario scenario){

        String scenarioname=scenario.getName().replace(" ","_");
        if (scenario.isFailed()){
            byte[] Srcscreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(Srcscreenshot,"image/png",scenarioname);
        }
        driver.quit();
    }
}
