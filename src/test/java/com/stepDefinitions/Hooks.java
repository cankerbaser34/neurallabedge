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

        String camera_ip = ConfigurationReader.get("vivotek_ib9365_ht_a");
        String name_password = ConfigurationReader.get("user_password");
        String partial_url = ConfigurationReader.get("vivo_live_url");
        String full_url = "http://" + name_password + camera_ip + partial_url;


        String url = ConfigurationReader.get("zktecofull");
        Driver.get(ConfigurationReader.get("browser")).manage().window().maximize();
        Driver.get(ConfigurationReader.get("browser")).manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Driver.get(ConfigurationReader.get("browser")).get(full_url);
        Base.waitFor(5);


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
