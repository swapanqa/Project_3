package com.lordAndTaylor.qa.scripts.steps;

import com.lordAndTaylor.qa.framework.hooks.BaseSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by Debajyoti Paul on 4/26/2018 at 6:37 PM
 */
public class CheckoutSteps extends BaseSteps {

    @Given("^Not a validated checkout Functionality$")
    public void not_a_validated_checkout_Functionality() throws Throwable {
        getLordAndTaylor().checkout().clearCookies();
    }

    @Then("^User should see the same product name that was added to the cart$")
    public void user_should_see_the_same_product_name_that_was_added_to_the_cart() throws Throwable {
        getLordAndTaylor().checkout().verifyProduct();
    }

    @When("^User enter Shipping details as$")
    public void user_enter_Shipping_details_as(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        getLordAndTaylor().checkout().enterFirstName(data.get(0).get(0));
        getLordAndTaylor().checkout().enterlastName(data.get(0).get(1));
        getLordAndTaylor().checkout().enterAddress(data.get(0).get(2));
        getLordAndTaylor().checkout().enterCity(data.get(0).get(3));
        getLordAndTaylor().checkout().enterState(data.get(0).get(4));
        getLordAndTaylor().checkout().enterZipCode(data.get(0).get(5));
        getLordAndTaylor().checkout().enterEmail(data.get(0).get(6));
        getLordAndTaylor().checkout().enterPhoneNumber(data.get(0).get(7));
    }

    @When("^Click the Continue Checkout button$")
    public void click_the_Continue_Checkout_button() throws Throwable {
        getLordAndTaylor().checkout().clickCheckout();
    }

    @When("^Click Continue Checkout$")
    public void click_Continue_Checkout() throws Throwable {
       getLordAndTaylor().checkout().clickCheckoutEx();
    }

    @Then("^An enter missing field error message should display$")
    public void an_enter_missing_field_error_message_should_display() throws Throwable {
        getLordAndTaylor().checkout().verifyMissingFieldErrorMsg();
    }

    @Then("^User should see the make billing address checkbox is checked by default$")
    public void user_should_see_the_make_billing_address_checkbox_is_checked_by_default() throws Throwable {
        getLordAndTaylor().checkout().verifyMakeBillingCheckBoxIsChecked();
    }

    @When("^Click on the use address as entered button$")
    public void click_on_the_use_address_as_entered_button() throws Throwable {
        getLordAndTaylor().checkout().clickAddressAsEntered();
    }

    @When("^Click on the payment dropdown in the payments section$")
    public void click_on_the_payment_dropdown_in_the_payments_section() throws Throwable {
        getLordAndTaylor().checkout().clickPaymentDropdown();
    }

    @Then("^User should see the following payment options$")
    public void user_should_see_the_following_payment_options(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedOptions = getLordAndTaylor().productsPage().dataTableToArray(data);
        getLordAndTaylor().checkout().verifyPaymentOptions(expectedOptions);
    }

    @When("^User selects \"([^\"]*)\" as the payment type$")
    public void user_selects_as_the_payment_type(String payment) throws Throwable {
        getLordAndTaylor().checkout().selectPaymentOptions(payment);
    }

    @When("^Provides the following card information$")
    public void provides_the_following_card_information(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        getLordAndTaylor().checkout().enterCardNumber(data.get(0).get(0));
        getLordAndTaylor().checkout().enterCardName(data.get(0).get(1));
        getLordAndTaylor().checkout().selectCardMonth(data.get(0).get(2));
        getLordAndTaylor().checkout().selectCardYear(data.get(0).get(3));
        getLordAndTaylor().checkout().enterCardCCV(data.get(0).get(4));
    }

    @When("^Click the continue Checkout$")
    public void click_the_continue_Checkout() throws Throwable {
        getLordAndTaylor().checkout().clickCheckoutButton();
    }

    @Then("^User should see the following payment info in the review and submit page$")
    public void user_should_see_the_following_payment_info_in_the_review_and_submit_page(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        getLordAndTaylor().checkout().verifyPaymentReview(data.get(0).get(0));
    }

    @Then("^User should see Invalid card error message$")
    public void user_should_see_Invalid_card_error_message() throws Throwable {
        getLordAndTaylor().checkout().verifyInvalidCardErrorMsg();
    }

    @When("^Enters the following gift card information$")
    public void enters_the_following_gift_card_information(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        getLordAndTaylor().checkout().enterGiftCard(data.get(0).get(0));
        getLordAndTaylor().checkout().enterCardPin(data.get(0).get(1));
    }

    @When("^Clicks on the gift card apply link$")
    public void clicks_on_the_gift_card_apply_link() throws Throwable {
        getLordAndTaylor().checkout().clickGiftCardApplyLink();
    }

    @Then("^User should see Invalid gift card error message$")
    public void user_should_see_Invalid_gift_card_error_message() throws Throwable {
        getLordAndTaylor().checkout().verifyGiftCardErrorMsg();
    }


    @Then("^Payment tab should display$")
    public void payment_tab_should_display() throws Throwable {
        getLordAndTaylor().checkout().verifyPaymentPage();
    }

    @When("^User click on the edit item link in the payment section$")
    public void user_click_on_the_edit_item_link_in_the_payment_section() throws Throwable {
        getLordAndTaylor().checkout().clickEditLink();
    }

    @When("^Select the item size as medium$")
    public void select_the_item_size_as_medium() throws Throwable {
        getLordAndTaylor().checkout().selectNewItemSize();
    }

    @When("^Click on apply edit button$")
    public void click_on_apply_edit_button() throws Throwable {
        getLordAndTaylor().checkout().clickApplyButton();
    }

    @Then("^User should see the updated size on the payment page$")
    public void user_should_see_the_updated_size_on_the_payment_page() throws Throwable {
        getLordAndTaylor().checkout().verifyUpdatedItemSize();
    }

    @When("^Select quantity to be \"([^\"]*)\"$")
    public void select_quantity_to_be(String quantity) throws Throwable {
        getLordAndTaylor().checkout().enterNewQuantity(quantity);
    }

    @Then("^User should see the updated subtotal to be \"([^\"]*)\"$")
    public void user_should_see_the_updated_subtotal_to_be(String subTotal) throws Throwable {
        getLordAndTaylor().checkout().newSubTotalAfterEdit(subTotal);
    }

    @When("^User click on the remove item link$")
    public void user_click_on_the_remove_item_link() throws Throwable {
        getLordAndTaylor().checkout().clickItemRemoveLink();
    }

    @When("^Clicks on the confirm remove item button$")
    public void Clicks_on_the_confirm_remove_item_button() throws Throwable {
        getLordAndTaylor().checkout().clickConfirmRemove();
    }

    @Then("^User should see an empty item bag message$")
    public void user_should_see_an_empty_item_bag_message() throws Throwable {
        getLordAndTaylor().checkout().verifyMsgAfterRemovingItem();
    }

    @When("^Click on the continue to review button$")
    public void click_on_the_continue_to_review_button() throws Throwable {
        getLordAndTaylor().checkout().clickContinueCheckoutToReview();
    }

    @Then("^Review and Submit tab should display$")
    public void review_and_Submit_tab_should_display() throws Throwable {
       getLordAndTaylor().checkout().verifyReviewPage();
    }

    @Then("^User should see the shipping address same as the billing address like$")
    public void user_should_see_the_shipping_address_same_as_the_billing_address_like(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        String[] expectedShippingAddress = getLordAndTaylor().productsPage().dataTableToArray(data);
        getLordAndTaylor().checkout().verifyShippingAddress(expectedShippingAddress);
    }

    @Then("^User should see the delivery option is chosen as Standard by default$")
    public void user_should_see_the_delivery_option_is_chosen_as_Standard_by_default() throws Throwable {
        getLordAndTaylor().checkout().verifyDeliveryOption();
    }

    @When("^User click on the promo code edit link$")
    public void user_click_on_the_promo_code_edit_link() throws Throwable {
        getLordAndTaylor().checkout().clickPromoCodeLink();
    }

    @When("^Enters the promo code$")
    public void enters_the_promo_code() throws Throwable {
        getLordAndTaylor().checkout().enterPromoCode("AB456789YZ");
    }

    @When("^Clicks Apply Promo Code$")
    public void clicks_Apply_Promo_Code() throws Throwable {
        getLordAndTaylor().checkout().clickApplyPromoCode();
    }

    @Then("^An invalid promo code error message should display$")
    public void an_invalid_promo_code_error_message_should_display() throws Throwable {
        getLordAndTaylor().checkout().verifyPromoCodeErrorMsg();
    }

    @When("^User click on the Place Order button$")
    public void user_click_on_the_Place_Order_button() throws Throwable {
        getLordAndTaylor().checkout().clickPlaceOrder();
    }

    @Then("^An invalid payment error message should display$")
    public void an_invalid_payment_error_message_should_display() throws Throwable {
        getLordAndTaylor().checkout().verifyOrderErrorMessage();
    }

    @Then("^Order total should update to \"([^\"]*)\"$")
    public void order_total_should_update_to(String total) throws Throwable {
        getLordAndTaylor().checkout().verifyOrderTotal(total);
    }

    @Then("^Delivery should get FREE$")
    public void delivery_should_get_FREE() throws Throwable {
        getLordAndTaylor().checkout().verifyDeliveryAmount();
    }


}
