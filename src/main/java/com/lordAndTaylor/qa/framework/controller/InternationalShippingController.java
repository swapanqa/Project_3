package com.lordAndTaylor.qa.framework.controller;

import com.lordAndTaylor.qa.framework.model.InternationalShippingModel;
import com.lordAndTaylor.qa.framework.utils.extra_utils.RegexArrayMatcher;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.startsWith;

/**
 * Created by Debajyoti Paul on 4/20/2018 at 2:21 PM
 */
public class InternationalShippingController extends PageBaseMethods {

    public InternationalShippingController(WebDriver driver) {
        super(driver);
    }

    public void clickOnShipToCountryLink(){
        clickElement(InternationalShippingModel.getShipToLink());
    }

    public void verifyShipToCountryPage(){
        verifyText(InternationalShippingModel.getShipToPageHeader(), "INTERNATIONAL SHIPPING");
    }

    public void selectCountry(String country){
        clickElement(InternationalShippingModel.getCountryDropdown());

        List<WebElement> countries = driver.findElements(InternationalShippingModel.getCountryList());
        int count = 1;
        for(WebElement option : countries){
            String text = option.getText();
            System.out.println("Country #" + count + " -- " + text);
            count++;
            if(text.trim().equalsIgnoreCase(country)){
                option.click();
                break;
            }
        }
    }

    public void selectCurrency(String currency){
        clickElement(InternationalShippingModel.getCurrencyDropdown());

        List<WebElement> countries = driver.findElements(InternationalShippingModel.getCurrencyList());
        int count = 1;
        for(WebElement option : countries){
            String text = option.getText();
            System.out.println("Currency #" + count + " -- " + text);
            count++;
            if(text.trim().equalsIgnoreCase(currency)){
                option.click();
                break;
            }
        }
    }

    public void clickSaveAndContinue(){
        clickElement(InternationalShippingModel.getSaveContinueButton());
    }

    public void clickBackToUSASite(){
        clickElement(InternationalShippingModel.getBackToUSAButton());
    }

    public void closePopUp(){
        try {
            switchToLastOpenWindow();
            clickElement(InternationalShippingModel.getPopUpCloseButton());
        }catch (Exception ex){
            System.out.println("Element wasn't visible, needed to refresh the page.");
        }

        refreshPage();

    }

    public void verifyCountrySwitch(String countryCode){
        WebElement flag = driver.findElement(InternationalShippingModel.getCountryFlag());
        String flagImageLink = flag.getAttribute("src");
        if(flagImageLink.trim().equalsIgnoreCase("/static/images/flags/" + countryCode)){
            System.out.println("Country Switch verified..!!");
        }
    }

    public void verifyProductPriceCurrency(){
        refreshPage();
        delay(2000);
        String actualPrice = driver.findElement(InternationalShippingModel.getProductPriceCurrency()).getText().trim();
        assertThat(actualPrice, containsString("INR"));
    }

    public void verifyInternationalShippingNotice(String[] expectedNotices){
        List<WebElement> notices = driver.findElements(InternationalShippingModel.getInternationalShippingNotice());
        String[] actualNotices = new String[notices.size()];
        int count = 1;
        for(WebElement text : notices){
            javascriptUtils().highlight(text);
            String notice = text.getAttribute("innerText");
            System.out.println("Actual Notice #" + count + " -- " + notice);
            actualNotices[count - 1] = notice;
            count++;
        }

        Assert.assertEquals(expectedNotices, actualNotices);
    }

}
