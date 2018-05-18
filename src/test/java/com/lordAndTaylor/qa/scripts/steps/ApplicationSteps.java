package com.lordAndTaylor.qa.scripts.steps;

import com.lordAndTaylor.qa.framework.hooks.BaseSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * Created by Debajyoti Paul on 3/8/2018 at 6:34 PM
 */
public class ApplicationSteps extends BaseSteps {

    @Given("^Not a validated user$")
    public void not_a_validated_user() throws Throwable {
        getLordAndTaylor().homepage().clearCookies();
    }

    @Given("^Not a validated Header and Footer section$")
    public void not_a_validated_Header_and_Footer_section() throws Throwable {
        getLordAndTaylor().homepage().clearCookies();
    }

    @When("^User browse to the site$")
    public void user_browse_to_the_site() throws Throwable {
        getLordAndTaylor().homepage().navigateToApplication();
        getLordAndTaylor().shipToCountry().webDriverUtils().printCurrentURL();
        getLordAndTaylor().shipToCountry().webDriverUtils().printPageTitle();
    }

    @Given("^Not a validated homepage$")
    public void not_a_validated_homepage() throws Throwable {
        getLordAndTaylor().homepage().clearCookies();
    }

}
