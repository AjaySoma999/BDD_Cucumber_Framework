package bdd.sigleTonDesignParttern;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class MySession {
    private  WebDriver driver;
    private static MySession instance;

    private MySession(){
    }

    public static MySession getInstance() {
        if(instance==null) {
            synchronized (MySession.class) {
                instance = new MySession();
            }
        }
            return instance;
        }
    public void setDriver(String browser){
        switch (browser.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver=new ChromeDriver(options);
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;
            default:
                throw new InvalidArgumentException("Invalid Browser Name");
        }
    }

    public WebDriver getDriver(){
      return driver;
    }

}
