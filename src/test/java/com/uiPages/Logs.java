package com.uiPages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logs extends Base {

    public Logs() {

        PageFactory.initElements(Driver.get(ConfigurationReader.get("url")), this);

    }

    @FindBy(css = "#alogs")
    public WebElement logs_href;

    @FindBy(xpath = "//span[normalize-space()='Restart service']")
    public WebElement restart_button;

    @FindBy(xpath = "(//div[@class='dx-radiobutton-icon'])[2]")
    public WebElement service_radio;

    @FindBy(css = ".dx-checkbox-icon")
    public WebElement enabled_radio;

    @FindBy(xpath = "(//div[@class='dx-radiobutton-icon-dot'])[1]")
    public WebElement manager_radio;

    @FindBy(xpath = "//div[contains(text(),'Manager')]")
    public WebElement manager_log_radio;

    @FindBy(xpath = "(//div[@class='dx-radiobutton-icon'])[3]")
    public WebElement engine_radio;

    @FindBy(css = "div[id='clear-logs'] div[class='dx-button-content']")
    public WebElement clearlogs_button;

    public void restartService() {
        restart_button.click();
    }

    @FindBy(css = "div[id='icon-done_info'] div[class='dx-button-content']")
    public WebElement downloadlogs_button;


    public void navto_logs() {

        Base.waitFor(5);
        logs_href.click();
    }

    public void clickServiceRadio() {
        service_radio.click();
    }

    public void clickEnabled() {
        enabled_radio.click();
        Base.waitFor(4);
    }

    public void clickManagerRadio() {
        manager_log_radio.click();
        Base.waitFor(5);
    }

    public void clickEngine() {
        engine_radio.click();
    }

    public void clearLogs() {
        clearlogs_button.click();
    }

    public void downloadLogs() {
        downloadlogs_button.click();
        Base.waitFor(10);
    }
}


