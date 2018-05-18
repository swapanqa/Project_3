package com.lordAndTaylor.qa.framework.model;

import org.openqa.selenium.By;

/**
 * Created by Debajyoti Paul on 4/20/2018 at 2:20 PM
 */
public class InternationalShippingModel {

    private static By shipToLink = By.xpath("//li[@class='menu-item shipping']/a");
    private static By shipToPageHeader = By.xpath("//div[@class='inner-wrapper']/h2");
    private static By countryDropdown = By.xpath("//select[@id='INTCOUNTRY']");
    private static By countryList = By.xpath("//select[@id='INTCOUNTRY']/option");
    private static By currencyDropdown = By.xpath("//select[@id='INTSELECT']");
    private static By currencyList = By.xpath("//select[@id='INTSELECT']/option");
    private static By saveContinueButton = By.xpath("//input[@class='sfa-button transactional large float-right']");

    private static By backToUSAButton = By.xpath("//button[@class='back-to-us-site-link js-back-to-us-site-link float-right']");
    private static By popUpCloseButton = By.xpath("//a[@id='closeButton']");
    private static By countryFlag = By.xpath("//li[@class='menu-item shipping']//img");

    private static By productPriceCurrency = By.xpath("//a[@class='mainBlackText']/p[text()='Hydroguard Mica Top']/following-sibling::span");

    private static By internationalShippingNotice = By.xpath("//form[@id='context_chooser']/following-sibling::ul/li");

    public static By getShipToLink() {
        return shipToLink;
    }

    public static By getShipToPageHeader() {
        return shipToPageHeader;
    }

    public static By getCountryDropdown() {
        return countryDropdown;
    }

    public static By getCountryList() {
        return countryList;
    }

    public static By getCurrencyDropdown() {
        return currencyDropdown;
    }

    public static By getCurrencyList() {
        return currencyList;
    }

    public static By getSaveContinueButton() {
        return saveContinueButton;
    }

    public static By getBackToUSAButton() {
        return backToUSAButton;
    }

    public static By getPopUpCloseButton() {
        return popUpCloseButton;
    }

    public static By getCountryFlag() {
        return countryFlag;
    }

    public static By getProductPriceCurrency() {
        return productPriceCurrency;
    }

    public static By getInternationalShippingNotice() {
        return internationalShippingNotice;
    }

}
