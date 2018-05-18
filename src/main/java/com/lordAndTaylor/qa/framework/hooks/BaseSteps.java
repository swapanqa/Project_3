package com.lordAndTaylor.qa.framework.hooks;

import com.lordAndTaylor.qa.framework.utils.DriverFactory;
import com.lordAndTaylor.qa.framework.controller.ApplicationController;
import org.openqa.selenium.*;

/**
 * Created by Debajyoti Paul on 3/8/2018 at 6:35 PM
 */
public class BaseSteps {

    protected WebDriver driver = DriverFactory.getInstance("cloud_win8.1_chrome_66").getDriver();
    //protected WebDriver driver = DriverFactory.getInstance("chrome").getDriver();

    protected ApplicationController applicationController = null;

    public ApplicationController getLordAndTaylor() {
        if (applicationController == null) {
            applicationController = new ApplicationController(driver);
        }
        return applicationController;
    }

}
