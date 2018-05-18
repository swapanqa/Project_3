package com.lordAndTaylor.qa.framework.controller;


import com.lordAndTaylor.qa.framework.model.SearchBoxModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

/**
 * Created by Debajyoti Paul on 4/21/2018 at 3:50 PM
 */
public class SearchBoxController extends PageBaseMethods {

    public SearchBoxController(WebDriver driver) {
        super(driver);
    }

    public void enterSearchText(String text){
        typeText(SearchBoxModel.getSearchBox(), text);
    }

    public void clickSearchButton(){
        clickElement(SearchBoxModel.getSubmitSearchBtn());
    }

    public void verifySearchResultHeader(String expectedText){
        verifyText(SearchBoxModel.getSearchResultHeader(), expectedText);
        delay(3000);
    }

    public void verifySearchResultItems(String[] expectedItems) {
        List<WebElement> items = driver.findElements(SearchBoxModel.getSearchResults());
        String[] actualItemTexts = new String[items.size()];
        int count = 0;
        for (WebElement item : items) {
            String text = item.getText();
            System.out.println(text);
            actualItemTexts[count] = text;
            count++;
        }
        Assert.assertEquals(expectedItems, actualItemTexts);
    }

    public String[] dataTableToArray(List<List<String>> data){
        String[] expectedItems = new String[data.get(0).size()];
        int count = 1;
        for(int i=0; i<data.size(); i++){
            for(int j=0; j<data.get(i).size(); j++){
                String text = data.get(i).get(j);
                System.out.println("Expected Item #" + count + " -- " + text);
                expectedItems[j] = text;
                count++;
            }
        }
        return expectedItems;
    }

    public void clickDropdownInSearchBox(){
        clickElement(SearchBoxModel.getDropdownInSearchBox());
        delay(3000);
    }

    public void verifyDropDownOptions(String[] expectedMenuList){
        List<WebElement> items = driver.findElements(SearchBoxModel.getDropdownOptionTexts());
        String[] actualItemTexts = new String[items.size()];
        int count = 0;
        for (WebElement item : items) {
            String text = item.getText();
            System.out.println(text);
            actualItemTexts[count] = text;
            count++;
        }

        Assert.assertEquals(expectedMenuList, actualItemTexts);
    }

    public void selectAdvancedOption(String typeText){
        List<WebElement> items = driver.findElements(SearchBoxModel.getDropdownOptionTexts());
        for (WebElement item : items) {
            String text = item.getText();
            System.out.println(text);
            if(text.trim().equalsIgnoreCase(typeText)){
                javascriptUtils().highlight(item);
                item.click();
                break;
            }
        }

    }

    public void verifyAdvancedSearchResultItems(String[] expectedItems) {
        List<WebElement> items = driver.findElements(SearchBoxModel.getSearchResults());
        String[] actualItemTexts = new String[items.size()];
        int count = 0;
        for (WebElement item : items) {
            String text = item.getText();
            System.out.println("Actual Item #" + (count+1) + " -- " + text);
            actualItemTexts[count] = text;
            count++;
        }
           Assert.assertEquals(expectedItems, actualItemTexts);

    }

    public void verifyInvalidSearchErrorMessage(){
        verifyTextIsPresent(SearchBoxModel.getInvalidSearchErrorMsg(), "No results were found");
    }

    public void clickFeaturedShopsLink(){
        clickElement(SearchBoxModel.getFeatureShopsLink());
    }

    public void clickColorTab(){
        clickElement(SearchBoxModel.getColorTab());
        delay(3000);
    }

    public void clickColorOption(){
        clickElement(SearchBoxModel.getColorOption());
    }

    public void clickApplyButton(){
        clickElement(SearchBoxModel.getApplyButton());
        delay(3000);
        driver.navigate().refresh();
    }

    public void pressEnterKey(){
        pressEnter(SearchBoxModel.getSearchBox());
    }

    public void verifyTotalSearchItems(){
        verifyText(SearchBoxModel.getTotalSearchItem(), "4");
    }

    public void clickCancelFilterButton(){
        clickElement(SearchBoxModel.getCancelFilter());
    }

}
