package com.stepDefinitions;

import com.uiPages.Base;
import com.uiPages.GeneralConfigPage;
import com.uiPages.ListsPage;
import com.uiPages.ReviewPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GeneralConfigStepDefinitions {

    GeneralConfigPage generalConfigPage = new GeneralConfigPage();
    ReviewPage reviewPage = new ReviewPage();
    ListsPage listsPage = new ListsPage();

    @Given("user is on generalconfig page")
    public void userIsGeneralconfigPage() {

        generalConfigPage.goToGeneralConfigPage();
    }

    @When("user clicks on maintenance option")
    public void userClicksOnMaintenanceOption() {
        generalConfigPage.clickMaintenanceOption();
        Base.waitFor(2);


    }

    @And("user clicks on upload file button")
    public void userClicksOnUploadFileButton() {

        // generalConfigPage.clickUpladfile();
    }

    @And("user selects any file to upload")
    public void userSelectsAnyFileToUpload() {
    }


    @When("user clicks on revert last file button")
    public void userClicksOnRevertLastFileButton() {

        generalConfigPage.clickRevertLastFile();


    }

    @Then("the last files should be reverted")
    public void theLastFilesShouldBeReverted() {
    }

    @When("user clicks on show info button")
    public void userClicksOnShowInfoButton() {

        generalConfigPage.clickShowInfo();
    }

    @Then("the version and mac adress should be seen")
    public void theVersionAndMacAdressShouldBeSeen() {

        generalConfigPage.getTextShowInfo();
    }

    @And("user closes info section")
    public void userClosesInfoSection() {

        generalConfigPage.closeInfoSection();
    }

    @When("user clicks on reset data base button")
    public void userClicksOnResetDataBaseButton() {

        generalConfigPage.clickResetDatabase();
    }

    @And("user enters the mac address as password")
    public void userEntersTheMacAddressAsPassword() {
        generalConfigPage.entersMacAddress();
    }

    @And("user enters the mac address as password into resetcounters field")
    public void userEntersTheMacAddressAsPasswordIntoResetcountersField() {
        generalConfigPage.enterMacToResetCounter();
    }

    @And("user clicks on yes button")
    public void userClicksOnYesButton() {
        generalConfigPage.clickYesToClearData();
    }

    @Then("the data base will be  cleared")
    public void theDataBaseWillBeCleared() {
    }

    @When("user clicks on reset counters button")
    public void userClicksOnResetCountersButton() {
        generalConfigPage.clickResetCountersButton();


    }

    @Then("ANPR counters will be reset")
    public void anprCountersWillBeReset() {
    }

    @When("user clicks on export general config button")
    public void userClicksOnExportGeneralConfigButton() {
        generalConfigPage.clickExportGenConfig();

    }

    @Then("general config file should be downloaded")
    public void generalConfigFileShouldBeDownloaded() {

        listsPage.isFileDownloaded("generalconfig");
    }

    @When("user clicks export database button")
    public void userClicksExportDatabaseButton() {
        generalConfigPage.clickOnExportDataBase();
    }

    @Then("database should be downloaded")
    public void databaseShouldBeDownloaded() {
        listsPage.isFileDownloaded("db.tar.gz");
    }

    @When("user clicks on export VPAR config button")
    public void userClicksOnExportVPARConfigButton() {

        generalConfigPage.clickOnVparConfig();
    }

    @Then("vpar config should be downloaded")
    public void vparConfigShouldBeDownloaded() {
        listsPage.isFileDownloaded("vparcfg.tar.gz");

    }


    @And("user unselect save image option")
    public void userUnselectSaveImageOption() {
        generalConfigPage.disableSaveImage();
    }

    @And("user unselects save te plate image option")
    public void userUnselectsSaveTePlateImageOption() {
        generalConfigPage.disableSavePlateImage();
    }

    @Then("the full image should not be saved")
    public void theFullImageShouldNotBeSaved() {
        reviewPage.assertNoImage();

    }


    @When("user  clicks on expert option")
    public void userClicksOnExpertOption() {
        generalConfigPage.openExpertSection();
    }


    @Then("the plate image is not saved")
    public void thePlateImageIsNotSaved() {
        reviewPage.assertNoImageImageColumn();
    }


    @And("user clicks on restart service button on GeneralConfig page")
    public void userClicksOnRestartServiceButtonOnGeneralConfigPage() {
        generalConfigPage.clickOnRestartServiceButton();


    }

    @And("user enters {int} in imageqality field")
    public void userEntersInImageqalityField(int arg0) {
        generalConfigPage.setImageQuality();
    }

    @Then("the size of saved image should be increased")
    public void theSizeOfSavedImageShouldBeIncreased() {
    }

    @And("user clicks persistent action time option")
    public void userClicksPersistentActionTimeOption() {
        generalConfigPage.selectPersistentActionTimeOption();
    }

    @Then("persistent action should be selected")
    public void persistentActionShouldBeSelected() {
    }

    @And("user clicks savedatetime overlay option")
    public void userClicksSavedatetimeOverlayOption() {
        generalConfigPage.selectSaveTimeOverlay();
    }

    @Then("date and time should appear on image from live page")
    public void dateAndTimeShouldAppearOnImageFromLivePage() {
        generalConfigPage.assertSelectSaveTimeActivated();
    }

    @When("user clicks on view options")
    public void userClicksOnViewOptions() {
        generalConfigPage.clickOnViewOptions();

    }

    @And("user selects view option")
    public void userSelectsViewOption() {
        generalConfigPage.selectListViewType();
    }

    @Then("the results should show on live page as a list")
    public void theResultsShouldShowOnLivePageAsAList() {
        generalConfigPage.assertElementForListTable();
    }

    @And("user selects square option")
    public void userSelectsSquareOption() {
        generalConfigPage.selectSquareViewoption();
    }

    @Then("the results should show as a square box on live page")
    public void theResultsShouldShowAsASquareBoxOnLivePage() {
        generalConfigPage.assertElementforSquareTable();
    }

    @And("user selects Lane option")
    public void userSelectsLaneOption() {
        generalConfigPage.selectLaneOptionViewType();
    }


    @Then("on result panel lane column should appear")
    public void onResultPanelLaneColumnShouldAppear() {
        generalConfigPage.assertLaneColumnLivePage();
    }

    @And("user selects direction option")
    public void userSelectsDirectionOption() {
        generalConfigPage.selectDirectionViewOption();
    }

    @Then("on result panel  direction column should appear")
    public void onResultPanelDirectionColumnShouldAppear() {
        generalConfigPage.assertDirectionColumnLivePage();
    }

    @And("user selects confidence option")
    public void userSelectsConfidenceOption() {
        generalConfigPage.selectConfOptionViewType();
    }

    @Then("on result panel confidence column should appear")
    public void onResultPanelConfidenceColumnShouldAppear() {
        generalConfigPage.assertConfColumnLivePage();
    }

    @And("user selects height option")
    public void userSelectsHeightOption() {
        generalConfigPage.selectHeightOptionViewType();

    }

    @Then("on result panel height column should appear")
    public void onResultPanelHeightColumnShouldAppear() {
        generalConfigPage.assertHeightColumnLivePage();
    }

    @And("user selects country option")
    public void userSelectsCountryOption() {
        generalConfigPage.selectCountryOptionViewType();
    }

    @Then("on result panel country column should appear")
    public void onResultPanelCountryColumnShouldAppear() {
        generalConfigPage.assertCountryColumnLivePage();
    }

    @And("user selects list option")
    public void userSelectsListOption() {
        generalConfigPage.selectListOptionViewType();
    }

    @Then("on result panel list column should appear")
    public void onResultPanelListColumnShouldAppear() {
        generalConfigPage.assertListColumnLivePage();
    }

    @And("user selects lane option for review field")
    public void userSelectsLaneOptionForReviewField() {
        generalConfigPage.selectLaneOptionReviewField();
    }

    @And("user goes to review page")
    public void userGoesToReviewPage() {
        generalConfigPage.goesToReviewPage();
    }

    @Then("Lane column and Lane filter field should appear on Review page")
    public void laneColumnAndLaneFilterFieldShouldAppearOnReviewPage() {
        generalConfigPage.assertLaneFieldColumnReviewPage();
    }

    @And("user selects direction option for review field")
    public void userSelectsDirectionOptionForReviewField() {
        generalConfigPage.selectDirectionOptionReviewfield();
    }

    @Then("Direction column and Direction filter should appear on review page")
    public void directionColumnAndDirectionFilterShouldAppearOnReviewPage() {
        generalConfigPage.assertDirectionColumnReviewPage();
    }

    @And("user selects confidence option for review field")
    public void userSelectsConfidenceOptionForReviewField() {
        generalConfigPage.selectConfOptionReviewField();
    }

    @Then("confidence column should appear on review page")
    public void confidenceColumnShouldAppearOnReviewPage() {
        generalConfigPage.assertConfidenceColumnReviewPage();
    }

    @And("user selects height option for review field")
    public void userSelectsHeightOptionForReviewField() {
        generalConfigPage.selectHeightOptionReviewField();
    }

    @Then("Height column should appear on review page")
    public void heightColumnShouldAppearOnReviewPage() {
        generalConfigPage.assertHeightColumnReviewPage();
    }

    @And("user selects country option for review field")
    public void userSelectsCountryOptionForReviewField() {
        generalConfigPage.selectCountryOptionReviewField();
    }

    @Then("Country column should appear on review page")
    public void countryColumnShouldAppearOnReviewPage() {
        generalConfigPage.assertCountryColumnReviewPage();
    }


    @And("user selects list option for review field")
    public void userSelectsListOptionForReviewField() {
        generalConfigPage.selectListOptionReviewField();
    }

    @Then("List column and List filter should appear on review page")
    public void listColumnAndListFilterShouldAppearOnReviewPage() {
        generalConfigPage.assertListColumnReviewPage();
    }

    @When("user clicks on  logs options")
    public void userClicksOnLogsOptions() {
        generalConfigPage.clicksOnLogOptions();
    }

    @And("user sets log level service to {int}")
    public void userSetsLogLevelServiceTo(int arg0) {
        generalConfigPage.setLogServiceThree();
    }

    @And("user goes to log page")
    public void userGoesToLogPage() {
        generalConfigPage.navToLogPage();
    }

    @Then("logs info filters logs should appear")
    public void logsInfoFiltersLogsShouldAppear() {

    }


    @Then("debugs logs should appear in logs")
    public void debugsLogsShouldAppearInLogs() {
    }

    @And("user clicks on enable engine log option")
    public void userClicksOnEnableEngineLogOption() {

        generalConfigPage.clickEnableEngineLog();

    }

    @And("user sets log level manager to {int}")
    public void userSetsLogLevelManagerTo(int arg0) {

        generalConfigPage.logLevelManagerSetFour();
    }


    @Then("the logs level should be three")
    public void theLogsLevelShouldBeThree() {
    }

    @When("user  clicks on purge options")
    public void userClicksOnPurgeOptions() {

        generalConfigPage.clicksOnPurgeOptions();
    }

    @And("user selects hour perge interval option")
    public void userSelectsHourPergeIntervalOption() {

        generalConfigPage.selectHourPurgeInterval();
    }

    @And("user selects days from type of purge")
    public void userSelectsDaysFromTypeOfPurge() {
        generalConfigPage.selectDaysPurge();
    }


    @When("user clicks on heartbeat options")
    public void userClicksOnHeartbeatOptions() {

        generalConfigPage.opensHeartbeatOptions();
    }

    @When("user clicks send hearbeat checkbox")
    public void userClicksSendHearbeatCheckbox() {

        generalConfigPage.clickSendHeartBeat();

    }

    @And("user sets id for heartbox")
    public void userSetsIdForHeartbox() {
        generalConfigPage.setIdHeartBeat();
    }

    @And("user sets timing in seconds field")
    public void userSetsTimingInSecondsField() {

        generalConfigPage.setTimeHeartBeat();
    }

    @And("user sets IP input filed")
    public void userSetsIPInputFiled() {
        generalConfigPage.setIpHeartbeat();
    }

    @And("user sets Port input field")
    public void userSetsPortInputField() {
        generalConfigPage.setPortHeartBeat();
    }

    @And("user selects type of heartbeat option")
    public void userSelectsTypeOfHeartbeatOption() {
        generalConfigPage.selecTypeHeartBeat();
    }


    @And("user selects json type of heartbeat option")
    public void userSelectsJsonTypeOfHeartbeatOption() {
        generalConfigPage.selectJsonTypeHeartBeat();
    }


    @When("user clicks on Customized options section")
    public void userClicksOnCustomizedOptionsSection() {
        generalConfigPage.openCustomizedOptions();
    }

    @And("user clicks on Export to Csv file button")
    public void userClicksOnExportToCsvFileButton() {
        generalConfigPage.clickOnCustomExportCsv();
    }

    @Then("customized options should be downloaded")
    public void customizedOptionsShouldBeDownloaded() {

        listsPage.isFileDownloaded("customconfig.csv");
    }


    @And("user select save image option")
    public void userSelectSaveImageOption() {
        generalConfigPage.ableSaveImage();
    }

    @Then("the full image should  be saved")
    public void theFullImageShouldBeSaved() {
        reviewPage.asserDownloadImageColumn();

    }

    @And("user goes to lpr_config page")
    public void userGoesToLpr_configPage() {
        generalConfigPage.goesToLprPage();
    }

    @And("user selects save the plate image option")
    public void userSelectsSaveThePlateImageOption() {
        generalConfigPage.selectSavePlateImage();


    }

    @Then("the plate image is  saved")
    public void thePlateImageIsSaved() {
        reviewPage.assertTrueSaveImage();
        Base.waitFor(3
        );
    }

    @And("user selects day radio option")
    public void userSelectsDayRadioOption() {
        generalConfigPage.selectPurgeDaysOption();

    }

    @When("user clicks on add button under general configuration")
    public void userClicksOnAddButtonUnderGeneralConfiguration() {
        generalConfigPage.clickOnAddCustomValue();
    }

    @And("user enters a name into name input field")
    public void userEntersANameIntoNameInputField() {
        generalConfigPage.enterValueName();
    }

    @And("user enters a value into value input field")
    public void userEntersAValueIntoValueInputField() {
        generalConfigPage.enterValue();
    }

    @And("user changes the name of the value")
    public void userChangesTheNameOfTheValue() {
        generalConfigPage.editSavedValueName();

    }

    @And("user changes the value")
    public void userChangesTheValue() {
        generalConfigPage.editSavedValue();
    }

    @And("user clicks on edit button for saved customized value")
    public void userClicksOnEditButtonForSavedCustomizedValue() {
        generalConfigPage.clickOnEditButton();
    }

    @And("user clicks on delete button of desired option")
    public void userClicksOnDeleteButtonOfDesiredOption() {
        generalConfigPage.clickOnDeleteButton();
    }

    @Then("new option should be added")
    public void newOptionShouldBeAdded() {
    }

    @Then("option should be edited")
    public void optionShouldBeEdited() {
    }

    @And("the option should be deleted")
    public void theOptionShouldBeDeleted() {
    }
}
