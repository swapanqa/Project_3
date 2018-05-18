package com.lordAndTaylor.qa.scripts.steps;

import com.lordAndTaylor.qa.framework.hooks.BaseSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by Debajyoti Paul on 4/15/2018 at 4:33 PM
 */
public class RegisterUserPageSteps extends BaseSteps {

    @When("^User clicks on the Create Account link$")
    public void user_clicks_on_the_Create_Account_link() throws Throwable {
        getLordAndTaylor().signInPage().clickCreateAccountLink();
    }

    @Then("^Lord and Taylor Create New Account page should display$")
    public void lord_and_Taylor_Create_New_Account_page_should_display() throws Throwable {
        getLordAndTaylor().signInPage().verifyPageTitle("Lordandtaylor.com", "Create Account Page");
    }

    @When("^User enter all the fields with valid data$")
    public void user_enter_all_the_fields_with_valid_data(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        getLordAndTaylor().registerUser().typeFullName(data.get(0).get(0), data.get(0).get(1));
        getLordAndTaylor().registerUser().typeEmail(data.get(0).get(2));
        getLordAndTaylor().registerUser().typePassword(data.get(0).get(3), data.get(0).get(4));
        getLordAndTaylor().registerUser().typeZipCode(data.get(0).get(5));
        getLordAndTaylor().registerUser().delay(3000);
    }

    @When("^Click on the create account button$")
    public void click_on_the_create_account_button() throws Throwable {
        getLordAndTaylor().registerUser().clickCreateAccountButton();
        getLordAndTaylor().registerUser().delay(2000);
    }

    @Then("^Registration welcome message should display$")
    public void registration_welcome_message_should_display() throws Throwable {
        getLordAndTaylor().registerUser().verifyRegistrationSuccess("Debajyoti");
    }

    @When("^Canadian user enter all the field boxes with valid data$")
    public void canadian_user_enter_all_the_field_boxes_with_valid_data(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        getLordAndTaylor().registerUser().typeFullName(data.get(0).get(0), data.get(0).get(1));
        getLordAndTaylor().registerUser().typeEmail(data.get(0).get(2));
        getLordAndTaylor().registerUser().typePassword(data.get(0).get(3), data.get(0).get(4));
        getLordAndTaylor().registerUser().typeZipCode(data.get(0).get(5));
    }

    @When("^Click on canadian user radio button$")
    public void click_on_canadian_user_radio_button() throws Throwable {
        getLordAndTaylor().registerUser().registerAsCanadianUser();
    }

    @Then("^An electronic marketing communications notice should display$")
    public void an_electronic_marketing_communications_notice_should_display() throws Throwable {
        getLordAndTaylor().registerUser().verifyCanadianUserNotice();
        getLordAndTaylor().registerUser().delay(3000);
    }

    @When("^User enter some of the fields with valid data$")
    public void user_enter_some_of_the_fields_with_valid_data(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        getLordAndTaylor().registerUser().typeFullName(data.get(0).get(0), data.get(0).get(1));
        getLordAndTaylor().registerUser().typeEmail(data.get(0).get(2));
        getLordAndTaylor().registerUser().typePassword(data.get(0).get(3), data.get(0).get(4));
        getLordAndTaylor().registerUser().typeZipCode(data.get(0).get(5));
        getLordAndTaylor().registerUser().delay(3000);
    }

    @Then("^Registration error message should display$")
    public void registration_error_message_should_display() throws Throwable {
        getLordAndTaylor().registerUser().verifyInvalidOrIncorrectFieldText("This field is required.");
    }

    @Then("^Password error message should display$")
    public void password_error_message_should_display() throws Throwable {
        getLordAndTaylor().registerUser().verifyInvalidOrIncorrectFieldText("Password must match.");
    }

    @When("^User enter different password and confirm password fields$")
    public void user_enter_different_password_and_confirm_password_fields(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        getLordAndTaylor().registerUser().typeFullName(data.get(0).get(0), data.get(0).get(1));
        getLordAndTaylor().registerUser().typeEmail(data.get(0).get(2));
        getLordAndTaylor().registerUser().typePassword(data.get(0).get(3), data.get(0).get(4));
        getLordAndTaylor().registerUser().typeZipCode(data.get(0).get(5));
        getLordAndTaylor().registerUser().delay(3000);
    }

    @When("^User enter special characters in first or last name fields$")
    public void user_enter_special_characters_in_first_or_last_name_fields(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        getLordAndTaylor().registerUser().typeFullName(data.get(0).get(0), data.get(0).get(1));
        getLordAndTaylor().registerUser().typeEmail(data.get(0).get(2));
        getLordAndTaylor().registerUser().typePassword(data.get(0).get(3), data.get(0).get(4));
        getLordAndTaylor().registerUser().typeZipCode(data.get(0).get(5));
        getLordAndTaylor().registerUser().delay(3000);
    }

    @Then("^Invalid characters error message should display$")
    public void invalid_characters_error_message_should_display() throws Throwable {
        getLordAndTaylor().registerUser().verifyInvalidOrIncorrectFieldText("Please enter a valid last name.");
    }

    @When("^User clicks the Terms and Conditions Link$")
    public void user_clicks_the_Terms_and_Conditions_Link() throws Throwable {
        getLordAndTaylor().registerUser().clickTermsAndConditionsLink();
    }

    @Then("^Terms and conditions page should display$")
    public void terms_and_conditions_page_should_display() throws Throwable {
        getLordAndTaylor().registerUser().switchToTermsAndConditionsPage();
        getLordAndTaylor().registerUser().verifyPageTitle("Lordandtaylor.com Legal Terms", "Terms and Conditions Page");
    }

    @When("^User clicks the cancel button$")
    public void user_clicks_the_cancel_button() throws Throwable {
        getLordAndTaylor().registerUser().clickCancelButton();
    }

    @Then("^Sign In page should display$")
    public void sign_In_page_should_display() throws Throwable {
        getLordAndTaylor().registerUser().verifySignInPageText();
    }

}
