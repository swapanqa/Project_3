package com.lordAndTaylor.qa.scripts.steps;

import com.lordAndTaylor.qa.framework.hooks.BaseSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by Debajyoti Paul on 4/25/2018 at 3:38 PM
 */
public class AddToCartSteps extends BaseSteps {

    @Given("^Not a validated Shopping Cart Page and Add To Cart Functionality$")
    public void not_a_validated_Shopping_Cart_Page_and_Add_To_Cart_Functionality() throws Throwable {
        getLordAndTaylor().addToCart().clearCookies();
    }

    @When("^Click on Add To Bag Button$")
    public void click_on_Add_To_Bag_Button() throws Throwable {
        getLordAndTaylor().addToCart().clickAddToBagButton();
    }

    @Then("^User should see the following product related details in the pop up box$")
    public void user_should_see_the_following_product_related_details_in_the_pop_up_box(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedText = getLordAndTaylor().productsPage().dataTableToArrayV2(data);
        getLordAndTaylor().addToCart().verifyProductDescriptionInPopUp(expectedText);
    }

    @When("^Enters \"([^\"]*)\" in the quantity box$")
    public void enters_in_the_quantity_box(String quantity) throws Throwable {
        getLordAndTaylor().addToCart().enterProductQuantity(quantity);
    }

    @Then("^the total price displayed in the pop up would be \"([^\"]*)\"$")
    public void the_total_price_displayed_in_the_pop_up_would_be(String price) throws Throwable {
        getLordAndTaylor().addToCart().verifyPriceInPopUp(price);
    }

    @When("^User click on the View My Bag button$")
    public void user_click_on_the_View_My_Bag_button() throws Throwable {
        getLordAndTaylor().addToCart().clickViewMyBagButton();
    }

    @Then("^Shopping Bag page should display$")
    public void shopping_Bag_page_should_display() throws Throwable {
        getLordAndTaylor().addToCart().verifyShoppingBagPage();
    }

    @When("^User click on Bag Link in the navigation bar$")
    public void user_click_on_Bag_Link_in_the_navigation_bar() throws Throwable {
        getLordAndTaylor().addToCart().clickShoppingBagInNavBar();
    }

    @When("^User click the pop up close button$")
    public void user_click_the_pop_up_close_button() throws Throwable {
       getLordAndTaylor().addToCart().clickPopUpCloseButton();
    }

    @Then("^Shopping Bag pop up should display$")
    public void shopping_Bag_pop_up_should_display() throws Throwable {
        getLordAndTaylor().addToCart().shoppingBagPopUpDisplay();
    }

    @When("^User updates the quantity as \"([^\"]*)\"$")
    public void user_updates_the_quantity_as(String quantity) throws Throwable {
        getLordAndTaylor().addToCart().enterNewQuantity(quantity);
    }

    @Then("^New updated item price of \"([^\"]*)\" should display$")
    public void new_updated_item_price_of_should_display(String price) throws Throwable {
        getLordAndTaylor().addToCart().verifyUpdatedSubTotalPrice(price);
    }

    @When("^User clicks the edit item link$")
    public void user_clicks_the_edit_item_link() throws Throwable {
       getLordAndTaylor().addToCart().clickEditLink();
    }

    @When("^Choose size Medium$")
    public void choose_size_Medium() throws Throwable {
       getLordAndTaylor().addToCart().chooseSizeMedium();
    }

    @When("^Clicks on Apply modification button$")
    public void clicks_on_Apply_modification_button() throws Throwable {
        getLordAndTaylor().addToCart().clickApplyButton();
    }

    @Then("^Updated \"([^\"]*)\" size should display in the shipping bag page$")
    public void updated_size_should_display_in_the_shipping_bag_page(String size) throws Throwable {
        getLordAndTaylor().addToCart().verifyItemSizeText(size);
    }

    @When("^User clicks the remove item link$")
    public void user_clicks_the_remove_item_link() throws Throwable {
        getLordAndTaylor().addToCart().clickRemoveItemLink();
    }

    @When("^Clicks on the confirm remove item link$")
    public void clicks_on_the_confirm_remove_item_link() throws Throwable {
        getLordAndTaylor().addToCart().clickConfirmRemove();
    }

    @Then("^User should see that the item has been removed$")
    public void user_should_see_that_the_item_has_been_removed() throws Throwable {
        getLordAndTaylor().addToCart().verifyNoItemInBag();
    }

    @When("^Clicks on the cancel remove item link$")
    public void clicks_on_the_cancel_remove_item_link() throws Throwable {
        getLordAndTaylor().addToCart().clickCancelRemove();
    }

    @Then("^User should see that the item isn't been removed$")
    public void user_should_see_that_the_item_isn_t_been_removed() throws Throwable {
        getLordAndTaylor().addToCart().verifyItemName();
    }

    @When("^User enter zipcode as \"([^\"]*)\"$")
    public void user_enter_zipcode_as(String zip) throws Throwable {
        getLordAndTaylor().addToCart().enterZipCode(zip);
    }

    @When("^Click on shipping method dropdown$")
    public void click_on_shipping_method_dropdown() throws Throwable {
        getLordAndTaylor().addToCart().clickShippingOptions();
    }

    @Then("^User should see the following shipping options$")
    public void user_should_see_the_following_shipping_options(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedOptions = getLordAndTaylor().productsPage().dataTableToArrayV2(data);
        getLordAndTaylor().addToCart().verifyShippingOptions(expectedOptions);
    }

    @When("^Selects \"([^\"]*)\" as the shipping method$")
    public void selects_as_the_shipping_method(String option) throws Throwable {
        getLordAndTaylor().addToCart().chooseShippingMethod(option);
    }

    @Then("^User should see the grand total as \"([^\"]*)\"$")
    public void user_should_see_the_grand_total_as(String total) throws Throwable {
        getLordAndTaylor().addToCart().verifyGrandTotal(total);
    }

    @When("^Click on the checkout button$")
    public void click_on_the_checkout_button() throws Throwable {
        getLordAndTaylor().addToCart().clickCheckOutButton();
    }

    @When("^click on the checkout as guest button$")
    public void click_on_the_checkout_as_guest_button() throws Throwable {
        getLordAndTaylor().addToCart().clickCheckoutAsGuest();
    }

    @Then("^Shipping and billing page should display$")
    public void shipping_and_billing_page_should_display() throws Throwable {
        getLordAndTaylor().addToCart().verifyShippingAndBillingPage();
    }

    @When("^Click on the paypal checkout button$")
    public void click_on_the_paypal_checkout_button() throws Throwable {
        getLordAndTaylor().addToCart().clickPaypalCheckoutLink();
    }

    @Then("^Paypal checkout page should open$")
    public void paypal_checkout_page_should_open() throws Throwable {
        getLordAndTaylor().addToCart().verifyPaypalPage();
    }

    @When("^Click on the masterpass checkout button$")
    public void click_on_the_masterpass_checkout_button() throws Throwable {
        getLordAndTaylor().addToCart().clickMasterPassCheckoutLink();
        getLordAndTaylor().addToCart().switchToMasterpassIFrame();
    }

    @Then("^Masterpass checkout pop up should open$")
    public void masterpass_checkout_pop_up_should_open() throws Throwable {
        getLordAndTaylor().addToCart().verifyMasterpassPage();
    }

    @When("^User provides a valid phone number$")
    public void user_provides_a_valid_phone_number() throws Throwable {
        getLordAndTaylor().addToCart().enterPhoneNumber();
    }

    @When("^Click on Sign Up button$")
    public void click_on_Sign_Up_button() throws Throwable {
        getLordAndTaylor().addToCart().clickSignUp();
    }

    @When("^Provide an invalid credit card number$")
    public void provide_an_invalid_credit_card_number() throws Throwable {
        getLordAndTaylor().addToCart().enterInvalidCreditCardNumber();
    }

    @Then("^An error message should display$")
    public void an_error_message_should_display() throws Throwable {
        getLordAndTaylor().addToCart().verifyCreditCardErrorMsg();
    }

    @When("^User clicks on the cross button$")
    public void user_clicks_on_the_cross_button() throws Throwable {
        getLordAndTaylor().addToCart().clickMasterPassCrossButton();
    }

    @When("^User click on Nike Running Tee product image$")
    public void user_click_on_Nike_Running_Tee_product_image() throws Throwable {
        getLordAndTaylor().addToCart().clickNikeRunningTeeProduct();
    }

    @Then("^Nike Running Tee Product page should display$")
    public void nike_Running_Tee_Product_page_should_display() throws Throwable {
        getLordAndTaylor().addToCart().verifyNikeRunningTeePage();
    }

    @When("^Selects black as the color$")
    public void selects_black_as_the_color() throws Throwable {
        getLordAndTaylor().addToCart().selectNikeTeeBlackColor();
    }

    @Then("^Shopping Bag page should display items as follows$")
    public void shopping_Bag_page_should_display_items_as_follows(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedItems = getLordAndTaylor().productsPage().dataTableToArray(data);
        getLordAndTaylor().addToCart().verifyItemsInShippingBagPage(expectedItems);
    }

}
