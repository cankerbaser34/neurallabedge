package com.stepDefinitions;

import com.uiPages.AuditVivotek;
import com.uiPages.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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


}
