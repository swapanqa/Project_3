package com.lordAndTaylor.qa.framework.model;

import org.openqa.selenium.By;

/**
 * Created by Debajyoti Paul on 4/11/2018 at 11:54 PM
 */
public class UserAccountPageModel {

    private static By applyLink = By.xpath("//a[@class='banner-credit-card__card-link'][contains(@href, 'lordandtaylor.capitalonecards.com')]");
    private static By welcomeLink = By.xpath("//li[@class='menu-item']");
    private static By yourAccountLink = By.xpath("//li[@class='first-child']/a[contains(@href, 'https://www.lordandtaylor.com/account/account')]");
    private static By shippingAddressNavigationLink = By.xpath("//ul[@class='scroll-nav__links']/li[last()-3]/a");
    private static By addShippingAddressLink = By.xpath("//div[@class='add-new-item-card__inner-cell']/h2");
    private static By countryBox = By.xpath("//select[@class='drop-down-menu__select'][@name='country']");
    private static By countryDropdownList = By.xpath("//select[@class='drop-down-menu__select'][@name='country']/option");
    private static By stateBox = By.xpath("//select[@class='drop-down-menu__select'][@name='state']");
    private static By stateDropdownList = By.xpath("//select[@class='drop-down-menu__select'][@name='state']/option");
    private static By firstName = By.xpath("//input[@id='address-book-form-first-name']");
    private static By lastName = By.xpath("//input[@id='address-book-form-last-name']");
    private static By addressBox = By.xpath("//input[@id='address-book-form-address-one']");
    private static By cityBox = By.xpath("//input[@id='address-book-form-city']");
    private static By zipCodeBox = By.xpath("//input[@id='address-book-form-postal-code']");
    private static By phoneBox = By.xpath("//input[@id='address-book-form-phone-number']");
    private static By billingCheckBox = By.xpath("//input[@class='checkbox-group__checkbox-input'][@value='billing']/following-sibling::span");
    private static By submitButton = By.xpath("//button[@class='hbc-button hbc-button--block hbc-button--primary']");

    private static By defaultShippingAddressHeader = By.xpath("//p[@class='address-book__content--default-address']");
    private static By defaultShippingAddress = By.xpath("//p[@class='address-book__content'][last()-3]");
    private static By billingAddressLink = By.xpath("//a[contains(@href, '/account/billing-address-book')]");
    private static By paymentNavigationLink = By.xpath("//ul[@class='scroll-nav__links']/li[last()-1]/a");
    private static By addPaymentLink = By.xpath("//div[@class='add-new-item-card__inner-cell']/h2");
    private static By fullName = By.xpath("//input[@id='payment-add-name']");
    private static By cardBox = By.xpath("//input[@id='payment-add-card-number']");
    private static By monthElement = By.xpath("//select[@class='drop-down-menu__select drop-down-menu__select--default'][@name='month']");
    private static By monthList = By.xpath("//select[@class='drop-down-menu__select drop-down-menu__select--default'][@name='month']/option");
    private static By yearElement = By.xpath("//select[@class='drop-down-menu__select drop-down-menu__select--default'][@name='year']");
    private static By yearList = By.xpath("//select[@class='drop-down-menu__select drop-down-menu__select--default'][@name='year']/option");
    private static By error = By.xpath("//span[@class='text-field__error-message']");
    private static By yourProfile = By.xpath("//h2[@class='card__title'][text()='Your Profile']");
    private static By elementToWait = By.xpath("//a[@class='back-to-top']");
    private static By welcomeText = By.xpath("//a[@class='account']");

    private static By navBarOptions = By.xpath("//ul[@class='scroll-nav__links']/li/a");
    private static By noOrderHistoryMsg = By.xpath("//div[@class='order-history__no-order']/p");
    private static By orderHistoryLink = By.xpath("//a[contains(@href, 'order-history')]");
    private static By missingFieldErrorMsg = By.xpath("//span[@class='text-field__error-message']");
    private static By nameInAddress1 = By.xpath("//h2[@class='card__title'][text()='Address 2']/following-sibling::div/p[@class='address-book__content'][last()-5]/strong");

    private static By editLink = By.xpath("(//button[@class='hbc-button hbc-button--link'][@title='Edit']/span)[last()]");
    private static By checkDefaultShippingAddress = By.xpath("//span[@class='checkbox-group__checkbox-label'][text()='Default Shipping Address']");

    public static By getApplyLink() {
        return applyLink;
    }

    public static By getWelcomeLink() {
        return welcomeLink;
    }

    public static By getYourAccountLink() {
        return yourAccountLink;
    }

    public static By getShippingAddressNavigationLink() {
        return shippingAddressNavigationLink;
    }

    public static By getAddShippingAddressLink() {
        return addShippingAddressLink;
    }

    public static By getCountryBox() {
        return countryBox;
    }

    public static By getCountryDropdownList() {
        return countryDropdownList;
    }

    public static By getStateBox() {
        return stateBox;
    }

    public static By getStateDropdownList() {
        return stateDropdownList;
    }

    public static By getFirstName() {
        return firstName;
    }

    public static By getLastName() {
        return lastName;
    }

    public static By getAddressBox() {
        return addressBox;
    }

    public static By getCityBox() {
        return cityBox;
    }

    public static By getZipCodeBox() {
        return zipCodeBox;
    }

    public static By getPhoneBox() {
        return phoneBox;
    }

    public static By getBillingCheckBox() {
        return billingCheckBox;
    }

    public static By getSubmitButton() {
        return submitButton;
    }

    public static By getDefaultShippingAddressHeader() {
        return defaultShippingAddressHeader;
    }

    public static By getDefaultShippingAddress() {
        return defaultShippingAddress;
    }

    public static By getBillingAddressLink() {
        return billingAddressLink;
    }

    public static By getPaymentNavigationLink() {
        return paymentNavigationLink;
    }

    public static By getAddPaymentLink() {
        return addPaymentLink;
    }

    public static By getFullName() {
        return fullName;
    }

    public static By getCardBox() {
        return cardBox;
    }

    public static By getMonthElement() {
        return monthElement;
    }

    public static By getMonthList() {
        return monthList;
    }

    public static By getYearElement() {
        return yearElement;
    }

    public static By getYearList() {
        return yearList;
    }

    public static By getError() {
        return error;
    }

    public static By getYourProfile() {
        return yourProfile;
    }

    public static By getElementToWait() {
        return elementToWait;
    }

    public static By getWelcomeText() {
        return welcomeText;
    }

    public static By getNavBarOptions() {
        return navBarOptions;
    }

    public static By getNoOrderHistoryMsg() {
        return noOrderHistoryMsg;
    }

    public static By getOrderHistoryLink() {
        return orderHistoryLink;
    }

    public static By getMissingFieldErrorMsg() {
        return missingFieldErrorMsg;
    }

    public static By getNameInAddress1() {
        return nameInAddress1;
    }

    public static By getEditLink() {
        return editLink;
    }

    public static By getCheckDefaultShippingAddress() {
        return checkDefaultShippingAddress;
    }

}
