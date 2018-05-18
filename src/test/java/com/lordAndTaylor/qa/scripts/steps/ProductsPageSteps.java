package com.lordAndTaylor.qa.scripts.steps;

import com.lordAndTaylor.qa.framework.hooks.BaseSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by Debajyoti Paul on 4/19/2018 at 7:55 PM
 */
public class ProductsPageSteps extends BaseSteps {

    @Given("^Not a validated Products Page$")
    public void not_a_validated_Products_Page() throws Throwable {
        getLordAndTaylor().productsPage().clearCookies();
    }

    @When("^User hover over the men section in navigation bar$")
    public void user_hover_over_the_men_section_in_navigation_bar() throws Throwable {
        getLordAndTaylor().productsPage().hoverToMenInNavBar();
    }

    @When("^User click on the Nike Link$")
    public void user_click_on_the_Nike_Link() throws Throwable {
        getLordAndTaylor().productsPage().clickNikePage();
    }

    @Then("^Nike products page should display$")
    public void nike_products_page_should_display() throws Throwable {
        getLordAndTaylor().productsPage().verifyNikeProductPage();
    }

    @Then("^User should see the exact number of products shown at the top of the page$")
    public void user_should_see_the_exact_number_of_products_shown_at_the_top_of_the_page() throws Throwable {
        getLordAndTaylor().productsPage().verifyTotalItemsDisplayedInPageOne();
    }

    @Then("^User should see the following filter options$")
    public void user_should_see_the_following_filter_options(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedItems = getLordAndTaylor().productsPage().dataTableToArray(data);
        getLordAndTaylor().productsPage().verifyFilterNavMenuOptions(expectedItems);
    }

    @Then("^User should see the following items$")
    public void user_should_see_the_following_items(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedItemsList = getLordAndTaylor().productsPage().dataTableToArray(data);
        getLordAndTaylor().productsPage().verifyProductDisplayedAfterFilter(expectedItemsList);
    }

    @When("^User click on the price link$")
    public void user_click_on_the_price_link() throws Throwable {
        getLordAndTaylor().productsPage().clickPriceFilter();
    }

    @When("^User selects the third option$")
    public void user_selects_the_third_option() throws Throwable {
        getLordAndTaylor().productsPage().clickPriceOption();
    }

    @When("^click on the submit button$")
    public void click_on_the_submit_button() throws Throwable {
        getLordAndTaylor().productsPage().clickFilterSubmitButton();
    }

    @Then("^User should see a search filter error message$")
    public void user_should_see_a_search_filter_error_message() throws Throwable {
        getLordAndTaylor().productsPage().verifyFilterErrorMsg();
    }

    @Then("^User should see the following category options$")
    public void user_should_see_the_following_category_options(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedItemsList = getLordAndTaylor().productsPage().dataTableToArray(data);
        getLordAndTaylor().productsPage().verifyShopByCategoryColumn(expectedItemsList);
    }

    @When("^User click on the Shop by brand dropdown$")
    public void user_click_on_the_Shop_by_brand_dropdown() throws Throwable {
        getLordAndTaylor().productsPage().clickShopByBrands();
    }

    @When("^Selects \"([^\"]*)\" from the dropdown$")
    public void selects_from_the_dropdown(String brand) throws Throwable {
        getLordAndTaylor().productsPage().selectBrand(brand);
    }

    @Then("^\"([^\"]*)\" product page should display$")
    public void product_page_should_display(String brandName) throws Throwable {
        getLordAndTaylor().productsPage().verifyBannerName(brandName);
    }

    @When("^User clicks on the preview button of a product$")
    public void user_clicks_on_the_preview_button_of_a_product() throws Throwable {
        getLordAndTaylor().productsPage().clickProductPreviewButton();
    }

    @When("^User choose a particular product$")
    public void user_choose_a_particular_product() throws Throwable {
        getLordAndTaylor().productsPage().getProductNameInPage();
    }

    @Then("^User should see the same product name$")
    public void user_should_see_the_same_product_name() throws Throwable {
        String pageName = "Six-Panel Logo Baseball Cap";
        String popUpName = getLordAndTaylor().productsPage().getProductNameInPopUp();
        getLordAndTaylor().productsPage().verifySameProductNameInPopUp(pageName, popUpName);
    }

    @When("^User choose a particular product and note the price of it$")
    public void user_choose_a_particular_product_and_note_the_price_of_it() throws Throwable {
        getLordAndTaylor().productsPage().getProductPriceInPage();
    }

    @Then("^User should see the same price of the product$")
    public void user_should_see_the_same_price_of_the_product() throws Throwable {
        String pagePrice = "$26.00";   //Price of the blue cap
        String popUpPrice = getLordAndTaylor().productsPage().getProductPriceInPopUp();
        getLordAndTaylor().productsPage().verifySameProductPriceInPopUp(pagePrice, popUpPrice);
    }

    @When("^User clicks on the pop up cancel button$")
    public void user_clicks_on_the_pop_up_cancel_button() throws Throwable {
        getLordAndTaylor().productsPage().clickPopUpCancelButton();
    }

    @When("^User click on Nike Hydroguard Mica Top product image$")
    public void user_click_on_Nike_Hydroguard_Mica_Top_product_image() throws Throwable {
        getLordAndTaylor().productsPage().clickNikeProduct();
    }

    @Then("^Hydroguard Mica Top Product page should display$")
    public void hydroguard_Mica_Top_Product_page_should_display() throws Throwable {
        getLordAndTaylor().productsPage().verifyNikeMikaTopProductPage();
    }

    @Then("^No text for colors should display$")
    public void no_text_for_colors_should_display() throws Throwable {
        getLordAndTaylor().productsPage().verifyColorOptionTexts("");
    }

    @When("^User click on \"([^\"]*)\" color option$")
    public void user_click_on_color_option(String color) throws Throwable {
        getLordAndTaylor().productsPage().productColorOptions(color);
    }

    @Then("^\"([^\"]*)\" should display as the text of the color$")
    public void should_display_as_the_text_of_the_color(String color) throws Throwable {
        getLordAndTaylor().productsPage().verifyColorOptionTexts(color);
    }

    @When("^Selects X-large as the size$")
    public void selects_X_large_as_the_size() throws Throwable {
        getLordAndTaylor().productsPage().clickSizeXL();
    }

    @Then("^User should see a sold out button that is unclickable$")
    public void user_should_see_a_sold_out_button_that_is_unclickable() throws Throwable {
        getLordAndTaylor().productsPage().verifySoldOutButton();
    }

    @Then("^User should see the same price in both of the product pages$")
    public void user_should_see_the_same_price_in_both_of_the_product_pages() throws Throwable {
        getLordAndTaylor().productsPage().verifySamePriceInBothProductPage();
    }

    @When("^User click on the product size guide link$")
    public void user_click_on_the_product_size_guide_link() throws Throwable {
        getLordAndTaylor().productsPage().clickProductSizeGuide();
    }

    @Then("^Product size guide page should display$")
    public void product_size_guide_page_should_display() throws Throwable {
        getLordAndTaylor().productsPage().verifyProductSizeGuidePage();
    }

    @When("^User click on the add to bag button$")
    public void user_click_on_the_add_to_bag_button() throws Throwable {
        getLordAndTaylor().productsPage().clickAddToBagButton();
    }

    @Then("^User should see a add size and color error message$")
    public void user_should_see_a_add_size_and_color_error_message() throws Throwable {
        getLordAndTaylor().productsPage().verifyAddToBagErrorMsg();
    }

    @When("^User should see the default quantity has value one$")
    public void user_should_see_the_default_quantity_has_value_one() throws Throwable {
        getLordAndTaylor().productsPage().verifyDefaultProductQuantity("1");
    }

    @When("^User clicks twice on the quantity increment button$")
    public void user_clicks_twice_on_the_quantity_increment_button() throws Throwable {
        getLordAndTaylor().productsPage().clickIncrementButton();
        getLordAndTaylor().productsPage().clickIncrementButton();
    }

    @Then("^User should see the quantity has value three$")
    public void user_should_see_the_quantity_has_value_three() throws Throwable {
        getLordAndTaylor().productsPage().verifyIncrementButtonFunctionality("3");
    }

    @When("^User click on the quantity decrement button once$")
    public void user_click_on_the_quantity_decrement_button_once() throws Throwable {
        getLordAndTaylor().productsPage().clickDecrementButton();
    }

    @Then("^User should see the quantity has value two$")
    public void user_should_see_the_quantity_has_value_two() throws Throwable {
        getLordAndTaylor().productsPage().verifyDecrementButtonFunctionality("2");
    }

    @Then("^User should see the following product description$")
    public void user_should_see_the_following_product_description(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedDetails = getLordAndTaylor().productsPage().dataTableToArrayV2(data);
        getLordAndTaylor().productsPage().verifyProductDescription(expectedDetails);
    }

    @When("^Selects Large as the size$")
    public void selects_Large_as_the_size() throws Throwable {
        getLordAndTaylor().productsPage().clickSizeLargeButton();
    }

    @When("^Choose store pick up option$")
    public void choose_store_pick_up_option() throws Throwable {
        getLordAndTaylor().productsPage().clickStorePickUpRadioButton();
    }

    @When("^Enters a valid zipcode as \"([^\"]*)\"$")
    public void enters_a_valid_zipcode_as(String zip) throws Throwable {
        getLordAndTaylor().productsPage().enterZipCode(zip);
    }

    @When("^Clicks on Check Stores button$")
    public void clicks_on_Check_Stores_button() throws Throwable {
        getLordAndTaylor().productsPage().clickCheckStoreButton();
    }

    @Then("^User should see an item unavailable message for store pick up$")
    public void user_should_see_an_item_unavailable_message_for_store_pick_up() throws Throwable {
        getLordAndTaylor().productsPage().verifyItemUnAvailableText();
    }

    @When("^Enters an invalid zipcode as \"([^\"]*)\"$")
    public void enters_an_invalid_zipcode_as(String zip) throws Throwable {
        getLordAndTaylor().productsPage().enterZipCode(zip);
    }

    @Then("^User should see an invalid zipcode error message$")
    public void user_should_see_an_invalid_zipcode_error_message() throws Throwable {
        getLordAndTaylor().productsPage().verifyMissingZipCodeMsg();
    }

}
