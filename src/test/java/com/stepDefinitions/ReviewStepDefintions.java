package com.stepDefinitions;

import com.uiPages.Base;
import com.uiPages.ReviewPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReviewStepDefintions {

    ReviewPage reviewPage = new ReviewPage();

    @Given("user is on review page")
    public void userIsOnReviewPage() {

        reviewPage.navToReview();
    }

    @When("user clicks on search button of review page")
    public void userClicksOnSearchButtonOfReviewPage() {

        reviewPage.clickSearch();
        Base.waitFor(3);

    }

    @Then("all the saved plates should appear on result panel")
    public void allTheSavedPlatesShouldAppearOnResultPanel() {

        reviewPage.validateRowTables();
    }

    @When("user enters a plate number in plate field")
    public void userEntersAPlateNumberInPlateField() {
        reviewPage.enterPlateNumber();


    }

    @Then("plate should appear on result panel")
    public void plateShouldAppearOnResultPanel() {


    }

    @When("user clicks on show num register menu")
    public void userClicksOnShowNumRegisterMenu() {
        reviewPage.openNumRegisterMenu();

    }

    @And("it selects for {int} option")
    public void itSelectsForOption(int arg0) {
        reviewPage.select20Register();

    }

    @Then("{int} registers should appear on result panel")
    public void registersShouldAppearOnResultPanel(int arg0) {
        reviewPage.assertResults20();
    }

    @And("it selects for fifty option")
    public void itSelectsForFiftyOption() {
        reviewPage.select50Register();
    }

    @Then("fifty registers should appear on result panel")
    public void fiftyRegistersShouldAppearOnResultPanel() {

        reviewPage.assertResult50();

    }

    @And("it selects for hundred option")
    public void itSelectsForHundredOption() {
        reviewPage.select100Register();
    }

    @Then("hundred registers should appear on result panel")
    public void hundredRegistersShouldAppearOnResultPanel() {

        reviewPage.assertResult100();

    }

    @And("user clicks on Export button to download all plates between given time period")
    public void userClicksOnExportButtonToDownloadAllPlatesBetweenGivenTimePeriod() {
        reviewPage.clickExportButton();

    }

    @Then("the plates list should be downloaded")
    public void thePlatesListShouldBeDownloaded() {


    }

    @When("user clicks on direction dropdown button to see direction options")
    public void userClicksOnDirectionDropdownButtonToSeeDirectionOptions() {
        reviewPage.openDirectionSection();
    }

    @And("user selects coming direction")
    public void userSelectsComingDirection() {
        reviewPage.selectComingDirection();
    }


    @Then("all the results direction should be coming")
    public void allTheResultsDirectionShouldBeComing() {
    }


    @And("user selects no direction option")
    public void userSelectsNoDirectionOption() {
        reviewPage.selectNodirectionOption();

    }

    @Then("all the results direction should be no direction")
    public void allTheResultsDirectionShouldBeNoDirection() {

    }

    @And("user selects going option")
    public void userSelectsGoingOption() {

        reviewPage.selectGoingDirection();

    }

    @Then("all the results direction should be going")
    public void allTheResultsDirectionShouldBeGoing() {

    }

    @When("user clicks on list section")
    public void userClicksOnListSection() {

        reviewPage.openListSection();

    }

    @And("user selects ALLOWLIST option")
    public void userSelectsALLOWLISTOption() {

    }

    @Then("all the plates listed should be from ALLOWLIST")
    public void allThePlatesListedShouldBeFromALLOWLIST() {
    }

    @And("user selects not in the list option")
    public void userSelectsNotInTheListOption() {

    }

    @Then("all the plates listed should be from not_inthe_list")
    public void allThePlatesListedShouldBeFromNot_inthe_list() {

    }

    @And("user selects BLOCKLIST option")
    public void userSelectsBLOCKLISTOption() {

    }

    @Then("all the plates listed should be from BLOCKLIST")
    public void allThePlatesListedShouldBeFromBLOCKLIST() {
    }
}
