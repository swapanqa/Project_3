package com.lordAndTaylor.qa.framework.hooks;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import com.lordAndTaylor.qa.framework.utils.DriverFactory;
import com.lordAndTaylor.qa.framework.utils.SendEmailUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Debajyoti Paul on 3/8/2018 at 6:35 PM
 */
public class BeforeAfterHook extends BaseSteps {

    @Before
    public void setUp(Scenario scenario){
        if(driver instanceof ChromeDriver){
            driver.manage().window().maximize();
        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        Reporter.assignAuthor("Debajyoti_Paul");        //For Extent Reports
        System.out.println("----------------------------------------------------------------------");
        System.out.println("*************** Test Environment Set up ***************");
        System.out.println("***************    Starting Scenario    ***************");
        System.out.println("*************** Scenario Name -- " + scenario.getName() + " ***************");
        System.out.println("----------------------------------------------------------------------");
    }

    @After
    public void tearDown(Scenario scenario){

        Reporter.loadXMLConfig(new File("src/test/Resources/extent-config.xml"));
	        /*Properties p = System.getProperties();
	        p.list(System.out);*/

        Reporter.setSystemInfo("User Name",System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("64 Bit", "Windows 8.1");
        Reporter.setSystemInfo("3.8.1", "Selenium");
        Reporter.setSystemInfo("3.5", "Maven");
        Reporter.setSystemInfo("1.8.0", "Java Version");
        Reporter.setTestRunnerOutput("Cucumber TestNg Runner");

        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", "_");
                try {
                    File sourcePath = ((TakesScreenshot)this.driver).getScreenshotAs(OutputType.FILE);
                    File destinationPath = new File(System.getProperty("user.dir") + "/target/extent-reports/screenshots/" + screenshotName + ".png");
                    Files.copy(sourcePath, destinationPath);
                    String imagePath = destinationPath.toString();
                    System.out.println("Image path is: " + imagePath);
                    Reporter.addScreenCaptureFromPath(imagePath); // For screenshot in extent cucumber report

                    scenario.embed(((TakesScreenshot)this.driver).getScreenshotAs(OutputType.BYTES),"image/png"); // For screenshot in basic cucumber report

                    SendEmailUtils.emailReport("mailfailedreportstopaul@gmail.com", "Failed Test Report For " + scenario.getName(), "Scenario ID : " + scenario.getId() + " -- FAILED..!! ");
                }
                catch (IOException e) {
            }
        }

        System.out.println("Test Environment Destroyed");
        System.out.println("----------------------------------------------------------------------");

        DriverFactory.getInstance().removeDriver();
    }

}
