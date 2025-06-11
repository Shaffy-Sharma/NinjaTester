Feature: Testing Arrays using different ways

  #Background:
   # Given The user sign in to dsAlgo Portal, User is on Home page

  Scenario: Verify that user is able to navigate to "Array" data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the "GetStarted" button in Home Page
    Then The user be directed to "ARRAY" Data Structure Page

  Scenario: Verify that user is able to navigate to "Arrays in Python" page
    Given The user is in the "Array" page after Sign in
    When The user clicks "Arrays in Python" button
    Then The user should be redirected to "Arrays in Python" page

  Scenario: Verify that user is able to navigate to "Arrays Using List" page
    Given The user is in the "Array" page after Sign in
    When The user clicks "Arrays Using List" button
    Then The user should be redirected to "Arrays Using List" page

  Scenario: Verify that user is able to navigate to "basic-operations-in-lists" page
    Given The user is in the "Array" page after Sign in
    When The user clicks "basic-operations-in-lists" button
    Then The user should be redirected to "basic-operations-in-lists" page

  Scenario: Verify that user is able to navigate to "Applications of Array" page
    Given The user is in the "Array" page after Sign in
    When The user clicks "Applications of Array" button
    Then The user should be redirected to "Applications of Array" page

#Verifying Python Editor functionality of practice questions in Array

  Scenario: Verify that user receives NameError for invalid python code on Run button
    Given The user is on the practice question editor
    When The user write the invalid code in Editor and Click the Submit Button
    Then The user should able to see an NameError message in alert window

  Scenario: Verify that user receives error occurred during submission for invalid python code on submit button
    Given The user is on the practice question editor
    When The user write the invalid code in the Editor and Click the Run Button
    Then The user should able to see error occurred during submission

  Scenario: Verify that user is able to run valid python code in editor
    Given The user is on the practice question editor
    When The user write the valid code in the Editor and Click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user receives error occurred during submission for valid python code on submit button
    Given The user is on the practice question editor
    When The user write the valid code in Editor and Click the Submit Button
    Then The user should able to see error occured during submission

    #Verifying Try Here functionality fof Practice questions in Array

  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Arrays in Python" page
    Given The user is on the "Arrays in Python" page
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice" page

  Scenario: Verify that user is able to navigate to question/1 Page of "Practice Questions"
    Given The user is in the Practice page
    When The user clicks "Search the array" link
    Then The user should be redirected to the question/1 page

  Scenario: Verify that user is able to navigate to question/2 Page of "Practice Questions"
    Given The user is in the Practice page
    When The user clicks ""Max Consecutive ones" link
    Then The user should be redirected to the question/2 page

  Scenario: Verify that user is able to navigate to question/3 Page of "Practice Questions"
    Given The user is in the Practice page
    When The user clicks "Find numbers with even numbers of digits" link
    Then The user should be redirected to the question/3 page

  Scenario: Verify that user is able to navigate to question/4 Page of "Practice Questions"
    Given The user is in the Practice page
    When The user clicks "Squares of a sorted array" link
    Then The user should be redirected to the question/4 page

    #Verifying Try Here functionality for different options in Array
  Scenario: Verify that user is able to navigate to "try Editor" page for "Arrays in Python" page
    Given The user is on the "Arrays in Python" page
    When The user clicks "Try Here" button in Arrays in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that no error message is displayed when click on Run button without entering code for "Arrays in Python" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then Nothing happens to the page and no error message is displayed

  Scenario: Verify that user receives error for invalid python code for "Arrays in Python" page
    Given  The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to navigate to "try Editor" page for "Arrays in Python" page
    Given  The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console




