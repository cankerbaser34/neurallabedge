package com.stepDefinitions;

import com.uiPages.LoginVicon;
import io.cucumber.java.en.Given;

public class ViconLoginStepDefinitions {

    LoginVicon loginVicon = new LoginVicon();

    @Given("user is on homepage of vicon camera")
    public void userIsOnHomepageOfViconCamera() {

        loginVicon.navToCameraHome();



    }


}
