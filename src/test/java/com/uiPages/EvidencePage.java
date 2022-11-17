package com.uiPages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EvidencePage extends Base {


    public EvidencePage() {

        PageFactory.initElements(Driver.get(ConfigurationReader.get("url")), this);
    }

    @FindBy(css = "#aevidence")
    public WebElement evidence_page_href;

    @FindBy(css = "#evcameras")
    public WebElement evidence_visible_button;


    @FindBy(css = "div[title='Add a row'] div[class='dx-button-content']")
    public WebElement add_evidence_button;

    @FindBy(xpath = "(//input[@id='dx-col-2'])[1]")
    public WebElement evidence_name_input;

    @FindBy(css = ".dx-link.dx-link-save")
    public WebElement evidence_save_href;

    @FindBy(css = ".dx-link.dx-link-cancel")
    public WebElement evidence_cancel_href;

    @FindBy(css = ".dx-link.dx-link-delete")
    public WebElement delete_camera_button;

    @FindBy(css = "div[aria-label='Yes'] div[class='dx-button-content']")
    public WebElement confirm_yes_button;

    @FindBy(xpath = "(//tbody)[2]")
    public WebElement evidence_added_camera;

    @FindBy(css = "#camdet")
    public WebElement details_config;

    @FindBy(css = "#dx-1abec29b-b735-d918-c8a5-77a6f5323346")
    public WebElement connection_type_radio;

    @FindBy(css = "div[id='elem2'] input[role='textbox']")
    public WebElement login_input;

    @FindBy(css = "input[role='textbox'][type='password']")
    public WebElement password_input;

    @FindBy(css = "#dx-95123f43-2c23-d8d8-5e3f-a33285c79c04")
    public WebElement authentication_none_radio;

    @FindBy(xpath = "(//div[@class='dx-radio-value-container'])[3]")
    public WebElement authentication_basic_radio;

    @FindBy(xpath = "(//div[@role='radio'])[4]")
    public WebElement authentication_digest_radio;

    @FindBy(css = "div[id='elem5'] input[role='textbox']")
    public WebElement url_input;

    @FindBy(css = "input[role='spinbutton']")
    public WebElement fps_input;


    public void navToEvidencePage() {
        evidence_page_href.click();

    }

    public void clickOnAddButton() {
        add_evidence_button.click();
    }


    public void enterEvidenceCamName() {
        evidence_name_input.sendKeys("TestEvidence");
    }

    public void clickSaveButton() {
        evidence_save_href.click();
        Base.waitFor(6);
    }

    public void clickOnSavedCamera() {
        evidence_added_camera.click();
        Base.waitFor(5);

    }

    public void clickToDeleteEvidence() {
        delete_camera_button.click();
        Base.waitFor(2);
    }

    public void clickYesToDelete() {
        confirm_yes_button.click();
        Base.waitFor(4);
    }

    public void enterNameOfEvidenceCamera() {
        login_input.sendKeys("cihan");

    }

    public void enterPasswordOfCamera() {
        password_input.sendKeys("neural001");
    }

    public void selectBasicAut() {
        authentication_basic_radio.click();
        Base.waitFor(3);
    }

    public void enterUrlofCamera() {
        url_input.sendKeys("http://192.168.1.120/cgi-bin/viewer/video.jpg");
        Base.waitFor(2);
    }

    public void setFps() {
        fps_input.click();
        fps_input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(3);
        fps_input.clear();
        Base.waitFor(3);
        fps_input.sendKeys("4");
        Base.waitFor(3);
    }
}


