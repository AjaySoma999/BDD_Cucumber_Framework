package bdd.factoryPerttern;

import org.openqa.selenium.WebDriver;

public interface WebDriverFactory {
    WebDriver getDriver(String browserName);
}
