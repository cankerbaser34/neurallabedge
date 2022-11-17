package com.stepDefinitions;

import com.uiPages.LoginAxis;
import io.cucumber.java.en.Given;


public class AxisLoginStepDefinitions {


    LoginAxis loginAxis = new LoginAxis();

    @Given("user is on homepage of axis camera")
    public void userIsOnHomepageOfAxisCamera() {

        loginAxis.navToHomePage();

    }
}
