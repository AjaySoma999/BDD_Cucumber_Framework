package bdd.pages;

import bdd.utilities.ActionUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetValueAttributePage {
    WebDriver driver;
    private ActionUtilities act;

    public GetValueAttributePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        act = new ActionUtilities(driver);
    }

    @FindBy(xpath = "//input[@id='field1']")
    private WebElement field1;

    @FindBy(xpath = "//input[@id='field2']")
    private WebElement field2;


    public void getValueFromfield1(String data) {
        try {
            act.scrollToMiddleOfElement(field1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit(); // Close the WebDriver instance to release resources
            }
        }

        String actual_value = field1.getAttribute("value");
        System.out.println(actual_value + "----" + data);
     /*   if (actual_value.equalsIgnoreCase(data)){
            System.out.println("Get value from field1 : "+data);
        }
        else if (actual_value!=null && actual_value==""){
            System.out.println("The value is null or empty  : "+data);
        }
        else {
            System.out.println("value execuption");
        }*/
    }

    public void enterDatainField2(String data) {
        field2.sendKeys(data);
    }

    public void getValuefield2(String data) {
        String actual_value = field2.getAttribute("value");
        if (actual_value.equalsIgnoreCase(data)) {
            System.out.println("Get value from field2 : " + data);
        } else if (actual_value != null && actual_value == "") {
            System.out.println("The value is null or empty  : " + data);
        } else {
            System.out.println("value execuption");
        }
    }
}
