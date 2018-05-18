package com.lordAndTaylor.qa.scripts.steps;

import com.lordAndTaylor.qa.framework.hooks.BaseSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Debajyoti Paul on 3/8/2018 at 6:35 PM
 */
public class HomePageSteps extends BaseSteps {
    @When("^Closes the Popup window$")
    public void closes_the_Popup_window() throws Throwable {
        getLordAndTaylor().homepage().closeEmailPopUp();
        getLordAndTaylor().homepage().switchToHomePage();
    }

    @Then("^Lord and Taylor Homepage should display$")
    public void lord_and_Taylor_Homepage_should_display() throws Throwable {
        getLordAndTaylor().homepage().verifyPageTitle("Lord & Taylor: Designer Clothing, Shoes, Handbags, Accessories & More", "Homepage");
    }

    @When("^User clicks on the login link$")
    public void user_clicks_on_the_login_link() throws Throwable {
        getLordAndTaylor().homepage().clickSignInLink();
    }

    @Then("^User should get all the image links in proper working order$")
    public void user_should_get_all_the_image_links_in_proper_working_order() throws Throwable {
        getLordAndTaylor().homepage().checkImageLinkStatus();
    }

    @Then("^User should see the first advertisement banner as per the size mentioned in the business document$")
    public void user_should_see_the_first_advertisement_banner_as_per_the_size_mentioned_in_the_business_document() throws Throwable {
        getLordAndTaylor().homepage().verifyFirstBannerWidth();
    }

    @Then("^User should see the exact discount of the third advertisement banner$")
    public void user_should_see_the_exact_discount_of_the_third_advertisement_banner() throws Throwable {
        getLordAndTaylor().homepage().verifyBannerOfferText();
    }

    @When("^User clicks the Father's day gift guide link$")
    public void user_clicks_the_Father_s_day_gift_guide_link() throws Throwable {
        getLordAndTaylor().homepage().clickFathersDayGiftGuideLink();
    }

    @Then("^Father's Day Gift Guide page should display$")
    public void father_s_Day_Gift_Guide_page_should_display() throws Throwable {
        getLordAndTaylor().homepage().verifyFathersGiftGuideNavigation();
    }

}
