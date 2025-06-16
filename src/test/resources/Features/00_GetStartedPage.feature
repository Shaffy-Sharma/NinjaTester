@homePage
Feature: Homepage

  Background: The user is on the dsAlgo portal
    Given  The user is on the DS Algo portal

  Scenario: Verify that user is able to click on the Get Started button from dsAlgo portal
    When  The user clicks the Get Started button
    Then  The user should be navigated to the Data Structure Introduction page, which displays the Register and Sign in links.