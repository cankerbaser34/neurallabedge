package com.uiPages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginVivotek extends Base {

    public LoginVivotek() {

        PageFactory.initElements(Driver.get(ConfigurationReader.get("url")), this);

    }

    public void enterVivotekCamera() {

        String url = ConfigurationReader.get("urlfullVivotek");
        Driver.get(ConfigurationReader.get("browser")).manage().window().maximize();
        Driver.get(ConfigurationReader.get("browser")).manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Driver.get(ConfigurationReader.get("browser")).get(url);
        Base.waitFor(2);
    }
}
