package com.stepDefinitions;

import com.uiPages.LivePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LiveStepDefinitions {
    LivePage livePage = new LivePage();

    @Given("user is on live page")
    public void userIsOnLivePage() {
    }

    @When("user unselect show plates checkbox")
    public void userUnselectShowPlatesCheckbox() {
        livePage.clickOnShowPlate();
    }

    @Then("info panel background should change and it stops showing the results")
    public void infoPanelBackgroundShouldChangeAndItStopsShowingTheResults() {
        livePage.assertResultPanelChanging();
    }

    @When("user unselect show status  checkbox")
    public void userUnselectShowStatusCheckbox() {
        livePage.clickOnstatus();
    }

    @Then("info panel background should change and it stops updating")
    public void infoPanelBackgroundShouldChangeAndItStopsUpdating() {
        livePage.assertInfoPanelChanging();
    }

    @When("user selects showRoi status checkbox")
    public void userSelectsShowRoiStatusCheckbox() {

        livePage.clickOnShowRoi();
    }

    @Then("NO Roi do display message should not appear on live page")
    public void noRoiDoDisplayMessageShouldNotAppearOnLivePage() {

        livePage.assertPopUpforRoi();
    }

    @When("user selects showlanes checkbox")
    public void userSelectsShowlanesCheckbox() {
        livePage.clickOnShowLanes();
    }

    @Then("lane set before should appear on the live stream")
    public void laneSetBeforeShouldAppearOnTheLiveStream() {

    }


    @When("user selects calibration pattern")
    public void userSelectsCalibrationPattern() {
        livePage.clickOnCallibration();
    }

    @Then("patterns should appear on live streaming")
    public void patternsShouldAppearOnLiveStreaming() {
    }


    @When("user clicks on language section to select a language")
    public void userClicksOnLanguageSectionToSelectALanguage() {

        livePage.clickOnLanguageDropDown();

    }

    @And("user selects Spanish")
    public void userSelectsSpanish() {

        livePage.selectSpanish();

    }

    @Then("the language should be Spanish")
    public void theLanguageShouldBeSpanish() {
        livePage.AssertSpanishLanguage();

    }


}
