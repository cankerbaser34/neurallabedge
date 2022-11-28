Feature: Functionality of List page


  Background:
    Given user is on List Page


  Scenario: Validate that the new list can be added.
    And user clicks on add button for new list
    And user enters name of new list
    And user enters Levenshtein distance
    And user clicks on save button
    Then the new list should be added and appears among the lists


  Scenario: Validate the functionality of edit option for created list
    When user clicks on edit button on created list
    And user changes name of the list
    And user changes Levenshtein distance
    And user clicks on save page
    Then name and Levenshtein distance should be changed


  Scenario: Validate the functionality of delete option for created list
    When user clicks on delete button
    And user clicks on yes button to delete
    Then the list should be deleted from the list


  Scenario: Validate the functionality of downloading list items
    When user clicks on Export_all_data button
    Then the lists should be downloaded

    # Verifying step is missing, other fields except plate should be added to step definitions

  Scenario: Validate the functionality of adding a licence plate to lists
    And user clicks on add button for new list
    And user enters name of new list
    And user enters Levenshtein distance
    And user clicks on save button
    When user clicks on test list
    And user clicks on List of licence plates section
    And user clicks on add button
    And user enters newplate in input field
    And user clicks save button for newplate



    # verifing step is missing

    Scenario: Validate  the  functionality of delete option for saved plate under new list
      When user clicks on test list
      And user clicks on List of licence plates section
      And user clicks on delete button to delete new plate
      And user clicks yes to confirm deleting saved plate
      Then user should be deleted from the list




Scenario: Validate that user can add a new action to all plates list

  When user clicks on all plates list
  And user clicks on action for the list field
  And user clicks on add action button
  And user enters description of action
  And user selects type of action
  And user enables the action
  When user clicks on save button for new action

