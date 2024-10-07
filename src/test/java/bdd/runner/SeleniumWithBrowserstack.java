package bdd.runner;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class SeleniumWithBrowserstack {
    public static final String userName="somaajay_BCqjWp";
    public static final String automatKey="auEtPjdY6UgXkex9FbpK";
    public static final String browserStackURL ="http://hub-cloud.browserstack.com/wd/hub";

    @Test
    public void setup() throws MalformedURLException, InterruptedException, UnsupportedEncodingException {

        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("browserstack.user", "somaajay_BCqjWp");
        caps.setCapability("browserstack.key", "auEtPjdY6UgXkex9FbpK");
        caps.setCapability("browserstack.debug","true");
        caps.setCapability("browserstack.local","false");
        caps.setCapability("device","Google Pixel 6 Pro");
        caps.setCapability("os","android");
        caps.setCapability("os_version","13.0");
        caps.setCapability("Project","API demo App Automation");
        caps.setCapability("build","5.1");
        caps.setCapability("name","BrowserStack Test");
        //get the app kay value from the cmd
        caps.setCapability("app","bs://0961c4d0720f66198585a3f93fa0dc31eaf49758");
        AndroidDriver driver=new AndroidDriver(new URL("http://hub-cloud.browserstack.com/wd/hub"),caps);
        Thread.sleep(2000);
        driver.quit();

    }
}
/*        "Android": {
            "browserstack.user": "YOUR_USERNAME",
                    "browserstack.key": "YOUR_KEY",
                    "device": "Samsung Galaxy S21",
                    "os_version": "11.0",
                    "browserstack.debug": "true",
                    "browserstack.local": false,
                    "app": "Your_APP_URL"
        },*/
