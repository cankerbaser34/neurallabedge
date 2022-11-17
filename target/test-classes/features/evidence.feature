Feature: Functionality of Evidence camera

  Background:
    Given user is on Evidence Page



  Scenario: Validate that evidence camera can be added
    When user clicks on add button for new evidence camera
    And user enters name of evidence camera
    And user clicks on save button on evidence page



  Scenario: Validate that evidence camera deleted after clicking on delete button
    When user clicks on delete button to delete evidence camera
    And user clicks yes to conform
    Then camera should be delete from the list


  @Evidence
    Scenario: Validate that evidence camera configuration should work with basic authentication

      When user clicks on add button for new evidence camera
      And user enters name of evidence camera
      And user clicks on save button on evidence page
      And user clicks on added element to see details
      And user enters name of the camera in login field
      And user enters password of the camera in password field
      When user selects basic authentication
      And user enters url
      And user sets fps to 4







