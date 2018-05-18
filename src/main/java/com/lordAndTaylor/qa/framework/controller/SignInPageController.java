package com.lordAndTaylor.qa.framework.controller;

import com.lordAndTaylor.qa.framework.model.SignInPageModel;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * Created by Debajyoti Paul on 4/11/2018 at 2:52 AM
 */
public class SignInPageController extends PageBaseMethods {

    public SignInPageController(WebDriver driver) {
        super(driver);
    }

    public void clickCreateAccountLink() {
        clickElement(SignInPageModel.getCreateAccountLink());
    }

    public void typeEmail(String email) {
        typeText(SignInPageModel.getEmailBox(), email);
    }

    public void typePassword(String password) {
        typeText(SignInPageModel.getPasswordBox(), password);
        delay(2000);
    }

    public void clickSignInButton() {
        do{
            clickElement(SignInPageModel.getSignInButton());
            delay(2500);
        }while(!(driver.getCurrentUrl().contains("/account/summary")));
    }

    public void clickSignInButtonEx() {
        int count = 0;
        do{
            try {
                clickElement(SignInPageModel.getSignInButton());
            }catch (StaleElementReferenceException ex){}
            count++;
        }while(count<5);
    }

    public void verifySignInSuccessMsg(String firstName) {
        delay(2000);
        verifyText(SignInPageModel.getWelcomeText(), firstName + "'s Account");
    }

    public boolean verifySignInErrorMsgEx(){
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        String actualText = driver.findElement(SignInPageModel.getErrorMsg()).getText().trim();
        String expectText = "does not match our records.";
        try{
            if(actualText.contains(expectText)){
                return true;
            }
        }catch (Exception ex){}
        return false;

//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void verifySignInErrorMsg(){
        delay(4000);
        verifyTextIsPresent(SignInPageModel.getErrorMsg(), "does not match our records.");
    }

    public void verifyMissingFieldText(String expectedText){
        verifyText(SignInPageModel.getMissingField(), expectedText);
    }

    public void signIntoMyAccount(){
       do{
           refreshPage();
           typeEmail("debajyoti1234500@gmail.com");
           typePassword("Shiftqa0119!!");
           clickSignInButton();
           delay(2000);
       }while(!(driver.getCurrentUrl().contains("/account/summary")));
    }

    public void clickForgetPasswordLink() {
        clickElement(SignInPageModel.getForgetPasswordLink());
    }

    public void typeEmailForPasswordReset(String email) {
        typeText(SignInPageModel.getForgetPasswordEmailBox(), email);
    }

    public void clickContinueButton(){
        clickElement(SignInPageModel.getContinueBtn());
    }

    public void verifyPasswordResetMsg(){
        String expectedText = "An email has been sent to you at ";
        verifyTextIsPresent(SignInPageModel.getPasswordReset(), expectedText);
    }

    public void typeOrderNumber(String orderNumber) {
        typeText(SignInPageModel.getOrderNumberBox(), orderNumber);
    }

    public void typeZipCode(String zipcode) {
        typeText(SignInPageModel.getZipCodeBox(), zipcode);
    }

    public void verifyErrorMsg(){
        verifyTextIsPresent(SignInPageModel.getErrorMsg(), "We were not able to find your order. Please check your order number and billing address zip code and try again.");
    }

    public void clickSubmitButton() {
        clickElement(SignInPageModel.getSubmitBtn());
    }

}
