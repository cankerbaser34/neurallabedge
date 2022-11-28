package com.stepDefinitions;

import com.uiPages.LprconfigPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LprConfigStepDefinitions {
    LprconfigPage lprconfigPage = new LprconfigPage();

    @Given("user is on lpr configuration page")
    public void userIsOnLprConfigurationPage() {
        lprconfigPage.navToLpgConfigPage();
    }

    @When("user enters a region into region section")
    public void userEntersARegionIntoRegionSection() {
        lprconfigPage.changeRegion("Europe");

    }

    @And("user selects one country or state from that region")
    public void userSelectsOneCountryOrStateFromThatRegion() {
        lprconfigPage.selectCountryforRegion("Spain");
    }

    @And("user clicks on restart service button")
    public void userClicksOnRestartServiceButton() {
        lprconfigPage.clickRestartService();
    }

    @Then("on result panel from live page country or state column should show selected country")
    public void onResultPanelFromLivePageCountryOrStateColumnShouldShowSelectedCountry() {
        lprconfigPage.assertChangeRegion("Spain");
    }

    @When("user clicks on trigger radio button")
    public void userClicksOnTriggerRadioButton() {
        lprconfigPage.selectTriggerOption();
    }

    @When("user clicks on free flow option")
    public void userClicksOnFreeFlowOption() {
        lprconfigPage.selectFreeflow();

    }

    @When("user clicks on motionddetection option")
    public void userClicksOnMotionddetectionOption() {
        lprconfigPage.selectMotionDetection();
    }

    @When("user clicks on {int}*{int} resolutions")
    public void userClicksOnResolutions(int arg0, int arg1) {
        lprconfigPage.selectLowResolutions();
    }

    @When("user clicks on {int}x{int} resolutions")
    public void userClicksOnXResolutions(int arg0, int arg1) {
        lprconfigPage.selectHighResolution();
    }

    @When("user clicks on ShowROI section")
    public void userClicksOnShowROISection() {
        lprconfigPage.opensShowROISection();
    }

    @And("user clicks on ResetROI  button")
    public void userClicksOnResetROIButton() {
        lprconfigPage.clickOnResetRoi();
    }

    @Then("the roi should be removed")
    public void theRoiShouldBeRemoved() {

    }

    @When("user clicks on ShowLanes section")
    public void userClicksOnShowLanesSection() {
        lprconfigPage.openShowLanesSection();
    }

    @And("user clicks on DeleteLanes  button")
    public void userClicksOnDeleteLanesButton() {
        lprconfigPage.clickOnDeleteLanes();
    }

    @When("user clicks on expert options field")
    public void userClicksOnExpertOptionsField() {
        lprconfigPage.openExpertSection();
    }

    @And("user enter {int} in minimum character height field")
    public void userEnterInMinimumCharacterHeightField(int arg0) {
        lprconfigPage.enterMinValueCharHeight();

    }

    @And("user enter {int} in maximum character height field")
    public void userEnterInMaximumCharacterHeightField(int arg0) {
        lprconfigPage.enterMaximumCharacterHeight();
    }

    @And("user enters {int} in minimum confidence field")
    public void userEntersInMinimumConfidenceField(int arg0) {
        lprconfigPage.enterMinimumConfidenceValue();

    }

    @And("user clicks enable angle filter checkbox")
    public void userClicksEnableAngleFilterCheckbox() {
        lprconfigPage.enableAngleFilter();
    }

    @And("user set angle filter minimum to minus {int}")
    public void userSetAngleFilterMinimumToMinus(int arg0) {
        lprconfigPage.setAngelFilterMinimum();
    }

    @And("user set angel filter maximum to {int}")
    public void userSetAngelFilterMaximumTo(int arg0) {
        lprconfigPage.setAngleFilterMax();
    }

    @When("user clicks on trigger options")
    public void userClicksOnTriggerOptions() {
        lprconfigPage.opensTriggerSection();
    }

    @And("user enters a value into trigger captures")
    public void userEntersAValueIntoTriggerCaptures() {
        lprconfigPage.setTriggerCaptures();
    }

    @And("user set trigger timeout")
    public void userSetTriggerTimeout() {
        lprconfigPage.setTriggerTimeOut();
    }

    @And("user selects IO port")
    public void userSelectsIOPort() {
        lprconfigPage.selectTriggerIoPort();
    }

    @And("user goes to live page")
    public void userGoesToLivePage() {
        lprconfigPage.userNavtoLivePage();
    }

    @Then("the mode should be trigger")
    public void theModeShouldBeTrigger() {
        lprconfigPage.assertTriggerMode();
    }

    @When("user clicks on direction section")
    public void userClicksOnDirectionSection() {
        lprconfigPage.openVivoDirectionSection();
    }

    @And("user enables compute traffic direction option")
    public void userEnablesComputeTrafficDirectionOption() {
        lprconfigPage.enableComputeTraffDirection();
    }

    @Then("the direction column should show directions")
    public void theDirectionColumnShouldShowDirections() {

    }

    @When("user clicks on freeflowMotion section")
    public void userClicksOnFreeflowMotionSection() {
        lprconfigPage.openFreeFlowOption();
    }

    @And("user selects none freeflowmotion filter mode")
    public void userSelectsNoneFreeflowmotionFilterMode() {
        lprconfigPage.selectNoneFilterMotion();
    }

    @Then("camera read plates consistently")
    public void cameraReadPlatesConsistently() {
    }

    @And("user selects captures filter mode")
    public void userSelectsCapturesFilterMode() {
        lprconfigPage.selectCaptureFilterOption();
    }

    @And("user selects time filter mode")
    public void userSelectsTimeFilterMode() {
        lprconfigPage.setTimeFilterOption();

    }

    @And("user set filter time to {string} ms")
    public void userSetFilterTimeToMs(String arg0) {
        lprconfigPage.setFilterTime();
    }

    @Then("the mode on live page should be freeflow")
    public void theModeOnLivePageShouldBeFreeflow() {
        lprconfigPage.validateFreeflowMode();

    }

    @Then("the mode on live page should be motiondetection")
    public void theModeOnLivePageShouldBeMotiondetection() {
        lprconfigPage.assertMotionDetectionMode();
    }

    @And("user draws a lane on the image")
    public void userDrawsALaneOnTheImage() {
        lprconfigPage.setLane();
    }

    @Then("the lane should be set and appear on live page when show lane option is selected")
    public void theLaneShouldBeSetAndAppearOnLivePageWhenShowLaneOptionIsSelected() {
    }
}
