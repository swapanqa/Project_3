package com.lordAndTaylor.qa.framework.model;

import org.openqa.selenium.By;

/**
 * Created by Debajyoti Paul on 4/19/2018 at 6:33 PM
 */
public class ProductsPageModel {

    private static By optionMenInNavBar = By.xpath("//a[@class='menu-item-link'][contains(@href, 'Men')]");
    private static By optionNikeInMenNavBar = By.xpath("//ul[@class='sub-menu']//a[contains(@href, '/Nike/Men/shop/_/N-1z137wqZ4ztez4')]");
    private static By pageNameVerification = By.xpath("//span[@class='action-link-text'][text()='Nike']");
    private static By totalNumberOfProductsDisplayed = By.xpath("//span[@id='view-current-top']");
    private static By totalNikeProducts = By.xpath("//p[@class='blackBold11 sfa-product-designer-name-container']");

    private static By filterNavMenu = By.xpath("//div[@class='sfa-pa-enh-refine-bar-container']/ul/li/span/a");

    private static By priceLink = By.xpath("//li[@class='sfa-pa-enh-refine-bar-option group1 sfa-refine-bar-first-label']");
    private static By priceTagOption = By.xpath("//input[@id='refinement-399545627']");
    private static By filterOptionClick = By.xpath("(//a[@class='action-link sfa-pa-refine-apply-button sfa-button transactional'])[last()-4]");
    private static By productDisplayedAfterFiltering = By.xpath("//p[@class='product-description']");

    private static By filterErrorMsg = By.xpath("(//span[@class='sfa-pa-refine-warning'])[last()-4]");

    private static By shopByCategory = By.xpath("//li[@id='subitems-302023696']/ul/li/a");
    private static By shopByBrandLink = By.xpath("//select[@id='leftNavBrands']");
    private static By shopByBrandItems = By.xpath("//select[@id='leftNavBrands']/option");
    private static By bannerName = By.xpath("//h1[@id='banner-generic']");

    private static By productNameInPage = By.xpath("//p[@class='product-description'][text()='Six-Panel Logo Baseball Cap']");
    private static By productPriceInPage = By.xpath("//p[@class='product-description'][text()='Six-Panel Logo Baseball Cap']//following-sibling::span");
    private static By previewLink = By.xpath("//a[@id='quicklook-0500087773374']//span");
    private static By productNameInPopUp = By.xpath("//h2[@class='short-description component component-1']");
    private static By productPriceInPopUp = By.xpath("//div[@class='value']");
    private static By popUpCancelBtn = By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']");

    private static By productOneImage = By.xpath("//img[@id='img_0500087327563-0']");
    private static By productNameHeader = By.xpath("//h1[@class='product-overview__short-description']");

    private static By colorOptions = By.xpath("//li[@class='product-variant-attribute-value product-variant-attribute-value--swatch']");
    private static By getColorOptionText = By.xpath("(//dd[@class='product-variant-attribute-label__selected-value'])[last()-1]");

    private static By productSizeXL = By.xpath("//li[@class='product-variant-attribute-value product-variant-attribute-value--unavailable product-variant-attribute-value--text']");
    private static By soldOutButtonText = By.xpath("//button[@class='hbc-button hbc-button--full hbc-button--primary']/span/span");
    private static By soldOutButton = By.xpath("//button[@class='hbc-button hbc-button--full hbc-button--primary']");

    private static By productPriceInIndividualProductPage = By.xpath("//span[@itemprop='price']");

    private static By productSizeChartLink = By.xpath("//p[@class='product-size-options__size-guide']/a");
    private static By productSizeChartText = By.xpath("(//div[@id='saksBody']/h2)[last()-1]");

    private static By addToBagButton = By.xpath("//button[@class='hbc-button hbc-button--full hbc-button--primary']");
    private static By selectColorAndSizeText = By.xpath("//div[@class='alert alert--danger']/p");

    private static By productIncrement = By.xpath("//button[@class='spinbox__increment']");
    private static By productDecrement = By.xpath("//button[@class='spinbox__decrement']");
    private static By productQuantity = By.xpath("//input[@id='numberInput']");

    private static By productDetailsText = By.xpath("//div[@data-reactid='90']//li");

    private static By sizeLargeButton = By.xpath("(//ul[@class='product-variant-attribute-values']/li[last()-1])[last()]");
    private static By storePickUpRadioBtn = By.xpath("//input[@class='radiogroup__radio-input'][@value='pick_up_in_store']");
    private static By zipCodeBox = By.xpath("//input[@id='store-availability-zip-code-input']");
    private static By checkStoreBtn = By.xpath("//button[@class='hbc-button hbc-button--block hbc-button--secondary']");
    private static By itemUnavailableText = By.xpath("//p[@class='pick-up-in-store-results__error-message']");
    private static By missingZipCodeMsg = By.xpath("//span[@class='text-field__error-message']");

    public static By getOptionMenInNavBar() {
        return optionMenInNavBar;
    }

    public static By getOptionNikeInMenNavBar() {
        return optionNikeInMenNavBar;
    }

    public static By getPageNameVerification() {
        return pageNameVerification;
    }

    public static By getTotalNumberOfProductsDisplayed() {
        return totalNumberOfProductsDisplayed;
    }

    public static By getTotalNikeProducts() {
        return totalNikeProducts;
    }

    public static By getFilterNavMenu() {
        return filterNavMenu;
    }

    public static By getPriceLink() {
        return priceLink;
    }

    public static By getPriceTagOption() {
        return priceTagOption;
    }

    public static By getFilterOptionClick() {
        return filterOptionClick;
    }

    public static By getProductDisplayedAfterFiltering() {
        return productDisplayedAfterFiltering;
    }

    public static By getFilterErrorMsg() {
        return filterErrorMsg;
    }

    public static By getShopByCategory() {
        return shopByCategory;
    }

    public static By getShopByBrandLink() {
        return shopByBrandLink;
    }

    public static By getShopByBrandItems() {
        return shopByBrandItems;
    }

    public static By getBannerName() {
        return bannerName;
    }

    public static By getProductNameInPage() {
        return productNameInPage;
    }

    public static By getProductPriceInPage() {
        return productPriceInPage;
    }

    public static By getPreviewLink() {
        return previewLink;
    }

    public static By getProductNameInPopUp() {
        return productNameInPopUp;
    }

    public static By getProductPriceInPopUp() {
        return productPriceInPopUp;
    }

    public static By getPopUpCancelBtn() {
        return popUpCancelBtn;
    }

    public static By getProductOneImage() {
        return productOneImage;
    }

    public static By getProductNameHeader() {
        return productNameHeader;
    }

    public static By getColorOptions() {
        return colorOptions;
    }

    public static By getGetColorOptionText() {
        return getColorOptionText;
    }

    public static By getProductSizeXL() {
        return productSizeXL;
    }

    public static By getSoldOutButtonText() {
        return soldOutButtonText;
    }

    public static By getSoldOutButton() {
        return soldOutButton;
    }

    public static By getProductPriceInIndividualProductPage() {
        return productPriceInIndividualProductPage;
    }

    public static By getProductSizeChartLink() {
        return productSizeChartLink;
    }

    public static By getProductSizeChartText() {
        return productSizeChartText;
    }

    public static By getAddToBagButton() {
        return addToBagButton;
    }

    public static By getSelectColorAndSizeText() {
        return selectColorAndSizeText;
    }

    public static By getProductIncrement() {
        return productIncrement;
    }

    public static By getProductDecrement() {
        return productDecrement;
    }

    public static By getProductQuantity() {
        return productQuantity;
    }

    public static By getProductDetailsText() {
        return productDetailsText;
    }

    public static By getSizeLargeButton() {
        return sizeLargeButton;
    }

    public static By getStorePickUpRadioBtn() {
        return storePickUpRadioBtn;
    }

    public static By getZipCodeBox() {
        return zipCodeBox;
    }

    public static By getCheckStoreBtn() {
        return checkStoreBtn;
    }

    public static By getItemUnavailableText() {
        return itemUnavailableText;
    }

    public static By getMissingZipCodeMsg() {
        return missingZipCodeMsg;
    }

}
