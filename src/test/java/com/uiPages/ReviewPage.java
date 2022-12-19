package com.uiPages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.junit.Assert;
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


    @FindBy(css = "#export")
    public WebElement export_button;

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

    public void assertTrueSaveImage(){
        Assert.assertTrue(td_first_show_image.getAttribute("img").contains("cut.jpg"));
    }
}
