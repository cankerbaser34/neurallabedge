package com.uiPages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class ListsPage {

    public ListsPage() {
        PageFactory.initElements(Driver.get(ConfigurationReader.get("url")), this);
    }


    @FindBy(css = "#alist")
    public WebElement list_page_href;

    // List types locators

    @FindBy(css = "#listtypes")
    public WebElement list_types_open;

    @FindBy(css = "div[id='gridContainer'] div[title='Add a row']")
    public WebElement add_new_list_button;

    @FindBy(xpath = "(//div[@class='dx-button-content'])[3]")
    public WebElement export_all_data_list_button;

    @FindBy(xpath = "(//div[@class='dx-texteditor-container'])[2]")
    public WebElement search_input;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
    public WebElement new_list_name_input;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(5) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
    public WebElement edit_new_list_input;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(5) > td:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")
    public WebElement edit_lev_distance_input;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")
    public WebElement add_lev_distance_value_input;

    @FindBy(css = ".dx-link.dx-link-save")
    public WebElement save_newlist_href;

    @FindBy(xpath = "//*[@id=\"gridContainer\"]/div/div[6]/div/table/tbody/tr[5]/td[4]/a[1]")
    public WebElement save_edited_list;

    @FindBy(css = ".dx-link.dx-link-cancel")
    public WebElement cancel_save_href;

    @FindBy(css = "tbody tr:nth-child(5) td:nth-child(4) a:nth-child(2)")
    public WebElement delete_last_list_button;

    @FindBy(css = "tbody tr:nth-child(5) td:nth-child(4) a:nth-child(1)")
    public WebElement edit_new_list;

    @FindBy(css = "div[aria-label='Yes'] div[class='dx-button-content']")
    public WebElement confirm_delete_list;

    @FindBy(xpath = "//td[normalize-space()='TestList']")
    public WebElement test_list;

    @FindBy(css = "#plateslist")
    public WebElement test_licence_plates;

    @FindBy(css = "#plateslist")
    public WebElement platelist_add_open;

    @FindBy(xpath = "(//div[@class='dx-button-content'])[5]")
    public WebElement addlist_newplate_button;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
    public WebElement newplate_insert_input;

    @FindBy(css = "tbody tr[role='row'] td:nth-child(6) a:nth-child(2)")
    public WebElement delete_plate_button;

    @FindBy(xpath = "(//div[@class='dx-texteditor-container'])[5]")
    public WebElement description_newplate_input;

    @FindBy(xpath = "(//div[@class='dx-dropdowneditor-input-wrapper'])[1]")
    public WebElement start_val_date_input;

    @FindBy(xpath = "(//div[@class='dx-dropdowneditor-input-wrapper'])[2]")
    public WebElement end_val_date_input;

    @FindBy(css = ".dx-link.dx-link-save")
    public WebElement save_newplate_href;

    @FindBy(xpath = "//td[normalize-space()='all plates']")
    public WebElement allplates_list;

    @FindBy(css = "..dx-link.dx-link-cancel")
    public WebElement cancel_newplate_href;

    @FindBy(css = "#actionlist")
    public WebElement action_list_open;

    @FindBy(css = "#ExportActionsCSV")
    public WebElement export_actions_CSV_button;

    @FindBy(css = "#ExportActionsXML")
    public WebElement export_actions_XML_button;

    @FindBy(css = "#deleteoldaction")
    public WebElement delete_list_element_checkbox;


    // Action Locators

    @FindBy(xpath = "(//div[@title='Add a row'])[3]")
    public WebElement add_action_button;

    @FindBy(css = "#actionlist")
    public WebElement action_section;

    @FindBy(xpath = "(//div[@class='dx-texteditor-container'])[5]")
    public WebElement description_action_input;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
    public WebElement action_description;

    @FindBy(css = "td[role='gridcell'][aria-describedby='dx-col-25']")
    public WebElement select_action_dropdown;

    @FindBy(xpath = "//div[contains(text(),'Socket client')]")
    public WebElement socket_client_action;

    @FindBy(css = "td[role='gridcell'][aria-describedby='dx-col-26']")
    public WebElement select_active_dropdown;

    @FindBy(xpath = "//div[contains(text(),'Enabled')]")
    public WebElement enabled_action;

    @FindBy(css = "div[id='ExportActionsCSV'] div[class='dx-button-content']")
    public WebElement export_to_CSV_file_button;

    @FindBy(css = "div[id='ExportActionsXML'] div[class='dx-button-content']")
    public WebElement export_to_xmlfile;


    // Export locators
    @FindBy(css = "#exportstitle")
    public WebElement export_list_open;

    @FindBy(css = "#ExportCSV")
    public WebElement export_to_Csv_file;

    @FindBy(css = "#ExportXML")
    public WebElement export_Xml_file;

    @FindBy(xpath = "(//div[@title='Add a row'])[4]")
    public WebElement add_export_button;

    @FindBy(xpath = "(//input[@id='dx-col-24'])[1]")
    public WebElement description_export_input;

    @FindBy(xpath = "(//input[@id='dx-col-34'])[1]")
    public WebElement export_type_dropdown;

    @FindBy(id = "dx-col-35")
    public WebElement export_interval_drowpdown;

    @FindBy(id = "dx-col-36")
    public WebElement active_dropdown;

    @FindBy(css = ".dx-link.dx-link-save")
    public WebElement export_save_href;

    @FindBy(css = ".dx-link.dx-link-cancel")
    public WebElement export_cancel_href;

    // import list locators

    @FindBy(css = "#importstitle")
    public WebElement import_list_open;

    @FindBy(xpath = "(//span[@class='dx-button-text'])[12]")
    public WebElement imoort_xml_csv_button;

    @FindBy(css = "#deleteold")
    public WebElement delete_list_elem_import_checkbox;

    @FindBy(xpath = "(//div[@title='Add a row'])[5]")
    public WebElement add_import_button;

    @FindBy(xpath = "(//div[@title='Add a row'])[5]")
    public WebElement description_import;

    @FindBy(xpath = "(//input[@id='dx-col-34'])[1]")
    public WebElement import_type;

    @FindBy(xpath = "(//input[@id='dx-col-35'])[1]")
    public WebElement interval_input;


    @FindBy(xpath = "(//div[@class='dx-datagrid-content'])[5]")
    public WebElement active_import_list;

    @FindBy(css = ".dx-link.dx-link-save")
    public WebElement save_import_href;

    @FindBy(css = ".dx-link.dx-link-cancel")
    public WebElement cancel_import_href;


    public void navToListPage() {
        list_page_href.click();
        Base.waitFor(5);
    }

    public void clickOnListTypes() {
        // list_types_open.click();
        //Base.waitFor(3);

    }

    public void clickOnAddButton() {
        add_new_list_button.click();
        Base.waitFor(3);
    }

    public void enterListName() {
        new_list_name_input.sendKeys("TestList");
        Base.waitFor(3);

    }

    public void enterLeventshtein() {
        add_lev_distance_value_input.sendKeys("1");
        Base.waitForClickablility(save_newlist_href, 4);
    }

    public void clickSaveNewList() {
        save_newlist_href.click();
        Base.waitFor(3);
    }

    public void clickEditList() {
        edit_new_list.click();
        Base.waitFor(3);
    }

    public void editNameNewList() {
        edit_new_list_input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(3);
        edit_new_list_input.clear();
        Base.waitFor(3);
        edit_new_list_input.sendKeys("TestListNew");
        Base.waitFor(3);
    }

    public void editLevInput() {
        edit_lev_distance_input.click();
        Base.waitFor(3);
        edit_lev_distance_input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(3);
        edit_lev_distance_input.clear();
        Base.waitFor(3);
        edit_lev_distance_input.sendKeys("0");
        Base.waitFor(4);
        edit_lev_distance_input.sendKeys(Keys.TAB);
        Base.waitFor(3);
        edit_lev_distance_input.sendKeys(Keys.ENTER);
        Base.waitFor(3);
        save_edited_list.click();

    }

    public void click_delete_List() {
        delete_last_list_button.click();
        Base.waitForClickablility(confirm_delete_list, 3);
    }

    public void clickYesToDeleteList() {
        confirm_delete_list.click();
        Base.waitFor(3);
    }

    public void clicktoDownloadLists() {
        export_all_data_list_button.click();
        Base.waitFor(3);

    }

    public boolean isFileDownloaded(String filename) {
        File dir = new File("C:\\Users\\cihan.baser\\Documents\\projectNeeded\\HauTest\\src\\test\\java\\com\\Downloads");
        File[] dirContents = dir.listFiles();

        for (int i = 0; i < dirContents.length; i++) {
            if (dirContents[i].getName().equals(filename)) {
                // File has been found, it can now be deleted:
                dirContents[i].delete();
                return true;
            }
        }
        return false;
    }

    public void newFileDownload(String filename) {

        File dir = new File("C:\\Users\\cihan.baser\\Documents\\projectNeeded\\HauTest\\src\\test\\java\\com\\Downloads");
        File[] dirContents = dir.listFiles();

        for (int i = 0; i < dirContents.length; i++) {
            if (dirContents[i].getName().equals(filename)) {
                // File has been found, it can now be deleted:
                dirContents[i].delete();
            }
        }


    }


    public void clickOnNewList() {
        test_list.click();
        Base.waitFor(6);
    }

    public void clickOnLicencePlates() {
        test_licence_plates.click();
        Base.waitFor(3);
    }

    public void clickOnAddPlateButton() {
        addlist_newplate_button.click();
        Base.waitFor(6);
    }

    public void enterNewPlatetoNewList() {

        newplate_insert_input.click();
        newplate_insert_input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(3);
        newplate_insert_input.clear();
        Base.waitFor(3);
        newplate_insert_input.sendKeys("B9059NW");
        Base.waitFor(4);
        newplate_insert_input.sendKeys(Keys.TAB);
        Base.waitFor(3);
        newplate_insert_input.sendKeys(Keys.ENTER);
        Base.waitFor(3);
    }

    public void clickSaveNewPlate() {
        save_newplate_href.click();
    }

    public void clickDeleteNewPlate() {
        delete_plate_button.click();
        Base.waitFor(3);
    }

    public void clickYestoConfirmDelete() {
        confirm_delete_list.click();
        Base.waitFor(2);
    }

    public void clickOnAllPlatesList() {
        allplates_list.click();
    }

    public void clickOnActionSection() {
        action_section.click();
    }

    public void clickOnAddAction() {
        add_action_button.click();
        Base.waitFor(3);
    }

    public void entersDescriptionofAction() {
        // action_description.sendKeys("Action1");
        //  Base.waitFor(3);

        action_description.click();
        Base.waitFor(3);
        action_description.sendKeys("Action1");
        Base.waitFor(4);

    }

    public void clickOnActionType() {
        select_action_dropdown.click();
        Base.waitFor(2);
    }

    public void selectActionType() {
        socket_client_action.click();

    }

    public void clickOnActiveSection() {
        select_active_dropdown.click();
        Base.waitFor(3);
    }

    public void selectActiveAction() {
        enabled_action.click();

    }

}
