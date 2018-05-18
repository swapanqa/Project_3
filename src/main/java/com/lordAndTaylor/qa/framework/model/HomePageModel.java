package com.lordAndTaylor.qa.framework.model;

import org.openqa.selenium.By;

/**
 * Created by Debajyoti Paul on 4/11/2018 at 2:44 AM
 */
public class HomePageModel {

    private static By iFrames = By.tagName("iframe");
    private static By closeBtn = By.xpath("//div[@id='close-button']");
    private static By signInLink = By.xpath("//a[@class='account']");

    private static By imageLinks = By.tagName("img");
    private static By firstBanner = By.xpath("(//div[@class='hpp-full-height'])[1]");
    private static By thirdBanner = By.xpath("//div[@class='hpp-full-height']//h2[contains(text(), '15% OFF')]");
    private static By thirdBanner2 = By.xpath("//div[@class='hpp-full-height']//h2[contains(text(), '25% OFF')]");
    private static By fathersDayGiftLink = By.xpath("(//div[@class='cta__wrap invert']//strong[contains(text(), 'SHOP')])[last()-1]");

    public static By getiFrames() {
        return iFrames;
    }

    public static By getCloseBtn() {
        return closeBtn;
    }

    public static By getSignInLink() {
        return signInLink;
    }

    public static By getImageLinks() {
        return imageLinks;
    }

    public static By getFirstBanner() {
        return firstBanner;
    }

    public static By getThirdBanner() {
        return thirdBanner;
    }

    public static By getThirdBanner2() {
        return thirdBanner2;
    }

    public static By getFathersDayGiftLink() {
        return fathersDayGiftLink;
    }

}
