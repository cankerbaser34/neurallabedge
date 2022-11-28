Feature: Live page functionality

  Background:
    Given user is on live page


  Scenario: Validate that camera is reading plates after installing the new packages and doing correct configuration

  Scenario: Validate that result panel stops showing plates when show plates option unselected
    When user unselect show plates checkbox
    Then info panel background should change and it stops showing the results

  @live
  Scenario: Validate that info panel stops updating results when show status option unselected
    When user unselect show status  checkbox
    Then info panel background should change and it stops updating



  Scenario: Validate that the ROI section appears when showroi option is selected
    Given user is on live page
    When user selects showRoi status checkbox
    Then NO Roi do display message should not appear on live page


  Scenario: Validate that lane appears on live streaming when showlane option is selected
    When user selects showlanes checkbox
    Then lane set before should appear on the live stream

  @live12
  Scenario: Validate that patterns on live stream appears when calibrationpattern option is selected
    When user selects calibration pattern
    Then patterns should appear on live streaming

  @live
  Scenario: Validate that user can change language of the page
    When user clicks on language section to select a language
    And user selects Spanish
    Then the language should be Spanish

    # This scenario revised again.

  Scenario: Validate that functionality of crossline checkbox
    Given user is on live page
