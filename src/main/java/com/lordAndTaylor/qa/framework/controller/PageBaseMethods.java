package com.lordAndTaylor.qa.framework.controller;

import com.lordAndTaylor.qa.framework.utils.UtilsController;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class PageBaseMethods extends UtilsController{

    //protected WebDriver driver;

    public PageBaseMethods(WebDriver driver){
       super(driver);
    }

    // ***************************  PageBase Utils library *************************** //

    public void navigateToApplication(){
        driver.navigate().to("https://www.lordandtaylor.com");
    }

    public void clearCookies(){
        driver.manage().deleteAllCookies();
    }

    public void delay(int timeInMilli){
        try {
            Thread.sleep(timeInMilli);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void refreshPage(){
        driver.navigate().refresh();
    }

    public void verifyPageTitle(String expectedPageTitle, String pageName){
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(actualPageTitle.trim(), expectedPageTitle.trim());
        System.out.println(pageName + " Title verified...");
    }

    public void verifyPageTitleV2(String expectedPageTitle, String pageName){
        String actualPageTitle = driver.getTitle();
        assertThat(actualPageTitle, containsString(expectedPageTitle));
        System.out.println(pageName + " Title verified...");
    }

    public void typeText(By by, String text){
        WebElement element = driver.findElement(by);
        javascriptUtils().highlight(element);
        element.clear();
        element.sendKeys(text);
    }

    public void clickElement(By by){
        WebElement element = driver.findElement(by);
        javascriptUtils().highlight(element);
        element.click();
    }

    public void pressEnter(By by){
        WebElement element = driver.findElement(by);
        javascriptUtils().highlight(element);
        element.sendKeys(Keys.ENTER);
    }

    public void verifyText(By by, String expectedText){
        WebElement element = driver.findElement(by);
        javascriptUtils().highlight(element);
        String actualText = element.getText();
        System.out.println("Actual Text is : " + actualText);
        Assert.assertEquals(expectedText.trim(), actualText.trim());
    }

    public void verifyTextV2(By by, String expectedText){
        WebElement element = driver.findElement(by);
        javascriptUtils().highlight(element);
        String actualText = element.getAttribute("innerText");
        System.out.println("Actual Text is : " + actualText);
        Assert.assertEquals(expectedText.trim(), actualText.trim());
    }

    public void verifyTextIsPresent(By by, String expectedText){
        WebElement element = driver.findElement(by);
        javascriptUtils().highlight(element);
        boolean result = element.getText().contains(expectedText);
        Assert.assertTrue(result);
    }

    public void verifyValue(By by, String expectedText){
        WebElement element = driver.findElement(by);
        javascriptUtils().highlight(element);
        String actualValue = element.getAttribute("value");
        System.out.println("Actual Value is : " + actualValue);
        Assert.assertEquals(expectedText.trim(), actualValue.trim());
    }

    public void hoverToElement(WebElement element){
        javascriptUtils().highlight(element);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        delay(2000);
    }

    public void switchToLastOpenWindow(){
        Set<String> windowList = driver.getWindowHandles();
        String lastOpenedWindow = windowList.toArray()[windowList.size()-1].toString();
        driver.switchTo().window(lastOpenedWindow);
    }

}

