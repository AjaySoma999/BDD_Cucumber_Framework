package bdd.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
public final long implicitWait=10;

    public Properties intializeProperties(){
        Properties prop=new Properties();
        File profile=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\Config.properties");
        try {
        FileInputStream fis = new FileInputStream(profile);
            prop.load(fis);
        } catch (Throwable e) {
           e.printStackTrace();
        }
        return prop;
    }
}
