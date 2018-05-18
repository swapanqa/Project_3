package com.lordAndTaylor.qa.framework.controller;

import com.lordAndTaylor.qa.framework.model.ProductsPageModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

/**
 * Created by Debajyoti Paul on 4/19/2018 at 6:52 PM
 */
public class ProductsPageController extends PageBaseMethods {

    public ProductsPageController(WebDriver driver) {
        super(driver);
    }

    public void hoverToMenInNavBar(){
        do {
            refreshPage();
            hoverToElement(driver.findElement(ProductsPageModel.getOptionMenInNavBar()));
        }while (!driver.findElement(ProductsPageModel.getOptionNikeInMenNavBar()).getText().trim().equalsIgnoreCase("Nike"));
    }

    public void clickNikePage(){
        clickElement(ProductsPageModel.getOptionNikeInMenNavBar());
    }

    public void verifyNikeProductPage(){
        verifyText(ProductsPageModel.getPageNameVerification(), "Nike");
    }

    public void verifyTotalItemsDisplayedInPageOne(){
        WebElement numberOfProductsDisplayedInPageOne = driver.findElement(ProductsPageModel.getTotalNumberOfProductsDisplayed());
        String displayedNumber = numberOfProductsDisplayedInPageOne.getText();
        System.out.println("Number of Products Displayed: " + displayedNumber);

        List<WebElement> totalItems = driver.findElements(ProductsPageModel.getTotalNikeProducts());
        String actualNumberOfProducts = "" + totalItems.size();
        System.out.println("Actual Products in Page# 1: " + totalItems);

        Assert.assertEquals(displayedNumber, actualNumberOfProducts);
    }

    //For 1 row and multiple columns
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

    //For 1 column and multiple rows
    public String[] dataTableToArrayV2(List<List<String>> data){
        String[] expectedItems = new String[data.size()];
        int count = 1;
        for(int i=0; i<data.size(); i++){
            for(int j=0; j<data.get(i).size(); j++){
                String text = data.get(i).get(j);
                System.out.println("Expected Item #" + count + " -- " + text);
                expectedItems[i] = text;
                count++;
            }
        }
        return expectedItems;
    }

    public void clickPriceFilter(){
        clickElement(ProductsPageModel.getPriceLink());
    }

    public void clickPriceOption(){
        clickElement(ProductsPageModel.getPriceTagOption());
    }

    public void clickFilterSubmitButton(){
        clickElement(ProductsPageModel.getFilterOptionClick());
        delay(3000);
    }

    public void verifyProductDisplayedAfterFilter(String[] expectedItemsList){
        List<WebElement> filteredItems = driver.findElements(ProductsPageModel.getProductDisplayedAfterFiltering());
        String[] actualMenuList = new String[filteredItems.size()];

        int count=0;
        for(WebElement menu : filteredItems){
            String menuText = menu.getAttribute("innerHTML").trim();
            actualMenuList[count] = menuText;
            System.out.println("Actual Item #" + count + " -- " + menuText);
            count++;
        }

        Assert.assertEquals(actualMenuList,expectedItemsList);
    }

    public void verifyFilterErrorMsg(){
        verifyText(ProductsPageModel.getFilterErrorMsg(), "Choose your filters before clicking apply.");
    }

    public void verifyFilterNavMenuOptions(String[] expectedMenuList){
        List<WebElement> navMenuItems = driver.findElements(ProductsPageModel.getFilterNavMenu());
        String[] actualMenuList = new String[navMenuItems.size()];

        int count=0;
        for(WebElement menu : navMenuItems){
            String menuText = menu.getAttribute("innerHTML").trim();
            actualMenuList[count] = menuText;
            count++;
            System.out.println(menuText);
        }

        Assert.assertEquals(actualMenuList,expectedMenuList);
    }

    public void verifyShopByCategoryColumn(String[] expectedItemsList){
        List<WebElement> items = driver.findElements(ProductsPageModel.getShopByCategory());
        String[] actualMenuList = new String[items.size()];

        int count=0;
        for(WebElement menu : items){
            String menuText = menu.getAttribute("innerHTML").trim();
            actualMenuList[count] = menuText;
            System.out.println("Actual Item #" + count + " -- " + menuText);
            count++;
        }

        Assert.assertEquals(actualMenuList,expectedItemsList);

    }

    public void clickShopByBrands(){
        clickElement(ProductsPageModel.getShopByBrandLink());
    }

    public void selectBrand(String brand){
        List<WebElement> items = driver.findElements(ProductsPageModel.getShopByBrandItems());
        int count = 1;
        for(WebElement item : items){
            String itemName = item.getText();
            System.out.println("Brand Name #" + count + " -- " + itemName);
            count++;
            if(itemName.trim().equalsIgnoreCase(brand)){
                item.click();
                break;
            }
        }
    }

    public void verifyBannerName(String brandName){
        verifyText(ProductsPageModel.getBannerName(), brandName);
    }

    public void clickProductPreviewButton(){
        clickElement(ProductsPageModel.getPreviewLink());
        delay(2000);
        windowUtils().switchToLastWindow();
    }

    public String getProductNameInPage(){
        WebElement productName1 = driver.findElement(ProductsPageModel.getProductNameInPage());
        String productNameInPage = productName1.getText();
        return productNameInPage;
    }

    public String getProductNameInPopUp(){
        WebElement productName2 = driver.findElement(ProductsPageModel.getProductNameInPopUp());
        delay(2000);
        String productNameInPopUp = productName2.getText();
        return productNameInPopUp;
    }

    public void verifySameProductNameInPopUp(String nameInPage, String nameInPopUp){
        Assert.assertEquals(nameInPage, nameInPopUp);
    }

    public String getProductPriceInPage(){
        WebElement productPrice1 = driver.findElement(ProductsPageModel.getProductPriceInPage());
        String productPriceInPage = productPrice1.getText();
        return productPriceInPage;
    }

    public String getProductPriceInPopUp(){
        WebElement productPrice2 = driver.findElement(ProductsPageModel.getProductPriceInPopUp());
        String productPriceInPopUp = productPrice2.getText();
        return productPriceInPopUp;
    }

    public void verifySameProductPriceInPopUp(String priceInPage, String priceInPopUp){
        Assert.assertEquals(priceInPage, priceInPopUp);
    }

    public void clickPopUpCancelButton(){
        //clickElement(ProductsPageModel.popUpCancelBtn);
        javascriptUtils().actionClick(driver.findElement(ProductsPageModel.getPopUpCancelBtn()));
    }

    public void clickNikeProduct(){
        clickElement(ProductsPageModel.getProductOneImage());
    }

    public void verifyNikeMikaTopProductPage(){
        verifyText(ProductsPageModel.getProductNameHeader(), "Hydroguard Mica Top");
    }

    public void productColorOptions(String color){
        List<WebElement> colorOptions = driver.findElements(ProductsPageModel.getColorOptions());
        int count = 1;
        for(WebElement option : colorOptions){
            WebElement element = option.findElement(By.xpath("./span"));
            String colorName = element.getText();
            System.out.println("Color #" + count + " -- " + colorName);
            if(colorName.trim().equalsIgnoreCase(color.trim())){
                javascriptUtils().actionClick(option);
                break;
            }
            count++;
        }
        delay(3000);
    }

    public void verifyColorOptionTexts(String color){
        verifyText(ProductsPageModel.getGetColorOptionText(), color);
    }

    public void clickSizeXL(){
        clickElement(ProductsPageModel.getProductSizeXL());
    }

    public void verifySoldOutButton(){
        verifyText(ProductsPageModel.getSoldOutButtonText(), "SOLD OUT");

        Boolean isButtonEnabled = driver.findElement(ProductsPageModel.getSoldOutButton()).isEnabled();
        Assert.assertFalse(isButtonEnabled);
    }

    public void verifySamePriceInBothProductPage(){
        String priceInMainPage = "38.00";
        verifyTextIsPresent(ProductsPageModel.getProductPriceInIndividualProductPage(), priceInMainPage);
    }

    public void clickProductSizeGuide(){
        clickElement(ProductsPageModel.getProductSizeChartLink());
        delay(3000);
        switchToLastOpenWindow();
    }

    public void verifyProductSizeGuidePage(){
        verifyText(ProductsPageModel.getProductSizeChartText(), "MEN'S GENERAL SIZING GUIDE");
    }

    public void clickAddToBagButton(){
        clickElement(ProductsPageModel.getAddToBagButton());
    }

    public void verifyAddToBagErrorMsg(){
        verifyText(ProductsPageModel.getSelectColorAndSizeText(), "Please select a color and/or size.");
    }

    public void verifyDefaultProductQuantity(String expectedQuantity){
        verifyValue(ProductsPageModel.getProductQuantity(), expectedQuantity);
    }

    public void clickIncrementButton(){
        clickElement(ProductsPageModel.getProductIncrement());
    }

    public void clickDecrementButton(){
        clickElement(ProductsPageModel.getProductDecrement());
    }

    public void verifyIncrementButtonFunctionality(String expectedQuantity){
        verifyValue(ProductsPageModel.getProductQuantity(), expectedQuantity);
    }

    public void verifyDecrementButtonFunctionality(String expectedQuantity){
        verifyValue(ProductsPageModel.getProductQuantity(), expectedQuantity);
    }

    public void verifyProductDescription(String[] expectedText){
        List<WebElement> details = driver.findElements(ProductsPageModel.getProductDetailsText());
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

    public void clickSizeLargeButton(){
        clickElement(ProductsPageModel.getSizeLargeButton());
    }

    public void clickStorePickUpRadioButton(){
        javascriptUtils().actionClick(driver.findElement(ProductsPageModel.getStorePickUpRadioBtn()));
    }

    public void enterZipCode(String zip){
        typeText(ProductsPageModel.getZipCodeBox(), zip);
    }

    public void clickCheckStoreButton(){
        clickElement(ProductsPageModel.getCheckStoreBtn());
    }

    public void verifyItemUnAvailableText(){
        verifyText(ProductsPageModel.getItemUnavailableText(), "This item is not available at a store near you.");
    }

    public void verifyMissingZipCodeMsg(){
        verifyText(ProductsPageModel.getMissingZipCodeMsg(), "Enter a valid zip code");
    }


}
