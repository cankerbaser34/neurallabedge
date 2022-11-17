package com.stepDefinitions;

import com.uiPages.Base;
import com.uiPages.LoginVivotek;
import com.uiPages.Logs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogsStepDefinitions {

    Logs logs = new Logs();
    LoginVivotek login = new LoginVivotek();

    @Given("user is on home page  of vivotek camera")
    public void user_is_on_home_page_of_vivotek_camera() {
        logs.navto_logs();
    }

    @When("user clicks service and Enabled options")
    public void userClicksServiceAndEnabledOptions() {
        logs.clickServiceRadio();
        logs.clickEnabled();
    }

    @Then("the logs should appear on logs screen")
    public void theLogsShouldAppearOnLogsScreen() {

    }


    @When("user clicks manager logs option")
    public void userClicksManagerLogsOption() {
        logs.clickManagerRadio();
    }

    @Then("the manager logs should appear on the screen")
    public void theManagerLogsShouldAppearOnTheScreen() {
    }

    @When("user clicks on engine logs option")
    public void userClicksOnEngineLogsOption() {
        logs.clickEngine();
        logs.clickEnabled();

    }

    @Then("the engine logs should appear on the screen")
    public void theEngineLogsShouldAppearOnTheScreen() {
        
    }

    @And("user clicks on clearlogs button")
    public void userClicksOnClearlogsButton() {
        logs.clearLogs();
    }

    @And("user clicks on downloadlogs button")
    public void userClicksOnDownloadlogsButton() {

        logs.downloadLogs();

    }

}
