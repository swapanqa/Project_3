package com.lordAndTaylor.qa.scripts.steps;

import com.lordAndTaylor.qa.framework.hooks.BaseSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by Debajyoti Paul on 4/19/2018 at 3:07 PM
 */
public class SearchBoxSteps extends BaseSteps {

    @Given("^Not a validated search box$")
    public void not_a_validated_search_box() throws Throwable {
        getLordAndTaylor().searchBox().clearCookies();
    }

    @When("^User enters as \"([^\"]*)\" in the search box$")
    public void user_enters_as_in_the_search_box(String text) throws Throwable {
        getLordAndTaylor().searchBox().enterSearchText(text);
    }

    @When("^User enters \"([^\"]*)\" in the search box$")
    public void user_enters_in_the_search_box(String text) throws Throwable {
        getLordAndTaylor().searchBox().enterSearchText(text);
    }

    @When("^User clicks on search button$")
    public void user_clicks_on_search_button() throws Throwable {
        getLordAndTaylor().searchBox().clickSearchButton();
    }

    @Then("^User should see Search page header containing the same text that is entered in search box$")
    public void user_should_see_Search_page_header_containing_the_same_text_that_is_entered_in_search_box() throws Throwable {
        getLordAndTaylor().searchBox().verifySearchResultHeader("SEARCH RESULTS \"MEN'S NIKE AIR\"");
    }

    @Then("^User should see the following six items$")
    public void user_should_see_the_following_six_items(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedItems = getLordAndTaylor().searchBox().dataTableToArray(data);
        getLordAndTaylor().searchBox().verifySearchResultItems(expectedItems);
    }

    @When("^User clicks on dropdown box button$")
    public void user_clicks_on_dropdown_box_button() throws Throwable {
        getLordAndTaylor().searchBox().clickDropdownInSearchBox();
    }

    @Then("^User should see the following dropdown options within the search box$")
    public void user_should_see_the_following_dropdown_options_within_the_search_box(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedItems = getLordAndTaylor().searchBox().dataTableToArray(data);
        getLordAndTaylor().searchBox().verifyDropDownOptions(expectedItems);
    }

    @When("^User select \"([^\"]*)\" from Dropdown option$")
    public void user_select_from_Dropdown_option(String data) throws Throwable {
        getLordAndTaylor().searchBox().selectAdvancedOption(data);
    }

    @Then("^User should see Search page header containing the same text that is entered$")
    public void user_should_see_Search_page_header_containing_the_same_text_that_is_entered() throws Throwable {
        getLordAndTaylor().searchBox().verifySearchResultHeader("SEARCH RESULTS \"NIKE AIR\"");
    }

    @Then("^User should see the following eight items$")
    public void user_should_see_the_following_eight_items(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedItems = getLordAndTaylor().searchBox().dataTableToArray(data);
        getLordAndTaylor().searchBox().verifyAdvancedSearchResultItems(expectedItems);
    }

    @Then("^User should see a No Results Found message$")
    public void user_should_see_a_No_Results_Found_message() throws Throwable {
        getLordAndTaylor().searchBox().verifyInvalidSearchErrorMessage();
    }

    @When("^User click Featured shops link$")
    public void user_click_Featured_shops_link() throws Throwable {
        getLordAndTaylor().searchBox().clickFeaturedShopsLink();
    }

    @Then("^User should see the following six search results$")
    public void user_should_see_the_following_six_search_results(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedItems = getLordAndTaylor().searchBox().dataTableToArray(data);
        getLordAndTaylor().searchBox().verifyAdvancedSearchResultItems(expectedItems);
    }

    @When("^User click on color tab$")
    public void user_click_on_color_tab() throws Throwable {
        getLordAndTaylor().searchBox().clickColorTab();
    }

    @When("^User selects blue color$")
    public void user_selects_blue_color() throws Throwable {
        getLordAndTaylor().searchBox().clickColorOption();
    }

    @When("^User clicks on apply button$")
    public void user_clicks_on_apply_button() throws Throwable {
        getLordAndTaylor().searchBox().clickApplyButton();
    }

    @Then("^User should see the following three results as$")
    public void user_should_see_the_following_three_results(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedItems = getLordAndTaylor().searchBox().dataTableToArray(data);
        getLordAndTaylor().searchBox().verifyAdvancedSearchResultItems(expectedItems);
    }

    @When("^User enters \"([^\"]*)\" with spaces in between characters in the search box$")
    public void user_enters_with_spaces_in_between_characters_in_the_search_box(String text) throws Throwable {
        getLordAndTaylor().searchBox().enterSearchText(text);
    }

    @When("^User enters \"([^\"]*)\" having spaces before and after the keyword in the search box$")
    public void user_enters_having_spaces_before_and_after_the_keyword_in_the_search_box(String text) throws Throwable {
        getLordAndTaylor().searchBox().enterSearchText(text);
    }

    @When("^User presses the Enter button$")
    public void user_presses_the_Enter_button() throws Throwable {
        getLordAndTaylor().searchBox().pressEnterKey();
    }

    @Then("^User should see four products$")
    public void user_should_see_four_products() throws Throwable {
        getLordAndTaylor().searchBox().verifyTotalSearchItems();
    }

    @When("^When user clicks the cancel filter button$")
    public void User_clicks_the_cancel_filter_button() throws Throwable {
       getLordAndTaylor().searchBox().clickCancelFilterButton();
    }

    @When("^User clicks the cancel filter button$")
    public void user_clicks_the_cancel_filter_button() throws Throwable {
        getLordAndTaylor().searchBox().clickCancelFilterButton();
    }


}
