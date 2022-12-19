package com.stepDefinitions;

import com.uiPages.ZktecoLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ZktecoLoginStepDefinitions {
    ZktecoLogin zktecoLogin = new ZktecoLogin();



    @When("user enters camera name")
    public void userEntersCameraName() {
        zktecoLogin.enterUsename();
    }

    @And("user enters camera password")
    public void userEntersCameraPassword() {
        zktecoLogin.enterPassword();
    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() {
        zktecoLogin.clickOnLogin();
    }
}
