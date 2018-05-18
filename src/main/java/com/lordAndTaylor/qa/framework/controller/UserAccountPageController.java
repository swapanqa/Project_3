package com.lordAndTaylor.qa.framework.controller;

import com.lordAndTaylor.qa.framework.model.UserAccountPageModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Debajyoti Paul on 4/11/2018 at 11:54 PM
 */
public class UserAccountPageController extends PageBaseMethods {

    public UserAccountPageController(WebDriver driver) {
        super(driver);
    }

    // ****************************** Credit Card apply now methods ******************************** //

    public void clickApplyLink() {
        clickElement(UserAccountPageModel.getApplyLink());
    }

    public void switchToApplyNowPage() {
        switchToLastOpenWindow();
    }

    // ************************* Add Shipping Address -- Methods *************************** //

    public void clickShippingAddressNavLink() {
        clickElement(UserAccountPageModel.getShippingAddressNavigationLink());
    }

    public void clickAddShippingAddressLink() {
        //clickElement(UserAccountPageModel.addShippingAddressLink);
        javascriptUtils().actionClick(driver.findElement(UserAccountPageModel.getAddShippingAddressLink()));
    }

    public void selectCountry(String country) {
        clickElement(UserAccountPageModel.getCountryBox());

        List<WebElement> dropdownList = driver.findElements(UserAccountPageModel.getCountryDropdownList());
        int count = 1;
        for (WebElement option : dropdownList) {
            String countryName = option.getText();
            System.out.println("Country #" + count + " -- " + countryName);
            if (countryName.trim().equalsIgnoreCase(country)) {
                option.click();
                break;
            }
            count++;
        }
    }

    public void selectState(String state) {
        clickElement(UserAccountPageModel.getStateBox());

        List<WebElement> dropdownList = driver.findElements(UserAccountPageModel.getStateDropdownList());
        int count = 1;
        for (WebElement option : dropdownList) {
            String stateName = option.getText();
            System.out.println("State #" + count + " -- " + stateName);
            if (stateName.trim().equalsIgnoreCase(state)) {
                option.click();
                break;
            }
            count++;
        }
    }

    public void typeFullName(String first, String last) {
        typeText(UserAccountPageModel.getFirstName(), first);
        typeText(UserAccountPageModel.getLastName(), last);
    }

    public void typeFullAddressAndCity(String address, String city) {
        typeText(UserAccountPageModel.getAddressBox(), address);
        typeText(UserAccountPageModel.getCityBox(), city);
    }

    public void typeZipCode(String zipcode) {
        typeText(UserAccountPageModel.getZipCodeBox(), zipcode);
    }

    public void typePhoneNumber(String phone) {
        typeText(UserAccountPageModel.getPhoneBox(), phone);
    }

    public void selectDefaultBillingAddressCheckBox() {
        clickElement(UserAccountPageModel.getBillingCheckBox());
    }

    public void clickSubmitButton() {
        clickElement(UserAccountPageModel.getSubmitButton());
    }

    public void verifyAddedShippingAddress(String expectedHeaderText, String expectedAddress) {
        verifyText(UserAccountPageModel.getDefaultShippingAddressHeader(), expectedHeaderText);
        verifyText(UserAccountPageModel.getDefaultShippingAddress(), expectedAddress);
    }

    public void verifySameDefaultBillingAndShippingAddress(String expectedHeaderText, String expectedAddress) {
        clickElement(UserAccountPageModel.getBillingAddressLink());
        verifyText(UserAccountPageModel.getDefaultShippingAddressHeader(), expectedHeaderText);
        verifyText(UserAccountPageModel.getDefaultShippingAddress(), expectedAddress);
    }

    // **************************** Add new payment cards -- methods ******************************** //

    public void clickPaymentsNavLink() {
        clickElement(UserAccountPageModel.getPaymentNavigationLink());
    }

    public void clickAddPaymentLink() {
        clickElement(UserAccountPageModel.getAddPaymentLink());
    }

    public void addFullName(String name) {
        typeText(UserAccountPageModel.getFullName(), name);
    }

    public void addCardInfo(String cardNumber) {
        typeText(UserAccountPageModel.getCardBox(), cardNumber);
    }

    public void enterMonth(String month) {
        clickElement(UserAccountPageModel.getMonthElement());

        List<WebElement> months = driver.findElements(UserAccountPageModel.getMonthList());
        for (WebElement option : months) {
            String monthName = option.getText().trim();
            System.out.println("Month #" + monthName);
            if (monthName.equalsIgnoreCase(month)) {
                option.click();
                break;
            }
        }
    }

    public void enterYear(String year) {
        clickElement(UserAccountPageModel.getYearElement());

        List<WebElement> years = driver.findElements(UserAccountPageModel.getYearList());
        int count = 1;
        for (WebElement option : years) {
            String yearNumber = option.getText();
            System.out.println("Year #" + count + " -- " + yearNumber);
            if (yearNumber.equalsIgnoreCase(year)) {
                option.click();
                break;
            }
            count++;
        }
    }

    public void clickPaymentSubmitButton() {
        clickElement(UserAccountPageModel.getSubmitButton());
    }

    public void verifyAddPaymentErrorMsg(String expectedText) {
        verifyText(UserAccountPageModel.getError(), expectedText);
    }

    public void scrollToYourProfile() {
        WebElement element = driver.findElement(UserAccountPageModel.getYourProfile());
        javascriptUtils().scrollToElement(element);
    }

    public void clickBackToTopButton() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(UserAccountPageModel.getElementToWait()));
        boolean status = element.isDisplayed();
        if (status) {
            System.out.println("===== Element is visible ======");
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();
        } else {
            System.out.println("===== Element is not visible ======");
        }
    }

    public void verifyBackToTopOfThePage() {
        verifyTextIsPresent(UserAccountPageModel.getWelcomeText(), "Welcome,");
    }

    public void checkStateDropdownAlphabeticalOrder() {
        clickElement(UserAccountPageModel.getStateBox());

        List<WebElement> dropdownList = driver.findElements(UserAccountPageModel.getStateDropdownList());
        String[] states = new String[dropdownList.size() - 1];
        for (int i = 1; i < dropdownList.size(); i++) {   // index[0] = "state/province" header -- not required in this case
            String stateName = dropdownList.get(i).getText();
            states[i - 1] = stateName;
        }

        String modifiedStates[] = new String[dropdownList.size() - 1];
        for (int i = 1; i < dropdownList.size(); i++) {
            String stateName1 = dropdownList.get(i).getText();
            modifiedStates[i - 1] = stateName1;
        }
        String temp = null;
        int result;
        for (int i = 0; i < modifiedStates.length - 3; i++) {
            for (int j = 1; j < (modifiedStates.length - 3 - i); j++) {
                result = modifiedStates[j - 1].compareTo(modifiedStates[j]);
                if (result > 0) {
                    temp = modifiedStates[j - 1];
                    modifiedStates[j - 1] = modifiedStates[j];
                    modifiedStates[j] = temp;
                }
            }
        }
        System.out.println("Actual States -- " + Arrays.deepToString(states));
        System.out.println("Modified States -- " + Arrays.deepToString(modifiedStates));
        Assert.assertEquals(modifiedStates, states);
    }

    public void verifyNavBarOptions(String[] expectedOptions){
        List<WebElement> options = driver.findElements(UserAccountPageModel.getNavBarOptions());
        String[] actualOptions = new String[options.size()];

        int count = 1;
        for(WebElement option : options){
            String text = option.getText().trim();
            System.out.println("Navigation bar option #" + count + " -- " + text);
            actualOptions[count-1] = text;
            count++;
        }

        Assert.assertEquals(expectedOptions,actualOptions);
    }

    public void clickOrderHistoryLink(){
        clickElement(UserAccountPageModel.getOrderHistoryLink());
    }

    public void verifyNoOrderHistoryMsg(String[] expectedMessage){
        List<WebElement> messages = driver.findElements(UserAccountPageModel.getNoOrderHistoryMsg());
        String[] actualMessages = new String[messages.size()];

        int count = 1;
        for(WebElement option : messages){
            String text = option.getText().trim();
            System.out.println("Actual Message #" + count + " -- " + text);
            actualMessages[count-1] = text;
            count++;
        }

        Assert.assertEquals(expectedMessage,actualMessages);
    }

    public void verifyShippingAddressMissingFieldErrorMsg(){
        verifyText(UserAccountPageModel.getMissingFieldErrorMsg(), "This field is required.");
    }

    public void verifyNameInAddress1(String name){
        delay(1500);
        refreshPage();
        delay(1500);
        verifyText(UserAccountPageModel.getNameInAddress1(), name);
    }

    public void clickDefaultShippingAddress(){
        clickElement(UserAccountPageModel.getCheckDefaultShippingAddress());
    }

    public void clickEditLink(){
        clickElement(UserAccountPageModel.getEditLink());
    }

    public void editFirstName(String name){
        typeText(UserAccountPageModel.getFirstName(), name);
    }


}
