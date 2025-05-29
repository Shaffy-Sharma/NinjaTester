@regression
Feature: Homepage

  Background: The user is on the Home page
    Given The user is on the Home page

    Scenario: Verify if user able to select data structure dropdown in homepage without signin
      When The user clicks datastructures dropdown and select
      Then The error message You are not logged in appears in homepage

    Scenario: Verify if user able to click "Get started" button from data structure options in homepage without signin
      When  The user clicks on Data Structure Get Started button on homepage
      Then The error message You are not logged in appears in homepage

    Scenario: Verify if user is on Home page and click on sign in
       When The user clicks on signin link
       Then The user is redirected to login page

    Scenario: Verify if user is on Home page and click on Register
      When The user clicks on register link
      Then The user redirected to Registration page

    Scenario: Verify that user is able to view options of Data Structures dropdown on home page without Sign in
      When The user clicks the Data Structures dropdown
      Then The user should able to see 6 options Arrays, Linked,List, Stack, Queue, Tree, Graph in dropdown menu

    Scenario: Verify if user able to select Arrays option in data structure dropdown in homepage with signIn
      When The user clicks datastructures dropdown and select "Arrays"
      Then The user should redirected to Array page

    Scenario: Verify if user able to click Get started button from Arrays in homepage with signIn
      When  The user clicks on Arrays "Get Started" button on homepage
      Then The user should redirected to Array page

