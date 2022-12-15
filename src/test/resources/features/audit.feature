Feature: Checking the functionality of all the action types

  Background:
    Given user is on audit page of vivotek camera

  @Auditpage
  Scenario: Check the functionality of exports
    When user selects a date for from_date option
    And user selects a data for to_date option
    And user selects export option from tpye section
    And user clicks on search button
    Then 10 register should appear on result panel

  @Auditpage12
  Scenario: Validate that  after selection 20 from show num registers,  number of list should be 20 for actions
    When user selects a date for from_date option
    And user selects a data for to_date option
    And user clicks on show num register menu
    And it selects for 20 option
    And  user selects action option from tpye section
    And user clicks on search button
    Then 20 registers should appear on result panel


  @Auditpage
  Scenario: Validate that  after selection 50 from show num registers,  number of list should be 50 for actions
    When user selects a date for from_date option
    And user selects a data for to_date option
    And user clicks on show num register menu
    And it selects for fifty option
    And  user selects action option from tpye section
    And user clicks on search button
    Then fifty registers should appear on result panel

  @Auditpage
  Scenario: Validate that  after selection 100 from show num registers,  number of list should be 100 for actions
    When user selects a date for from_date option
    And user selects a data for to_date option
    And user clicks on show num register menu
    And it selects for hundred option
    And  user selects action option from tpye section
    And user clicks on search button
    Then hundred registers should appear on result panel

  @Auditpage
  Scenario: Validate that  after selection 20 from show num registers,  number of list should be 20 for exports
    When user selects a date for from_date option
    And user selects a data for to_date option
    And user clicks on show num register menu
    And it selects for 20 option
    And  user selects export option from tpye section
    And user clicks on search button
    Then 20 registers should appear on result panel

  @Auditpage
  Scenario: Validate that  after selection 50 from show num registers,  number of list should be 50 for exports
    When user selects a date for from_date option
    And user selects a data for to_date option
    And user clicks on show num register menu
    And it selects for fifty option
    And  user selects export option from tpye section
    And user clicks on search button
    Then fifty registers should appear on result panel

  @Auditpage
  Scenario: Validate that  after selection 100 from show num registers,  number of list should be 100 for exports
    When user selects a date for from_date option
    And user selects a data for to_date option
    And user clicks on show num register menu
    And it selects for hundred option
    And  user selects export option from tpye section
    And user clicks on search button
    Then hundred registers should appear on result panel


  @Auditpage
  Scenario: Check the functionality of history of import type
    When user selects a date for from_date option
    And user selects a data for to_date option
    And user selects import option from type section

  @Auditpage
  Scenario: Check the functionality of actions history
    When user selects a date for from_date option
    And  user selects action option from tpye section
    And user clicks on search button


  Scenario: Validate the functionality of Export button for action type
    When user selects a date for from_date option
    And user selects a data for to_date option
    And user selects action option from tpye section
    And user clicks on Export button


  Scenario: Validate the functionality of export button for export type
    When user selects export option from tpye section
    And user clicks on search button
    And user clicks on Export button


  Scenario: Validate the functionality of export button for import
    When user selects import option from type section
    And user clicks on search button
    And user clicks on Export button


  Scenario: Validate the functionality of last page button
    When user selects action option from tpye section
    And user clicks on search button
    And user clicks on last page button
    Then the last actions should appear on the page


  Scenario: Validate the functionality of next button
    When user selects action option from tpye section
    And user clicks on search button
    And user clicks on next page button
    Then the next page should appear


  Scenario: Validate the  functionality of previous button
    When user selects action option from tpye section
    And user clicks on search button
    And user clicks on last page button
    And user clicks on previous button
    Then the previous page should appear

  @Auditpage1
  Scenario: Validate the functionality of sort descending on id column
    When user selects action option from tpye section
    And user clicks on search button
    And user rights click on id column
    And user  clicks on sort decending


