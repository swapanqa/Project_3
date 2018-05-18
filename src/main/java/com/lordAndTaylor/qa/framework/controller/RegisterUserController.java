package com.lordAndTaylor.qa.framework.controller;

import com.lordAndTaylor.qa.framework.model.RegisterUserModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Debajyoti Paul on 4/11/2018 at 2:42 AM
 */
public class RegisterUserController extends PageBaseMethods {

    public RegisterUserController(WebDriver driver) {
        super(driver);
    }

    public void typeFullName(String firstName, String lastName) {
        typeText(RegisterUserModel.getFirstNameBox(), firstName);
        typeText(RegisterUserModel.getLastNameBox(), lastName);
    }

    public void typeEmail(String email) {
        typeText(RegisterUserModel.getEmailBox(), email);
    }

    public void typePassword(String password, String confirmPassword) {
        typeText(RegisterUserModel.getPasswordBox(), password);
        typeText(RegisterUserModel.getConfirmPasswordBox(), confirmPassword);
    }

    public void typeZipCode(String zip) {
        typeText(RegisterUserModel.getZipCode(), zip);
    }

    public void registerAsCanadianUser(){
        clickElement(RegisterUserModel.getRadioButton());
    }

    public void verifyCanadianUserNotice(){
        verifyTextIsPresent(RegisterUserModel.getNotice(), "I agree to receive electronic marketing");
    }

    public void clickCreateAccountButton() {
        clickElement(RegisterUserModel.getCreateAccountBtn());
    }

    public void verifyRegistrationSuccess(String firstName) {
        verifyText(RegisterUserModel.getWelcomeText(), firstName + "'s Account");
    }

    public void verifyInvalidOrIncorrectFieldText(String expectedText){
        verifyText(RegisterUserModel.getMissingField(), expectedText);
    }

    public void clickTermsAndConditionsLink() {
        clickElement(RegisterUserModel.getTerms());
    }

    public void switchToTermsAndConditionsPage() {
        switchToLastOpenWindow();
    }

    public void clickCancelButton() {
        clickElement(RegisterUserModel.getCancelButton());
    }

    public void verifySignInPageText() {
        verifyTextIsPresent(RegisterUserModel.getSignInToMyAccount(), "Sign Into My Account");
    }

}
