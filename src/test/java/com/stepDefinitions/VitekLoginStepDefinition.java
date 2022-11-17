package com.stepDefinitions;

import com.uiPages.LoginVivotek;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VitekLoginStepDefinition {

    LoginVivotek login = new LoginVivotek();

    @Given("customer  is on home page")
    public void customerIsOnHomePage() {
        login.enterVivotekCamera();

    }


}
