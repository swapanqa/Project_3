package com.lordAndTaylor.qa.framework.model;

import org.openqa.selenium.By;

/**
 * Created by Debajyoti Paul on 4/25/2018 at 3:38 PM
 */
public class AddToCartModel {

    private static By productDetailsInPopUp = By.xpath("//td[@class='saksBagItem']//tr/td");
    private static By productQuantity = By.xpath("//input[@id='numberInput']");

    private static By productPriceInPopUp = By.xpath("//div[@class='copy estimated-total']");
    private static By viewMyBagButton = By.xpath("(//a[@class='sfa-button small transactional'])[last()]");
    private static By shoppingBagLinkInNavigationBar = By.xpath("//a[@class='shopping-bag']");

    private static By headerTextInShoppingBagPage = By.xpath("//h1[@class='masthead-saksbag-title']");
    private static By addToBagButton = By.xpath("//button[@class='hbc-button hbc-button--full hbc-button--primary']");

    private static By popUpCloseButton = By.xpath("//div[@class='btnSaksBagClose']");

    private static By updateQuantityBox = By.xpath("//div[@class='grid-14']/input");
    private static By subTotalPrice = By.xpath("//p[@class='widebag-item-extended-price']");
    private static By itemSizeMedium = By.xpath("//a[@class='item size available'][text()='MEDIUM']");
    private static By itemUpdateApplyBtn = By.xpath("//button[@class='sfa-button transactional medium js-action-button']");
    private static By itemEditLink = By.xpath("//span[@class='action-link-text'][text()='Edit']");
    private static By itemSizeText = By.xpath("(//dl[@class='description-list']/dd)[last()-1]");

    private static By removeItemLink = By.xpath("//a[@class='action-link jsRemoveItem']/span[text()='Remove']");
    private static By confirmRemoveItem = By.xpath("//a[@class='action-link jsConfirm']/span");
    private static By cancelRemoveItem = By.xpath("//a[@class='action-link jsCancel']/span");
    private static By itemName = By.xpath("//p[@class='widebag-item-short-description']");
    private static By noItemInBagText = By.xpath("//p[@class='widebag-empty-message']");

    private static By zipcodeBox = By.xpath("//input[@id='jsBagZipCode']");
    private static By shippingMethodDropdown = By.xpath("//select[@id='jsSelectShippingMethod']");
    private static By shippingMethodOptionList = By.xpath("//select[@id='jsSelectShippingMethod']/option");
    private static By checkoutButton = By.xpath("//a[@id='jsStartCheckout']");
    private static By grandTotalCost = By.xpath("//dd[@id='jsVal-grandTotal']");
    private static By checkOutAsGuestButton = By.xpath("//button[@id='jsCheckoutRemediationGuestCheckout']");
    private static By shippingAndBillingPageText = By.xpath("//a[@id='tab-shipbill']");

    private static By paypalCheckoutButton = By.xpath("//a[@id='jsPayPalExpressCheckout']/img");
    private static By masterpassCheckoutButton = By.xpath("//a[@id='masterpassCheckout']/img");
    private static By checkoutPageIframes = By.tagName("iframe");
    private static By masterpassHeader = By.xpath("//h1[@class='text-announcements ng-binding']");

    private static By masterPassPhoneBox = By.xpath("//input[@id='formly_1_fieldUsername_username_0']");
    private static By masterPassSignUpBtn = By.xpath("//button[@class='btn btn-block btn-primary ng-binding']");
    private static By masterpassCrossBtn = By.xpath("//button[@class='btn btn-link btn-link-interface btn-close pull-right']");
    private static By masterpassCreditCardBox = By.xpath("//input[@id='formly_2_fieldCardAccountNumber_registrationDataInSwitch.paymentCard.accountNumber_1']");
    private static By getMasterpassHeader2 = By.xpath("//h1[@class='text-announcements ng-binding']");
    private static By masterpassErrorMsg = By.xpath("//div[@class='forgeforms-collapser ng-binding collapse in']");

    private static By nikeRunningTee = By.xpath("//a[@id='image-url-0500087768225']/img[last()]");
    private static By nikeRunningTeeColor = By.xpath("//li[@class='product-variant-attribute-value product-variant-attribute-value--swatch'][last()-1]");
    private static By itemsInShoppingBag = By.xpath("//p[@class='widebag-item-short-description']");
    private static By nikeRunningTeeHeader = By.xpath("//h1[@class='product-overview__short-description']");

    public static By getProductDetailsInPopUp() {
        return productDetailsInPopUp;
    }

    public static By getProductQuantity() {
        return productQuantity;
    }

    public static By getProductPriceInPopUp() {
        return productPriceInPopUp;
    }

    public static By getViewMyBagButton() {
        return viewMyBagButton;
    }

    public static By getShoppingBagLinkInNavigationBar() {
        return shoppingBagLinkInNavigationBar;
    }

    public static By getHeaderTextInShoppingBagPage() {
        return headerTextInShoppingBagPage;
    }

    public static By getAddToBagButton() {
        return addToBagButton;
    }

    public static By getPopUpCloseButton() {
        return popUpCloseButton;
    }

    public static By getUpdateQuantityBox() {
        return updateQuantityBox;
    }

    public static By getSubTotalPrice() {
        return subTotalPrice;
    }

    public static By getItemSizeMedium() {
        return itemSizeMedium;
    }

    public static By getItemUpdateApplyBtn() {
        return itemUpdateApplyBtn;
    }

    public static By getItemEditLink() {
        return itemEditLink;
    }

    public static By getItemSizeText() {
        return itemSizeText;
    }

    public static By getRemoveItemLink() {
        return removeItemLink;
    }

    public static By getConfirmRemoveItem() {
        return confirmRemoveItem;
    }

    public static By getCancelRemoveItem() {
        return cancelRemoveItem;
    }

    public static By getItemName() {
        return itemName;
    }

    public static By getNoItemInBagText() {
        return noItemInBagText;
    }

    public static By getZipcodeBox() {
        return zipcodeBox;
    }

    public static By getShippingMethodDropdown() {
        return shippingMethodDropdown;
    }

    public static By getShippingMethodOptionList() {
        return shippingMethodOptionList;
    }

    public static By getCheckoutButton() {
        return checkoutButton;
    }

    public static By getGrandTotalCost() {
        return grandTotalCost;
    }

    public static By getCheckOutAsGuestButton() {
        return checkOutAsGuestButton;
    }

    public static By getShippingAndBillingPageText() {
        return shippingAndBillingPageText;
    }

    public static By getPaypalCheckoutButton() {
        return paypalCheckoutButton;
    }

    public static By getMasterpassCheckoutButton() {
        return masterpassCheckoutButton;
    }

    public static By getCheckoutPageIframes() {
        return checkoutPageIframes;
    }

    public static By getMasterpassHeader() {
        return masterpassHeader;
    }

    public static By getMasterPassPhoneBox() {
        return masterPassPhoneBox;
    }

    public static By getMasterPassSignUpBtn() {
        return masterPassSignUpBtn;
    }

    public static By getMasterpassCrossBtn() {
        return masterpassCrossBtn;
    }

    public static By getMasterpassCreditCardBox() {
        return masterpassCreditCardBox;
    }

    public static By getGetMasterpassHeader2() {
        return getMasterpassHeader2;
    }

    public static By getMasterpassErrorMsg() {
        return masterpassErrorMsg;
    }

    public static By getNikeRunningTee() {
        return nikeRunningTee;
    }

    public static By getNikeRunningTeeColor() {
        return nikeRunningTeeColor;
    }

    public static By getItemsInShoppingBag() {
        return itemsInShoppingBag;
    }

    public static By getNikeRunningTeeHeader() {
        return nikeRunningTeeHeader;
    }

}
