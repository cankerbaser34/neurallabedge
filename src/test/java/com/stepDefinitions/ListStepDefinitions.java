package com.stepDefinitions;

import com.uiPages.Base;
import com.uiPages.ListsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class ListStepDefinitions {

    ListsPage listsPage = new ListsPage();

    @Given("user is on List Page")
    public void userIsOnListPage() {
        listsPage.navToListPage();
    }


    @And("user clicks on add button for new list")
    public void userClicksOnAddButtonForNewList() {
        listsPage.clickOnAddButton();
    }

    @And("user enters name of new list")
    public void userEntersNameOfNewList() {
        listsPage.enterListName();
    }

    @And("user enters Levenshtein distance")
    public void userEntersLevenshteinDistance() {
        listsPage.enterLeventshtein();
    }

    @And("user clicks on save button")
    public void userClicksOnSaveButton() {
        listsPage.clickSaveNewList();
    }

    @Then("the new list should be added and appears among the lists")
    public void theNewListShouldBeAddedAndAppearsAmongTheLists() {

    }

    @When("user clicks on edit button on created list")
    public void userClicksOnEditButtonOnCreatedList() {
        listsPage.clickEditList();
        Base.waitFor(3);

    }

    @And("user changes name of the list")
    public void userChangesNameOfTheList() {
        listsPage.editNameNewList();
    }

    @And("user changes Levenshtein distance")
    public void userChangesLevenshteinDistance() {

        listsPage.editLevInput();
    }

    @And("user clicks on save page")
    public void userClicksOnSavePage() {
    }

    @Then("name and Levenshtein distance should be changed")
    public void nameAndLevenshteinDistanceShouldBeChanged() {
    }

    @When("user clicks on delete button")
    public void userClicksOnDeleteButton() {
        listsPage.click_delete_List();
    }

    @And("user clicks on yes button to delete")
    public void userClicksOnYesButtonToDelete() {
        listsPage.clickYesToDeleteList();

    }

    @Then("the list should be deleted from the list")
    public void theListShouldBeDeletedFromTheList() {
    }

    @When("user clicks on Export_all_data button")
    public void userClicksOnExport_all_dataButton() {
        listsPage.clicktoDownloadLists();

    }

    @Then("the lists should be downloaded")
    public void theListsShouldBeDownloaded() {
        listsPage.isFileDownloaded("DataGrid.xlsx");
    }


    @When("user clicks on test list")
    public void userClicksOnTestList() {
        listsPage.clickOnNewList();
    }

    @And("user clicks on List of licence plates section")
    public void userClicksOnListOfLicencePlatesSection() {
        listsPage.clickOnLicencePlates();
    }

    @And("user clicks on add button")
    public void userClicksOnAddButton() {
        listsPage.clickOnAddPlateButton();
    }

    @And("user enters newplate in input field")
    public void userEntersNewplateInInputField() {
        listsPage.enterNewPlatetoNewList();
    }

    @And("user clicks save button for newplate")
    public void userClicksSaveButtonForNewplate() {
        listsPage.clickSaveNewPlate();
    }

    @And("user clicks on delete button to delete new plate")
    public void userClicksOnDeleteButtonToDeleteNewPlate() {
        listsPage.clickDeleteNewPlate();

    }

    @And("user clicks yes to confirm deleting saved plate")
    public void userClicksYesToConfirmDeletingSavedPlate() {
        listsPage.clickYestoConfirmDelete();
    }

    @And("user should be deleted from the list")
    public void userShouldBeDeletedFromTheList() {
    }

    @When("user clicks on all plates list")
    public void userClicksOnAllPlatesList() {
        listsPage.clickOnAllPlatesList();
    }

    @And("user clicks on action for the list field")
    public void userClicksOnActionForTheListField() {
        listsPage.clickOnActionSection();
    }

    @And("user clicks on add action button")
    public void userClicksOnAddActionButton() {
        listsPage.clickOnAddAction();
    }

    @And("user enters description of action")
    public void userEntersDescriptionOfAction() {
        listsPage.entersDescriptionofAction();
    }

    @And("user selects type of action")
    public void userSelectsTypeOfAction() {
        listsPage.selectActionType();

    }

    @And("user enables the action")
    public void userEnablesTheAction() {
        listsPage.selectActiveAction();

    }

    @When("user clicks on save button for new action")
    public void userClicksOnSaveButtonForNewAction() {
    }


    @And("user clicks on select import XMLCSV file button")
    public void userClicksOnSelectImportXMLCSVFileButton() throws IOException {
        listsPage.clickOnImportActionFile();
    }

    @And("user clicks on exports section")
    public void userClicksOnExportsSection() {
    }

    @And("user clicks on exports exports to CSV file button")
    public void userClicksOnExportsExportsToCSVFileButton() {
    }

    @And("exports should be downloaded")
    public void exportsShouldBeDownloaded() {
    }

    @And("user clicks on exports for the list section")
    public void userClicksOnExportsForTheListSection() {
        listsPage.clickOnExportsForList();
    }

    @And("user clicks on Export to Csv file button under exports section")
    public void userClicksOnExportToCsvFileButtonUnderExportsSection() {
        listsPage.clickOnExportCSVFile();
    }

    @When("user clicks one e")
    public void userClicksOneE() {
    }

    @And("user clicks on Export_to_xml_file button under exports section")
    public void userClicksOnExport_to_xml_fileButtonUnderExportsSection() {

        listsPage.clickOnExportXMLFile();
    }

    @Then("export file should be downloaded")
    public void exportFileShouldBeDownloaded() {
        listsPage.clickOnExportXMLFile();
    }

    @Then("the action should be saved")
    public void theActionShouldBeSaved() {
    }

    @And("user enters description of export")
    public void userEntersDescriptionOfExport() {

        listsPage.enterDescriptionExport();
    }

    @And("user selects type of export type")
    public void userSelectsTypeOfExportType() {

        listsPage.enterExportType();
    }

    @And("user selects interval type")
    public void userSelectsIntervalType() {
        listsPage.enterExportInterval();
    }

    @And("user activates the export")
    public void userActivatesTheExport() {
        listsPage.setExportActivate();
    }

    @And("user clicks on add button for export type")
    public void userClicksOnAddButtonForExportType() {
        listsPage.clickOnAddExport();
    }

    @And("user clicks on interval section to open export properties")
    public void userClicksOnIntervalSectionToOpenExportProperties() {
        listsPage.openExportProperties();
    }

    @And("user enters host api")
    public void userEntersHostApi() {
        listsPage.exportSetHost();
    }

    @And("user enters port number")
    public void userEntersPortNumber() {

    }

    @And("user selects format type")
    public void userSelectsFormatType() {

    }

    @And("user enters folder name")
    public void userEntersFolderName() {
        listsPage.exportSetFolderName();
    }

    @And("user enters username")
    public void userEntersUsername() {
        listsPage.exportSetUserName();
    }

    @And("user enters password")
    public void userEntersPassword() {
        listsPage.exportSetPassword();
    }

    @Then("the export should arrive to its destination")
    public void theExportShouldArriveToItsDestination() {

    }

    @And("user clicks on delete button to delete desired action")
    public void userClicksOnDeleteButtonToDeleteDesiredAction() {
        listsPage.clickOnDeleteAction();

    }
}
