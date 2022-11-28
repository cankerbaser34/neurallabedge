package com.uiPages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LivePage extends Base {

    public LivePage() {
        PageFactory.initElements(Driver.get(ConfigurationReader.get("url")), this);
    }


    @FindBy(css = "#aindex")
    public WebElement live_link;

    @FindBy(tagName = "body")
    public WebElement body;

    @FindBy(css = "#widget")
    public WebElement language_field;

    @FindBy(xpath = "//div[contains(text(),'Español')]")
    public WebElement spanish_div;

    @FindBy(css = "#shwRLIVE")
    public WebElement show_plates_checkbox;

    @FindBy(css = "#shwESTATUS")
    public WebElement show_status_checkbox;

    @FindBy(css = "#shwROI")
    public WebElement show_roi_checkbox;

    @FindBy(css = "#shwLNS")
    public WebElement show_lane_checkbox;

    @FindBy(css = "#shwGUI")
    public WebElement callibration_pattern_checkbox;

    @FindBy(css = "div[id='gridContainer'] div[aria-label='Data grid']")
    public WebElement result_panel;

    @FindBy(css = "div[id='gridstatus'] div[aria-label='Data grid']")
    public WebElement info_panel;

    @FindBy(css = ".dx-overlay.dx-widget.dx-visibility-change-handler.dx-toast")
    public WebElement popup_roi_div;

    public void clickOnShowPlate() {

        Base.waitFor(4);

        if (show_plates_checkbox.getAttribute("aria-checked").equals("true")) {
            show_plates_checkbox.click();

            Base.waitFor(5);
        }
    }

    public void assertResultPanelChanging() {
        Assert.assertEquals("background-color: rgb(198, 200, 202);", result_panel.getAttribute("style"));
    }

    public void clickOnstatus() {
        show_status_checkbox.click();
    }

    public void assertInfoPanelChanging() {
        Assert.assertEquals("background-color: rgb(198, 200, 202);", info_panel.getAttribute("style"));

    }

    public void clickOnShowRoi() {
        show_roi_checkbox.click();
        Base.waitFor(5);
    }


    public void clickOnShowLanes() {
        show_lane_checkbox.click();
    }

    public void clickOnCallibration() {
        callibration_pattern_checkbox.click();
    }

    public void clickOnLanguageDropDown() {
        language_field.click();
        Base.waitForClickablility(spanish_div, 3);

    }

    public void selectSpanish() {
        spanish_div.click();
        Base.waitFor(7);
    }

    public void AssertSpanishLanguage() {
        String link_text = live_link.getText();
        Assert.assertEquals(link_text, "En Directo");

    }

    public void assertPopUpforRoi() {
        Assert.assertTrue(body.getText().contains("No ROI to display"));
    }

    public void assertCallibrationCheckbox() {
        Assert.assertEquals("true", callibration_pattern_checkbox.getAttribute("aria-checked"));

    }
}
