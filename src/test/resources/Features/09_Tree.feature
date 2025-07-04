@treePage
Feature: TreePage

  Background: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enters valid "NinjaTester" and "Welcome@123" and clicks on login button
    Then  The user redirected to homepage

  Scenario: Verify that user is able to navigate to "Tree" page
    Given The user is in the Home page after Sign in
    When User clicks the Get Started button in the Tree page
    Then  User should be redirected to the "Tree" page

  Scenario: Verify if user able to navigate "Overview of Trees" page
    Given The  user is on the Tree page after logged in
    When  The user clicks Overview of Trees link
    Then  The user should be redirected to the "Overview of Trees" page

  Scenario: Verify if user able to to redirect to a "tryEditor" page from overview of trees page
    Given The user is in the Overview of Trees Page
    When  The user clicks Try Here button in Tree page
    Then  The user should be redirected to a Tree page having an tryEditor with a Run button to test

  Scenario: Verify if user able to see the output in console
    Given The user is on the Tree tryEditor page
    When  The user writes valid python code from sheet "PythonCode" and row 1 in tryEditor page
    Then  User is able to see the output in console of Tree Page

  Scenario: Verify if user able to see the error message in pop up window
    Given The user is on the Tree tryEditor page
    When  The user writes invalid python code from sheet "PythonCode" and row 2 in tryEditor page
    Then  User is able to see the error message in Tree Page pop up window

  Scenario: Verify if user able to navigate to "Terminologies" page
    Given The  user is on the Tree page after logged in
    When The user clicks Terminologies link in tree page
    Then The user should be redirected to the Terminologies Page

  Scenario: Verify if user able to direct to "Types of Trees"
    Given The  user is on the Tree page after logged in
    When  The user clicks Types of Trees link
    Then  The user should be redirected to the Types of Trees Page


  Scenario: Verify if user able to direct to "Tree Traversals"
    Given The  user is on the Tree page after logged in
    When  The user clicks Tree Traversals link
    Then  The user should be redirected to the Tree Traversals Page


  Scenario: Verify if user able to direct to "Traversals-Illustration"
    Given The  user is on the Tree page after logged in
    When  The user clicks Traversals-Illustration link
    Then  The user should be redirected to the Traversals-Illustration Page

  Scenario: Verify if user able to direct to "Binary Trees"
    Given The  user is on the Tree page after logged in
    When  The user clicks Binary Trees link
    Then  The user should be redirected to the Binary Trees Page

  Scenario: Verify if user able to direct to "Types of Binary Trees"
    Given The  user is on the Tree page after logged in
    When The user clicks Types of Binary Trees link
    Then The user should be redirected to the Types of Binary Trees Page

  Scenario: Verify if user able to direct to "Implementation in Python"
    Given The  user is on the Tree page after logged in
    When The user clicks Implementation in Python link
    Then The user should be redirected to the Implementation in Python Page

  Scenario: Verify if user able to direct to "Binary Tree Traversals"
    Given The  user is on the Tree page after logged in
    When The user clicks Binary Tree Traversals link
    Then The user should be redirected to the Binary Tree Traversals Page

  Scenario: Verify if user able to direct to "Implementation of Binary Trees"
    Given The  user is on the Tree page after logged in
    When The user clicks Implementation of Binary Trees link
    Then The user should be redirected to the Implementation of Binary Trees Page

  Scenario: Verify if user able to direct to "Applications of Binary trees"
    Given The  user is on the Tree page after logged in
    When The user clicks Applications of Binary trees link
    Then The user should be redirected to the Applications of Binary trees Page

  Scenario: Verify if user able to direct to "Binary Search Trees"
    Given The  user is on the Tree page after logged in
    When The user clicks Binary Search Trees link
    Then The user should be redirected to the Binary Search Trees Page

  Scenario: Verify if user able to direct to "Implementation Of BST"
    Given The  user is on the Tree page after logged in
    When The user clicks Implementation Of BST link
    Then The user should be redirected to the Implementation Of BST Page

       #Practice Questions
  Scenario: The user is able to click and navigate to "Practice Questions"
    Given The user is in the Implementation Of BST Page
    When  The user clicks Trees Practice Questions link
    Then  The user is redirected to Trees Practice Questions page