package com.lordAndTaylor.qa.framework.controller;

import com.lordAndTaylor.qa.framework.model.HeaderFooterModel;
import com.lordAndTaylor.qa.framework.model.HomePageModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

/**
 * Created by Debajyoti Paul on 4/11/2018 at 2:45 AM
 */
public class HomePageController extends PageBaseMethods {

    public HomePageController(WebDriver driver) {
        super(driver);
    }

    public void closeEmailPopUp() {
        List<WebElement> iframes = driver.findElements(HomePageModel.getiFrames());
        int count = 1;
        for (WebElement iframe : iframes) {
            String src = iframe.getAttribute("src");
            System.out.println("IFrame #" + count + " -- " + src);
            if (src.contains("/email_popup/EML1145Acollect.jsp")) {
                driver.switchTo().frame(iframe);
                break;
            }
            count++;
        }

        clickElement(HomePageModel.getCloseBtn());
    }

    public void switchToHomePage() {
        driver.switchTo().defaultContent();
    }

    public void clickSignInLink(){
        clickElement(HomePageModel.getSignInLink());
    }

    public void checkImageLinkStatus(){
        List<WebElement> links = driver.findElements(HomePageModel.getImageLinks());
        System.out.println("Total links are " + links.size());

        for(int i=0;i<links.size();i++){
            int row = i + 1;
            WebElement element = links.get(i);
            String url = element.getAttribute("src");
            brokenLinkUtils().verifyLinkStatus(HeaderFooterModel.getLinkStatusExcelFile(), row, url, "Sheet2");
        }

    }

    public void verifyFirstBannerWidth(){
        WebElement element = driver.findElement(HomePageModel.getFirstBanner());
        javascriptUtils().highlight(element);
        int width = element.getSize().getWidth();
        int height = element.getSize().getHeight();

        System.out.println("Width: " + width +" ---- Height: " + height);

        Assert.assertEquals(width, 1024);
    }

    public void verifyBannerOfferText(){
        verifyText(HomePageModel.getThirdBanner2(), "EXTRA 25% OFF");
        verifyText(HomePageModel.getThirdBanner(), "EXTRA 15% OFF");
    }

    public void clickFathersDayGiftGuideLink(){
        javascriptUtils().scrollToElement(driver.findElement(HomePageModel.getFathersDayGiftLink()));
        clickElement(HomePageModel.getFathersDayGiftLink());
    }

    public void verifyFathersGiftGuideNavigation(){
        verifyPageTitleV2("Father's Day", "Father's Day Gift Guide Page");
    }

}
