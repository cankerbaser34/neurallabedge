package com.uiPages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage extends Base {

    public LoginPage() {

        PageFactory.initElements(Driver.get(ConfigurationReader.get("url")), this);


    }

    public void navToHomePage() {

        String URL= "http://root:neural001@192.168.1.217/VPARD/www/index.html";

        String url = ConfigurationReader.get("");
        Driver.get(ConfigurationReader.get("browser")).manage().window().maximize();
        Driver.get(ConfigurationReader.get("browser")).manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Driver.get(ConfigurationReader.get("browser")).get(url);
        waitFor(6);
    }
}
