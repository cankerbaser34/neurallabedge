Feature:  functionality of review page


  Background:
    Given user is on review page

  @Reviewpage
  Scenario: Validate that search button works with  default 'from_date' and 'to_date' option
    When user clicks on search button of review page
    Then all the saved plates should appear on result panel


  Scenario: Validate that search option works for a specific plate
    When user enters a plate number in plate field
    And user clicks on search button of review page
    Then plate should appear on result panel

  @Reviewpage
  Scenario: Validate that  after selection 20 from show num registers,  number of list should be 20
    When user clicks on show num register menu
    And it selects for 20 option
    And user clicks on search button of review page
    Then 20 registers should appear on result panel

  @Reviewpage
  Scenario: Validate that  after selection 50 from show num registers,  number of list should be 50
    When user clicks on show num register menu
    And it selects for fifty option
    And user clicks on search button of review page
    Then fifty registers should appear on result panel

  @Reviewpage
  Scenario: Validate that  after selection 100 from show num registers,  number of list should be 100
    When user clicks on show num register menu
    And it selects for hundred option
    And user clicks on search button of review page
    Then hundred registers should appear on result panel

  Scenario: Validate the functionality of export button to download the list of plates.
    When user clicks on search button of review page
    And user clicks on Export button to download all plates between given time period
    Then the plates list should be downloaded


  Scenario: Validate the functionality of not_inthe_list filter under list section
    When user clicks on list section
    And user selects not in the list option
    Then all the plates listed should be from not_inthe_list


  Scenario: Validate the functionality of ALLOWLIST  filter under list section
    When user clicks on list section
    And user selects BLOCKLIST option
    Then all the plates listed should be from BLOCKLIST


  Scenario: Validate the functionality of ALLOWLIST  filter under list section
    When user clicks on list section
    And user selects ALLOWLIST option
    Then all the plates listed should be from ALLOWLIST


  Scenario: Validate the functionality coming filter option under direction section.
    When user clicks on direction dropdown button to see direction options
    And user selects coming direction
    And user clicks on search button of review page
    Then all the results direction should be coming


  Scenario:  Validate the functionality of no direction filter under direction section.
    When user clicks on direction dropdown button to see direction options
    And user selects no direction option
    And user clicks on search button of review page
    Then all the results direction should be no direction


  Scenario:  Validate the functionality of no direction filter under direction section.
    When user clicks on direction dropdown button to see direction options
    And user selects going option
    And user clicks on search button of review page
    Then all the results direction should be going


