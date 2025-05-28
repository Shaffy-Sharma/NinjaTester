Feature: Testing the Stack Module in dsAlgo Portal

Scenario Outline: Verify the user is able to navigate the Stack page.
			Given User is in the Home Page after Logged in for Stack <Rownumber>
			When User clicks the Get Strated button in the Stack panel
			Then User should be directed to the Stack page
			Examples:
					|Rownumber|
					|1|
