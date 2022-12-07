Feature: Functionality of lpr configuration

  Background:
    Given user is on lpr configuration page


  Scenario: Validate that user can change the region and country for lpg config page
    When user enters a region into region section
    And user selects one country or state from that region
    And user clicks on free flow option
    And user clicks on freeflowMotion section
    And user selects none freeflowmotion filter mode
    And user clicks on restart service button
    And user goes to live page
    Then on result panel from live page country or state column should show selected country


  Scenario: Validate that user can select trigger option
    When user clicks on trigger radio button
    And user clicks on restart service button
    And user goes to live page
    Then the mode should be trigger


  Scenario: Validate that user can select freeflow option
    When user clicks on free flow option
    And user clicks on restart service button
    Then the mode on live page should be freeflow


  Scenario: Validate that user  can select motiondetection option
    When user clicks on motionddetection option
    And user clicks on restart service button
    And user goes to live page
    Then the mode on live page should be motiondetection


  Scenario: Validate that user can select 1280*720 resolutions
    When user clicks on 1280*720 resolutions
    And user clicks on freeflowMotion section
    And user selects none freeflowmotion filter mode
    And user clicks on restart service button
    And user goes to live page
    Then camera read plates consistently

    # validation step is missing

  Scenario: Validate that user can select 1920*1080 resolution
    When user clicks on 1920x1080 resolutions
    And user clicks on freeflowMotion section
    And user selects none freeflowmotion filter mode
    And user clicks on restart service button
    And user goes to live page
    Then camera read plates consistently

  @test
  Scenario: Validate that camera can work with close/slow application distance option
    When user selects closeslow application distance option
    And user clicks on freeflowMotion section
    And user selects none freeflowmotion filter mode
    And user clicks on restart service button
    And user goes to live page
    Then camera read plates consistently


  @test
  Scenario: Validate that camera can work with close/fast application distance option
    When user selects closefast application distance option
    And user clicks on freeflowMotion section
    And user selects none freeflowmotion filter mode
    And user clicks on restart service button
    And user goes to live page
    Then camera read plates consistently


  Scenario: Validate that camera can work with far/slow application distance option
    When user selects farslow application distance option
    And user clicks on freeflowMotion section
    And user selects none freeflowmotion filter mode
    And user clicks on restart service button
    And user goes to live page
    Then camera read plates consistently

  Scenario: Validate that camera can work with far/fast application distance option
    When user selects farfast application distance option
    And user clicks on freeflowMotion section
    And user selects none freeflowmotion filter mode
    And user clicks on restart service button
    And user goes to live page
    Then camera read plates consistently

    # Apllication distance should be added here
    # validation step is missing

  Scenario: Validate the functionality of resetROI button
    When user clicks on ShowROI section
    And user clicks on ResetROI  button
    And user clicks on restart service button
    And user goes to live page
    And user selects showRoi status checkbox
    Then the roi should be removed


  Scenario: Validate that the lane can be set
    When user clicks on ShowLanes section
    And user clicks on DeleteLanes  button
    And user draws a lane on the image
    Then the lane should be set and appear on live page when show lane option is selected


    # validation step is missing
  Scenario: Validate the functionality of DeleteLanes button
    When user clicks on ShowLanes section
    And user clicks on DeleteLanes  button
    And user clicks on restart service button
    Then the roi should be removed

    # Add cross line detection here, first learn how it works
    # validation step is missing
  Scenario:Validate that plates can be read with minimum character high configuration
    When user clicks on expert options field
    And user enter 13 in minimum character height field
    And user clicks on restart service button

    # validation step is missing
  Scenario: Validate that plates can be read with maximum character configuration
    When user clicks on expert options field
    And user enter 80 in maximum character height field
    And user clicks on restart service button

    # validation step is missing
  Scenario: Validate that camera can read the plates with 80 minimum confidence value
    When user clicks on expert options field
    And user enters 80 in minimum confidence field
    And user clicks on restart service button


   # validation step is missing
  Scenario: Validate that camera can read the plates after activating and setting angle filter options
    When user clicks on expert options field
    And user clicks enable angle filter checkbox
    And user set angle filter minimum to minus 20
    And user set angel filter maximum to 20

    # validation step is missing


  Scenario: Validate that user can configure trigger options from lpr configuration
    When user clicks on trigger options
    And user enters a value into trigger captures
    And user set trigger timeout
    And user selects IO port


  Scenario: Validate that camera can read plates with none option for freeflow/motion filter mode
    When user clicks on freeflowMotion section
    And user selects none freeflowmotion filter mode
    And user clicks on restart service button
    Then camera read plates consistently


  Scenario: Validate that camera can read plates with captures option for freeflow/motion filter mode
    When user clicks on freeflowMotion section
    And user selects captures filter mode
    And user clicks on restart service button
    Then camera read plates consistently


  Scenario: Validate that camera can read plates with time option for freeflow/motion filter mode
    When user clicks on freeflowMotion section
    And user selects time filter mode
    And user set filter time to "7000" ms
    And user clicks on restart service button
    Then camera read plates consistently


  Scenario: Validate that the direction options after enabling
    When user clicks on direction section
    And user enables compute traffic direction option
    Then the direction column should show directions

