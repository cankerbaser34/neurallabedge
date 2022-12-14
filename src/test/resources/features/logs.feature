Feature: Different type of logs and their functionality

  Scenario: Validate service logs functionality

    Given user is on home page  of vivotek camera
    When user clicks service and Enabled options
    Then the logs should appear on logs screen



  Scenario: Validate manager logs functionality
    Given user is on home page  of vivotek camera
    When user clicks manager logs option
    Then the manager logs should appear on the screen

  Scenario: Validate engine logs functionality
    Given user is on home page  of vivotek camera
    When user clicks on engine logs option
    Then the engine logs should appear on the screen



  Scenario: Validate clearlogs option for manager logs
    Given user is on home page  of vivotek camera
    When user clicks manager logs option
    And user clicks on clearlogs button

  Scenario: Validate clearlogs option for service logs
    Given user is on home page  of vivotek camera
    When user clicks service and Enabled options
    And user clicks on clearlogs button


  Scenario: Validate clearlogs option for Engine logs
    Given user is on home page  of vivotek camera
    When user clicks on engine logs option
    And user clicks on clearlogs button

  @logs
  Scenario: Validate download manager logs when autorefresh option is disabled
    Given user is on home page  of vivotek camera
    When user clicks manager logs option
    And user clicks on downloadlogs button
    Then the logs should be downloaded



