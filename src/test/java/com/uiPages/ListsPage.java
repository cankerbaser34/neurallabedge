package com.uiPages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class ListsPage {

    String host = ConfigurationReader.get("ftp_post");
    String username = ConfigurationReader.get("ftp_user");
    String folder_name = ConfigurationReader.get("ftp_folder_name");
    String password = ConfigurationReader.get("ftp_password");

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

    @FindBy(xpath = "//*[@id=\"ImportActionsbutton\"]/div/div/div/div[1]/div[1]")
    public WebElement select_import_xml;

    // Action Locators

    @FindBy(xpath = "(//div[@title='Add a row'])[3]")
    public WebElement add_action_button;

    @FindBy(xpath = "(//a[@class='dx-link dx-link-delete'][normalize-space()='Delete'])[5]")
    public WebElement delete_action_button;

    @FindBy(css = "#gridContainer4 > div > div.dx-datagrid-rowsview.dx-datagrid-nowrap.dx-scrollable.dx-visibility-change-handler.dx-scrollable-both.dx-scrollable-simulated.dx-scrollable-customizable-scrollbars.dx-last-row-border > div > div > div.dx-scrollable-content > div > table > tbody > tr:nth-child(1) > td.dx-command-edit > a.dx-link.dx-link-delete")
    public WebElement delete_exports_button;

    @FindBy(css = "#actionlist")
    public WebElement action_section;

    @FindBy(xpath = "(//div[@class='dx-texteditor-container'])[5]")
    public WebElement description_action_input;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
    public WebElement action_description;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(1) > div:nth-child(1)")
    public WebElement select_action_div;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")
    public WebElement select_action_input;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")
    public WebElement action_activate;

    @FindBy(css = "div[id='ExportActionsCSV'] div[class='dx-button-content']")
    public WebElement export_to_CSV_file_button;

    @FindBy(xpath = "#ExportXML")
    public WebElement export_to_xmlfile;

    @FindBy(css = "#ExportActionsXML")
    public WebElement action_export_xml;


    // Export locators
    @FindBy(css = "#exportstitle")
    public WebElement export_list_open;

    @FindBy(css = "#ExportCSV")
    public WebElement export_to_Csv_file;

    @FindBy(css = "#ExportXML")
    public WebElement export_Xml_file;

    @FindBy(xpath = "(//div[@title='Add a row'])[4]")
    public WebElement add_export_button;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
    public WebElement description_export_input;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")
    public WebElement export_type_dropdown;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")
    public WebElement export_interval_drowpdown;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")
    public WebElement export_active_dropdown;

    @FindBy(xpath = "//td[normalize-space()='Minute']")
    public WebElement export_type_open;

    @FindBy(css = ".dx-link.dx-link-save")
    public WebElement export_save_href;

    @FindBy(css = ".dx-link.dx-link-cancel")
    public WebElement export_cancel_href;

    @FindBy(css = "div[id='elemhost103'] input[role='textbox']")
    public WebElement export_host_input;

    @FindBy(css = "div[id='elemport101'] input[role='spinbutton']")
    public WebElement export_port_input;

    @FindBy(css = "div[id='dx-d6ad5cb6-4d61-e236-5fd9-742f2267ea35'] div[class='dx-item-content']")
    public WebElement export_format_xml;

    @FindBy(xpath = "//div[contains(text(),'XML_IMG')]")
    public WebElement export_format_xml_img;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(5) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2)")
    public WebElement export_format_json;

    @FindBy(xpath = "//div[contains(text(),'JSON_IMG')]")
    public WebElement export_json_img;

    @FindBy(css = "div[id='dx-d6ad5cb6-4d61-e236-5fd9-742f2267ea35'] div[class='dx-item-content']")
    public WebElement export_csv;

    @FindBy(css = "div[id='elemparam2103'] input[role='textbox']")
    public WebElement export_folder_name_input;

    @FindBy(css = "div[id='elemparam3103'] input[role='textbox']")
    public WebElement export_username_input;

    @FindBy(css = "div[id='elemparam4103'] input[role='textbox']")
    public WebElement export_password_input;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(5) > div:nth-child(2) > div:nth-child(9) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2)")
    public WebElement export_type_ftps;

    // import list locators
    @FindBy(css = "#importstitle")
    public WebElement import_list_open;

    @FindBy(xpath = "(//span[@class='dx-button-text'])[12]")
    public WebElement import_xml_csv_button;

    @FindBy(css = "#deleteold")
    public WebElement delete_list_elem_import_checkbox;

    @FindBy(css = "div[id='gridContainer5'] div[class='dx-item dx-toolbar-item dx-toolbar-button dx-toolbar-item-auto-hide dx-toolbar-text-auto-hide']")
    public WebElement add_import_button;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(6) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
    public WebElement description_import;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(6) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")
    public WebElement import_type;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(6) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")
    public WebElement import_interval_input;


    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(6) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")
    public WebElement import_activate_list;

    @FindBy(css = ".dx-link.dx-link-save")
    public WebElement save_import_href;

    @FindBy(xpath = "//tr[@class='dx-row dx-data-row dx-row-lines dx-column-lines dx-state-hover']//a[@class='dx-link dx-link-delete'][normalize-space()='Delete']")
    public WebElement import_delete_list;

    @FindBy(css = ".dx-link.dx-link-cancel")
    public WebElement cancel_import_href;

    @FindBy(xpath = "//td[normalize-space()='FTP list']")
    public WebElement ftp_row;

    @FindBy(css = "div[id='elemhost200'] input[role='textbox']")
    public WebElement import_ftp_list_host;

    @FindBy(css = "div[id='elemport200'] input[role='spinbutton']")
    public WebElement getImport_ftp_list_port;

    @FindBy(xpath = "//div[contains(text(),'XML_NOTDELETE')]")
    public WebElement xml_notdelete_radio;

    @FindBy(xpath = "//div[contains(text(),'CSV_NOTDELETE')]")
    public WebElement csv_not_delete_radio;

    @FindBy(css = "div[id='dx-31170d59-8522-5f93-40fb-be8e893cc7b6'] div[class='dx-item-content']")
    public WebElement csv_radio;

    @FindBy(css = "div[id='dx-31170d59-8522-5f93-40fb-be8e893cc7b6'] div[class='dx-radiobutton-icon dx-radiobutton-icon-checked']")
    public WebElement xml_radio;

    @FindBy(css = "div[id='elemparam2200'] input[role='textbox']")
    public WebElement foldername_ftp_list_import;

    @FindBy(css = "div[id='elemparam3200'] input[role='textbox']")
    public WebElement user_name_ftplist_import;

    @FindBy(css = "div[id='elemparam4200'] input[role='textbox']")
    public WebElement password_ftplist_import;

    @FindBy(css = "div[id='dx-31170d59-8522-5f93-40fb-be8e893cc7b6'] div[class='dx-item-content']")
    public WebElement xml_ftplist_import;

    @FindBy(css = "div[id='dx-32a67e81-70e3-8319-1a6f-7c239bc41f12'] div[class='dx-item-content']")
    public WebElement ftps_ftplist_import;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1)")
    public WebElement select_importXMLCSV_import;


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
        Base.waitFor(4);
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
        File dir = new File("C:\\Users\\cihan.baser\\Documents\\projectNeeded\\neuralclone\\neurallabedge\\src\\test\\java\\com\\Downloads");
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
        Base.waitFor(5);
    }

    public void clickOnAddAction() {
        add_action_button.click();
        Base.waitFor(4);
    }

    public void entersDescriptionofAction() {
        action_description.sendKeys("Action1");
        Base.waitFor(3);
    }

    public void selectActionType() {
        select_action_div.click();
        Base.waitFor(2);
        select_action_input.sendKeys("Trigger server");
        Base.waitFor(2);
        select_action_input.sendKeys(Keys.ENTER);
        Base.waitFor(2);
        //select_action_input.sendKeys();
    }

    public void clickOnImportActionFile() throws IOException {

        //select_import_xml.click();
        select_import_xml.sendKeys("Users/Damla/Documents/20230103152734_0_LOCAL_DATA_EXPORT_CSV_ALLLIST");
        Base.waitFor(2);
        // Runtime.getRuntime().exec("C:\\Users\\Damla\\Documents\\20230103152734_0_LOCAL_DATA_EXPORT_CSV_ALLLIST");
        // Base.waitFor(5);

    }

    public void selectActiveAction() {
        action_activate.click();
        // action_activate.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(3);
        // action_activate.clear();
        action_activate.sendKeys("Enabled");
        Base.waitFor(2);
        action_activate.sendKeys(Keys.ENTER);
        Base.waitFor(3);
    }

    public void clickOnExportsForList() {
        export_list_open.click();
        Base.waitFor(2);
    }

    public void clickOnExportCSVFile() {
        export_to_Csv_file.click();
        Base.waitFor(4);
    }

    public void clickOnExportXMLFile() {
        export_to_xmlfile.click();
        Base.waitFor(3);
    }

    public void clickOnAddExport() {
        add_export_button.click();
        Base.waitFor(2);
    }

    public void enterDescriptionExport() {
        description_export_input.click();
        Base.waitFor(2);
        description_export_input.sendKeys("Ftp");
        Base.waitFor(2);
        description_export_input.sendKeys(Keys.ENTER);
    }

    public void enterExportType() {
        export_type_dropdown.click();
        Base.waitFor(2);
        export_type_dropdown.sendKeys("FTP list");
        Base.waitFor(2);
        export_type_dropdown.sendKeys(Keys.ENTER);
    }

    public void enterExportInterval() {
        export_interval_drowpdown.click();
        Base.waitFor(2);
        export_interval_drowpdown.sendKeys("Minute");
        Base.waitFor(2);
        export_interval_drowpdown.sendKeys(Keys.ENTER);
    }

    public void setExportActivate() {
        export_active_dropdown.click();
        Base.waitFor(2);
        export_active_dropdown.sendKeys("Enabled");
        Base.waitFor(4);
        export_active_dropdown.sendKeys(Keys.ENTER);
        //  Base.waitFor(4);
    }

    public void openExportProperties() {
        export_type_open.click();
        Base.waitFor(5);
    }

    public void exportSetHost() {

        export_host_input.click();
        export_host_input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(3);
        export_host_input.clear();
        Base.waitFor(3);
        export_host_input.sendKeys(host);
        Base.waitFor(5);
    }

    public void exportSetFolderName() {

        export_folder_name_input.click();
        Base.waitFor(3);
        export_folder_name_input.sendKeys(folder_name);
        Base.waitFor(3);
    }

    public void exportSetUserName() {

        export_username_input.click();
        Base.waitFor(3);
        export_username_input.sendKeys(username);
        Base.waitFor(3);
    }

    public void exportSetPassword() {

        export_password_input.click();
        Base.waitFor(3);
        export_password_input.sendKeys(password);
        export_password_input.sendKeys(Keys.ENTER);
        Base.waitFor(3);
    }

    public void clickOnDeleteAction() {
        delete_action_button.click();
        Base.waitFor(3);
    }

    public void clickOnDeleteExport() {
        delete_exports_button.click();
        Base.waitFor(3);
    }

    public void clickOnExportCSVfile() {
        export_to_CSV_file_button.click();
        Base.waitFor(3);
    }

    public void clickOnExportXMLAction() {
        action_export_xml.click();
        Base.waitFor(4);
    }

    public void opensImportSection() {
        import_list_open.click();
        Base.waitFor(5);
    }

    public void clickOnAddImport() {

        add_import_button.click();
        Base.waitFor(3);
    }

    public void enterDescritionImport() {

        description_import.click();
        Base.waitFor(2);
        description_import.sendKeys("Ftp");
        Base.waitFor(2);
        description_import.sendKeys(Keys.ENTER);

    }

    public void selectFtpListImport() {
        import_type.click();
        Base.waitFor(2);
        import_type.sendKeys("FTP list");
        Base.waitFor(2);
        import_type.sendKeys(Keys.ENTER);

    }

    public void selectIntervalImport() {

        import_interval_input.click();
        Base.waitFor(2);
        import_interval_input.sendKeys("Minute");
        Base.waitFor(1);
        import_interval_input.sendKeys(Keys.ENTER);
    }

    public void selectActivateImport() {

        import_activate_list.click();
        Base.waitFor(2);
        import_activate_list.sendKeys("Enabled");
        Base.waitFor(2);
        import_activate_list.sendKeys(Keys.ENTER);
        Base.waitFor(2);
    }

    public void deleteImportList() {
        import_delete_list.click();
        Base.waitFor(2);
    }

    public void clickOnFtpListImport() {
        ftp_row.click();
    }

    public void setImportFtpListHost() {
        import_ftp_list_host.click();
        import_ftp_list_host.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Base.waitFor(3);
        import_ftp_list_host.clear();
        Base.waitFor(3);
        import_ftp_list_host.sendKeys(host);
        Base.waitFor(3);
    }

    public void setImportFolderName() {

        foldername_ftp_list_import.click();
        Base.waitFor(3);
        foldername_ftp_list_import.sendKeys(folder_name);
        Base.waitFor(3);
    }

    public void setUserImportFtpList() {

        user_name_ftplist_import.click();
        Base.waitFor(2);
        user_name_ftplist_import.sendKeys(username);
    }

    public void setPasswordFptListImport() {

        password_ftplist_import.click();
        Base.waitFor(2);
        password_ftplist_import.sendKeys(password);
        password_ftplist_import.sendKeys(Keys.ENTER);
        Base.waitFor(2);
    }

    public void clickOnSelectImportXmlCsvImport() {
        select_importXMLCSV_import.click();
        Base.waitFor(5);
    }
}
