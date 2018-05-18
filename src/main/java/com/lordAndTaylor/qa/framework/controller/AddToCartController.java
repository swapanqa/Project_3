package com.lordAndTaylor.qa.framework.controller;

import com.lordAndTaylor.qa.framework.model.AddToCartModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.hamcrest.number.OrderingComparison.lessThan;

import java.util.List;

/**
 * Created by Debajyoti Paul on 4/25/2018 at 3:38 PM
 */
public class AddToCartController extends PageBaseMethods {

    public AddToCartController(WebDriver driver) {
        super(driver);
    }

    public void verifyProductDescriptionInPopUp(String[] expectedText){
        List<WebElement> details = driver.findElements(AddToCartModel.getProductDetailsInPopUp());
        String[] productDetails = new String[details.size()];
        int count = 0;
        for(WebElement option: details){
            String text = option.getText();
            System.out.println("Product Details #" + (count+1) + " -- " + text);
            productDetails[count] = text;
            count++;
        }

        Assert.assertEquals(productDetails, expectedText);
    }

    public void enterProductQuantity(String number){
        typeText(AddToCartModel.getProductQuantity(), number);
    }

    public void verifyPriceInPopUp(String price){
        verifyText(AddToCartModel.getProductPriceInPopUp(), "Estimated total: " + price);
    }

    public void clickViewMyBagButton(){
        explicitWait().waitForVisibilityOfElement(AddToCartModel.getViewMyBagButton());
        clickElement(AddToCartModel.getViewMyBagButton());
    }

    public void clickShoppingBagInNavBar(){
        clickElement(AddToCartModel.getShoppingBagLinkInNavigationBar());
    }

    public void verifyShoppingBagPage(){
        verifyText(AddToCartModel.getHeaderTextInShoppingBagPage(), "BAG");
    }

    public void clickAddToBagButton(){
        do{
            clickElement(AddToCartModel.getAddToBagButton());
            delay(4000);
        }while (!driver.findElement(AddToCartModel.getViewMyBagButton()).isDisplayed());

    }

    public void clickPopUpCloseButton(){
        clickElement(AddToCartModel.getPopUpCloseButton());
    }

    public void shoppingBagPopUpDisplay(){
        delay(5000);
        verifyTextV2(AddToCartModel.getViewMyBagButton(), "VIEW MY BAG & CHECKOUT");
    }

    public void enterNewQuantity(String quantity){
        clickElement(AddToCartModel.getUpdateQuantityBox());
        typeText(AddToCartModel.getUpdateQuantityBox(), quantity);
        delay(3000);
    }

    public void verifyUpdatedSubTotalPrice(String price){
        verifyText(AddToCartModel.getSubTotalPrice(), price);
    }

    public void clickEditLink(){
        clickElement(AddToCartModel.getItemEditLink());
        delay(3000);
    }

    public void chooseSizeMedium(){
        clickElement(AddToCartModel.getItemSizeMedium());
    }

    public void clickApplyButton(){
        clickElement(AddToCartModel.getItemUpdateApplyBtn());
    }

    public void verifyItemSizeText(String size){
        delay(3000);
        verifyText(AddToCartModel.getItemSizeText(), size);
    }

    public void clickRemoveItemLink(){
        clickElement(AddToCartModel.getRemoveItemLink());
    }

    public void clickConfirmRemove(){
        clickElement(AddToCartModel.getConfirmRemoveItem());
    }

    public void clickCancelRemove(){
        clickElement(AddToCartModel.getCancelRemoveItem());
    }

    public void verifyItemName(){
        verifyText(AddToCartModel.getItemName(), "Hydroguard Mica Top");
    }

    public void verifyNoItemInBag(){
        verifyText(AddToCartModel.getNoItemInBagText(), "There are no items in your bag.");
    }

    public void enterZipCode(String zip){
        typeText(AddToCartModel.getZipcodeBox(), zip);
        delay(2000);
    }

    public void clickShippingOptions(){
        clickElement(AddToCartModel.getShippingMethodDropdown());
        delay(3000);
    }

    public void verifyShippingOptions(String[] shippingOptions){
        List<WebElement> shippingOptionList = driver.findElements(AddToCartModel.getShippingMethodOptionList());
        String[] actualOptions = new String[shippingOptionList.size()-1];
        for(int i=0; i<3; i++){
            String optionName = shippingOptionList.get(i).getAttribute("innerHTML").trim();
            actualOptions[i] = optionName;
            System.out.println("Shipping option #" + (i+1) + " -- " + optionName);
        }

        String[] modifiedActualOptions = new String[shippingOptionList.size()-1];
        String[] modifiedShippingOptions = new String[shippingOptions.length];
        for(int i=0; i<3; i++){
            String[] s1 = actualOptions[i].split("\\s", 2);
            modifiedActualOptions[i] = s1[0];

            String[] s2 = shippingOptions[i].split("\\s", 2);
            modifiedShippingOptions[i] = s2[0];
        }

        Assert.assertEquals(modifiedActualOptions, modifiedShippingOptions);
    }

    public void chooseShippingMethod(String shippingOption){
        List<WebElement> shippingOptionList = driver.findElements(AddToCartModel.getShippingMethodOptionList());
        for(WebElement option : shippingOptionList){
            String optionName = option.getAttribute("innerHTML").trim();
            System.out.println(optionName);
            if(optionName.trim().toLowerCase().contains(shippingOption.trim().toLowerCase())){
                option.click();
                break;
            }
        }
        delay(3000);
    }

    public void clickCheckOutButton(){
        do{
            refreshPage();
            clickElement(AddToCartModel.getCheckoutButton());
            delay(2000);
        }while (!driver.findElement(AddToCartModel.getCheckOutAsGuestButton()).getText().trim().equalsIgnoreCase("Checkout as Guest"));
    }

    public void verifyGrandTotal(String total){
        verifyText(AddToCartModel.getGrandTotalCost(), total);
    }

    public void clickCheckoutAsGuest(){
       javascriptUtils().actionClick(driver.findElement(AddToCartModel.getCheckOutAsGuestButton()));
    }

    public void verifyShippingAndBillingPage(){
        verifyTextIsPresent(AddToCartModel.getShippingAndBillingPageText(), "SHIPPING & BILLING");
    }

    public void clickPaypalCheckoutLink(){
        clickElement(AddToCartModel.getPaypalCheckoutButton());
        switchToLastOpenWindow();
        delay(3000);
    }

    public void switchToMasterpassIFrame(){
        List<WebElement> iFrameList = driver.findElements(AddToCartModel.getCheckoutPageIframes());
        for(WebElement iFrame : iFrameList){
            String src = iFrame.getAttribute("src");
            System.out.println("Src: " + src);
            if(src.contains("//masterpass.com/switchui/index.html?allowedCardTypes=master%2Camex%2Cdiners%2Cdiscover%2Cvisa&callbackUrl")){
                driver.switchTo().frame(iFrame);
                break;
            }
        }
    }

    public void clickMasterPassCheckoutLink(){
        clickElement(AddToCartModel.getMasterpassCheckoutButton());
        delay(3000);
    }

    public void verifyPaypalPage(){
        //verifyPageTitle("PayPal Checkout", "Paypal Page");
        System.out.println("Page Title is : " + driver.getTitle());
        boolean result = driver.getTitle().contains("PayPal");
        Assert.assertTrue(result);
    }

    public void verifyMasterpassPage(){
        verifyText(AddToCartModel.getMasterpassHeader(), "Welcome to Masterpass");
    }

    public void enterPhoneNumber(){
        typeText(AddToCartModel.getMasterPassPhoneBox(), "3477891356");
    }

    public void clickSignUp(){
        clickElement(AddToCartModel.getMasterPassSignUpBtn());
    }

    public void enterInvalidCreditCardNumber(){
        typeText(AddToCartModel.getMasterpassCreditCardBox(), "4125455880154455");
        delay(2000);
        clickElement(AddToCartModel.getGetMasterpassHeader2());
        delay(1500);
    }

    public void verifyCreditCardErrorMsg(){
        verifyText(AddToCartModel.getMasterpassErrorMsg(), "We're sorry, but we can't accept this card. Please try another.");
    }

    public void clickMasterPassCrossButton(){
        clickElement(AddToCartModel.getMasterpassCrossBtn());
    }

    public void clickNikeRunningTeeProduct(){
        clickElement(AddToCartModel.getNikeRunningTee());
    }

    public void selectNikeTeeBlackColor(){
        clickElement(AddToCartModel.getNikeRunningTeeColor());
    }

    public void verifyNikeRunningTeePage(){
        verifyText(AddToCartModel.getNikeRunningTeeHeader(), "Dry Printed Running Tee");
    }

    public void verifyItemsInShippingBagPage(String[] expectedItems){
        List<WebElement> items = driver.findElements(AddToCartModel.getItemsInShoppingBag());
        String[] actualItems = new String[items.size()];
        int count = 1;
        for(WebElement option : items){
            String text = option.getText().trim();
            System.out.println("Actual Item #" + count + " -- " + text);
            actualItems[count-1] = text;
            count++;
        }

        //Assert.assertEquals(actualItems, expectedItems);
        assertThat(actualItems, is(arrayContainingInAnyOrder(expectedItems)));
    }

}
