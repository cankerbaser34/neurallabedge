package com.uiPages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

public class GeneralConfigPage extends Base {

    public String mac_adress_text;

    public GeneralConfigPage() {
        PageFactory.initElements(Driver.get(ConfigurationReader.get("url")), this);
    }

    @FindBy(css = "#aconfiguration")
    public WebElement generalconfig_href;

    @FindBy(css = "#areview")
    public WebElement review_page;

    @FindBy(css = "#alogs")
    public WebElement logs_page;

    @FindBy(css = "#group0")
    public WebElement expert_options_main;


    // Expert options locators start
    @FindBy(css = "#group0")
    public WebElement expert_options;

    @FindBy(css = "#elem5")
    public WebElement save_image_checkbox;

    @FindBy(css = "#elem6")
    public WebElement save_theplateimage_checkbox;

    @FindBy(css = "div[id='elem7'] input[role='spinbutton']")
    public WebElement image_quality;

    @FindBy(css = "#elem9")
    public WebElement trigger_socket_port;

    @FindBy(xpath = "(//div[@role='radio'])[2]")
    public WebElement actime_immediate_radio;

    @FindBy(xpath = "//div[contains(text(),'PERSISTENT')]")
    public WebElement actime_persistent_radio;

    @FindBy(css = "#elem28")
    public WebElement save_time_overlay_checkbox;

    @FindBy(css = "#group1")
    public WebElement view_options;
    @FindBy(id = "gridContainer")
    public WebElement list_container;

    @FindBy(id = "bxopt")
    public WebElement square_container;

    @FindBy(xpath = "//div[contains(text(),'LIST')]")
    public WebElement view_type_list_radio;

    @FindBy(xpath = "//div[contains(text(),'SQUARE')]")
    public WebElement view_type_square_radio;

    @FindBy(xpath = "(//div[@id='multioption37'])/div[1]")
    public WebElement listfield_lane_checkbox;

    @FindBy(xpath = "//div[normalize-space()='Lane']")
    public WebElement lane_column;


    @FindBy(xpath = "//div[normalize-space()='Direction']")
    public WebElement direction_column;

    @FindBy(xpath = "//div[@role='presentation'][normalize-space()='Direction']")
    public WebElement direction_column_reviewpage;

    @FindBy(xpath = "//div[normalize-space()='Conf.']")
    public WebElement conf_column;

    @FindBy(xpath = "//div[normalize-space()='Height(px)']")
    public WebElement height_column;

    @FindBy(xpath = "//div[normalize-space()='Conf.']")

    public WebElement height_column_reviewpage;

    @FindBy(xpath = "//div[normalize-space()='Country or state']")
    public WebElement country_column;

    @FindBy(xpath = "//div[normalize-space()='List']")
    public WebElement list_column;

    @FindBy(xpath = "//div[@role='presentation'][normalize-space()='List']")
    public WebElement list_column_reviewpage;

    @FindBy(xpath = "//div[@id='elem37-1']")
    public WebElement listfield_direction_checkbox;

    @FindBy(css = "#elem37-2")
    public WebElement listfield_confidence_checbox;

    @FindBy(css = "#elem37-3")
    public WebElement listfield_height_checkbox;

    @FindBy(css = "#elem37-4")
    public WebElement listfield_country_checkbox;

    @FindBy(css = "#elem37-5")
    public WebElement listfield_list_checkbox;

    @FindBy(css = "#elem38-0")
    public WebElement reviewfield_lane_checkbox;

    @FindBy(css = "#elem38-1")
    public WebElement reviewfield_direction_checkbox;

    @FindBy(css = "#elem38-2")
    public WebElement review_conf_checkbox;

    @FindBy(css = "#elem38-3")
    public WebElement review_height_checkbox;

    @FindBy(css = "#elem38-4")
    public WebElement review_country_checkbox;

    @FindBy(css = "#elem38-5")
    public WebElement review_list_checkbox;

    @FindBy(css = "div[id='col2'] div[class='dx-fieldset']")
    public WebElement lane_maindiv;


    // Log options locators

    @FindBy(css = "#group11")
    public WebElement log_options_section;
    @FindBy(css = "div[id='elem11'] input[role='spinbutton']")
    public WebElement log_level_service_input;

    @FindBy(css = "#elem12")
    public WebElement enable_engine_level_checkbox;

    @FindBy(css = "div[id='elem13'] input[role='spinbutton']")
    public WebElement log_level_manager_input;

    // Purge options locators

    @FindBy(css = "#group17")
    public WebElement purge_options_section;

    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(10) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")
    public WebElement purge_interval_hour_radio;

    @FindBy(css = "div[id='dx-b97aeb8b-e0d9-c893-c9b7-d74113aca688'] div[class='dx-radiobutton-icon dx-radiobutton-icon-checked']")
    public WebElement purge_interval_day_radio;

    @FindBy(css = "#dx-b97aeb8b-e0d9-c893-c9b7-d74113aca688")
    public WebElement purge_interval_week_radio;

    @FindBy(css = "div[id='dx-b97aeb8b-e0d9-c893-c9b7-d74113aca688'] div[class='dx-radio-value-container']")
    public WebElement purge_interval_month_radio;

    @FindBy(xpath = "(//div[@role='radio'])[10]")
    public WebElement type_purge_disabled_radio;

    @FindBy(css = "(body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(10) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2)")
    public WebElement type_purge_days_radio;

    @FindBy(xpath = "(//div[@class='dx-radio-value-container'])[12]")
    public WebElement type_purge_freespace_radi0;

    @FindBy(css = "#elem19")
    public WebElement days_preserve_storage;

    @FindBy(css = "#elem20")
    public WebElement minimum_percentage_freespace_input;

    @FindBy(css = "#elem21")
    public WebElement minimum_percentage_freespace_camera_input;

    // Heartbeat section locators

    @FindBy(css = "#group31")
    public WebElement heartbeat_section;

    @FindBy(css = "#elem32")
    public WebElement send_heartbeat_input;

    @FindBy(css = "div[id='elem33'] input[role='spinbutton']")
    public WebElement hearbeat_timing_seconds;


    @FindBy(css = "div[id='elem34'] input[role='textbox']")
    public WebElement heartbeat_ip;

    @FindBy(css = "div[id='elem35'] input[role='spinbutton']")
    public WebElement heartbeat_port;

    @FindBy(xpath = ("//div[contains(text(),'XML')]"))
    public WebElement type_xml_radio;

    @FindBy(xpath = "//div[contains(text(),'JSON')]")
    public WebElement type_json_radio;

    // Maintenance locators start

    @FindBy(css = "#Maintenance")
    public WebElement maintenance_options;

    @FindBy(xpath = "//span[normalize-space()='Upload file']")
    public WebElement uploadfile_button;

    @FindBy(xpath = "//span[normalize-space()='Revert last files']")
    public WebElement revert_last_files_button;

    @FindBy(css = "#infocam")
    public WebElement show_info_button;

    @FindBy(css = ".dx-popup-content")
    public WebElement version_mac_info_text;

    @FindBy(xpath = "//span[normalize-space()='Reset the database']")
    public WebElement reset_database_button;

    @FindBy(css = "#fname")
    public WebElement reset_database_input;


    @FindBy(css = "#fnamect")
    public WebElement reset_counters_input;

    @FindBy(css = "div[aria-label='Yes']")
    public WebElement confirm_yes_cleardata;
    @FindBy(xpath = "//span[normalize-space()='Reset Counters']")
    public WebElement reset_counters_button;

    @FindBy(css = ".dx-icon.dx-icon-close")
    public WebElement close_info_text;

    @FindBy(css = "#dconfig")
    public WebElement export_general_button;

    @FindBy(xpath = "//span[normalize-space()='Export database']")
    public WebElement export_database_button;

    @FindBy(xpath = "//span[normalize-space()='Export VPAR config']")
    public WebElement export_vpar_button;

    @FindBy(xpath = "//span[normalize-space()='Import CSV general config file']")
    public WebElement import_csv_gen_config;

    // Customized options locators

    @FindBy(css = "#ExportCC")
    public WebElement export_csv_file_button;

    @FindBy(xpath = "(//div[@class='dx-button-content'])[19]")
    public WebElement select_import_csvfile_button;

    @FindBy(css = "div[title='Add a row']")
    public WebElement add_value_button;

    @FindBy(xpath = "(//input[@id='dx-col-5'])[1]")
    public WebElement name_value_input;

    @FindBy(xpath = "(//div[@class='dx-texteditor-container'])[15]")
    public WebElement value_input;

    @FindBy(css = ".dx-link.dx-link-save")
    public WebElement save_newvalue_href;

    @FindBy(css = ".dx-link.dx-link-cancel")
    public WebElement cancel_newvalue_href;

    @FindBy(css = ".dx-link.dx-link-edit")
    public WebElement edit_data_button;

    @FindBy(css = ".dx-link.dx-link-delete")
    public WebElement delete_data_button;
    @FindBy(css = "#icon-done_info")
    public WebElement restart_service_button;

    public void goToGeneralConfigPage() {
        Base.waitFor(4);
        generalconfig_href.click();

    }

    public void openExpertSection() {
        expert_options.click();
        Base.waitFor(3);
    }

    public void disableSaveImage() {
        if (save_image_checkbox.getAttribute("aria-checked").equals("true")) {
            save_image_checkbox.click();
        }
    }

    public void disableSavePlateImage() {
        if (save_theplateimage_checkbox.getAttribute("aria-checked").equals("true")) {
            save_theplateimage_checkbox.click();
        }
    }

    public void clickMaintenanceOption() {
        maintenance_options.click();
    }

    public void clickUpladfile() {
        uploadfile_button.click();
        waitFor(4);
    }

    public void clickRevertLastFile() {
        revert_last_files_button.click();
    }


    public void clickShowInfo() {
        show_info_button.click();
        Base.waitFor(3);
    }

    public void getTextShowInfo() {
        String whole_version_mac = version_mac_info_text.getText();
        mac_adress_text = whole_version_mac.substring(29, 46);
        System.out.println(mac_adress_text);
        Base.waitFor(3);
    }

    public void closeInfoSection() {

        close_info_text.click();
    }

    public void clickResetDatabase() {
        reset_database_button.click();
        Base.waitFor(4);
    }


    public void entersMacAddress() {
        reset_database_input.sendKeys(mac_adress_text);
    }

    public void enterMacToResetCounter() {

        reset_counters_input.sendKeys(mac_adress_text);
        Base.waitFor(3);
    }


    public void clickYesToClearData() {
        confirm_yes_cleardata.click();
    }

    public void clickExportGenConfig() {
        export_general_button.click();
    }

    public void clickResetCountersButton() {
        reset_counters_button.click();
    }

    public void clickOnRestartServiceButton() {
        restart_service_button.click();
        Base.waitFor(15);
    }

    public void setImageQuality() {
        image_quality.click();
        Base.waitFor(2);
        image_quality.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(2);
        image_quality.clear();
        Base.waitFor(2);
        image_quality.sendKeys("80");
        Base.waitFor(3);

    }

    public void selectPersistentActionTimeOption() {
        actime_persistent_radio.click();
    }

    public void selectSaveTimeOverlay() {
        if (save_time_overlay_checkbox.getAttribute("aria-checked").equals("false")) {
            save_time_overlay_checkbox.click();
        }
    }


    public void assertSelectSaveTimeActivated() {
        Assert.assertTrue(save_time_overlay_checkbox.getAttribute("class").contains("dx-checkbox-checked"));
    }


    public void clickOnViewOptions() {
        view_options.click();
        // Base.waitForClickablility(view_type_list_radio, 4);
        Base.waitFor(4);
    }

    public void selectListViewType() {
        view_type_list_radio.click();
        Base.waitFor(3);

    }

    public void assertElementForListTable() {
        Assert.assertTrue(list_container.isDisplayed());
    }

    public void selectSquareViewoption() {
        view_type_square_radio.click();
    }

    public void assertElementforSquareTable() {
        Assert.assertTrue(square_container.isDisplayed());
    }

    public void selectLaneOptionViewType() {

        if (listfield_lane_checkbox.getAttribute("aria-checked").equals("false")) {
            listfield_lane_checkbox.click();
        }
    }

    public void assertLaneColumnLivePage() {
        Assert.assertTrue(lane_column.isDisplayed());
    }

    public void selectDirectionViewOption() {
        if (listfield_direction_checkbox.getAttribute("aria-checked").equals("false")) {
            listfield_direction_checkbox.click();
        }
    }

    public void assertDirectionColumnLivePage() {
        Assert.assertTrue(direction_column.isDisplayed());

    }

    public void selectConfOptionViewType() {

        if (listfield_confidence_checbox.getAttribute("aria-checked").equals("false")) {
            listfield_confidence_checbox.click();
        }
    }

    public void assertConfColumnLivePage() {
        Assert.assertTrue(conf_column.isDisplayed());

    }

    public void selectHeightOptionViewType() {

        if (listfield_height_checkbox.getAttribute("aria-checked").equals("false")) {
            listfield_height_checkbox.click();
        }
    }

    public void assertHeightColumnLivePage() {
        Assert.assertTrue(height_column.isDisplayed());
    }

    public void selectCountryOptionViewType() {


        if (listfield_country_checkbox.getAttribute("aria-checked").equals("false")) {
            listfield_country_checkbox.click();
        }
    }

    public void assertCountryColumnLivePage() {
        Assert.assertTrue(country_column.isDisplayed());
    }

    public void selectListOptionViewType() {
        if (listfield_list_checkbox.getAttribute("aria-checked").equals("false")) {
            listfield_list_checkbox.click();
        }
    }

    public void assertListColumnLivePage() {
        Assert.assertTrue(list_column.isDisplayed());


    }

    public void selectLaneOptionReviewField() {
        if (reviewfield_lane_checkbox.getAttribute("aria-checked").equals("false")) {
            reviewfield_lane_checkbox.click();
        }
    }

    public void goesToReviewPage() {
        review_page.click();
        Base.waitFor(3);
    }

    public void assertLaneFieldColumnReviewPage() {
        lane_column.isDisplayed();


    }

    public void selectDirectionOptionReviewfield() {

        if (reviewfield_direction_checkbox.getAttribute("aria-checked").equals("false")) {
            reviewfield_direction_checkbox.click();
        }

    }

    public void assertDirectionColumnReviewPage() {
        lane_column.isDisplayed();
        direction_column_reviewpage.isDisplayed();
    }

    public void selectConfOptionReviewField() {

        if (review_conf_checkbox.getAttribute("aria-checked").equals("false")) {
            review_conf_checkbox.click();
        }
    }

    public void assertConfidenceColumnReviewPage() {
        conf_column.isDisplayed();

    }

    public void selectHeightOptionReviewField() {
        if (review_height_checkbox.getAttribute("aria-checked").equals("false")) {
            review_height_checkbox.click();
        }
    }

    public void assertHeightColumnReviewPage() {
        height_column_reviewpage.isDisplayed();
    }


    public void selectCountryOptionReviewField() {

        if (review_country_checkbox.getAttribute("aria-checked").equals("false")) {
            review_country_checkbox.click();
        }
    }

    public void assertCountryColumnReviewPage() {
        country_column.isDisplayed();

    }


    public void selectListOptionReviewField() {

        if (review_list_checkbox.getAttribute("aria-checked").equals("false")) {
            review_list_checkbox.click();
        }
    }

    public void assertListColumnReviewPage() {
        list_column_reviewpage.isDisplayed();

    }

    public void clicksOnLogOptions() {
        log_options_section.click();
        Base.waitForClickablility(log_level_service_input, 3);

    }

    public void setLogServiceThree() {
        log_level_service_input.click();
        Base.waitFor(2);
        log_level_service_input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(2);
        log_level_service_input.clear();
        Base.waitFor(2);
        log_level_service_input.sendKeys("3");
        Base.waitFor(3);
    }

    public void navToLogPage() {
        logs_page.click();


    }

    public void clickEnableEngineLog() {

        if (enable_engine_level_checkbox.getAttribute("aria-checked").equals("false")) {
            enable_engine_level_checkbox.click();
        }
    }

    public void logLevelManagerSetFour() {


        if (!log_level_manager_input.getAttribute("aria-valuenow").equals("3")) {
            log_level_manager_input.click();
            Base.waitFor(2);
            log_level_manager_input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            Base.waitFor(2);
            log_level_manager_input.clear();
            Base.waitFor(2);
            log_level_manager_input.sendKeys("3");
            Base.waitFor(3);
        }
    }

    public void clicksOnPurgeOptions() {
        purge_options_section.click();
        Base.waitForClickablility(purge_interval_hour_radio, 2);

    }


    public void selectHourPurgeInterval() {
        if (purge_interval_hour_radio.getAttribute("aria-checked").equals("false")) purge_interval_hour_radio.click();
        Base.waitFor(10);
    }

    public void selectDaysPurge() {
        if (type_purge_days_radio.getAttribute("aria-checked").equals("false")) type_purge_days_radio.click();
    }

    public void opensHeartbeatOptions() {
        heartbeat_section.click();
    }


    public void clickSendHeartBeat() {
        if (send_heartbeat_input.getAttribute("aria-checked").equals("false")) send_heartbeat_input.click();
    }

    public void setTimeHeartBeat() {
        hearbeat_timing_seconds.click();
        Base.waitFor(2);
        hearbeat_timing_seconds.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(2);
        hearbeat_timing_seconds.clear();
        Base.waitFor(2);
        hearbeat_timing_seconds.sendKeys("5");
        Base.waitFor(3);
    }

    public void setIpHeartbeat() {
        heartbeat_ip.click();
        Base.waitFor(2);
        heartbeat_ip.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(2);
        heartbeat_ip.clear();
        Base.waitFor(2);
        heartbeat_ip.sendKeys("192.168.1.169");
    }

    public void setPortHeartBeat() {
        heartbeat_port.click();
        Base.waitFor(2);
        heartbeat_port.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(4);
        heartbeat_port.clear();
        Base.waitFor(2);
        heartbeat_port.sendKeys("8080");
    }

    public void selecTypeHeartBeat() {
        type_xml_radio.click();
    }

    public void selectJsonTypeHeartBeat() {
        type_json_radio.click();
    }

    public void clickOnExportDataBase() {
        export_database_button.click();
        Base.waitFor(6);
    }


}





