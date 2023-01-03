package com.uiPages;


import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LprconfigPage extends Base {

    public LprconfigPage() {

        PageFactory.initElements(Driver.get(ConfigurationReader.get("url")), this);
    }

    @FindBy(css = "#aindex")
    public WebElement live_page;

    @FindBy(tagName = "body")
    public WebElement live_body;

    @FindBy(css = ".dx-cell-focus-disabled[aria-describedby='dx-col-2']")
    public WebElement mode_value;

    @FindBy(xpath = "//*[@id=\"gridContainer\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[8]")
    public WebElement country_state_first_tr;
    @FindBy(css = "#acamconfiguration")
    public WebElement lpr_page;

    @FindBy(css = "div[id='region'] input[role='combobox']")
    public WebElement region_dropdown;

    @FindBy(css = "#country")
    public WebElement country_div;

    @FindBy(css = "div[class='dx-texteditor-container dx-tag-container dx-native-click'] input[role='combobox']")
    public WebElement country_state;

    @FindBy(css = "select[multiple='multiple']")
    public WebElement selectRegion;

    @FindBy(xpath = "(//div[@role='radio'])[1]")
    public WebElement mode_trigger_radio;

    @FindBy(xpath = "(//div[@class='dx-radio-value-container'])[2]")
    public WebElement mode_freeflow_radio;

    @FindBy(xpath = "//div[contains(text(),'MOTIONDETECTION')]")
    public WebElement mode_motiondetecion_radio;

    @FindBy(xpath = "//div[contains(text(),'1280x720')]")
    public WebElement resulation_1280_radio;

    @FindBy(xpath = "//div[contains(text(),'1920x1080')]")
    public WebElement resoluoyion_1980_radio;

    @FindBy(xpath = "(//div[contains(text(),'Close/Slow')]")
    public WebElement application_close_slow_radio;

    @FindBy(xpath = "(//div[contains(text(),'Close/Fast')]")
    public WebElement application_close_fast_radio;

    @FindBy(xpath = "(//div[contains(text(),'Far/Slow')]")
    public WebElement application_far_slow_radio;

    @FindBy(xpath = "(//div[contains(text(),'Far/Fast')]")
    public WebElement application_far_fast_radio;

    @FindBy(css = "#ROIheader")
    public WebElement roi_section;

    @FindBy(css = "#icon-done_info")
    public WebElement reset_roi_button;

    @FindBy(css = "#LH1")
    public WebElement lane_section;

    @FindBy(css = "#ResetLan")
    public WebElement delete_lanes;

    @FindBy(css = "#canvaslanes")
    public WebElement lane_image;


    // Expert options locators

    @FindBy(css = "#group7")
    public WebElement expert_section;

    @FindBy(xpath = "(//input[@role='spinbutton'])[1]")
    public WebElement min_char_height_input;

    @FindBy(xpath = "(//input[@role='spinbutton'])[2]")
    public WebElement max_char_height_input;

    @FindBy(xpath = "(//input[@role='spinbutton'])[3]")
    public WebElement min_conf_input;

    @FindBy(css = "#elem11")
    public WebElement min_plate_char__input;

    @FindBy(xpath = "(//div[@role='radio'])[10]")
    public WebElement camtr_foc_lane_radio1;

    @FindBy(xpath = "(//div[@class='dx-radio-value-container'])[11]")
    public WebElement camer_foc_lane_radio2;

    @FindBy(css = "#elem42")
    public WebElement enable_angle_filter;

    @FindBy(css = "div[id='elem43'] input[role='spinbutton']")
    public WebElement angle_lfilter_min;

    @FindBy(css = "div[id='elem44'] input[role='spinbutton']")
    public WebElement angle_filter_max;


// Trigger options locators

    @FindBy(css = "#group14")
    public WebElement triggeroptions_open;

    @FindBy(css = "div[id='elem14'] input[role='spinbutton']")
    public WebElement trigger_captures_input;

    @FindBy(css = "div[id='elem15'] input[role='spinbutton']")
    public WebElement trigger_timeout;

    @FindBy(css = "div[id='elem17-0'] div[class='dx-checkbox-container']")
    public WebElement trigger_ioport_value0;

    @FindBy(css = "div[id='elem17-1'] div[class='dx-checkbox-container']")
    public WebElement trigger_ioport_value1;

    // FreelFlow/Motion options locators

    @FindBy(xpath = "//*[contains(text(),'FreeFlow/Motion')]")
    public WebElement freeFlow_motion_open;

    @FindBy(xpath = "//div[contains(text(),'NONE')]")
    public WebElement freeflow_filter_none_radio;

    @FindBy(xpath = "//div[contains(text(),'CAPTURES')]")
    public WebElement freeflow_filter_capture_radio;

    @FindBy(xpath = "//div[contains(text(),'TIME')]")
    public WebElement freeflow_filter_time_radio;

    @FindBy(css = "#elem22")
    public WebElement freflow_motion_captures_input;

    @FindBy(css = "#elem23 > div > input")
    public WebElement freeflow_motion_time_input;

    @FindBy(css = "#elem24")
    public WebElement minimum_character_difference;

    @FindBy(css = "#elem36")
    public WebElement motion_queue_input;


    // Best result locators

    @FindBy(css = "#group47")
    public WebElement bestresult_open;

    @FindBy(css = "#elem47")
    public WebElement bestresult_enabled_input;

    @FindBy(css = "#elem48")
    public WebElement levenshtein_distance_input;

    @FindBy(css = "#elem49")
    public WebElement timeout_input;

    @FindBy(css = "#elem50")
    public WebElement max_number_plates_input;

    // Speed direction locators

    @FindBy(css = "#group47")
    public WebElement vivotek_direction_section;

    @FindBy(css = "#group51")
    public WebElement speed_direction_open;

    @FindBy(css = "#elem51")
    public WebElement com_traf_dir_enabled_input;

    @FindBy(css = "#elem53")
    public WebElement speed_enabled_input;

    @FindBy(css = "#elem56")
    public WebElement pattern_size_h_input;

    @FindBy(css = "#elem57")
    public WebElement pattern_size_v_input;

    @FindBy(xpath = "(//div[@id='elem52'])[1]")
    public WebElement vivotek_direction_checkbox;

    @FindBy(css = "#restartserv")
    public WebElement restart_button;


    public void navToLpgConfigPage() {
        lpr_page.click();
        Base.waitFor(3);
    }

    public void changeRegion(String region_name) {
        region_dropdown.click();
        Base.waitFor(1);
        region_dropdown.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(1);
        region_dropdown.clear();
        Base.waitFor(1);
        region_dropdown.sendKeys(region_name);
        Base.waitFor(1);
        region_dropdown.sendKeys(Keys.TAB);
        Base.waitFor(3);
    }

    public void selectCountryforRegion(String country) {

        // country_div.click();
        Base.waitFor(3);
        // Select regions = new Select(selectRegion);
        // regions.selectByVisibleText("Bolivia");

        // country_state.click();
        Base.waitFor(2);
        country_state.sendKeys(country);
        Base.waitFor(2);
        country_state.sendKeys(Keys.ENTER);
        Base.waitFor(2);

    }

    public void clickRestartService() {
        restart_button.click();
        Base.waitFor(25);
    }

    public void selectTriggerOption() {
        mode_trigger_radio.click();
    }

    public void selectFreeflow() {
        mode_freeflow_radio.click();
    }

    public void selectMotionDetection() {
        mode_motiondetecion_radio.click();
    }

    public void userNavtoLivePage() {
        live_page.click();
        Base.waitFor(4);

    }

    public void assertTriggerMode() {

        Assert.assertTrue(live_body.getText().contains("TRIGGER"));


    }

    public void selectLowResolutions() {
        resulation_1280_radio.click();
    }

    public void selectHighResolution() {
        resoluoyion_1980_radio.click();
    }

    public void opensShowROISection() {
        roi_section.click();
        Base.waitForClickablility(reset_roi_button, 3);
    }

    public void clickOnResetRoi() {
        reset_roi_button.click();
    }

    public void openShowLanesSection() {
        lane_section.click();
    }

    public void clickOnDeleteLanes() {
        delete_lanes.click();
    }

    public void openExpertSection() {
        expert_section.click();
        Base.waitFor(4);
    }

    public void enterMinValueCharHeight() {
        Base.scrollDown(triggeroptions_open);
        min_char_height_input.click();
        Base.waitFor(2);
        min_char_height_input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(1);
        min_char_height_input.clear();
        Base.waitFor(1);
        min_char_height_input.sendKeys("13");
        Base.waitFor(2);
    }

    public void enterMaximumCharacterHeight() {
        max_char_height_input.click();
        Base.waitFor(2);
        max_char_height_input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(1);
        max_char_height_input.clear();
        Base.waitFor(1);
        max_char_height_input.sendKeys("80");
        Base.waitFor(2);
    }

    public void enterMinimumConfidenceValue() {
        min_conf_input.click();
        Base.waitFor(2);
        min_conf_input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(1);
        min_conf_input.clear();
        Base.waitFor(1);
        min_conf_input.sendKeys("80");
        Base.waitFor(2);
    }

    public void enableAngleFilter() {
        if (enable_angle_filter.getAttribute("aria-checked").contains("false")) {
            enable_angle_filter.click();
        }
    }

    public void setAngelFilterMinimum() {

        angle_lfilter_min.click();
        Base.waitFor(2);
        angle_lfilter_min.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(2);
        angle_lfilter_min.clear();
        Base.waitFor(2);
        angle_lfilter_min.sendKeys("-20");
        Base.waitFor(2);
        //  Base.waitForClickablility(angle_filter_max, 4);
    }

    public void setAngleFilterMax() {
        angle_filter_max.click();
        angle_filter_max.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(2);
        angle_filter_max.clear();
        Base.waitFor(2);
        angle_filter_max.sendKeys("20");
        Base.waitFor(2);
    }

    public void opensTriggerSection() {

        triggeroptions_open.click();
        Base.waitFor(3);
    }

    public void setTriggerCaptures() {
        trigger_captures_input.click();
        trigger_captures_input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(2);
        trigger_captures_input.clear();
        Base.waitFor(2);
        trigger_captures_input.sendKeys("2");
        Base.waitFor(2);
    }

    public void setTriggerTimeOut() {
        trigger_timeout.click();
        trigger_timeout.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(2);
        trigger_timeout.clear();
        Base.waitFor(2);
        trigger_timeout.sendKeys("30");
        Base.waitFor(2);

    }

    public void selectTriggerIoPort() {
        trigger_ioport_value1.click();
    }

    public void openVivoDirectionSection() {
        vivotek_direction_section.click();
        Base.waitFor(4);
        //   Base.waitForClickablility(vivotek_direction_checkbox, 3);
    }

    public void enableComputeTraffDirection() {
        if (vivotek_direction_checkbox.getAttribute("aria-checked").equals("false")) {
            vivotek_direction_checkbox.click();
        }
    }

    public void openFreeFlowOption() {
        freeFlow_motion_open.click();
    }

    public void selectNoneFilterMotion() {
        freeflow_filter_none_radio.click();
    }

    public void selectCaptureFilterOption() {
        freeflow_filter_capture_radio.click();


    }

    public void setTimeFilterOption() {

        freeflow_filter_time_radio.click();
    }

    public void setFilterTime() {

        freeflow_motion_time_input.click();
        Base.waitFor(2);
        freeflow_motion_time_input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(1);
        freeflow_motion_time_input.clear();
        Base.waitFor(1);
        freeflow_motion_time_input.sendKeys("7000");
        Base.waitFor(2);


    }

    public void validateFreeflowMode() {

        Assert.assertTrue(live_body.getText().contains("FREEFLOW"));

    }

    public void assertMotionDetectionMode() {

        Assert.assertTrue(live_body.getText().contains("MOTION"));
    }

    public void assertChangeRegion(String country) {
        Assert.assertTrue(country_state_first_tr.getText().contains(country));
    }

    public void setLane() {


    }

    public void selectCloseSlowDistance() {
        application_close_slow_radio.click();
    }

    public void selectCloseFastDistance() {
        application_close_fast_radio.click();


    }

    public void selectFarSlowDistance() {
        application_far_slow_radio.click();

    }

    public void selectFarFastDistance() {

        application_far_fast_radio.click();
    }

}
