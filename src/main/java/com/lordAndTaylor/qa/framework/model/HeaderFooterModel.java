package com.lordAndTaylor.qa.framework.model;

import org.openqa.selenium.By;

/**
 * Created by Debajyoti Paul on 4/17/2018 at 11:23 PM
 */
public class HeaderFooterModel {

    private static By headerNotice3_Link2 = By.xpath("//ul[@id='js-global-promotion-banners']/li[last()]//a[last()]");

    private static String linkStatusExcelFile = System.getProperty("user.dir") + "/src/test/Resources/link_Status_Report/LinkStatus.xlsx";
    private static By navMenuDressesLinks = By.xpath("//li[@id='DRESSNavMenu']//a");

    private static By navLinkTexts = By.xpath("//ul[@class='menu gs-bow sh-split']/li/a");
    private static By menuContainerLink = By.xpath("//ul[@class='menu-container login-remediation']");
    private static By menuContainerDropDownLinks = By.xpath("//li[@class='menu-item']//ul[@class='first-of-type']/li/a");

    private static By footerSectionLinks = By.xpath("//div[@id='footer']//a");

    private static By FAQ_Link = By.xpath("//li[@class='menu-item first-child col1']/ul/li[last()-3]/a");

    private static By emailSubscriptionBox = By.cssSelector("#EmailUpdateString");
    private static By emailSubscriptionGoBtn = By.xpath("//button[@name='email_updates_form_one_save']");
    private static By ES_email = By.cssSelector("#saksSignUpEmail");
    private static By ES_confirmEmail = By.cssSelector("#confirmEmail");
    private static By ES_firstName = By.cssSelector("#FirstName");
    private static By ES_lastName = By.cssSelector("#LastName");
    private static By ES_zipCode = By.cssSelector("#ZipCode");
    private static By ES_month = By.cssSelector("#monthDOB");
    private static By ES_monthList = By.cssSelector("#monthDOB>option");
    private static By ES_day = By.cssSelector("#dayDOB");
    private static By ES_dayList = By.cssSelector("#dayDOB>option");
    private static By ES_year = By.cssSelector("#yearDOB");
    private static By ES_yearList = By.cssSelector("#yearDOB>option");
    private static By ES_gender_Male = By.xpath("//input[@name='saksGender'][@value='M']");
    private static By ES_gender_Female = By.xpath("//input[@name='saksGender'][@value='F']");
    private static By ES_submitBtn = By.xpath("//input[@id='email_updates_collect_save']");
    private static By ES_thankYouNote = By.xpath("//div[@class='email-sign-up-page email-sign-up-thank-you-page']/h2");

    private static By footerSectionOptionsColumn1 = By.xpath("//li[@class='menu-item first-child col1']//li/a");
    private static By footerSectionOptionsColumn2 = By.xpath("//li[@class='menu-item col2']//li/a");
    private static By footerSectionOptionsColumn3 = By.xpath("//li[@class='menu-item col3']//li/a");
    private static By footerSectionOptionsColumn4 = By.xpath("//li[@class='menu-item col4']//li/a");

    private static By socialMediaOptions = By.xpath("//div[@class='icons-container']//li/a");
    private static By lordAndTaylorLogo = By.xpath("//div[@class='logo logo-en']/a");

    public static By getHeaderNotice3_Link2() {
        return headerNotice3_Link2;
    }

    public static String getLinkStatusExcelFile() {
        return linkStatusExcelFile;
    }

    public static By getNavMenuDressesLinks() {
        return navMenuDressesLinks;
    }

    public static By getNavLinkTexts() {
        return navLinkTexts;
    }

    public static By getMenuContainerLink() {
        return menuContainerLink;
    }

    public static By getMenuContainerDropDownLinks() {
        return menuContainerDropDownLinks;
    }

    public static By getFooterSectionLinks() {
        return footerSectionLinks;
    }

    public static By getFAQ_Link() {
        return FAQ_Link;
    }

    public static By getEmailSubscriptionBox() {
        return emailSubscriptionBox;
    }

    public static By getEmailSubscriptionGoBtn() {
        return emailSubscriptionGoBtn;
    }

    public static By getES_email() {
        return ES_email;
    }

    public static By getES_confirmEmail() {
        return ES_confirmEmail;
    }

    public static By getES_firstName() {
        return ES_firstName;
    }

    public static By getES_lastName() {
        return ES_lastName;
    }

    public static By getES_zipCode() {
        return ES_zipCode;
    }

    public static By getES_month() {
        return ES_month;
    }

    public static By getES_monthList() {
        return ES_monthList;
    }

    public static By getES_day() {
        return ES_day;
    }

    public static By getES_dayList() {
        return ES_dayList;
    }

    public static By getES_year() {
        return ES_year;
    }

    public static By getES_yearList() {
        return ES_yearList;
    }

    public static By getES_gender_Male() {
        return ES_gender_Male;
    }

    public static By getES_gender_Female() {
        return ES_gender_Female;
    }

    public static By getES_submitBtn() {
        return ES_submitBtn;
    }

    public static By getES_thankYouNote() {
        return ES_thankYouNote;
    }

    public static By getFooterSectionOptionsColumn1() {
        return footerSectionOptionsColumn1;
    }

    public static By getFooterSectionOptionsColumn2() {
        return footerSectionOptionsColumn2;
    }

    public static By getFooterSectionOptionsColumn3() {
        return footerSectionOptionsColumn3;
    }

    public static By getFooterSectionOptionsColumn4() {
        return footerSectionOptionsColumn4;
    }

    public static By getSocialMediaOptions() {
        return socialMediaOptions;
    }

    public static By getLordAndTaylorLogo() {
        return lordAndTaylorLogo;
    }

}
