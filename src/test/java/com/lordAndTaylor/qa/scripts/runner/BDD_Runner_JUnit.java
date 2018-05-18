package com.lordAndTaylor.qa.scripts.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * To run it from the Command Line Interface, the following codes/syntax are used.
 * mvn clean test -Dcucumber.options="--tags @debug"                   //Only debug
 * mvn clean test -Dcucumber.options="--tags @debug --tags @smoke"     //AND
 * mvn clean test -Dcucumber.options="--tags @debug,@smoke"            //OR
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = { "@debug" },
        //tags = { "@smoke" },           /*   smoke test only    */
        //tags = { "@smoke,@debug" },    /* debug or smoke test  */
        //tags = { "@smoke","@debug" },  /* debug and smoke test */
        //tags = {"~@ignored"},
        //monochrome = true,
        strict = true,
        format = {"json:target/cucumber-parallel/1.json", "html:target/cucumber-parallel/1.html", "pretty"},
        features = {
                //"classpath:features/addToCartFunctionality.feature",
                "src/test/Resources/features/addToCartFunctionality.feature",
                //"src/test/Resources/features/checkoutFunctionality.feature",
                //"src/test/Resources/features/headerFooterFunctionality.feature",
                //"src/test/Resources/features/homepageFunctionality.feature",
                //"src/test/Resources/features/internationalShipping.feature",
                //"src/test/Resources/features/productsPageFunctionality.feature",
                //"src/test/Resources/features/registerUserFunctionality.feature",
                //"src/test/Resources/features/searchBoxFunctionality.feature",
                //"src/test/Resources/features/signInFunctionality.feature",
                //"src/test/Resources/features/userAccountPageFunctionality.feature",
        },
        //features = {"src/test/resources/features"},
        glue = {
                "com.lordAndTaylor.qa.scripts.steps",
                "com.lordAndTaylor.qa.framework.hooks"
        },
        //dryRun = true,
        plugin = {
                "pretty:target/cucumber-test-report/cucumber-pretty.txt",
                "html:target/cucumber-test-report",
                "json:target/cucumber-test-report/cucumber-report.json",
                "junit:target/cucumber-test-report/test-report.xml"
                //,"com.cucumber.listener.ExtentCucumberFormatter:target/extent-reports/full_report.html"

                // ----------- For Individual Page Reports ----------- //
                ,"com.cucumber.listener.ExtentCucumberFormatter:target/extent-reports/addToCart_report.html"
                // ,"com.cucumber.listener.ExtentCucumberFormatter:target/extent-reports/checkout_report.html"
                // ,"com.cucumber.listener.ExtentCucumberFormatter:target/extent-reports/header_Footer_report.html"
                // ,"com.cucumber.listener.ExtentCucumberFormatter:target/extent-reports/homepage_report.html"
                // ,"com.cucumber.listener.ExtentCucumberFormatter:target/extent-reports/productsPage_report.html"
                // ,"com.cucumber.listener.ExtentCucumberFormatter:target/extent-reports/international_Shipping_report.html"
                // ,"com.cucumber.listener.ExtentCucumberFormatter:target/extent-reports/register_User_report.html"
                // ,"com.cucumber.listener.ExtentCucumberFormatter:target/extent-reports/searchBox_report.html"
                // ,"com.cucumber.listener.ExtentCucumberFormatter:target/extent-reports/signInPage_report.html"
                // ,"com.cucumber.listener.ExtentCucumberFormatter:target/extent-reports/user_Account_report.html"

        }

)

public class BDD_Runner_JUnit {
}
