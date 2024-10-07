package bdd.runner;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStack {

/*    somaajay_BCqjWp auEtPjdY6UgXkex9FbpK*/
    public static final String UserName = "somaajay_BCqjWp";
    public static final String AutomateKey = "auEtPjdY6UgXkex9FbpK";
    public static final String URL = "https://" + UserName + ":" + AutomateKey + "@hub-cloud.browserstack.com/wd/hub";

    @Test
    public void Setup() throws MalformedURLException    {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("deviceName","Google Pixel 6 Pro");
        caps.setCapability("os_version","13.0");
        caps.setCapability("Project","BrowserStack Sample");
        caps.setCapability("build","browserstack-build-1");
        caps.setCapability("name","sample test");
        //caps.setCapability("app","bs://6cbd454ddd06ca200f0a70539fb1aab12519f2d9");
        caps.setCapability("app","bs://0961c4d0720f66198585a3f93fa0dc31eaf49758");
        //AndroidDriver Driver = new AndroidDriver(new URL(URL),caps);
        AndroidDriver Driver = new AndroidDriver(new URL(URL),caps);
        Driver.quit();

    }
}
