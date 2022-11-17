Feature: Checking the functionality of all the action types

  @Auditpage
  Scenario: Check the functionality of exports

    Given user is on audit page of vivotek camera
    When user selects a date for from_date option
    And user selects a data for to_date option
    And user selects export option from tpye section
    And user clicks on search button

  @Auditpage
  Scenario: Check the functionality of history of import type
    Given user is on audit page of vivotek camera
    When user selects a date for from_date option
    And user selects a data for to_date option
    And user selects import option from type section

  @Auditpage
  Scenario: Check the functionality of actions history

    Given user is on audit page of vivotek camera
    When user selects a date for from_date option
    And  user selects action option from tpye section
    And user clicks on search button

  @Auditpage
  Scenario: Check the functionality of Export button for action type
    Given user is on audit page of vivotek camera
    When user selects a date for from_date option
    And user selects a data for to_date option
    And user selects export option from tpye section
    And user clicks on Export button
