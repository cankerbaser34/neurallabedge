package com.stepDefinitions;

import com.uiPages.EvidencePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EvidenceStepDefinitions {

    EvidencePage evidencePage = new EvidencePage();

    @Given("user is on Evidence Page")
    public void userIsOnEvidencePage() {

        evidencePage.navToEvidencePage();
    }

    @When("user clicks on add button for new evidence camera")
    public void userClicksOnAddButtonForNewEvidenceCamera() {

        evidencePage.clickOnAddButton();
    }

    @And("user enters name of evidence camera")
    public void userEntersNameOfEvidenceCamera() {
        evidencePage.enterEvidenceCamName();
    }

    @And("user clicks on save button on evidence page")
    public void userClicksOnSaveButtonOnEvidencePage() {
        evidencePage.clickSaveButton();
    }

    @And("user clicks on added element to see details")
    public void userClicksOnAddedElementToSeeDetails() {

        evidencePage.clickOnSavedCamera();
    }

    @And("user clicks on delete button to delete evidence camera")
    public void userClicksOnDeleteButtonToDeleteEvidenceCamera() {
        evidencePage.clickToDeleteEvidence();

    }

    @And("user clicks yes to conform")
    public void userClicksYesToConform() {
        evidencePage.clickYesToDelete();
    }

    @Then("camera should be delete from the list")
    public void cameraShouldBeDeleteFromTheList() {


    }


    @And("user enters name of the camera in login field")
    public void userEntersNameOfTheCameraInLoginField() {

        evidencePage.enterNameOfEvidenceCamera();

    }

    @And("user enters password of the camera in password field")
    public void userEntersPasswordOfTheCameraInPasswordField() {
        evidencePage.enterPasswordOfCamera();

    }

    @When("user selects basic authentication")
    public void userSelectsBasicAuthentication() {
        evidencePage.selectBasicAut();
    }

    @And("user enters url")
    public void userEntersUrl() {
        evidencePage.enterUrlofCamera();
    }

    @And("user sets fps to {int}")
    public void userSetsFpsTo(int arg0) {
        evidencePage.setFps();
    }
}
