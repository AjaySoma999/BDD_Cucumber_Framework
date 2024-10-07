package bdd.factoryPerttern;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverFactory implements WebDriverFactory{


    @Override
    public WebDriver getDriver(String browserName) {
        if (browserName.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }else {
            throw new IllegalArgumentException("in valid browser name : "+browserName);
        }
    }
}
