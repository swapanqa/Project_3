package com.lordAndTaylor.qa.scripts.steps;

import com.lordAndTaylor.qa.framework.hooks.BaseSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by Debajyoti Paul on 4/12/2018 at 3:43 PM
 */
public class UserAccountPageSteps extends BaseSteps {
    @Then("^Lord and Taylor User account page should display$")
    public void lord_and_Taylor_User_account_page_should_display() throws Throwable {
        getLordAndTaylor().userAccountPage().verifyPageTitle("Lordandtaylor.com", "User Account Page");

    }

    @Then("^Login welcome message should display$")
    public void login_welcome_message_should_display() throws Throwable {
        getLordAndTaylor().signInPage().verifySignInSuccessMsg("Debajyoti");
    }

    @When("^User clicks the Credit Card Apply Now link$")
    public void user_clicks_the_Credit_Card_Apply_Now_link() throws Throwable {
        getLordAndTaylor().userAccountPage().clickApplyLink();
    }

    @Then("^Credit Card Apply Now page should display$")
    public void credit_Card_Apply_Now_page_should_display() throws Throwable {
        getLordAndTaylor().userAccountPage().switchToApplyNowPage();
        getLordAndTaylor().userAccountPage().delay(2000);
        getLordAndTaylor().userAccountPage().verifyPageTitle("Lord and Taylor Credit Card - Your Information","Apply Now Page");
    }

    @When("^User clicks the shipping address navigation bar link$")
    public void user_clicks_the_shipping_address_navigation_bar_link() throws Throwable {
        getLordAndTaylor().userAccountPage().clickShippingAddressNavLink();
        getLordAndTaylor().userAccountPage().delay(3000);
    }

    @When("^User clicks the add shipping address link$")
    public void user_clicks_the_add_shipping_address_link() throws Throwable {
        getLordAndTaylor().userAccountPage().clickAddShippingAddressLink();
    }

    @When("^User enters all field with valid data$")
    public void user_enters_all_field_with_valid_data(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        getLordAndTaylor().userAccountPage().selectCountry(data.get(0).get(0));
        getLordAndTaylor().userAccountPage().typeFullName(data.get(0).get(1), data.get(0).get(2));
        getLordAndTaylor().userAccountPage().typeFullAddressAndCity(data.get(0).get(3), data.get(0).get(4));
        getLordAndTaylor().userAccountPage().selectState(data.get(0).get(5));
        getLordAndTaylor().userAccountPage().typeZipCode(data.get(0).get(6));
        getLordAndTaylor().userAccountPage().typePhoneNumber(data.get(0).get(7));
    }

    @When("^User selects default billing address checkbox$")
    public void user_selects_default_billing_address_checkbox() throws Throwable {
        getLordAndTaylor().userAccountPage().selectDefaultBillingAddressCheckBox();
        getLordAndTaylor().userAccountPage().delay(3000);
    }

    @When("^User clicks the submit button$")
    public void user_clicks_the_submit_button() throws Throwable {
        getLordAndTaylor().userAccountPage().clickSubmitButton();
    }

    @Then("^Entire added shipping address should display in Shipping Address Page$")
    public void entire_added_shipping_address_should_display_in_Shipping_Address_Page() throws Throwable {
        getLordAndTaylor().userAccountPage().verifyAddedShippingAddress("Default Shipping:", "123-45 82nd Street"); //Default Shipping Address
        getLordAndTaylor().userAccountPage().delay(3000);
    }

    @Then("^Entire added shipping address should display in Billing Address Page$")
    public void entire_added_shipping_address_should_display_in_Billing_Address_Page() throws Throwable {
        getLordAndTaylor().userAccountPage().verifySameDefaultBillingAndShippingAddress("Default Billing:", "123-45 82nd Street"); //Default Billing Address
    }

    @When("^User clicks the payments navigation bar link$")
    public void user_clicks_the_payments_navigation_bar_link() throws Throwable {
        getLordAndTaylor().userAccountPage().clickPaymentsNavLink();
        getLordAndTaylor().userAccountPage().delay(2000);
    }

    @When("^User clicks the add a new payment link$")
    public void user_clicks_the_add_a_new_payment_link() throws Throwable {
        getLordAndTaylor().userAccountPage().clickAddPaymentLink();
    }

    @When("^User enters all the field with valid data$")
    public void user_enters_all_the_field_with_valid_data(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        getLordAndTaylor().userAccountPage().addFullName(data.get(0).get(0));
        getLordAndTaylor().userAccountPage().addCardInfo(data.get(0).get(1));
        getLordAndTaylor().userAccountPage().enterMonth(data.get(0).get(2));
        getLordAndTaylor().userAccountPage().enterYear(data.get(0).get(3));
    }

    @When("^User clicks the payment submit button$")
    public void user_clicks_the_payment_submit_button() throws Throwable {
        getLordAndTaylor().userAccountPage().clickPaymentSubmitButton();
        getLordAndTaylor().userAccountPage().delay(3000);
    }

    @Then("^Add payment error message should display$")
    public void add_payment_error_message_should_display() throws Throwable {
        getLordAndTaylor().userAccountPage().verifyAddPaymentErrorMsg("Please enter a valid credit card number.");
    }

    @When("^User scrolls to the bottom half of the page$")
    public void user_scrolls_to_the_bottom_half_of_the_page() throws Throwable {
        getLordAndTaylor().userAccountPage().scrollToYourProfile();
        getLordAndTaylor().userAccountPage().delay(3000);
    }

    @When("^User clicks the back to top button$")
    public void user_clicks_the_back_to_top_button() throws Throwable {
        getLordAndTaylor().userAccountPage().clickBackToTopButton();
    }

    @Then("^User should go back to the top of the page$")
    public void user_should_go_back_to_the_top_of_the_page() throws Throwable {
        getLordAndTaylor().userAccountPage().verifyBackToTopOfThePage();
    }

    @Then("^User should see the states dropdown menu options in alphabetical order$")
    public void user_should_see_the_states_dropdown_menu_options_in_alphabetical_order() throws Throwable {
        getLordAndTaylor().userAccountPage().checkStateDropdownAlphabeticalOrder();
    }

    @Then("^User should the following options in the navigation bar$")
    public void user_should_the_following_options_in_the_navigation_bar(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedOptions = getLordAndTaylor().productsPage().dataTableToArray(data);
        getLordAndTaylor().userAccountPage().verifyNavBarOptions(expectedOptions);
    }

    @Then("^User clicks the Order History link$")
    public void user_clicks_the_Order_History_link() throws Throwable {
        getLordAndTaylor().userAccountPage().clickOrderHistoryLink();
    }

    @Then("^The following order history message should display$")
    public void the_following_order_history_message_should_display(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedOptions = getLordAndTaylor().productsPage().dataTableToArrayV2(data);
        getLordAndTaylor().userAccountPage().verifyNoOrderHistoryMsg(expectedOptions);
    }

    @Then("^A shipping address missing field error message should display$")
    public void a_shipping_address_missing_field_error_message_should_display() throws Throwable {
        getLordAndTaylor().userAccountPage().verifyShippingAddressMissingFieldErrorMsg();
    }

    @When("^User selects default shipping address checkbox$")
    public void user_selects_default_shipping_address_checkbox() throws Throwable {
        getLordAndTaylor().userAccountPage().clickDefaultShippingAddress();
    }

    @Then("^User should see name as John Doe$")
    public void user_should_see_name_as_John_Doe() throws Throwable {
        getLordAndTaylor().userAccountPage().verifyNameInAddress1("John Doe");
    }

    @When("^User click on the Edit Link$")
    public void user_click_on_the_Edit_Link() throws Throwable {
        getLordAndTaylor().userAccountPage().clickEditLink();
    }

    @When("^Edit the first name as \"([^\"]*)\"$")
    public void edit_the_first_name_as(String firstName) throws Throwable {
        getLordAndTaylor().userAccountPage().editFirstName(firstName);
    }

    @Then("^User should see updated name as \"([^\"]*)\"$")
    public void user_should_see_updated_name_as(String name) throws Throwable {
        getLordAndTaylor().userAccountPage().verifyNameInAddress1(name);
    }


}
