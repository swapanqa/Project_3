package com.lordAndTaylor.qa.scripts.steps;

import com.lordAndTaylor.qa.framework.hooks.BaseSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by Debajyoti Paul on 4/20/2018 at 2:55 PM
 */
public class InternationalShippingSteps extends BaseSteps {


    @Given("^Not a validated ship to other country functionality$")
    public void not_a_validated_ship_to_other_country_functionality() throws Throwable {
        getLordAndTaylor().shipToCountry().clearCookies();
    }

    @When("^User click on ship to country link$")
    public void user_click_on_ship_to_country_link() throws Throwable {
        getLordAndTaylor().shipToCountry().clickOnShipToCountryLink();
    }

    @Then("^International Shipping page should display$")
    public void international_Shipping_page_should_display() throws Throwable {
        getLordAndTaylor().shipToCountry().verifyShipToCountryPage();
    }

    @When("^User selects the country as \"([^\"]*)\"$")
    public void user_selects_the_country_as(String country) throws Throwable {
        getLordAndTaylor().shipToCountry().selectCountry(country);
    }

    @When("^User selects the currency as \"([^\"]*)\"$")
    public void user_selects_the_currency_as(String currency) throws Throwable {
        getLordAndTaylor().shipToCountry().selectCurrency(currency);
    }

    @When("^User click on the international shipping save and continue button$")
    public void user_click_on_the_international_shipping_save_and_continue_button() throws Throwable {
        getLordAndTaylor().shipToCountry().clickSaveAndContinue();
    }

    @When("^User closes the pop up window$")
    public void user_closes_the_pop_up_window() throws Throwable {
        getLordAndTaylor().shipToCountry().closePopUp();
    }

    @Then("^User should see the Indian flag in the top corner of the page$")
    public void user_should_see_the_Indian_flag_in_the_top_corner_of_the_page() throws Throwable {
        getLordAndTaylor().shipToCountry().verifyCountrySwitch("IN");
    }

    @When("^User click on the back to US site button$")
    public void user_click_on_the_back_to_US_site_button() throws Throwable {
        getLordAndTaylor().shipToCountry().clickBackToUSASite();
    }

    @Then("^User should see the USA flag in the top corner of the page$")
    public void user_should_see_the_USA_flag_in_the_top_corner_of_the_page() throws Throwable {
        getLordAndTaylor().shipToCountry().verifyCountrySwitch("US");
    }

    @Then("^User should see the price of the products in Indian Rupee$")
    public void user_should_see_the_price_of_the_products_in_Indian_Rupee() throws Throwable {
        getLordAndTaylor().shipToCountry().verifyProductPriceCurrency();
    }

    @Then("^User should see the following notice$")
    public void user_should_see_the_following_notice(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedNotice = new String[data.size()];
        for(int i=0; i<data.size(); i++){
            for(int j=0; j<data.get(i).size(); j++){
                System.out.println("Expected Notice #" + (i+1) + " -- " + data.get(i).get(j));
                expectedNotice[i] = data.get(i).get(j);
            }
        }

        getLordAndTaylor().shipToCountry().verifyInternationalShippingNotice(expectedNotice);
    }

}
