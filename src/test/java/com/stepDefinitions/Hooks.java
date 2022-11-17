package com.stepDefinitions;

import com.uiPages.Base;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;


public class Hooks extends Base {


    @Before
    public void setUp() {
        Base.clearCookies();

        String url = ConfigurationReader.get("url");
        Driver.get(ConfigurationReader.get("browser")).manage().window().maximize();
        Driver.get(ConfigurationReader.get("browser")).manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Driver.get(ConfigurationReader.get("browser")).get(url);


    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {

            final byte[] screenshot = ((TakesScreenshot) Driver.get("url")).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", "screenshot");

        }

        Driver.closeDriver();

    }


}
