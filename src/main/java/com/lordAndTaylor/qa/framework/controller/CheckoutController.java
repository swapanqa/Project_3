package com.lordAndTaylor.qa.framework.controller;

import com.lordAndTaylor.qa.framework.model.CheckoutModel;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

/**
 * Created by Debajyoti Paul on 4/26/2018 at 6:38 PM
 */
public class CheckoutController extends PageBaseMethods {

    public CheckoutController(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(String first){
        typeText(CheckoutModel.getFirstNameBox(), first);
    }

    public void enterlastName(String last){
        typeText(CheckoutModel.getLastNameBox(), last);
    }

    public void enterAddress(String address){
        typeText(CheckoutModel.getAddress1Box(), address);
    }

    public void enterCity(String city){
        typeText(CheckoutModel.getCityBox(), city);
    }

    public void enterZipCode(String zip){
        typeText(CheckoutModel.getZipCodeBox(), zip);
    }

    public void enterState(String state){
        clickElement(CheckoutModel.getStateDropdownBox());
        List<WebElement> states = driver.findElements(CheckoutModel.getStateList());
        int count = 1;
        for(WebElement option: states){
            String text = option.getText().trim();
            System.out.println("State #" + count + " -- " + text);
            if(text.equalsIgnoreCase(state.trim())){
                option.click();
                break;
            }
            count++;
        }
    }

    public void enterEmail(String email){
        typeText(CheckoutModel.getEmailBox(), email);
    }

    public void enterPhoneNumber(String phone){
        typeText(CheckoutModel.getPhoneNumberBox(), phone);
    }

    public void clickCheckout(){
        do{
            clickElement(CheckoutModel.getCheckoutBtn());
            delay(2000);
        }while (!driver.findElement(CheckoutModel.getUseAddressAsGivenButton()).getText().trim().equalsIgnoreCase("Use Address As Entered"));
    }

    public void clickCheckoutEx(){
        do{
            try{
                clickElement(CheckoutModel.getCheckoutBtn());
                delay(1500);
            }catch (StaleElementReferenceException ex){}
        }while (!driver.findElement(CheckoutModel.getMissingCityErrorMsg()).getText().trim().contains("Please enter a city."));
    }

    public void verifyMissingFieldErrorMsg(){
        verifyText(CheckoutModel.getMissingCityErrorMsg(), "Please enter a city.");
    }

    public void verifyProduct(){
        verifyText(CheckoutModel.getItemHeaderText(), "Hydroguard Mica Top");
    }

    public void verifyMakeBillingCheckBoxIsChecked(){
        WebElement element = driver.findElement(CheckoutModel.getMakeBillingCheckBox());
        Assert.assertTrue(element.isSelected());
    }

    public void clickAddressAsEntered(){
        do{
            clickElement(CheckoutModel.getUseAddressAsGivenButton());
        }while(!(driver.findElement(CheckoutModel.getCreditCardNumberText()).getText().trim().equalsIgnoreCase("Credit Card Number")));
    }

    public void clickPaymentDropdown(){
        clickElement(CheckoutModel.getPaymentDropdown());
    }

    public void verifyPaymentOptions(String[] expectedOptions){
        List<WebElement> paymentOptions = driver.findElements(CheckoutModel.getPaymentDropdownOptions());

        String[] actualOptions = new String[paymentOptions.size()-1];
        for(int i=1; i<paymentOptions.size(); i++){
            String optionName = paymentOptions.get(i).getAttribute("innerHTML").trim();
            actualOptions[i-1] = optionName;
            System.out.println("Payment option #" + i + " -- " + optionName);
        }

        Assert.assertEquals(actualOptions, expectedOptions);

    }

    public void selectPaymentOptions(String paymentOption){
        List<WebElement> options = driver.findElements(CheckoutModel.getPaymentDropdownOptions());
        for(WebElement option : options){
            String optionName = option.getText().trim();
            if(optionName.contains(paymentOption.trim())){
                option.click();
                break;
            }
        }
    }

    public void enterCardNumber(String number){
        typeText(CheckoutModel.getCreditCardNumber(), number);
    }

    public void enterCardName(String name){
        typeText(CheckoutModel.getCardName(), name);
    }

    public void selectCardMonth(String month){
        clickElement(CheckoutModel.getCardMonth());
        List<WebElement> months = driver.findElements(By.xpath("//select[@id='ccMonth']/option"));
        for(WebElement m : months){
            String monthName = m.getText().trim();
            if(monthName.contains(month.trim())){
                javascriptUtils().highlight(m);
                m.click();
                break;
            }
        }
    }

    public void selectCardYear(String year){
        clickElement(CheckoutModel.getCardYear());
        List<WebElement> years = driver.findElements(By.xpath("//select[@id='ccYear']/option"));
        for(WebElement m : years){
            String monthName = m.getText().trim();
            if(monthName.contains(year.trim())){
                javascriptUtils().highlight(m);
                m.click();
                break;
            }
        }
    }

    public void enterCardCCV(String CCV){
        typeText(CheckoutModel.getCardCCV(), CCV);
    }

    public void clickCheckoutButton(){
        clickElement(CheckoutModel.getContinueCheckout());
    }

    public void verifyPaymentReview(String expectedText){
        verifyTextIsPresent(CheckoutModel.getPaymentReview(), expectedText);
    }

    public void verifyInvalidCardErrorMsg(){
        verifyText(CheckoutModel.getInvalidCardErrorMsg(), "Enter a valid credit card number.");
    }

    public void enterGiftCard(String number){
        typeText(CheckoutModel.getGiftCardNumber(), number);
    }

    public void enterCardPin(String number){
        typeText(CheckoutModel.getPinNumber(), number);
    }

    public void verifyGiftCardErrorMsg(){
        verifyText(CheckoutModel.getGiftCardErrorMsg(), "Please enter a valid card number.");
    }

    public void clickGiftCardApplyLink(){
        clickElement(CheckoutModel.getGiftCardApplyButton());
    }

    public void clickEditLink(){
        driver.navigate().refresh();
        clickElement(CheckoutModel.getEditLink());
        delay(2000);
    }

    public void enterNewQuantity(String quantity){
        typeText(CheckoutModel.getEditItemNumber(), quantity);
        delay(2500);
    }

    public void clickApplyButton(){
        clickElement(CheckoutModel.getEditApplyButton());
        delay(2500);
    }

    public void selectNewItemSize(){
        clickElement(CheckoutModel.getNewItemSize());
        delay(2000);
    }

    public void verifyUpdatedItemSize(){
        verifyText(CheckoutModel.getUpdatedItemSize(), "Medium");
    }

    public void newSubTotalAfterEdit(String subTotal){
        driver.navigate().refresh();
        delay(2000);
        verifyText(CheckoutModel.getSubTotalAfterEdit(), subTotal);
    }

    public void clickItemRemoveLink(){
        driver.navigate().refresh();
        clickElement(CheckoutModel.getItemRemoveLink());
        delay(2000);
    }

    public void clickConfirmRemove(){
        clickElement(CheckoutModel.getConfirmRemove());
    }

    public void verifyMsgAfterRemovingItem(){
        verifyText(CheckoutModel.getEmptyBagMsg(), "There are no items in your bag.");
    }

    public void verifyPaymentPage(){
        verifyText(CheckoutModel.getPaymentLink(), "PAYMENT");
    }

    public void clickContinueCheckoutToReview(){
        clickElement(CheckoutModel.getContinueCheckoutToReview());
    }

    public void verifyReviewPage(){
        verifyTextIsPresent(CheckoutModel.getReviewLink(), "REVIEW");
    }

    public void verifyShippingAddress(String[] expectedShippingAddress){
        String address = driver.findElement(CheckoutModel.getShippingAddress1()).getText().trim();
        String city = driver.findElement(CheckoutModel.getShippingCity()).getText().trim();
        String state = driver.findElement(CheckoutModel.getShippingRegion()).getText().trim();
        String zipCode = driver.findElement(CheckoutModel.getShippingZipCode()).getText().trim();

        String[] actualShippingAddress = {address, city, state, zipCode};
        Assert.assertEquals(expectedShippingAddress, actualShippingAddress);

    }

    public void verifyDeliveryOption(){
        String radio = driver.findElement(CheckoutModel.getDeliveryRadioButton()).getAttribute("class");
        if(radio.contains("selected")){
            System.out.println("Standard delivery option is checked.");
        }
    }

    public void clickPromoCodeLink(){
        clickElement(CheckoutModel.getPromoCodeEditLink());
    }

    public void enterPromoCode(String code){
        typeText(CheckoutModel.getEnterPromoCode(), code);
    }

    public void clickApplyPromoCode(){
        clickElement(CheckoutModel.getPromoApplyButton());
    }

    public void verifyPromoCodeErrorMsg(){
        verifyTextIsPresent(CheckoutModel.getPromoCodeErrorMsg(), "The code you have entered for this promotion is invalid. ");
    }

    public void clickPlaceOrder(){
        clickElement(CheckoutModel.getPlaceOrderButton());
    }

    public void verifyOrderErrorMessage(){
        verifyText(CheckoutModel.getOrderErrorMsg(), "Your payment information cannot be processed as entered. Please review and try again.");
    }

    public void verifyOrderTotal(String total){
        verifyText(CheckoutModel.getOrderTotal(), total);
    }

    public void verifyDeliveryAmount(){
        verifyText(CheckoutModel.getDeliveryAmount(), "FREE");
    }

}
