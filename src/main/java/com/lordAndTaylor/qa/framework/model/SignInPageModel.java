package com.lordAndTaylor.qa.framework.model;

import org.openqa.selenium.By;

/**
 * Created by Debajyoti Paul on 4/11/2018 at 2:52 AM
 */
public class SignInPageModel{

    private static By createAccountLink = By.cssSelector(".account-message-card__button");
    private static By emailBox = By.xpath("//input[@id='sign-into-account-email-field']");
    private static By passwordBox = By.xpath("//input[@id='sign-into-account-password-field']");
    private static By signInButton = By.xpath("//button[contains(@class, 'sign-into-account__submit-button')]");
    private static By welcomeText = By.xpath("//h1[@class='account-header__greeting']");
    private static By errorMessage = By.xpath("//div[@class='alert alert--danger']/span");
    private static By missingField = By.xpath("//span[@class='text-field__error-message']");
    private static By forgetPasswordLink = By.xpath("//div[@class='sign-into-account__forgot-password']/a");
    private static By forgetPasswordEmailBox = By.xpath("//input[@id='forgotPasswordPageEmailField']");
    private static By continueBtn = By.xpath("//button[@class='hbc-button hbc-button--block hbc-button--primary']");
    private static By passwordReset = By.xpath("//p[@class='account-message-card__message']");
    private static By orderNumberBox = By.xpath("//input[@id='order-status-order-number']");
    private static By zipCodeBox = By.xpath("//input[@id='order-status-zip-code']");
    private static By errorMsg = By.xpath("//div[@class='alert alert--danger']/span");
    private static By submitBtn = By.xpath("//button[@class='hbc-button hbc-button--block hbc-button--secondary']");

    public static By getCreateAccountLink() {
        return createAccountLink;
    }

    public static By getEmailBox() {
        return emailBox;
    }

    public static By getPasswordBox() {
        return passwordBox;
    }

    public static By getSignInButton() {
        return signInButton;
    }

    public static By getWelcomeText() {
        return welcomeText;
    }

    public static By getErrorMessage() {
        return errorMessage;
    }

    public static By getMissingField() {
        return missingField;
    }

    public static By getForgetPasswordLink() {
        return forgetPasswordLink;
    }

    public static By getForgetPasswordEmailBox() {
        return forgetPasswordEmailBox;
    }

    public static By getContinueBtn() {
        return continueBtn;
    }

    public static By getPasswordReset() {
        return passwordReset;
    }

    public static By getOrderNumberBox() {
        return orderNumberBox;
    }

    public static By getZipCodeBox() {
        return zipCodeBox;
    }

    public static By getErrorMsg() {
        return errorMsg;
    }

    public static By getSubmitBtn() {
        return submitBtn;
    }

}
