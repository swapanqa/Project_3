package com.lordAndTaylor.qa.scripts.steps;

import com.lordAndTaylor.qa.framework.hooks.BaseSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by Debajyoti Paul on 4/18/2018 at 3:10 PM
 */
public class HeaderFooterSteps extends BaseSteps {

    @Then("^User should have all links under Dresses Section in proper working order$")
    public void user_should_have_all_links_under_Dresses_Section_in_proper_working_order() throws Throwable {
        getLordAndTaylor().headerFooter().checkNavMenuLinkStatus();
    }

    @When("^User click the Always free shipping link$")
    public void user_click_the_Always_free_shipping_link() throws Throwable {
        getLordAndTaylor().headerFooter().clickHeaderNotice_Link_3();
    }

    @Then("^Lord and Taylor Buy Online Pick Up In Store page should display$")
    public void lord_and_Taylor_Buy_Online_Pick_Up_In_Store_page_should_display() throws Throwable {
        getLordAndTaylor().headerFooter().verifyHeaderNotice_Link_3();
    }

    @Then("^User should see all the options of navigation bar in capital letters as$")
    public void user_should_see_all_the_options_of_navigation_bar_in_capital_letters_as(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedMenuList = getLordAndTaylor().searchBox().dataTableToArray(data);
        getLordAndTaylor().headerFooter().assertNavMenu(expectedMenuList);
    }

    @Then("^User should see all the options of navigation bar welcome dropdown as$")
    public void user_should_see_all_the_options_of_navigation_bar_welcome_dropdown_as(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedMenuList = getLordAndTaylor().searchBox().dataTableToArray(data);
        getLordAndTaylor().headerFooter().assertMenuContainer(expectedMenuList);
    }

    @Then("^User should have all links under Footer Section in proper working order$")
    public void user_should_have_all_links_under_Footer_Section_in_proper_working_order() throws Throwable {
        getLordAndTaylor().headerFooter().checkFooterSectionLinkStatus();
    }

    @When("^User click the FAQ link$")
    public void user_click_the_FAQ_link() throws Throwable {
        getLordAndTaylor().headerFooter().clickFAQLink();
    }

    @Then("^Lord and Taylor FAQ page should display$")
    public void lord_and_Taylor_FAQ_page_should_display() throws Throwable {
        getLordAndTaylor().headerFooter().verifyPageTitle("Lordandtaylor.com Frequently Asked Questions", "FAQ Page");
    }

    @When("^User enters email in the email subscription box as \"([^\"]*)\"$")
    public void user_enters_email_in_the_email_subscription_box_as(String email) throws Throwable {
        getLordAndTaylor().headerFooter().enterEmailForDailySubscription(email);
    }

    @When("^User clicks on the go button$")
    public void user_clicks_on_the_go_button() throws Throwable {
        getLordAndTaylor().headerFooter().clickGoButton();
    }

    @When("^User enters all the sign up fields with data as$")
    public void user_enters_all_the_sign_up_fields_with_data_as(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        getLordAndTaylor().headerFooter().enterSignUpEmail(data.get(0).get(0));
        getLordAndTaylor().headerFooter().enterSignUpConfirmEmail(data.get(0).get(1));
        getLordAndTaylor().headerFooter().enterSignUpFirstName(data.get(0).get(2));
        getLordAndTaylor().headerFooter().enterSignUpLastName(data.get(0).get(3));
        getLordAndTaylor().headerFooter().enterSignUpZipCode(data.get(0).get(4));
        getLordAndTaylor().headerFooter().selectMonth(data.get(0).get(5));
        getLordAndTaylor().headerFooter().selectDay(data.get(0).get(6));
        getLordAndTaylor().headerFooter().selectYear(data.get(0).get(7));
        getLordAndTaylor().headerFooter().selectGender(data.get(0).get(8));
    }

    @When("^User clicks on the sign up submit button$")
    public void user_clicks_on_the_sign_up_submit_button() throws Throwable {
        getLordAndTaylor().headerFooter().clickSubmitButton();
    }

    @Then("^User should see a Thank You notice$")
    public void user_should_see_a_Thank_You_notice() throws Throwable {
        getLordAndTaylor().headerFooter().verifySignUp();
    }

    @Then("^User should see a Connection Error Message$")
    public void user_should_see_a_Connection_Error_Message() throws Throwable {
        getLordAndTaylor().headerFooter().verifySignUpErrorMessage();
    }

    @Then("^User should see the following options under Shop Lord and Taylor$")
    public void user_should_see_the_following_options_under_Shop_Lord_and_Taylor(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedOptions = getLordAndTaylor().productsPage().dataTableToArray(data);
        getLordAndTaylor().headerFooter().verifyFooterSectionOptionsColumn1(expectedOptions);
    }

    @Then("^User should see the following options under Stores and Corporate$")
    public void user_should_see_the_following_options_under_Stores_and_Corporate(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedOptions = getLordAndTaylor().productsPage().dataTableToArray(data);
        getLordAndTaylor().headerFooter().verifyFooterSectionOptionsColumn2(expectedOptions);
    }

    @Then("^User should see the following options under Shipping and Returns$")
    public void user_should_see_the_following_options_under_Shipping_and_Returns(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedOptions = getLordAndTaylor().productsPage().dataTableToArray(data);
        getLordAndTaylor().headerFooter().verifyFooterSectionOptionsColumn3(expectedOptions);
    }

    @Then("^User should see the following options under Lord and Taylor Credit$")
    public void user_should_see_the_following_options_under_Lord_and_Taylor_Credit(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedOptions = getLordAndTaylor().productsPage().dataTableToArray(data);
        getLordAndTaylor().headerFooter().verifyFooterSectionOptionsColumn4(expectedOptions);
    }

    @Then("^User should see the following social media options in the footer section$")
    public void user_should_see_the_following_social_media_options_in_the_footer_section(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedOptions = getLordAndTaylor().productsPage().dataTableToArray(data);
        getLordAndTaylor().headerFooter().verifySocialMediaOptions(expectedOptions);
    }

    @When("^User click the Lord and Taylor logo$")
    public void user_click_the_Lord_and_Taylor_logo() throws Throwable {
        getLordAndTaylor().headerFooter().clickLordAndTaylorLogo();
    }


}
