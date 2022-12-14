package com.stepDefinitions;

import com.uiPages.AuditVivotek;
import com.uiPages.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuditStepDefinitions {

    AuditVivotek auditVivotek = new AuditVivotek();


    @Given("user is on audit page of vivotek camera")
    public void userIsOnAuditPageOfVivotekCamera() {
        auditVivotek.goToHomePage();
    }

    @When("user selects a date for from_date option")
    public void userSelectsADateForFrom_dateOption() {
        auditVivotek.enterDatetoFromdate();
    }

    @And("user selects a data for to_date option")
    public void userSelectsADataForTo_dateOption() {
        auditVivotek.enterdatetoTodate();
    }

    @And("user selects export option from tpye section")
    public void userSelectsExportOptionFromTpyeSection() {

    }


    @And("user selects action option from tpye section")
    public void userSelectsActionOptionFromTpyeSection() {

        auditVivotek.selectAction();
        Base.waitFor(3);
    }

    @And("user selects import option from type section")
    public void userSelectsImportOptionFromTypeSection() {
        auditVivotek.selectImport();
    }


    @And("user clicks on search button")
    public void userClicksOnSearchButton() {
        auditVivotek.clickSearchButton();
    }

    @And("user clicks on Export button")
    public void userClicksOnExportButton() {
        auditVivotek.exportExports();

    }


    @And("user clicks on numbregister dropdown option")
    public void userClicksOnNumbregisterDropdownOption() {
    }

    @And("user selects {int} page options from show number registers")
    public void userSelectsPageOptionsFromShowNumberRegisters(int arg0) {
    }

    @Then("twenty action register should appear on result panel")
    public void twentyActionRegisterShouldAppearOnResultPanel() {
    }

    @Then("{int} register should appear on result panel")
    public void registerShouldAppearOnResultPanel(int arg0) {
    }

    @And("user clicks on last page button")
    public void userClicksOnLastPageButton() {
        auditVivotek.clickOnLastPageButton();
    }

    @Then("the last actions should appear on the page")
    public void theLastActionsShouldAppearOnThePage() {

    }

    @And("user clicks on next page button")
    public void userClicksOnNextPageButton() {
        auditVivotek.clickOnNextPageButton();
    }

    @Then("the next page should appear")
    public void theNextPageShouldAppear() {
    }

    @And("user clicks on previous button")
    public void userClicksOnPreviousButton() {
        auditVivotek.clickOnPreviousPage();
    }

    @Then("the previous page should appear")
    public void thePreviousPageShouldAppear() {
    }

    @And("user rights click on id column")
    public void userRightsClickOnIdColumn() {
        AuditVivotek.rightClickOnIdcolumn();
    }

    @And("user  clicks on sort decending")
    public void userClicksOnSortDecending() {
        auditVivotek.clickOnSortDescending();

    }
}
