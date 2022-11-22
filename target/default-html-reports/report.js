$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/lists.feature");
formatter.feature({
  "name": "Functionality of List page",
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
  "name": "user is on List Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.ListStepDefinitions.userIsOnListPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate that user can add a new action to all plates list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@listnw"
    }
  ]
});
formatter.step({
  "name": "user clicks on all plates list",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.ListStepDefinitions.userClicksOnAllPlatesList()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on action for the list field",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.ListStepDefinitions.userClicksOnActionForTheListField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on add action button",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.ListStepDefinitions.userClicksOnAddActionButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters description of action",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.ListStepDefinitions.userEntersDescriptionOfAction()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects type of action",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.ListStepDefinitions.userSelectsTypeOfAction()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enables the action",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.ListStepDefinitions.userEnablesTheAction()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on save button for new action",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.ListStepDefinitions.userClicksOnSaveButtonForNewAction()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});