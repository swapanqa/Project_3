package com.lordAndTaylor.qa.framework.controller;

import org.openqa.selenium.WebDriver;

/**
 * Created by Debajyoti Paul on 4/11/2018 at 3:03 AM
 */
public class ApplicationController {
    protected WebDriver driver = null;

    public ApplicationController(){
    }

    public ApplicationController(WebDriver driver) {
        this.driver = driver;
    }

    private HomePageController homepage = null;
    private RegisterUserController registerUser = null;
    private SignInPageController signInPage = null;
    private UserAccountPageController userAccountPage = null;
    private HeaderFooterController headerFooterController = null;
    private SearchBoxController searchBoxController = null;
    private ProductsPageController productsPageFunctionality = null;
    private InternationalShippingController shipToOtherCountryController = null;
    private AddToCartController addToCartController = null;
    private CheckoutController checkoutController = null;

    public HomePageController homepage(){
        if(homepage == null){
            homepage = new HomePageController(driver);
        }
        return homepage;
    }

    public RegisterUserController registerUser(){
        if(registerUser == null){
            registerUser = new RegisterUserController(driver);
        }
        return registerUser;
    }

    public SignInPageController signInPage(){
        if(signInPage == null){
            signInPage = new SignInPageController(driver);
        }
        return signInPage;
    }

    public UserAccountPageController userAccountPage(){
        if(userAccountPage == null){
            userAccountPage = new UserAccountPageController(driver);
        }
        return userAccountPage;
    }

    public HeaderFooterController headerFooter(){
        if(headerFooterController == null){
            headerFooterController = new HeaderFooterController(driver);
        }
        return headerFooterController;
    }

    public SearchBoxController searchBox(){
        if(searchBoxController == null){
            searchBoxController = new SearchBoxController(driver);
        }
        return searchBoxController;
    }

    public ProductsPageController productsPage(){
        if(productsPageFunctionality == null){
            productsPageFunctionality = new ProductsPageController(driver);
        }
        return productsPageFunctionality;
    }

    public InternationalShippingController shipToCountry(){
        if(shipToOtherCountryController == null){
            shipToOtherCountryController = new InternationalShippingController(driver);
        }
        return shipToOtherCountryController;
    }

    public AddToCartController addToCart(){
        if(addToCartController == null){
            addToCartController = new AddToCartController(driver);
        }
        return addToCartController;
    }

    public CheckoutController checkout(){
        if(checkoutController == null){
            checkoutController = new CheckoutController(driver);
        }
        return checkoutController;
    }


}
