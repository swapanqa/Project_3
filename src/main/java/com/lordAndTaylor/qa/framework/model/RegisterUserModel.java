package com.lordAndTaylor.qa.framework.model;

import org.openqa.selenium.By;

/**
 * Created by Debajyoti Paul on 4/11/2018 at 2:41 AM
 */
public class RegisterUserModel {

    private static By firstNameBox = By.xpath("//input[@id='create-new-account-first-name']");
    private static By lastNameBox = By.xpath("//input[@id='create-new-account-last-name']");
    private static By emailBox = By.xpath("//input[@id='create-new-account-email']");
    private static By passwordBox = By.xpath("//input[@id='create-new-account-password']");
    private static By confirmPasswordBox = By.xpath("//input[@id='create-new-account-confirm-password']");
    private static By zipCode = By.xpath("//input[@id='create-new-account-postal-code']");
    private static By radioButton = By.xpath("//span[@class='radiogroup__radio-label'][text()='Yes']");
    private static By notice = By.xpath("//span[@class='checkbox__checkbox-label']");
    private static By createAccountBtn = By.cssSelector(".hbc-button--primary");
    private static By welcomeText = By.xpath("//h1[@class='account-header__greeting']");
    private static By missingField = By.xpath("//span[@class='text-field__error-message']");
    private static By terms = By.xpath("//a[@class='create-new-account__terms-of-service']");
    private static By cancelButton = By.xpath("//button[contains(@class, 'hbc-button--secondary')]");
    private static By signInToMyAccount = By.xpath("//h2[@class='sign-into-account__title']");

    public static By getFirstNameBox() {
        return firstNameBox;
    }

    public static By getLastNameBox() {
        return lastNameBox;
    }

    public static By getEmailBox() {
        return emailBox;
    }

    public static By getPasswordBox() {
        return passwordBox;
    }

    public static By getConfirmPasswordBox() {
        return confirmPasswordBox;
    }

    public static By getZipCode() {
        return zipCode;
    }

    public static By getRadioButton() {
        return radioButton;
    }

    public static By getNotice() {
        return notice;
    }

    public static By getCreateAccountBtn() {
        return createAccountBtn;
    }

    public static By getWelcomeText() {
        return welcomeText;
    }

    public static By getMissingField() {
        return missingField;
    }

    public static By getTerms() {
        return terms;
    }

    public static By getCancelButton() {
        return cancelButton;
    }

    public static By getSignInToMyAccount() {
        return signInToMyAccount;
    }

}
