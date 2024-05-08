package bdd.stepDefinitions;

import bdd.pages.GetValueAttributePage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class GetValueAttribute {
    WebDriver driver;
    GetValueAttributePage getatt;

    @Given("^Verify user is able to get the value (.+) from the value attribute with contains data in the text field$")
    public void verify_user_is_able_to_get_the_value_from_the_value_attribute_with_contains_data_in_the_text_field(String data) {
        getatt =new GetValueAttributePage(driver);
        getatt.getValueFromfield1(data);
    }

    @When("^Enter data (.+) in field2 text field$")
    public void enter_data_in_field2_text_field(String data) {
        getatt.enterDatainField2(data);
    }

    @When("^Verify user is able to get the value (.+) from the id there is no value attribute with contains data in the text field$")
    public void verify_user_is_able_to_get_the_value_from_the_id_there_is_no_value_attribute_with_contains_data_in_the_text_field(String data) {
        getatt.getValuefield2(data);
    }

}
