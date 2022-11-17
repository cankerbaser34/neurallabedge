$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/evidence.feature");
formatter.feature({
  "name": "Functionality of Evidence camera",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on Evidence Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.EvidenceStepDefinitions.userIsOnEvidencePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate that evidence camera configuration should work with basic authentication",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Evidence"
    }
  ]
});
formatter.step({
  "name": "user clicks on add button for new evidence camera",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.EvidenceStepDefinitions.userClicksOnAddButtonForNewEvidenceCamera()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters name of evidence camera",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.EvidenceStepDefinitions.userEntersNameOfEvidenceCamera()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on save button on evidence page",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.EvidenceStepDefinitions.userClicksOnSaveButtonOnEvidencePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on added element to see details",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.EvidenceStepDefinitions.userClicksOnAddedElementToSeeDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters name of the camera in login field",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.EvidenceStepDefinitions.userEntersNameOfTheCameraInLoginField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password of the camera in password field",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.EvidenceStepDefinitions.userEntersPasswordOfTheCameraInPasswordField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects basic authentication",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.EvidenceStepDefinitions.userSelectsBasicAuthentication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters url",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.EvidenceStepDefinitions.userEntersUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sets fps to 4",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.EvidenceStepDefinitions.userSetsFpsTo(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});