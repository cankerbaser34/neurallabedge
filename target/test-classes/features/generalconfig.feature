Feature: Checking general configuration options

  Background:
    Given user is on generalconfig page

    #Expert options  validations start from here
  Scenario: Validate the functionality of save image option under expert option
    When user  clicks on expert option
    And user unselect save image option
    And user clicks on restart service button on GeneralConfig page
    Then the full image should not be saved


  Scenario: Validate the functionality of save the plate image option
    When user  clicks on expert option
    And user unselects save te plate image option
    And user clicks on restart service button on GeneralConfig page
    Then the plate image is not saved


  Scenario: Validate the functionality of image quality checkbox
    When user  clicks on expert option
    And user enters 80 in imageqality field
    And user clicks on restart service button on GeneralConfig page
    Then the size of saved image should be increased


  Scenario: Validate the functionality of persistent action time option
    When user  clicks on expert option
    And user clicks persistent action time option
    And user clicks on restart service button on GeneralConfig page
    Then persistent action should be selected

  Scenario: Validate the functionality of savedatetime overlay option
    When user  clicks on expert option
    And user clicks savedatetime overlay option
    Then date and time should appear on image from live page

    #View option validations start from here

  Scenario: Validate the list option functionality under view option
    When user clicks on view options
    And user selects view option
    And user goes to live page
    Then the results should show on live page as a list


  Scenario: Validate the square view option functionality under view option
    When user clicks on view options
    And user selects square option
    And user goes to live page
    Then the results should show as a square box on live page


  Scenario: Validate the functionality of Lane option for list field
    When user clicks on view options
    And user selects view option
    And user selects Lane option
    And user goes to live page
    Then on result panel lane column should appear


  Scenario: Validate the functionality of direction option for list field
    When user clicks on view options
    And user selects view option
    And user selects direction option
    And user goes to live page
    Then on result panel  direction column should appear

  Scenario: Validate the functionality of confidence option for list field
    When user clicks on view options
    And user selects view option
    And user selects confidence option
    And user goes to live page
    Then on result panel confidence column should appear


  Scenario: Validate the functionality of height option for list field
    When user clicks on view options
    And user selects view option
    And user selects height option
    And user goes to live page
    Then on result panel height column should appear


  Scenario: Validate the functionality of country option for list field
    When user clicks on view options
    And user selects view option
    And user selects country option
    And user goes to live page
    Then on result panel country column should appear


  Scenario: Validate the functionality of list option for list field
    When user clicks on view options
    And user selects view option
    And user selects list option
    And user goes to live page
    Then on result panel list column should appear


  Scenario: Validate the functionality of Lane option for review field
    When user clicks on view options
    And user selects lane option for review field
    And user goes to review page
    Then Lane column and Lane filter field should appear on Review page


  Scenario: Validate the functionality of Direction option for review filed
    When user clicks on view options
    And user selects direction option for review field
    And user goes to review page
    Then Direction column and Direction filter should appear on review page


  Scenario: Validate the functionality of confidence option for review filed
    When user clicks on view options
    And user selects confidence option for review field
    And user goes to review page
    Then confidence column should appear on review page


  Scenario: Validate the functionality of Height option for review filed
    When user clicks on view options
    And user selects height option for review field
    And user goes to review page
    Then Height column should appear on review page


  Scenario: Validate the functionality of Country option for review filed
    When user clicks on view options
    And user selects country option for review field
    And user goes to review page
    Then Country column should appear on review page


  Scenario: Validate the functionality of List option for review filed
    When user clicks on view options
    And user selects list option for review field
    And user goes to review page
    Then List column and List filter should appear on review page


#Log options test scripts start from here

  Scenario: Validate that log level service set to 3

    When user clicks on  logs options
    And user sets log level service to 3
    And user clicks on restart service button on GeneralConfig page
    And user goes to log page
    And user clicks service and Enabled options
    Then logs info filters logs should appear


  Scenario: Validate that log engine option is enabled
    When user clicks on  logs options
    And user clicks on enable engine log option
    And user goes to log page
    And user clicks on engine logs option
    Then the engine logs should appear on the screen


  Scenario: Validate that log level manager is set to 3
    When user clicks on  logs options
    And user sets log level manager to 3
    And user goes to log page
    When user clicks manager logs option
    Then the logs level should be three

    #Purge Options start from here


  Scenario: Validate that purge interval is set to hour
    When user  clicks on purge options
    And user selects hour perge interval option
    And user selects days from type of purge
    And user clicks on restart service button on GeneralConfig page


    # Heartbeat options start from here

  @log1
  Scenario: Validate that hearbeat options works when valid configuration is done with xml type
    When user clicks on heartbeat options
    And user clicks send hearbeat checkbox
    And user sets id for heartbox
    And user sets timing in seconds field
    And user sets IP input filed
    And user sets Port input field
    And user selects type of heartbeat option
    And user clicks on restart service button on GeneralConfig page


  @log1
  Scenario: Validate that hearbeat options works when valid configuration is done with xml json type
    When user clicks on heartbeat options
    And user clicks send hearbeat checkbox
    And user sets id for heartbox
    And user sets timing in seconds field
    And user sets IP input filed
    And user sets Port input field
    And user selects json type of heartbeat option
    And user clicks on restart service button on GeneralConfig page


  Scenario: Validate upload file option under maintenance option
    When user clicks on maintenance option
    And user clicks on upload file button
    And user selects any file to upload


  Scenario: Validate the functionality of revert last file button
    When user clicks on maintenance option
    And user clicks on revert last file button
    Then the last files should be reverted


  Scenario: Validate the content of show info button
    When user clicks on maintenance option
    And user clicks on show info button
    Then the version and mac adress should be seen


  Scenario: Validate  functionality of reset the database button
    When user clicks on maintenance option
    And user clicks on show info button
    And the version and mac adress should be seen
    And user closes info section
    And user clicks on reset data base button
    And user enters the mac address as password
    And user clicks on yes button
    Then the data base will be  cleared


  Scenario: Validate functionality of reset counters button button
    When user clicks on maintenance option
    And user clicks on show info button
    And the version and mac adress should be seen
    And user closes info section
    And user clicks on reset counters button
    And user enters the mac address as password into resetcounters field
    Then user clicks on yes button
    Then ANPR counters will be reset


  Scenario: Validate functionality of export general config button
    When user clicks on maintenance option
    And user clicks on export general config button
    Then general config file should be downloaded


    # File is downloaded the right path but it should fail when file name is wrong modify this.

  Scenario: Validate functionality of export data base button
    When user clicks on maintenance option
    And user clicks export database button
    Then database should be downloaded


  Scenario: Validate the functionality of export VPAR config button
    When user clicks on maintenance option
    And user clicks on export VPAR config button
    Then vpar config should be downloaded


  Scenario: Validate the functionality of ExportToCsvfile button under Customized Options
    When user clicks on Customized options section
    And user clicks on Export to Csv file button
    Then customized options should be downloaded





