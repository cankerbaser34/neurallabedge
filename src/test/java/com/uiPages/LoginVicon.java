package com.uiPages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginVicon {

    public LoginVicon() {

        PageFactory.initElements(Driver.get(ConfigurationReader.get("url")), this);

    }

    @FindBy(id = "Ilogin_id")
    public WebElement username_input;

    @FindBy(id = "Ilogin_passwd")
    public WebElement password_input;

    @FindBy(id = "Ilogin")
    public WebElement login_button;


    public void navToCameraHome() {

        String url = ConfigurationReader.get("vicon_full_url");
        Driver.get(ConfigurationReader.get("browser")).manage().window().maximize();
        Driver.get(ConfigurationReader.get("browser")).manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Driver.get(ConfigurationReader.get("browser")).get(url);
        Base.waitFor(4);

    }

}
