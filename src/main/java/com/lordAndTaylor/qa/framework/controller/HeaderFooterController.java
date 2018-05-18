package com.lordAndTaylor.qa.framework.controller;

import com.lordAndTaylor.qa.framework.model.HeaderFooterModel;
import gherkin.lexer.He;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

/**
 * Created by Debajyoti Paul on 4/17/2018 at 11:32 PM
 */
public class HeaderFooterController extends PageBaseMethods {

    public HeaderFooterController(WebDriver driver) {
        super(driver);
    }

    public void checkNavMenuLinkStatus(){
        List<WebElement> links = driver.findElements(HeaderFooterModel.getNavMenuDressesLinks());
        System.out.println("Total links are " + links.size());

        for(int i=0;i<links.size();i++){
            int row = i + 1;
            WebElement element = links.get(i);
            String url = element.getAttribute("href");
            brokenLinkUtils().verifyLinkStatus(HeaderFooterModel.getLinkStatusExcelFile(), row, url, "Sheet1");
        }

    }

    public void clickHeaderNotice_Link_3(){
        clickElement(HeaderFooterModel.getHeaderNotice3_Link2());
        delay(2000);
    }

    public void verifyHeaderNotice_Link_3(){
        verifyPageTitle("lordandtaylor.com - Buy Online Pick Up In Store", "Exclusion Details Page");
    }

    public void assertNavMenu(String[] expectedMenuList){
        List<WebElement> navMenuItems = driver.findElements(HeaderFooterModel.getNavLinkTexts());
        String[] actualMenuList = new String[navMenuItems.size()];

        int count=0;
        for(WebElement menu : navMenuItems){
            String menuText = menu.getText().trim();
            actualMenuList[count] = menuText;
            count++;
            System.out.println(menuText);
        }

        Assert.assertEquals(actualMenuList,expectedMenuList);
    }

    public void assertMenuContainer(String[] expectedMenuList){
        WebElement welcomeLink = driver.findElement(HeaderFooterModel.getMenuContainerLink());
        hoverToElement(welcomeLink);

        List<WebElement> navMenuItems = driver.findElements(HeaderFooterModel.getMenuContainerDropDownLinks());
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

    public void checkFooterSectionLinkStatus(){
        List<WebElement> links = driver.findElements(HeaderFooterModel.getFooterSectionLinks());
        System.out.println("Total links are " + links.size());

        for(int i=0;i<links.size();i++){
            int row = i + 1;
            WebElement element = links.get(i);
            String url = element.getAttribute("href");
            brokenLinkUtils().verifyLinkStatus(HeaderFooterModel.getLinkStatusExcelFile(), row, url, "Sheet3");
        }

    }

    public void clickFAQLink(){
        javascriptUtils().scrollToElement(driver.findElement(HeaderFooterModel.getFAQ_Link()));
        clickElement(HeaderFooterModel.getFAQ_Link());
        javascriptUtils().delay(3000);
    }

    public void enterEmailForDailySubscription(String email){
        typeText(HeaderFooterModel.getEmailSubscriptionBox(), email);
    }

    public void clickGoButton(){
        clickElement(HeaderFooterModel.getEmailSubscriptionGoBtn());
    }

    public void enterSignUpEmail(String email){
        typeText(HeaderFooterModel.getES_email(), email);
    }

    public void enterSignUpConfirmEmail(String confirmEmail){
        typeText(HeaderFooterModel.getES_confirmEmail(), confirmEmail);
    }

    public void enterSignUpFirstName(String fName){
        typeText(HeaderFooterModel.getES_firstName(), fName);
    }

    public void enterSignUpLastName(String lName){
        typeText(HeaderFooterModel.getES_lastName(), lName);
    }

    public void enterSignUpZipCode(String zip){
        typeText(HeaderFooterModel.getES_zipCode(), zip);
    }

    public void selectMonth(String month){
        clickElement(HeaderFooterModel.getES_month());
        List<WebElement> months = driver.findElements(HeaderFooterModel.getES_monthList());
        int count = 1;
        for(WebElement option : months){
            String text = option.getText();
            System.out.println("Text #" + count + " -- " + text);
            if(text.trim().equalsIgnoreCase(month)){
                option.click();
                break;
            }
        }
    }

    public void selectDay(String day){
        clickElement(HeaderFooterModel.getES_day());
        List<WebElement> days = driver.findElements(HeaderFooterModel.getES_dayList());
        int count = 1;
        for(WebElement option : days){
            String text = option.getText();
            System.out.println("Text #" + count + " -- " + text);
            if(text.trim().equalsIgnoreCase(day)){
                option.click();
                break;
            }
        }
    }

    public void selectYear(String year){
        clickElement(HeaderFooterModel.getES_year());
        List<WebElement> years = driver.findElements(HeaderFooterModel.getES_yearList());
        int count = 1;
        for(WebElement option : years){
            String text = option.getText();
            System.out.println("Text #" + count + " -- " + text);
            if(text.trim().equalsIgnoreCase(year)){
                option.click();
                break;
            }
        }
    }

    public void selectGender(String gender){
        if(gender.trim().equalsIgnoreCase("FEMALE")){
            clickElement(HeaderFooterModel.getES_gender_Female());
        }
        if(gender.trim().equalsIgnoreCase("MALE")){
            clickElement(HeaderFooterModel.getES_gender_Male());
        }
    }

    public void clickSubmitButton(){
        clickElement(HeaderFooterModel.getES_submitBtn());
        delay(2500);
    }

    public void verifySignUp(){
        String expectedText = "Thank you for signing up for our emails";
        verifyText(HeaderFooterModel.getES_thankYouNote(), expectedText.toUpperCase());
    }

    public void verifySignUpErrorMessage(){
        verifyText(HeaderFooterModel.getES_thankYouNote(), "CONNECTION ERROR");
    }

    public void verifyFooterSectionOptionsColumn1(String[] expectedOptions){
        List<WebElement> options = driver.findElements(HeaderFooterModel.getFooterSectionOptionsColumn1());
        String[] actualOptions = new String[options.size()];
        int count = 1;
        for(WebElement option : options){
            String text = option.getText().trim();
            System.out.println("Footer Section Column #1 -- Option #" + count + " -- " + text);
            actualOptions[count-1] = text;
            count++;
        }

        Assert.assertEquals(expectedOptions, actualOptions);

    }

    public void verifyFooterSectionOptionsColumn2(String[] expectedOptions){
        List<WebElement> options = driver.findElements(HeaderFooterModel.getFooterSectionOptionsColumn2());
        String[] actualOptions = new String[options.size()];
        int count = 1;
        for(WebElement option : options){
            String text = option.getText().trim();
            System.out.println("Footer Section Column #2 -- Option #" + count + " -- " + text);
            actualOptions[count-1] = text;
            count++;
        }

        Assert.assertEquals(expectedOptions, actualOptions);

    }

    public void verifyFooterSectionOptionsColumn3(String[] expectedOptions){
        List<WebElement> options = driver.findElements(HeaderFooterModel.getFooterSectionOptionsColumn3());
        String[] actualOptions = new String[options.size()];
        int count = 1;
        for(WebElement option : options){
            String text = option.getText().trim();
            System.out.println("Footer Section Column #3 -- Option #" + count + " -- " + text);
            actualOptions[count-1] = text;
            count++;
        }

        Assert.assertEquals(expectedOptions, actualOptions);

    }

    public void verifyFooterSectionOptionsColumn4(String[] expectedOptions){
        List<WebElement> options = driver.findElements(HeaderFooterModel.getFooterSectionOptionsColumn4());
        String[] actualOptions = new String[options.size()];
        int count = 1;
        for(WebElement option : options){
            String text = option.getText().trim();
            System.out.println("Footer Section Column #4 -- Option #" + count + " -- " + text);
            actualOptions[count-1] = text;
            count++;
        }

        Assert.assertEquals(expectedOptions, actualOptions);

    }

    public void verifySocialMediaOptions(String[] expectedOptions){
        List<WebElement> options = driver.findElements(HeaderFooterModel.getSocialMediaOptions());
        String[] actualOptions = new String[options.size()-2];

        for(int i=0; i<6; i++){
            String text = options.get(i).getAttribute("data-name").trim();
            System.out.println("Social Media Option #" + (i+1) + " -- " + text);
            actualOptions[i] = text;
        }

        Assert.assertEquals(expectedOptions, actualOptions);

    }

    public void clickLordAndTaylorLogo(){
        clickElement(HeaderFooterModel.getLordAndTaylorLogo());
    }


}
