$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/generalconfig.feature");
formatter.feature({
  "name": "Checking general configuration options",
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
  "name": "user is on generalconfig page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.GeneralConfigStepDefinitions.userIsGeneralconfigPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the square view option functionality under view option",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@log1"
    }
  ]
});
formatter.step({
  "name": "user clicks on view options",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.GeneralConfigStepDefinitions.userClicksOnViewOptions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects square option",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.GeneralConfigStepDefinitions.userSelectsSquareOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user goes to live page",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.LprConfigStepDefinitions.userGoesToLivePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the results should show as a square box on live page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.GeneralConfigStepDefinitions.theResultsShouldShowAsASquareBoxOnLivePage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});