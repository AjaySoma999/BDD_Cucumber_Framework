package bdd.stepDefinitions;

import bdd.factory.DriverFactory;
import bdd.pages.FormFillFieldsPage;
import bdd.utilities.ActionUtilities;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;


public class FillGeneralForm {
WebDriver driver;
FormFillFieldsPage formpage;
ActionUtilities ActUtil=new ActionUtilities(driver);
    @Given("^Verify user is in (.+) home page$")
    public void verify_user_is_in_home_page(String data) {
        driver= DriverFactory.getDriver();
        formpage =new FormFillFieldsPage(driver);
        formpage.verifyPageheader(data);
        System.out.println("verify_user_is_in_home_page qwqwqw"+ data);
    }

    @Given("^User enter name in the (.+) test-box$")
    public void user_enter_name_in_the_name_test_box(String name) {

        formpage.enterName(name);
        System.out.println("user_enter_name_in_the_name_testbox "+name);
    }

    @When("^User enter email in the (.+) test-box$")
    public void user_enter_email_in_the_email_test_box(String  email) {
        formpage.enterEmail(email);
        System.out.println("user_enter_email_in_the_email_test_box "+email);
    }

    @When("^User enter valid data in (.+) text-box$")
    public void user_enter_valid_data_in_phone_textbox(String phone) {
        formpage.enterPhone(phone);
        System.out.println("user_enter_valid_data_in_phone_text_box "+phone);
    }

    @When("^User enter valid data in (.+) textbox$")
    public void user_enter_valid_data_in_address_textbox(String address) {
        formpage.alertAcceptafternumber();
        formpage.enterAddress(address);
        System.out.println("user_enter_valid_data_in_address_text_box "+address);
    }

    @When("User click on male radio button in gender fields")
    public void user_click_on_male_radio_button_in_gender_fields() {
        formpage.clickGenderMale();
        System.out.println("user_click_on_male_radio_button_in_gender_fields");
    }

    @Then("User click on monday check box in days fields")
    public void user_click_on_monday_check_box_in_days_fields() {
        formpage.selectDateMonday();
        System.out.println("user_click_on_monday_check_box_in_days_fields");
    }


}
