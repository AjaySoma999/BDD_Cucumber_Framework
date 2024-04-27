package bdd.pages;

import bdd.utilities.ActionUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormFillFieldsPage {
    WebDriver driver;
private ActionUtilities actUitls;

      public FormFillFieldsPage(WebDriver driver){
          this.driver=driver;
          PageFactory.initElements(driver,this);
           actUitls =new ActionUtilities(driver);
      }

    @FindBy(xpath = "//h1[@class='title']")
    private WebElement pageheader;

    @FindBy(xpath = "//label[text()='Name:']/..//input[@id='name']")
    private WebElement name;

    @FindBy(xpath = "//label[text()='Email:']/..//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//label[text()='Phone:']/..//input[@id='phone']")
    private WebElement phone;

    @FindBy(xpath = "//label[text()='Address:']/..//textarea[@id='textarea']")
    private WebElement address;

    @FindBy(xpath = "//label[text()='Gender:']/..//input[@id='male']")
    private WebElement gendermale;

    @FindBy(xpath = "//label[text()='Days:']/..//input[@id='monday']")
    private WebElement clickdaymonday;

    @FindBy(xpath = "//label[text()='Country:']/..//select[@id='country']")
    private WebElement selectcountry;

    @FindBy(xpath = "//label[text()='Colors:']/..//select[@id='colors']")
    private WebElement colors;

    @FindBy(xpath = "//p[text()='Date: ']//input[@id='datepicker']")
    private WebElement date;

    public void verifyPageheader(String expecteddata){
       String actualdata= pageheader.getText();
        actualdata.equalsIgnoreCase(expecteddata);


    }

    public void enterName(String data){
        actUitls.waitForElement(name,10);
        name.sendKeys(data);
    }

    public void enterEmail(String data){
        email.sendKeys(data);
    }

    public void enterPhone(String data){
        phone.sendKeys(data);
    }
    public void enterAddress(String data){
        address.sendKeys(data);
    }

    public void clickGenderMale(){
        gendermale.click();
    }
    public void selectDateMonday(){

       clickdaymonday.click();
    }
    public void selectCountryIndia(){
        String data="India";
        actUitls.selectOptionInDropdown(selectcountry,data,10);
    }

    public void selectcolorsgreen(){
        String data="Green";
        actUitls.selectOptionInDropdown(colors,data,10);
    }

    public void enterDate(){
        String data="04/15/2024";
        date.sendKeys(data);
    }
    public void alertAcceptafternumber(){
        actUitls.alertAccept();

    }



}
