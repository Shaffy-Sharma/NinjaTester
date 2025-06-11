
Feature: Testing Arrays using different ways


  Scenario: Verify that user is able to navigate to "Data Structures - Introduction" page
    Given The user is in the Home page after logged in
    When The user clicks the "Getting Started" button in Data Structures - Introduction
    Then The user should land in "Data Structures- Introduction Page" 
    
    
  Scenario: Verify that user is able to navigate to "Time Complexity" page
    Given The user is in the "Data Structures - Introduction" page
    When The user clicks "Time Complexity" button
    Then The user should be redirected to "Time Complexity" of Data structures-Introduction
    
      Scenario: Verify that user is able to navigate to "Practice Questions" page
    Given The user is in the "Time Complexity" page
    When The user clicks the "Practice Questions" button
    Then The user should be redirected to "Practice Questions" of Data structures-Introduction
    
      Scenario: Verify that user is able to navigate to "try Editor" page
    Given The user is in the "Time Complexity" page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an try Editor with a Run button to test
