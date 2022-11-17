package com.uiPages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class AuditVivotek extends Base {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    final public static SimpleDateFormat sdfEdge = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public AuditVivotek() {

        PageFactory.initElements(Driver.get(ConfigurationReader.get("url")), this);
    }


    @FindBy(css = "#ahistoric")
    public WebElement autit_page_href;
    @FindBy(css = "div[id='data1'] input[role='combobox']")
    public WebElement fromdate_input;

    @FindBy(css = "div[id='data2'] input[role='combobox']")
    public WebElement todate_input;

    @FindBy(xpath = "//span[normalize-space()='Search']")
    public WebElement search_button;

    @FindBy(id = "radio-group-simple")
    public WebElement type_section;


    @FindBy(xpath = "//div[contains(text(),'import')]")

    public WebElement importtype;
    @FindBy(xpath = "//div[contains(text(),'action')]")
    public WebElement action_type;

    @FindBy(css = "#export")
    public WebElement export_button;


    public void goToHomePage() {

        Base.waitFor(4);
        autit_page_href.click();
    }

    public void enterDatetoFromdate() {

        fromdate_input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        //  fromdate_input.clear();
        //  Base.waitFor(3);
        // fromdate_input.sendKeys(dtf.format(now));

        Base.waitFor(2);


    }

    public void enterdatetoTodate() {
        todate_input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        todate_input.clear();
        Base.waitFor(2);
        todate_input.sendKeys(dtf.format(now));
        Base.waitFor(2);

    }

    public void selectAction() {
        type_section.click();
        action_type.click();
    }

    public void selectImport() {

        type_section.click();
        importtype.click();
    }

    public void clickSearchButton() {
        search_button.click();
        Base.waitFor(5);
    }

    public void exportExports() {

        export_button.click();
        Base.waitFor(3);
    }

}
