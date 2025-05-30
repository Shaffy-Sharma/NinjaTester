Feature: Linked List Module Navigation and Code Execution

  Background: 
    Given The user has successfully logged in and is on the Home page

  Scenario: Verify that user is able to navigate to "Linked List" data structure page
    When The user clicks the "Get Started" button in Linked List Panel OR selects Linked List from the dropdown menu
    Then The user should be directed to "Linked List" Data Structure Page

  Scenario: Verify that user is able to navigate to "Introduction" page
    Given The user has navigated to the Linked List main page
    When The user clicks "Introduction" link
    Then The user should be redirected to "Linked List - Introduction" page

  Scenario: Verify that user is able to navigate to Try Editor from Introduction
    Given The user is viewing the Linked List - Introduction page
    When The user clicks "Try Here" button
    Then The user should be redirected to try editor with Run button

  Scenario: Verify that it prevents code execution when user clicks Run button without code
    Given The user has accessed the tryEditor from the Introduction page
    When The user clicks Run without entering code
    Then Prevent code execution when editor is blank

  Scenario: Verify that user receives error for invalid python code
    Given The user is on the tryEditor with the editor opened
    When The user writes invalid code and clicks Run
    Then The user should see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code
    Given The user is on the tryEditor page with editor open
    When The user writes valid code and clicks Run
    Then The user should see output in the console

  Scenario: Verify that user is able to navigate to "Creating Linked List" page
    Given The user is at the Linked List main content page
    When The user clicks "Creating Linked List" link
    Then The user should be redirected to "Creating Linked List" page

  Scenario: Verify execution of code in Creating Linked List page
    Given The user has opened the Creating Linked List topic page
    When The user clicks "Try Here", writes valid Python code, and clicks Run
    Then The output should show correct linked list structure

  Scenario: Verify that user is able to navigate to "Types of Linked List" page
    Given The user is at the Linked List section overview page
    When The user clicks "Types of Linked List" link
    Then The user should be redirected to "Types of Linked List" page

  Scenario: Verify execution of code in Types of Linked List page
    Given The user has accessed the Types of Linked List topic
    When The user clicks "Try Here", enters valid Python code, and clicks Run
    Then The output should show correct linked list types

  Scenario: Verify that user is able to navigate to "Implement Linked List in Python" page
    Given The user is viewing the Linked List overview page
    When The user clicks "Implement Linked List in Python" link
    Then The user should be redirected to "Implement Linked List in Python" page

  Scenario: Verify execution of code in Implement Linked List in Python page
    Given The user has accessed the Implement Linked List in Python topic
    When The user clicks "Try Here", writes valid Python code, and clicks Run
    Then The output should show correct implementation

  Scenario: Verify that user is able to navigate to "Traversal" page
    Given The user is on the Linked List landing page
    When The user clicks "Traversal" link
    Then The user should be redirected to "Traversal" page

  Scenario: Verify execution of code in Traversal page
    Given The user has opened the Traversal topic in Linked List
    When The user clicks "Try Here", writes valid Python code, and clicks Run
    Then The output should show correct traversal sequence

  Scenario: Verify that user is able to navigate to "Insertion" page
    Given The user is in the Linked List overview section
    When The user clicks "Insertion" link
    Then The user should be redirected to "Insertion" page

  Scenario: Verify execution of code in Insertion page
    Given The user has accessed the Insertion topic page
    When The user clicks "Try Here", writes valid Python code, and clicks Run
    Then The output should show correct insertion results

  Scenario: Verify that user is able to navigate to "Deletion" page
    Given The user is viewing Linked List main topics
    When The user clicks "Deletion" link
    Then The user should be redirected to "Deletion" page

  Scenario: Verify execution of code in Deletion page
    Given The user has opened the Deletion topic in Linked List
    When The user clicks "Try Here", writes valid Python code, and clicks Run
    Then The output should show correct deletion results
