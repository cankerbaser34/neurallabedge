package com.uiPages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZktecoLogin {

    public ZktecoLogin() {
        PageFactory.initElements(Driver.get(ConfigurationReader.get("url")), this);
    }

    @FindBy(css = "#username")
    public WebElement username_input;

    @FindBy(css = "#password")
    public WebElement password_input;

    @FindBy(css = ".login_language_select.select_add")
    public WebElement language_dropdown;

    @FindBy(css = ".login_btn")
    public WebElement login_button;


    public void enterUsename() {
        // username_input.sendKeys("admin");
    }

    public void enterPassword() {
        password_input.click();
        password_input.sendKeys("neural001");

    }

    public void clickOnLogin() {

        login_button.click();
        Base.waitFor(10);
    }


}
