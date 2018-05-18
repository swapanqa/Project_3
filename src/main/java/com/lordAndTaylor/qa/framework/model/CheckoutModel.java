package com.lordAndTaylor.qa.framework.model;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Debajyoti Paul on 4/26/2018 at 6:37 PM
 */
public class CheckoutModel {

    private static By itemHeaderText = By.xpath("//p[@class='minibag-item-short-description']");
    private static By missingCityErrorMsg = By.xpath("//div[@id='shipCity-wrap']//p[@class='errorMsg']");
    private static By firstNameBox = By.id("shipFirst");
    private static By lastNameBox = By.id("shipLast");
    private static By address1Box = By.id("shipAddress1");
    private static By cityBox = By.id("shipCity");
    private static By stateDropdownBox = By.id("shipState");
    private static By stateList = By.xpath("//select[@id='shipState']/option");
    private static By zipCodeBox = By.id("shipZip");
    private static By emailBox = By.id("shipEmail");
    private static By phoneNumberBox = By.id("shipPhone");
    private static By checkoutBtn = By.xpath("//button[@class='sfa-button large transactional']");


    private static By makeBillingCheckBox = By.xpath("//input[@id='makeBilling']");
    private static By useAddressAsGivenButton = By.xpath("//button[@id='jsUseEntered']");
    private static By paymentDropdown = By.xpath("//select[@id='payCC']");
    private static By paymentDropdownOptions = By.xpath("//select[@id='payCC']/option");
    private static By creditCardNumber = By.xpath("//input[@id='payCCNum']");
    private static By creditCardNumberText = By.xpath("//input[@id='payCCNum']/preceding-sibling::span");
    private static By cardName = By.id("payCCName");
    private static By cardMonth = By.xpath("//select[@id='ccMonth']");
    private static By cardYear = By.xpath("//select[@id='ccYear']");
    private static By cardCCV = By.id("payCCV");
    private static By continueCheckout = By.cssSelector("#jsCompletePayment");
    private static By paymentReview = By.xpath("//p[@id='jsVal-creditCard']");
    private static By invalidCardErrorMsg = By.xpath("//p[@class='errorMsg']");

    private static By giftCardNumber = By.xpath("//input[@id='payGCNum']");
    private static By pinNumber = By.xpath("//input[@id='payGCPIN']");
    private static By giftCardErrorMsg = By.xpath("//p[@class='errorMsg']");
    private static By giftCardApplyButton = By.xpath("(//button[@class='sfa-button small flat']/span[text()='Apply'])[last()-1]");

    private static By editLink = By.xpath("//a[@class='action-link jsEditItem']");
    private static By editItemNumber = By.xpath("//input[@class='js-quantity quantity']");
    private static By editApplyButton = By.xpath("//button[@class='sfa-button transactional medium js-action-button']");
    private static By updatedItemSize = By.xpath("(//dl[@class='description-list']/dd)[last()-2]");
    private static By subTotalAfterEdit = By.xpath("//div[@class='minibag-item-subtotal']/h4[text()='Subtotal:']/following-sibling::p");
    private static By newItemSize = By.xpath("//a[@class='item size available'][text()='MEDIUM']");
    private static By itemRemoveLink = By.xpath("//span[@class='action-link-text'][text()='Remove']");
    private static By confirmRemove = By.xpath("(//span[@class='action-link-text'][text()='Remove'])[last()]");
    private static By emptyBagMsg = By.xpath("//p[@class='widebag-empty-message']");

    private static By paymentLink = By.xpath("//a[@id='tab-payment']");
    private static By continueCheckoutToReview = By.xpath("//button[@id='jsCompletePayment']");
    private static By reviewLink = By.xpath("//a[@id='tab-review']");

    private static By shippingAddress1 = By.xpath("(//span[@class='street-address']/span)[last()-1]");
    private static By shippingCity = By.xpath("(//span[@class='locality'])[last()]");
    private static By shippingRegion = By.xpath("(//span[@class='region'])[last()]");
    private static By shippingZipCode = By.xpath("(//span[@class='postal-code'])[last()]");

    private static By deliveryRadioButton = By.xpath("(//span[@class='radiobox-helper field-label'])[last()-3]/span");
    private static By promoCodeEditLink = By.xpath("//a[@class='action-link jsEditPromoCodes']/span[@class='action-link-text']");
    private static By enterPromoCode = By.xpath("//input[@id='promoCodeEntry']");
    private static By promoApplyButton = By.xpath("//button[@id='promoApply']/span");
    private static By promoCodeErrorMsg = By.xpath("//p[@class='errorMsg']");

    private static By placeOrderButton = By.xpath("//button[@id='jsReviewSubmit']");
    private static By orderErrorMsg = By.xpath("//div[@id='message-top']");

    private static By deliveryAmount = By.xpath("//dd[@id='jsVal-shippingCost']");
    private static By orderTotal = By.xpath("//dd[@id='jsVal-grandTotal']");

    public static By getItemHeaderText() {
        return itemHeaderText;
    }

    public static By getMissingCityErrorMsg() {
        return missingCityErrorMsg;
    }

    public static By getFirstNameBox() {
        return firstNameBox;
    }

    public static By getLastNameBox() {
        return lastNameBox;
    }

    public static By getAddress1Box() {
        return address1Box;
    }

    public static By getCityBox() {
        return cityBox;
    }

    public static By getStateDropdownBox() {
        return stateDropdownBox;
    }

    public static By getStateList() {
        return stateList;
    }

    public static By getZipCodeBox() {
        return zipCodeBox;
    }

    public static By getEmailBox() {
        return emailBox;
    }

    public static By getPhoneNumberBox() {
        return phoneNumberBox;
    }

    public static By getCheckoutBtn() {
        return checkoutBtn;
    }

    public static By getMakeBillingCheckBox() {
        return makeBillingCheckBox;
    }

    public static By getUseAddressAsGivenButton() {
        return useAddressAsGivenButton;
    }

    public static By getPaymentDropdown() {
        return paymentDropdown;
    }

    public static By getPaymentDropdownOptions() {
        return paymentDropdownOptions;
    }

    public static By getCreditCardNumber() {
        return creditCardNumber;
    }

    public static By getCreditCardNumberText() {
        return creditCardNumberText;
    }

    public static By getCardName() {
        return cardName;
    }

    public static By getCardMonth() {
        return cardMonth;
    }

    public static By getCardYear() {
        return cardYear;
    }

    public static By getCardCCV() {
        return cardCCV;
    }

    public static By getContinueCheckout() {
        return continueCheckout;
    }

    public static By getPaymentReview() {
        return paymentReview;
    }

    public static By getInvalidCardErrorMsg() {
        return invalidCardErrorMsg;
    }

    public static By getGiftCardNumber() {
        return giftCardNumber;
    }

    public static By getPinNumber() {
        return pinNumber;
    }

    public static By getGiftCardErrorMsg() {
        return giftCardErrorMsg;
    }

    public static By getGiftCardApplyButton() {
        return giftCardApplyButton;
    }

    public static By getEditLink() {
        return editLink;
    }

    public static By getEditItemNumber() {
        return editItemNumber;
    }

    public static By getEditApplyButton() {
        return editApplyButton;
    }

    public static By getUpdatedItemSize() {
        return updatedItemSize;
    }

    public static By getSubTotalAfterEdit() {
        return subTotalAfterEdit;
    }

    public static By getNewItemSize() {
        return newItemSize;
    }

    public static By getItemRemoveLink() {
        return itemRemoveLink;
    }

    public static By getConfirmRemove() {
        return confirmRemove;
    }

    public static By getEmptyBagMsg() {
        return emptyBagMsg;
    }

    public static By getPaymentLink() {
        return paymentLink;
    }

    public static By getContinueCheckoutToReview() {
        return continueCheckoutToReview;
    }

    public static By getReviewLink() {
        return reviewLink;
    }

    public static By getShippingAddress1() {
        return shippingAddress1;
    }

    public static By getShippingCity() {
        return shippingCity;
    }

    public static By getShippingRegion() {
        return shippingRegion;
    }

    public static By getShippingZipCode() {
        return shippingZipCode;
    }

    public static By getDeliveryRadioButton() {
        return deliveryRadioButton;
    }

    public static By getPromoCodeEditLink() {
        return promoCodeEditLink;
    }

    public static By getEnterPromoCode() {
        return enterPromoCode;
    }

    public static By getPromoApplyButton() {
        return promoApplyButton;
    }

    public static By getPromoCodeErrorMsg() {
        return promoCodeErrorMsg;
    }

    public static By getPlaceOrderButton() {
        return placeOrderButton;
    }

    public static By getOrderErrorMsg() {
        return orderErrorMsg;
    }

    public static By getDeliveryAmount() {
        return deliveryAmount;
    }

    public static By getOrderTotal() {
        return orderTotal;
    }

}
