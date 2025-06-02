Feature: Graph Module Functionality

  Background: 
    Given The user has successfully logged in and is on the Home page

  Scenario: Verify that user is able to navigate to 'Graph' data structure page
    When The user clicks the 'Get Started' button in Graph Panel OR selects Graph from the dropdown menu
    Then The user should be directed to 'Graph' Data Structure Page

  Scenario: Verify that user is able to navigate to 'Graph ' page
    Given The user is currently viewing the Graph landing page
    When The user clicks 'Graph ' link
    Then The user should be redirected to 'Graph' page

  Scenario: Verify that user is able to navigate to Try here Editor from Graph
    Given The user accesses the Graph section from the main menu
    When The user clicks 'Try Here' button
    Then The user should be redirected to try editor with Run button

  Scenario: Verify that it prevent the code execution when user clicking Run button without code
    Given The user opens the code editor for the Graph module
    When The user clicks Run without entering code
    Then Prevent code execution when editor is blank

  Scenario: Verify that user receives error for invalid python code
    Given The user is in the code editor screen for Graph
    When The user writes invalid code and clicks Run
    Then The user should see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code
    Given The user is testing valid code in the Graph editor
    When The user writes valid code and clicks Run
    Then The user should see output in the console

  Scenario: Verify that user is able to navigate to 'Graph Representations' page
    Given The user is exploring the Graph topic page
    When The user clicks 'Graph Representations' link
    Then The user should be redirected to 'Graph Representations' page

  Scenario: Verify execution of code in Graph Representations page
    Given The user is on the detailed page for Graph Representations
    When The user clicks 'Try Here' button
    Then The user should be redirected to try editor with Run button

  Scenario: Verify that user is able to see output for valid python code
    Given The user launches the editor from the Graph Representations page
    When The user writes valid code and clicks Run
    Then The user should see output in the console
