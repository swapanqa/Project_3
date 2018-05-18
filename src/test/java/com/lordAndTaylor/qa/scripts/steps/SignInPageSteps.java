package com.lordAndTaylor.qa.scripts.steps;

import com.lordAndTaylor.qa.framework.hooks.BaseSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

/**
 * Created by Debajyoti Paul on 3/8/2018 at 6:35 PM
 */
public class SignInPageSteps extends BaseSteps {
    @Then("^Lord and Taylor Login page should display$")
    public void lord_and_Taylor_Login_page_should_display() throws Throwable {
        getLordAndTaylor().signInPage().verifyPageTitle("Lordandtaylor.com", "Login Page");
    }

    @When("^User enter user email as \"([^\"]*)\"$")
    public void user_enter_user_email_as(String email) throws Throwable {
        getLordAndTaylor().signInPage().typeEmail(email);
    }

    @When("^User enter user password as \"([^\"]*)\"$")
    public void user_enter_user_password_as(String password) throws Throwable {
        getLordAndTaylor().signInPage().typePassword(password);
    }

    @When("^User clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable {
        getLordAndTaylor().signInPage().clickSignInButton();
    }

    @When("^User clicks on login$")
    public void user_clicks_on_login() throws Throwable {
        getLordAndTaylor().signInPage().clickSignInButtonEx();
    }

    @When("^User login with email and password$")
    public void user_login_with_email_and_password(DataTable dataTable) throws Throwable {
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        if(map.containsKey("EMAIL")){
            getLordAndTaylor().signInPage().typeEmail(map.get("EMAIL"));
        }
        if(map.containsKey("PASSWORD")){
            getLordAndTaylor().signInPage().typePassword(map.get("PASSWORD"));
        }

        getLordAndTaylor().signInPage().clickSignInButtonEx();
        getLordAndTaylor().signInPage().delay(3000);
    }

    @Then("^Login error message should display$")
    public void login_error_message_should_display() throws Throwable {
        getLordAndTaylor().signInPage().verifySignInErrorMsg();
    }

    @Then("^Missing error message should display$")
    public void missing_error_message_should_display() throws Throwable {
        getLordAndTaylor().signInPage().verifyMissingFieldText("This field is required.");
    }

    @When("^User click the Forget Password Link$")
    public void user_click_the_Forget_Password_Link() throws Throwable {
        getLordAndTaylor().signInPage().clickForgetPasswordLink();
    }

    @Then("^Forget Password page should display$")
    public void forget_Password_page_should_display() throws Throwable {
        getLordAndTaylor().homepage().verifyPageTitle("Lordandtaylor.com", "Forget Password Page");
    }

    @When("^When User enter user email as \"([^\"]*)\"$")
    public void when_User_enter_user_email_as(String email) throws Throwable {
        getLordAndTaylor().signInPage().typeEmailForPasswordReset(email);
    }

    @When("^Click the continue button$")
    public void click_the_continue_button() throws Throwable {
        getLordAndTaylor().signInPage().clickContinueButton();
    }

    @Then("^Verification message should display$")
    public void verification_message_should_display() throws Throwable {
        getLordAndTaylor().signInPage().verifyPasswordResetMsg();
    }

    @When("^User enters an invalid order number$")
    public void user_enters_an_invalid_order_number() throws Throwable {
        getLordAndTaylor().signInPage().typeOrderNumber("123456789");
    }

    @When("^User enters a valid zip code$")
    public void user_enters_a_valid_zip_code() throws Throwable {
        getLordAndTaylor().signInPage().typeZipCode("11435");
    }

    @When("^Click the submit button$")
    public void click_the_submit_button() throws Throwable {
        getLordAndTaylor().signInPage().clickSubmitButton();
    }

    @Then("^Error message should display$")
    public void error_message_should_display() throws Throwable {
        getLordAndTaylor().signInPage().verifyErrorMsg();
    }

    //The following sign in method used for the User Account Page
    @When("^User login with valid credentials$")
    public void user_login_with_valid_credentials() throws Throwable {
        getLordAndTaylor().signInPage().signIntoMyAccount();
    }

}
