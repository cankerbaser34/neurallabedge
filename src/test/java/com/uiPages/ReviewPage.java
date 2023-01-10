package com.uiPages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ReviewPage extends Base {

    public ReviewPage() {

        PageFactory.initElements(Driver.get(ConfigurationReader.get("url")), this);
    }

    @FindBy(css = "#areview")
    public WebElement review_page;

    @FindBy(css = "#data1")
    public WebElement from_date_input;

    @FindBy(css = "#data1")
    public WebElement to_date_input;

    @FindBy(css = "#gridContainer > div > div.dx-datagrid-rowsview.dx-datagrid-nowrap.dx-last-row-border > div > table > tbody > tr:nth-child(2) > td:nth-child(11)")
    public WebElement td_first_lpr_noimage;


    @FindBy(xpath = "//*[@id=\"gridContainer\"]/div/div[6]/div/table/tbody/tr[1]/td[10]")
    public WebElement td_first_show_image;

    @FindBy(css = "#dx-col-2")
    public WebElement time_column;

    @FindBy(css = "#dx-col-1")
    public WebElement id_column;

    @FindBy(css = "div[id='dirlist'] div[class='dx-dropdowneditor-input-wrapper dx-selectbox-container']")
    public WebElement direction_section;

    @FindBy(xpath = "//div[contains(text(),'Coming')]")
    public WebElement coming_direction;

    @FindBy(xpath = "//div[contains(text(),'No Direction')]")
    public WebElement no_direction;

    @FindBy(xpath = "//div[contains(text(),'Going')]")
    public WebElement going_direction;

    @FindBy(css = ".dx-row.dx-data-row.dx-row-lines.dx-column-lines")
    public List<WebElement> result_table;

    @FindBy(css = "#numreg")
    public WebElement numb_resister_drowdown;

    @FindBy(css = "div[class='dx-scrollview-content'] div:nth-child(2) div:nth-child(1)")
    public WebElement list_number_20;

    @FindBy(xpath = "//div[contains(text(),'50')]")
    public WebElement list_number_50;
    @FindBy(xpath = "//div[contains(text(),'100')]")
    public WebElement list_number_100;

    @FindBy(css = "#icon-done_info")
    public WebElement search_button;

    @FindBy(css = "div[id='lane_list'] div[class='dx-texteditor-container']")
    public WebElement line_dropdown;

    @FindBy(xpath = "//div[contains(text(),'LANE1')]")
    public WebElement line_one_option;

    @FindBy(xpath = "//div[contains(text(),'LANE2')]")
    public WebElement line_two_option;

    @FindBy(css = "div[id='TxPlate'] input[role='textbox']")
    public WebElement plate_search_input;

    @FindBy(css = "div[id='radio-group-simple'] div[class='dx-dropdowneditor-input-wrapper dx-selectbox-container']")
    public WebElement list_dropwdown;

    @FindBy(xpath = "//div[contains(text(),'not in list')]")
    public WebElement not_in_list;

    @FindBy(xpath = "//div[contains(text(),'BLOCKLIST')]")
    public WebElement blocklist;

    @FindBy(xpath = "//div[contains(text(),'ALLOWLIST')]")
    public WebElement allowlist;

    @FindBy(css = ".dx-row.dx-data-row.dx-row-lines.dx-column-lines")
    public List<WebElement> row_tables;

    @FindBy(css = "#lane_list")
    public WebElement lane_input_field;

    @FindBy(xpath = "//div[contains(text(),'No lane')]")
    public WebElement nolane_option;

    @FindBy(xpath = "//div[contains(text(),'LANE1')]")
    public WebElement lane1_option;

    @FindBy(xpath = "//div[contains(text(),'LANE2')]")
    public WebElement lane2_option;

    @FindBy(css = "#class_list")
    public WebElement class_input_field;

    @FindBy(xpath = "//div[contains(text(),'UNKNOWN')]")
    public WebElement unknown_option;

    @FindBy(xpath = "//div[contains(text(),'MOTORBIKE')]")
    public WebElement motorbike_option;

    @FindBy(xpath = "//div[contains(text(),'CAR')]")
    public WebElement car_option;

    @FindBy(xpath = "//div[contains(text(),'VAN')]")
    public WebElement van_option;

    @FindBy(xpath = "//div[contains(text(),'TRUCK')]")
    public WebElement truck_option;

    @FindBy(xpath = "//div[contains(text(),'BUS')]")
    public WebElement bus_option;

    @FindBy(xpath = "//div[contains(text(),'PICKUP')]")
    public WebElement pickup_option;


    @FindBy(css = "#maker_list")
    public WebElement make_input_field;

    @FindBy(xpath = "//div[contains(text(),'AUDI')]")
    public WebElement audi_option;

    @FindBy(xpath = "//div[contains(text(),'BMW')]")
    public WebElement bmw_option;

    @FindBy(xpath = "//div[contains(text(),'CHEVROLET')]")
    public WebElement chevrolet_option;

    @FindBy(xpath = "//div[contains(text(),'CITROEN')]")
    public WebElement citroen_option;

    @FindBy(xpath = "//div[contains(text(),'FIAT')]")
    public WebElement fita_option;


    @FindBy(css = "#color_list")
    public WebElement color_input_field;

    @FindBy(css = "div[class='dx-overlay-wrapper dx-dropdowneditor-overlay dx-popup-wrapper dx-dropdownlist-popup-wrapper dx-selectbox-popup-wrapper'] div[class='dx-scrollview-content'] div:nth-child(1) div:nth-child(1)")
    public WebElement unknown_color;


    @FindBy(xpath = "//div[contains(text(),'WHITE')]")
    public WebElement color_white;

    @FindBy(xpath = "//div[contains(text(),'GREY')]")
    public WebElement color_grey;

    @FindBy(xpath = "//div[contains(text(),'BLACK')]")
    public WebElement color_black;

    @FindBy(xpath = "//div[contains(text(),'RED')]")
    public WebElement color_red;

    @FindBy(xpath = "//div[contains(text(),'ORANGE')]")
    public WebElement color_orange;

    @FindBy(xpath = "//div[contains(text(),'YELLOW')]")
    public WebElement color_yellow;

    @FindBy(xpath = "//div[contains(text(),'GREEN')]")
    public WebElement color_green;

    @FindBy(xpath = "//div[contains(text(),'BLUE')]")
    public WebElement color_blue;

    @FindBy(css = "div[id='speed1'] input[role='spinbutton']")
    public WebElement speed_minimum_input_field;

    @FindBy(css = "div[id='speed2'] input[role='spinbutton']")
    public WebElement speed_maximum_input_field;

    @FindBy(css = "#export")
    public WebElement export_button;


    @FindBy(xpath = "//img[@title='truck - white']")
    public List<WebElement> color_white_list;

    public void navToReview() {
        review_page.click();
        Base.waitFor(3);
    }

    public void enterPlateNumber() {
        //plate_search_input.click();
        Base.waitFor(4);
        plate_search_input.sendKeys("6568LTT");
    }

    public void clickSearch() {
        search_button.click();
        Base.waitFor(5);
    }

    public void openNumRegisterMenu() {

        numb_resister_drowdown.click();
        Base.waitFor(4);
    }

    public void select20Register() {
        list_number_20.click();
    }

    public void select50Register() {
        list_number_50.click();
    }

    public void select100Register() {
        list_number_100.click();
    }

    public void assertResult50() {

        int size_of_rows = result_table.size();
        System.out.println(size_of_rows);
        Assert.assertTrue(size_of_rows <= 50);
    }

    public void assertResults20() {
        int size_of_rows = result_table.size();
        System.out.println(size_of_rows);
        Assert.assertTrue(size_of_rows <= 20);
    }

    public void assertResult100() {

        int size_of_rows = result_table.size();
        System.out.println(size_of_rows);
        Assert.assertTrue(size_of_rows <= 100);
    }

    public void clickExportButton() {
        export_button.click();
        Base.waitFor(4);
    }

    public void openDirectionSection() {
        direction_section.click();
        Base.waitFor(3);
    }

    public void selectComingDirection() {
        coming_direction.click();
        Base.waitFor(3);
    }

    public void selectNodirectionOption() {
        no_direction.click();
    }

    public void selectGoingDirection() {
        going_direction.click();
    }

    public void openListSection() {

        list_dropwdown.click();
    }

    public void selectNotINList() {
        not_in_list.click();
    }

    public void validateRowTables() {
        int numRowtables = row_tables.size();
        System.out.println(numRowtables);
        Assert.assertTrue(numRowtables >= 10);

    }


    public void rightClickOnTimeColumn() {
        Base.contextClick(time_column);
    }


    public void doubleClickOnIdColumn() {
        id_column.click();
        Base.waitFor(3);
        id_column.click();
        Base.waitFor(5);

    }

    public void assertNoImage() {
        Assert.assertTrue(td_first_lpr_noimage.getText().contains("No image"));
    }

    public void assertNoImageImageColumn() {

        Assert.assertTrue(td_first_show_image.getText().contains("No image"));
    }

    public void asserDownloadImageColumn() {
        Assert.assertTrue(td_first_lpr_noimage.getText().contains("LPR"));
    }

    public void assertTrueSaveImage() {
        Assert.assertTrue(td_first_show_image.getAttribute("img").contains("cut.jpg"));
    }

    public void clickOnLaneSection() {
        lane_input_field.click();
        Base.waitFor(2);
    }

    public void selecNoLane() {
        nolane_option.click();
    }

    public void selectLane1() {
        lane1_option.click();
    }

    public void selectLane2() {
        lane2_option.click();
    }

    public void clickOnClassFilter() {
        class_input_field.click();
        Base.waitFor(3);
    }

    public void selectClassCarOption() {
        car_option.click();
    }

    public void selectVanOption() {
        van_option.click();
    }

    public void selectBusOption() {
        bus_option.click();
    }

    public void selectTruckOption() {
        truck_option.click();
    }

    public void clickOnColorSection() {
        color_input_field.click();
        Base.waitFor(2);
    }

    public void selectWhiteColor() {

        color_white.click();
    }

    public void selectGreyColor() {
        color_grey.click();
    }

    public void selectRedColor() {
        color_red.click();
    }

    public void selectBlackColor() {
        color_black.click();
    }

    public void selectOrangeColor() {
        color_orange.click();
    }

    public void selectYellowColor() {
        color_yellow.click();
    }

    public void selectGreenColor() {
        color_green.click();
    }

    public void selectBlueColor() {
        color_blue.click();
    }

    public void enterSpeed() {
      //  speed_minimum_input_field.click();
        speed_minimum_input_field.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(3);
        speed_minimum_input_field.clear();
        Base.waitFor(3);
        speed_minimum_input_field.sendKeys("10");
        Base.waitFor(2);
        speed_maximum_input_field.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(2);
        speed_maximum_input_field.clear();
        speed_maximum_input_field.sendKeys("25");
        Base.waitFor(2);

    }
}
