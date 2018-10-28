$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("addToCartFunctionality.feature");
formatter.feature({
  "line": 1,
  "name": "Lord and Taylor Shopping Bag Page and Add To Cart Functionality",
  "description": "",
  "id": "lord-and-taylor-shopping-bag-page-and-add-to-cart-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4696906000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Not a validated Shopping Cart Page and Add To Cart Functionality",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User browse to the site",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Closes the Popup window",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Lord and Taylor Homepage should display",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User hover over the men section in navigation bar",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click on the Nike Link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Nike products page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User click on Nike Hydroguard Mica Top product image",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Hydroguard Mica Top Product page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User click on \"Mica Blue\" color option",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Selects Large as the size",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.not_a_validated_Shopping_Cart_Page_and_Add_To_Cart_Functionality()"
});
formatter.result({
  "duration": 255243300,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.user_browse_to_the_site()"
});
formatter.result({
  "duration": 12275290000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.closes_the_Popup_window()"
});
formatter.result({
  "duration": 1741570000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.lord_and_Taylor_Homepage_should_display()"
});
formatter.result({
  "duration": 56668100,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.user_hover_over_the_men_section_in_navigation_bar()"
});
formatter.result({
  "duration": 6306579400,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.user_click_on_the_Nike_Link()"
});
formatter.result({
  "duration": 6420642800,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.nike_products_page_should_display()"
});
formatter.result({
  "duration": 1171290700,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.user_click_on_Nike_Hydroguard_Mica_Top_product_image()"
});
formatter.result({
  "duration": 15739273200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//img[@id\u003d\u0027img_0500087327563-0\u0027]\"}\n  (Session info: chrome\u003d66.0.3359.117)\n  (Driver info: chromedriver\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 15.01 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b\u0027, time: \u00272016-03-15 17:00:58\u0027\nSystem info: host: \u0027199-7-164-14\u0027, ip: \u0027199.7.164.14\u0027, os.name: \u0027windows\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed), userDataDir\u003dC:\\Windows\\proxy\\scoped_dir4760_17080}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d66.0.3359.117, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: e101d7b31bae5227582b2503c34d0a6a\n*** Element info: {Using\u003dxpath, value\u003d//img[@id\u003d\u0027img_0500087327563-0\u0027]}\nCommand duration or timeout: 0 milliseconds\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat com.lordAndTaylor.qa.framework.controller.PageBaseMethods.clickElement(PageBaseMethods.java:63)\r\n\tat com.lordAndTaylor.qa.framework.controller.ProductsPageController.clickNikeProduct(ProductsPageController.java:208)\r\n\tat com.lordAndTaylor.qa.scripts.steps.ProductsPageSteps.user_click_on_Nike_Hydroguard_Mica_Top_product_image(ProductsPageSteps.java:133)\r\n\tat ✽.When User click on Nike Hydroguard Mica Top product image(addToCartFunctionality.feature:11)\r\nCaused by: org.openqa.selenium.remote.ScreenshotException: Screen shot has been taken\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:140)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat com.lordAndTaylor.qa.framework.controller.PageBaseMethods.clickElement(PageBaseMethods.java:63)\r\n\tat com.lordAndTaylor.qa.framework.controller.ProductsPageController.clickNikeProduct(ProductsPageController.java:208)\r\n\tat com.lordAndTaylor.qa.scripts.steps.ProductsPageSteps.user_click_on_Nike_Hydroguard_Mica_Top_product_image(ProductsPageSteps.java:133)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.runBackground(CucumberScenario.java:59)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:42)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat com.lordAndTaylor.qa.scripts.runner.BDD_Runner_TestNg.feature(BDD_Runner_TestNg.java:86)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:580)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:716)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:988)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\r\n\tat org.testng.TestRunner.run(TestRunner.java:505)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\r\n\tat org.testng.TestNG.run(TestNG.java:1017)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:114)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//img[@id\u003d\u0027img_0500087327563-0\u0027]\"}\n  (Session info: chrome\u003d66.0.3359.117)\n  (Driver info: chromedriver\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 15.01 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b\u0027, time: \u00272016-03-15 17:00:58\u0027\nSystem info: host: \u0027199-7-164-14\u0027, ip: \u0027199.7.164.14\u0027, os.name: \u0027windows\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed), userDataDir\u003dC:\\Windows\\proxy\\scoped_dir4760_17080}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d66.0.3359.117, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: e101d7b31bae5227582b2503c34d0a6a\n*** Element info: {Using\u003dxpath, value\u003d//img[@id\u003d\u0027img_0500087327563-0\u0027]}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027SHIFT-PC01\u0027, ip: \u0027192.168.1.158\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00279.0.4\u0027\nDriver info: driver.version: EventFiringWebDriver\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$2.invoke(EventFiringWebDriver.java:103)\r\n\tat com.sun.proxy.$Proxy1.findElement(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElement(EventFiringWebDriver.java:188)\r\n\tat org.openqa.selenium.remote.server.handler.FindElement.call(FindElement.java:48)\r\n\tat org.openqa.selenium.remote.server.handler.FindElement.call(FindElement.java:1)\r\n\tat java.util.concurrent.FutureTask.run(Unknown Source)\r\n\tat org.openqa.selenium.remote.server.DefaultSession$1.run(DefaultSession.java:176)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)\r\n\tat java.lang.Thread.run(Unknown Source)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ProductsPageSteps.hydroguard_Mica_Top_Product_page_should_display()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Mica Blue",
      "offset": 15
    }
  ],
  "location": "ProductsPageSteps.user_click_on_color_option(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProductsPageSteps.selects_Large_as_the_size()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 18,
  "name": "1. Verify that shopping cart pop up shows the same product related details after adding the item",
  "description": "",
  "id": "lord-and-taylor-shopping-bag-page-and-add-to-cart-functionality;1.-verify-that-shopping-cart-pop-up-shows-the-same-product-related-details-after-adding-the-item",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@functional"
    },
    {
      "line": 17,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "Click on Add To Bag Button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User should see the following product related details in the pop up box",
  "rows": [
    {
      "cells": [
        "Nike"
      ],
      "line": 21
    },
    {
      "cells": [
        "Hydroguard Mica Top"
      ],
      "line": 22
    },
    {
      "cells": [
        "Size: LARGE"
      ],
      "line": 23
    },
    {
      "cells": [
        "Color: MICA BLUE"
      ],
      "line": 24
    },
    {
      "cells": [
        "QTY: 1"
      ],
      "line": 25
    },
    {
      "cells": [
        "$38.00"
      ],
      "line": 26
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.click_on_Add_To_Bag_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToCartSteps.user_should_see_the_following_product_related_details_in_the_pop_up_box(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 11507730000,
  "status": "passed"
});
formatter.before({
  "duration": 3939718200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Not a validated Shopping Cart Page and Add To Cart Functionality",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User browse to the site",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Closes the Popup window",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Lord and Taylor Homepage should display",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User hover over the men section in navigation bar",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click on the Nike Link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Nike products page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User click on Nike Hydroguard Mica Top product image",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Hydroguard Mica Top Product page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User click on \"Mica Blue\" color option",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Selects Large as the size",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.not_a_validated_Shopping_Cart_Page_and_Add_To_Cart_Functionality()"
});
formatter.result({
  "duration": 74590700,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.user_browse_to_the_site()"
});
formatter.result({
  "duration": 9689732000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.closes_the_Popup_window()"
});
formatter.result({
  "duration": 1922677800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.lord_and_Taylor_Homepage_should_display()"
});
formatter.result({
  "duration": 43359700,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.user_hover_over_the_men_section_in_navigation_bar()"
});
formatter.result({
  "duration": 6854689600,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.user_click_on_the_Nike_Link()"
});
formatter.result({
  "duration": 6225315300,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.nike_products_page_should_display()"
});
formatter.result({
  "duration": 1186666200,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.user_click_on_Nike_Hydroguard_Mica_Top_product_image()"
});
formatter.result({
  "duration": 15688139100,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//img[@id\u003d\u0027img_0500087327563-0\u0027]\"}\n  (Session info: chrome\u003d66.0.3359.117)\n  (Driver info: chromedriver\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 15.02 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b\u0027, time: \u00272016-03-15 17:00:58\u0027\nSystem info: host: \u0027207-254-11-159\u0027, ip: \u0027207.254.11.159\u0027, os.name: \u0027windows\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed), userDataDir\u003dC:\\Windows\\proxy\\scoped_dir3532_9549}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d66.0.3359.117, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 96b337cff3296d07f3e73faae792c182\n*** Element info: {Using\u003dxpath, value\u003d//img[@id\u003d\u0027img_0500087327563-0\u0027]}\nCommand duration or timeout: 0 milliseconds\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat com.lordAndTaylor.qa.framework.controller.PageBaseMethods.clickElement(PageBaseMethods.java:63)\r\n\tat com.lordAndTaylor.qa.framework.controller.ProductsPageController.clickNikeProduct(ProductsPageController.java:208)\r\n\tat com.lordAndTaylor.qa.scripts.steps.ProductsPageSteps.user_click_on_Nike_Hydroguard_Mica_Top_product_image(ProductsPageSteps.java:133)\r\n\tat ✽.When User click on Nike Hydroguard Mica Top product image(addToCartFunctionality.feature:11)\r\nCaused by: org.openqa.selenium.remote.ScreenshotException: Screen shot has been taken\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:140)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat com.lordAndTaylor.qa.framework.controller.PageBaseMethods.clickElement(PageBaseMethods.java:63)\r\n\tat com.lordAndTaylor.qa.framework.controller.ProductsPageController.clickNikeProduct(ProductsPageController.java:208)\r\n\tat com.lordAndTaylor.qa.scripts.steps.ProductsPageSteps.user_click_on_Nike_Hydroguard_Mica_Top_product_image(ProductsPageSteps.java:133)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.runBackground(CucumberScenario.java:59)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:42)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat com.lordAndTaylor.qa.scripts.runner.BDD_Runner_TestNg.feature(BDD_Runner_TestNg.java:86)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:580)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:716)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:988)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\r\n\tat org.testng.TestRunner.run(TestRunner.java:505)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\r\n\tat org.testng.TestNG.run(TestNG.java:1017)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:114)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//img[@id\u003d\u0027img_0500087327563-0\u0027]\"}\n  (Session info: chrome\u003d66.0.3359.117)\n  (Driver info: chromedriver\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 15.02 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b\u0027, time: \u00272016-03-15 17:00:58\u0027\nSystem info: host: \u0027207-254-11-159\u0027, ip: \u0027207.254.11.159\u0027, os.name: \u0027windows\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed), userDataDir\u003dC:\\Windows\\proxy\\scoped_dir3532_9549}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d66.0.3359.117, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 96b337cff3296d07f3e73faae792c182\n*** Element info: {Using\u003dxpath, value\u003d//img[@id\u003d\u0027img_0500087327563-0\u0027]}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027SHIFT-PC01\u0027, ip: \u0027192.168.1.158\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00279.0.4\u0027\nDriver info: driver.version: EventFiringWebDriver\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$2.invoke(EventFiringWebDriver.java:103)\r\n\tat com.sun.proxy.$Proxy1.findElement(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElement(EventFiringWebDriver.java:188)\r\n\tat org.openqa.selenium.remote.server.handler.FindElement.call(FindElement.java:48)\r\n\tat org.openqa.selenium.remote.server.handler.FindElement.call(FindElement.java:1)\r\n\tat java.util.concurrent.FutureTask.run(Unknown Source)\r\n\tat org.openqa.selenium.remote.server.DefaultSession$1.run(DefaultSession.java:176)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)\r\n\tat java.lang.Thread.run(Unknown Source)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ProductsPageSteps.hydroguard_Mica_Top_Product_page_should_display()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Mica Blue",
      "offset": 15
    }
  ],
  "location": "ProductsPageSteps.user_click_on_color_option(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProductsPageSteps.selects_Large_as_the_size()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 30,
  "name": "2. Verify the price displayed in pop up is properly calculated as per the quantity",
  "description": "",
  "id": "lord-and-taylor-shopping-bag-page-and-add-to-cart-functionality;2.-verify-the-price-displayed-in-pop-up-is-properly-calculated-as-per-the-quantity",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@functional"
    },
    {
      "line": 29,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "Enters \"2\" in the quantity box",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Click on Add To Bag Button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "the total price displayed in the pop up would be \"$76.00\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 8
    }
  ],
  "location": "AddToCartSteps.enters_in_the_quantity_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToCartSteps.click_on_Add_To_Bag_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$76.00",
      "offset": 50
    }
  ],
  "location": "AddToCartSteps.the_total_price_displayed_in_the_pop_up_would_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 11323641900,
  "status": "passed"
});
formatter.before({
  "duration": 3805210400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Not a validated Shopping Cart Page and Add To Cart Functionality",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User browse to the site",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Closes the Popup window",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Lord and Taylor Homepage should display",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User hover over the men section in navigation bar",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click on the Nike Link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Nike products page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User click on Nike Hydroguard Mica Top product image",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Hydroguard Mica Top Product page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User click on \"Mica Blue\" color option",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Selects Large as the size",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.not_a_validated_Shopping_Cart_Page_and_Add_To_Cart_Functionality()"
});
formatter.result({
  "duration": 848428300,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.user_browse_to_the_site()"
});
formatter.result({
  "duration": 8333753900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.closes_the_Popup_window()"
});
formatter.result({
  "duration": 1981378800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.lord_and_Taylor_Homepage_should_display()"
});
formatter.result({
  "duration": 134464900,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.user_hover_over_the_men_section_in_navigation_bar()"
});
formatter.result({
  "duration": 6890267000,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.user_click_on_the_Nike_Link()"
});
formatter.result({
  "duration": 4761022700,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.nike_products_page_should_display()"
});
formatter.result({
  "duration": 1169051500,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.user_click_on_Nike_Hydroguard_Mica_Top_product_image()"
});
formatter.result({
  "duration": 15700215200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//img[@id\u003d\u0027img_0500087327563-0\u0027]\"}\n  (Session info: chrome\u003d66.0.3359.117)\n  (Driver info: chromedriver\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 15.06 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b\u0027, time: \u00272016-03-15 17:00:58\u0027\nSystem info: host: \u0027207-254-11-59\u0027, ip: \u0027207.254.11.59\u0027, os.name: \u0027windows\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed), userDataDir\u003dC:\\Windows\\proxy\\scoped_dir4684_14034}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d66.0.3359.117, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 0544a4a5af2d98c72f2d6d202eec50f9\n*** Element info: {Using\u003dxpath, value\u003d//img[@id\u003d\u0027img_0500087327563-0\u0027]}\nCommand duration or timeout: 0 milliseconds\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat com.lordAndTaylor.qa.framework.controller.PageBaseMethods.clickElement(PageBaseMethods.java:63)\r\n\tat com.lordAndTaylor.qa.framework.controller.ProductsPageController.clickNikeProduct(ProductsPageController.java:208)\r\n\tat com.lordAndTaylor.qa.scripts.steps.ProductsPageSteps.user_click_on_Nike_Hydroguard_Mica_Top_product_image(ProductsPageSteps.java:133)\r\n\tat ✽.When User click on Nike Hydroguard Mica Top product image(addToCartFunctionality.feature:11)\r\nCaused by: org.openqa.selenium.remote.ScreenshotException: Screen shot has been taken\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:140)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat com.lordAndTaylor.qa.framework.controller.PageBaseMethods.clickElement(PageBaseMethods.java:63)\r\n\tat com.lordAndTaylor.qa.framework.controller.ProductsPageController.clickNikeProduct(ProductsPageController.java:208)\r\n\tat com.lordAndTaylor.qa.scripts.steps.ProductsPageSteps.user_click_on_Nike_Hydroguard_Mica_Top_product_image(ProductsPageSteps.java:133)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.runBackground(CucumberScenario.java:59)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:42)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat com.lordAndTaylor.qa.scripts.runner.BDD_Runner_TestNg.feature(BDD_Runner_TestNg.java:86)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:580)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:716)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:988)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\r\n\tat org.testng.TestRunner.run(TestRunner.java:505)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\r\n\tat org.testng.TestNG.run(TestNG.java:1017)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:114)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//img[@id\u003d\u0027img_0500087327563-0\u0027]\"}\n  (Session info: chrome\u003d66.0.3359.117)\n  (Driver info: chromedriver\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 15.06 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b\u0027, time: \u00272016-03-15 17:00:58\u0027\nSystem info: host: \u0027207-254-11-59\u0027, ip: \u0027207.254.11.59\u0027, os.name: \u0027windows\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed), userDataDir\u003dC:\\Windows\\proxy\\scoped_dir4684_14034}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d66.0.3359.117, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 0544a4a5af2d98c72f2d6d202eec50f9\n*** Element info: {Using\u003dxpath, value\u003d//img[@id\u003d\u0027img_0500087327563-0\u0027]}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027SHIFT-PC01\u0027, ip: \u0027192.168.1.158\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00279.0.4\u0027\nDriver info: driver.version: EventFiringWebDriver\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$2.invoke(EventFiringWebDriver.java:103)\r\n\tat com.sun.proxy.$Proxy1.findElement(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElement(EventFiringWebDriver.java:188)\r\n\tat org.openqa.selenium.remote.server.handler.FindElement.call(FindElement.java:48)\r\n\tat org.openqa.selenium.remote.server.handler.FindElement.call(FindElement.java:1)\r\n\tat java.util.concurrent.FutureTask.run(Unknown Source)\r\n\tat org.openqa.selenium.remote.server.DefaultSession$1.run(DefaultSession.java:176)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)\r\n\tat java.lang.Thread.run(Unknown Source)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ProductsPageSteps.hydroguard_Mica_Top_Product_page_should_display()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Mica Blue",
      "offset": 15
    }
  ],
  "location": "ProductsPageSteps.user_click_on_color_option(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProductsPageSteps.selects_Large_as_the_size()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 68,
  "name": "7. Verify the remove item functionality in the shopping bag page",
  "description": "",
  "id": "lord-and-taylor-shopping-bag-page-and-add-to-cart-functionality;7.-verify-the-remove-item-functionality-in-the-shopping-bag-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 66,
      "name": "@functional"
    },
    {
      "line": 67,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 69,
  "name": "Click on Add To Bag Button",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "User click on the View My Bag button",
  "keyword": "When "
});
formatter.step({
  "line": 71,
  "name": "Shopping Bag page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "User clicks the remove item link",
  "keyword": "When "
});
formatter.step({
  "line": 73,
  "name": "Clicks on the confirm remove item link",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "User should see that the item has been removed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.click_on_Add_To_Bag_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToCartSteps.user_click_on_the_View_My_Bag_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToCartSteps.shopping_Bag_page_should_display()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToCartSteps.user_clicks_the_remove_item_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToCartSteps.clicks_on_the_confirm_remove_item_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToCartSteps.user_should_see_that_the_item_has_been_removed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 11454154400,
  "status": "passed"
});
formatter.before({
  "duration": 3849536600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Not a validated Shopping Cart Page and Add To Cart Functionality",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User browse to the site",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Closes the Popup window",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Lord and Taylor Homepage should display",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User hover over the men section in navigation bar",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click on the Nike Link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Nike products page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User click on Nike Hydroguard Mica Top product image",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Hydroguard Mica Top Product page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User click on \"Mica Blue\" color option",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Selects Large as the size",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.not_a_validated_Shopping_Cart_Page_and_Add_To_Cart_Functionality()"
});
formatter.result({
  "duration": 88498700,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.user_browse_to_the_site()"
});
formatter.result({
  "duration": 10966223900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.closes_the_Popup_window()"
});
formatter.result({
  "duration": 2556066100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.lord_and_Taylor_Homepage_should_display()"
});
formatter.result({
  "duration": 58513400,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.user_hover_over_the_men_section_in_navigation_bar()"
});
formatter.result({
  "duration": 8835131200,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.user_click_on_the_Nike_Link()"
});
formatter.result({
  "duration": 7200485500,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.nike_products_page_should_display()"
});
formatter.result({
  "duration": 1447395800,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.user_click_on_Nike_Hydroguard_Mica_Top_product_image()"
});
formatter.result({
  "duration": 15849941800,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//img[@id\u003d\u0027img_0500087327563-0\u0027]\"}\n  (Session info: chrome\u003d66.0.3359.117)\n  (Driver info: chromedriver\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 15.02 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b\u0027, time: \u00272016-03-15 17:00:58\u0027\nSystem info: host: \u0027207-254-11-217\u0027, ip: \u0027207.254.11.217\u0027, os.name: \u0027windows\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed), userDataDir\u003dC:\\Windows\\proxy\\scoped_dir1908_30120}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d66.0.3359.117, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: e912849dc980ef9308649f0bed18e67c\n*** Element info: {Using\u003dxpath, value\u003d//img[@id\u003d\u0027img_0500087327563-0\u0027]}\nCommand duration or timeout: 0 milliseconds\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat com.lordAndTaylor.qa.framework.controller.PageBaseMethods.clickElement(PageBaseMethods.java:63)\r\n\tat com.lordAndTaylor.qa.framework.controller.ProductsPageController.clickNikeProduct(ProductsPageController.java:208)\r\n\tat com.lordAndTaylor.qa.scripts.steps.ProductsPageSteps.user_click_on_Nike_Hydroguard_Mica_Top_product_image(ProductsPageSteps.java:133)\r\n\tat ✽.When User click on Nike Hydroguard Mica Top product image(addToCartFunctionality.feature:11)\r\nCaused by: org.openqa.selenium.remote.ScreenshotException: Screen shot has been taken\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:140)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat com.lordAndTaylor.qa.framework.controller.PageBaseMethods.clickElement(PageBaseMethods.java:63)\r\n\tat com.lordAndTaylor.qa.framework.controller.ProductsPageController.clickNikeProduct(ProductsPageController.java:208)\r\n\tat com.lordAndTaylor.qa.scripts.steps.ProductsPageSteps.user_click_on_Nike_Hydroguard_Mica_Top_product_image(ProductsPageSteps.java:133)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.runBackground(CucumberScenario.java:59)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:42)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat com.lordAndTaylor.qa.scripts.runner.BDD_Runner_TestNg.feature(BDD_Runner_TestNg.java:86)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:580)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:716)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:988)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\r\n\tat org.testng.TestRunner.run(TestRunner.java:505)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\r\n\tat org.testng.TestNG.run(TestNG.java:1017)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:114)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//img[@id\u003d\u0027img_0500087327563-0\u0027]\"}\n  (Session info: chrome\u003d66.0.3359.117)\n  (Driver info: chromedriver\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 15.02 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b\u0027, time: \u00272016-03-15 17:00:58\u0027\nSystem info: host: \u0027207-254-11-217\u0027, ip: \u0027207.254.11.217\u0027, os.name: \u0027windows\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed), userDataDir\u003dC:\\Windows\\proxy\\scoped_dir1908_30120}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d66.0.3359.117, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: e912849dc980ef9308649f0bed18e67c\n*** Element info: {Using\u003dxpath, value\u003d//img[@id\u003d\u0027img_0500087327563-0\u0027]}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027SHIFT-PC01\u0027, ip: \u0027192.168.1.158\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00279.0.4\u0027\nDriver info: driver.version: EventFiringWebDriver\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$2.invoke(EventFiringWebDriver.java:103)\r\n\tat com.sun.proxy.$Proxy1.findElement(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElement(EventFiringWebDriver.java:188)\r\n\tat org.openqa.selenium.remote.server.handler.FindElement.call(FindElement.java:48)\r\n\tat org.openqa.selenium.remote.server.handler.FindElement.call(FindElement.java:1)\r\n\tat java.util.concurrent.FutureTask.run(Unknown Source)\r\n\tat org.openqa.selenium.remote.server.DefaultSession$1.run(DefaultSession.java:176)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)\r\n\tat java.lang.Thread.run(Unknown Source)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ProductsPageSteps.hydroguard_Mica_Top_Product_page_should_display()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Mica Blue",
      "offset": 15
    }
  ],
  "location": "ProductsPageSteps.user_click_on_color_option(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProductsPageSteps.selects_Large_as_the_size()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 121,
  "name": "12. Verify Paypal checkout button",
  "description": "",
  "id": "lord-and-taylor-shopping-bag-page-and-add-to-cart-functionality;12.-verify-paypal-checkout-button",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 119,
      "name": "@functional"
    },
    {
      "line": 120,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 122,
  "name": "Click on Add To Bag Button",
  "keyword": "And "
});
formatter.step({
  "line": 123,
  "name": "User click on the View My Bag button",
  "keyword": "When "
});
formatter.step({
  "line": 124,
  "name": "Shopping Bag page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 125,
  "name": "User enter zipcode as \"11435\"",
  "keyword": "When "
});
formatter.step({
  "line": 126,
  "name": "Click on shipping method dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 127,
  "name": "Selects \"Rush\" as the shipping method",
  "keyword": "And "
});
formatter.step({
  "line": 128,
  "name": "Click on the paypal checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 129,
  "name": "Paypal checkout page should open",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.click_on_Add_To_Bag_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToCartSteps.user_click_on_the_View_My_Bag_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToCartSteps.shopping_Bag_page_should_display()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "11435",
      "offset": 23
    }
  ],
  "location": "AddToCartSteps.user_enter_zipcode_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToCartSteps.click_on_shipping_method_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Rush",
      "offset": 9
    }
  ],
  "location": "AddToCartSteps.selects_as_the_shipping_method(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToCartSteps.click_on_the_paypal_checkout_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToCartSteps.paypal_checkout_page_should_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 12176299100,
  "status": "passed"
});
formatter.uri("addToCartFunctionality.feature");
formatter.feature({
  "line": 1,
  "name": "Lord and Taylor Shopping Bag Page and Add To Cart Functionality",
  "description": "",
  "id": "lord-and-taylor-shopping-bag-page-and-add-to-cart-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3790330700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Not a validated Shopping Cart Page and Add To Cart Functionality",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User browse to the site",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Closes the Popup window",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Lord and Taylor Homepage should display",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User hover over the men section in navigation bar",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click on the Nike Link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Nike products page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User click on Nike Hydroguard Mica Top product image",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Hydroguard Mica Top Product page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User click on \"Mica Blue\" color option",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Selects Large as the size",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.not_a_validated_Shopping_Cart_Page_and_Add_To_Cart_Functionality()"
});
formatter.result({
  "duration": 77642700,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.user_browse_to_the_site()"
});
formatter.result({
  "duration": 8591343300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.closes_the_Popup_window()"
});
formatter.result({
  "duration": 2088709000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.lord_and_Taylor_Homepage_should_display()"
});
formatter.result({
  "duration": 40487300,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.user_hover_over_the_men_section_in_navigation_bar()"
});
formatter.result({
  "duration": 6105311100,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.user_click_on_the_Nike_Link()"
});
formatter.result({
  "duration": 3904034100,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.nike_products_page_should_display()"
});
formatter.result({
  "duration": 1133442000,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.user_click_on_Nike_Hydroguard_Mica_Top_product_image()"
});
formatter.result({
  "duration": 15555186400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//img[@id\u003d\u0027img_0500087327563-0\u0027]\"}\n  (Session info: chrome\u003d66.0.3359.117)\n  (Driver info: chromedriver\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 15.01 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b\u0027, time: \u00272016-03-15 17:00:58\u0027\nSystem info: host: \u0027207-254-11-62\u0027, ip: \u0027207.254.11.62\u0027, os.name: \u0027windows\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed), userDataDir\u003dC:\\Windows\\proxy\\scoped_dir4180_21092}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d66.0.3359.117, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: f0698459280baf6b1e1157a21c3ab6f4\n*** Element info: {Using\u003dxpath, value\u003d//img[@id\u003d\u0027img_0500087327563-0\u0027]}\nCommand duration or timeout: 0 milliseconds\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat com.lordAndTaylor.qa.framework.controller.PageBaseMethods.clickElement(PageBaseMethods.java:63)\r\n\tat com.lordAndTaylor.qa.framework.controller.ProductsPageController.clickNikeProduct(ProductsPageController.java:208)\r\n\tat com.lordAndTaylor.qa.scripts.steps.ProductsPageSteps.user_click_on_Nike_Hydroguard_Mica_Top_product_image(ProductsPageSteps.java:133)\r\n\tat ✽.When User click on Nike Hydroguard Mica Top product image(addToCartFunctionality.feature:11)\r\nCaused by: org.openqa.selenium.remote.ScreenshotException: Screen shot has been taken\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:140)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat com.lordAndTaylor.qa.framework.controller.PageBaseMethods.clickElement(PageBaseMethods.java:63)\r\n\tat com.lordAndTaylor.qa.framework.controller.ProductsPageController.clickNikeProduct(ProductsPageController.java:208)\r\n\tat com.lordAndTaylor.qa.scripts.steps.ProductsPageSteps.user_click_on_Nike_Hydroguard_Mica_Top_product_image(ProductsPageSteps.java:133)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.runBackground(CucumberScenario.java:59)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:42)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat com.lordAndTaylor.qa.scripts.runner.BDD_Runner_TestNg.feature(BDD_Runner_TestNg.java:86)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:580)\r\n\tat org.testng.internal.Invoker.retryFailed(Invoker.java:838)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1009)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\r\n\tat org.testng.TestRunner.run(TestRunner.java:505)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\r\n\tat org.testng.TestNG.run(TestNG.java:1017)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:114)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//img[@id\u003d\u0027img_0500087327563-0\u0027]\"}\n  (Session info: chrome\u003d66.0.3359.117)\n  (Driver info: chromedriver\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 15.01 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b\u0027, time: \u00272016-03-15 17:00:58\u0027\nSystem info: host: \u0027207-254-11-62\u0027, ip: \u0027207.254.11.62\u0027, os.name: \u0027windows\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed), userDataDir\u003dC:\\Windows\\proxy\\scoped_dir4180_21092}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d66.0.3359.117, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: f0698459280baf6b1e1157a21c3ab6f4\n*** Element info: {Using\u003dxpath, value\u003d//img[@id\u003d\u0027img_0500087327563-0\u0027]}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027SHIFT-PC01\u0027, ip: \u0027192.168.1.158\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00279.0.4\u0027\nDriver info: driver.version: EventFiringWebDriver\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$2.invoke(EventFiringWebDriver.java:103)\r\n\tat com.sun.proxy.$Proxy1.findElement(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElement(EventFiringWebDriver.java:188)\r\n\tat org.openqa.selenium.remote.server.handler.FindElement.call(FindElement.java:48)\r\n\tat org.openqa.selenium.remote.server.handler.FindElement.call(FindElement.java:1)\r\n\tat java.util.concurrent.FutureTask.run(Unknown Source)\r\n\tat org.openqa.selenium.remote.server.DefaultSession$1.run(DefaultSession.java:176)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)\r\n\tat java.lang.Thread.run(Unknown Source)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ProductsPageSteps.hydroguard_Mica_Top_Product_page_should_display()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Mica Blue",
      "offset": 15
    }
  ],
  "location": "ProductsPageSteps.user_click_on_color_option(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProductsPageSteps.selects_Large_as_the_size()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 18,
  "name": "1. Verify that shopping cart pop up shows the same product related details after adding the item",
  "description": "",
  "id": "lord-and-taylor-shopping-bag-page-and-add-to-cart-functionality;1.-verify-that-shopping-cart-pop-up-shows-the-same-product-related-details-after-adding-the-item",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@functional"
    },
    {
      "line": 17,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "Click on Add To Bag Button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User should see the following product related details in the pop up box",
  "rows": [
    {
      "cells": [
        "Nike"
      ],
      "line": 21
    },
    {
      "cells": [
        "Hydroguard Mica Top"
      ],
      "line": 22
    },
    {
      "cells": [
        "Size: LARGE"
      ],
      "line": 23
    },
    {
      "cells": [
        "Color: MICA BLUE"
      ],
      "line": 24
    },
    {
      "cells": [
        "QTY: 1"
      ],
      "line": 25
    },
    {
      "cells": [
        "$38.00"
      ],
      "line": 26
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.click_on_Add_To_Bag_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToCartSteps.user_should_see_the_following_product_related_details_in_the_pop_up_box(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 11458275200,
  "status": "passed"
});
formatter.before({
  "duration": 3715371800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Not a validated Shopping Cart Page and Add To Cart Functionality",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User browse to the site",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Closes the Popup window",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Lord and Taylor Homepage should display",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User hover over the men section in navigation bar",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click on the Nike Link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Nike products page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User click on Nike Hydroguard Mica Top product image",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Hydroguard Mica Top Product page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User click on \"Mica Blue\" color option",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Selects Large as the size",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.not_a_validated_Shopping_Cart_Page_and_Add_To_Cart_Functionality()"
});
formatter.result({
  "duration": 97192900,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.user_browse_to_the_site()"
});
formatter.result({
  "duration": 10648780700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.closes_the_Popup_window()"
});
formatter.result({
  "duration": 1829289200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.lord_and_Taylor_Homepage_should_display()"
});
formatter.result({
  "duration": 41005400,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.user_hover_over_the_men_section_in_navigation_bar()"
});
formatter.result({
  "duration": 6468592700,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.user_click_on_the_Nike_Link()"
});
formatter.result({
  "duration": 4208606400,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.nike_products_page_should_display()"
});
formatter.result({
  "duration": 1171182600,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.user_click_on_Nike_Hydroguard_Mica_Top_product_image()"
});
