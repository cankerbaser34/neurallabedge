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
    When user clicks on save button
    Then the action should be saved


  @lists1
  Scenario Outline:Validate that user can add a new action to all plate list
    And user clicks on all plates list
    When user clicks on action for the list field
    And user clicks on add button
    And user enters '<action_descript>'
    And user selects '<action_type>'
    And user enables the action
    When user clicks on save button
    Then the action should be saved

    Examples:
      | action_descript        | action_type     |
      | socket_client          | Socket client   |
      | socket_server          | Socket server   |
      | onvif_event            | Onvif event     |
      | IO_action              | IO              |
      | FTP_action             | FTP             |
      | HTTP_action            | HTTP            |
      | VAST2_action           | VAST2           |
      | Trigger_action         | Trigger server  |
      | Wiegand_vivotek_action | Wiegand Vivotek |
      | email_action           | EMAIL           |
      | Protocol_pss_action    | Protocol PSS    |
      | Twin_camera_action     | Twin Camera     |


  Scenario: Validate the functionality of delete button for an action
    When user clicks on all plates list
    And user clicks on action for the list field
    And user clicks on delete button to delete desired action
    And user clicks on yes button to delete


  Scenario: Validate that user can import xml/css action file
    When user clicks on all plates list
    And user clicks on action for the list field
    And user clicks on select import XMLCSV file button


  Scenario: Validate the functionality of exportToCSVfile button under action
    When user clicks on all plates list
    And user clicks on action for the list field
    And user clicks on exports exports to CSV file button
    Then configured actions should be downloaded as csv file


  Scenario: Validate the functionality of exportToXMLfile button under action
    When user clicks on all plates list
    And user clicks on action for the list field
    And user clicks on Export_to_xml_file button under action section
    Then configured actions should be downloaded as xml file

  Scenario: Validate the functionality of exporttoCsvfile button under exports for the list
    When user clicks on all plates list
    And user clicks on exports for the list section
    And user clicks on Export to Csv file button under exports section
    Then exports should be downloaded


  Scenario: Validate the functionality of exportoxmlfile button under exports for the list
    When user clicks on all plates list
    And user clicks on exports for the list section
    And user clicks on Export_to_xml_file button under exports section
    Then export file should be downloaded


  Scenario: Validate the functionality of adding ftp matching type
    When user clicks on all plates list
    And user clicks on exports for the list section
    And user clicks on add button for export type
    And user enters description of export
    And user selects type of export type
    And user selects interval type
    And user activates the export
    And user clicks on save button
    And user clicks on interval section to open export properties
    And user enters host api
    And user enters port number
    And user selects format type
    And user enters folder name
    And user enters username
    And user enters password
    Then the export should arrive to its destination


  Scenario: Validate the functionality of deleting exports for all list
    When user clicks on all plates list
    And user clicks on exports for the list section
    And user clicks on delete button for exports for all list
    And user clicks on yes button to delete


  Scenario: Validate that user can add ftp import to all plate list
    When user clicks on all plates list
    And user clicks on imports for the list part
    And user clicks on add button to create and ftp list import
    And user enters description of  import
    And user enters ftp list import type
    And user selects the interval
    And user selects active type of import
    And user clicks on save button
    And user clicks on created list to configure
    And user enters host name of the ftp list
    And user enters port of the ftp list of import
    And user enters folder name of ftp list of import
    And users user of ftp list of import
    And user enters password of ftp list of import
    And user selects ftp type


  Scenario: Validate the functionality  of delete button for import lists
    When user clicks on all plates list
    And user clicks on imports for the list part
    And user clicks on delete button for imports all list
    And user clicks on yes button to delete


  Scenario: Validate the functionality of selectimportfile option
    When user clicks on all plates list
    And user clicks on imports for the list part
    And user clicks on selectImportfile button


