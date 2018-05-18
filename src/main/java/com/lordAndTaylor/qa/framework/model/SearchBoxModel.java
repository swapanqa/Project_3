package com.lordAndTaylor.qa.framework.model;

import org.openqa.selenium.By;

/**
 * Created by Debajyoti Paul on 4/21/2018 at 3:49 PM
 */
public class SearchBoxModel {

    private static By searchBox = By.xpath("//input[@class='ui-autocomplete-input']");
    private static By submitSearchBtn = By.xpath("//button[@name='submit-search']");
    private static By searchResultHeader = By.xpath("//h1[@class='pa-enh-page-title']/span");
    private static By searchResults = By.xpath("//div[@class='image-container-large']/following-sibling::div//p[@class='product-description']");

    private static By dropdownInSearchBox = By.xpath("//span[@class='selectboxit-text']");
    private static By dropdownOptionTexts = By.xpath("//a[@class='selectboxit-option-anchor']");

    private static By invalidSearchErrorMsg = By.xpath("//span[@id='no-results-msg']");

    private static By featureShopsLink = By.xpath("//a[@id='refinement-302024187']");
    private static By colorTab = By.xpath("//span[@id='color']/a");
    private static By colorOption = By.xpath("//div[@class='color-refine-swatch']/a[text()='Blue']");
    private static By applyButton = By.xpath("(//a[@class='action-link sfa-pa-refine-apply-button sfa-button transactional'])[last()]");

    private static By totalSearchItem = By.xpath("(//span[@class='mainBoldBlackText totalRecords'])[last()-1]");
    private static By cancelFilter = By.xpath("//div[@class='sfa-close-button']/span");

    public static By getSearchBox() {
        return searchBox;
    }

    public static By getSubmitSearchBtn() {
        return submitSearchBtn;
    }

    public static By getSearchResultHeader() {
        return searchResultHeader;
    }

    public static By getSearchResults() {
        return searchResults;
    }

    public static By getDropdownInSearchBox() {
        return dropdownInSearchBox;
    }

    public static By getDropdownOptionTexts() {
        return dropdownOptionTexts;
    }

    public static By getInvalidSearchErrorMsg() {
        return invalidSearchErrorMsg;
    }

    public static By getFeatureShopsLink() {
        return featureShopsLink;
    }

    public static By getColorTab() {
        return colorTab;
    }

    public static By getColorOption() {
        return colorOption;
    }

    public static By getApplyButton() {
        return applyButton;
    }

    public static By getTotalSearchItem() {
        return totalSearchItem;
    }

    public static By getCancelFilter() {
        return cancelFilter;
    }

}
