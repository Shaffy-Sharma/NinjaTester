Feature: Testing the Queue Module in dsAlgo Portal

Scenario Outline: Verify that the user is able to land in Queue page
		Given Queue-User is in the Home page after logging in using credentials from Excel <Rownumber>
		When User clicks on Get Started button under the section Queue
		Then User lands on the Queue page
		Examples:
			|Rownumber|
			|1|


Scenario Outline: Verify that the user is able to navigate to the Implementation of Queue in Python page
		Given User is in the Queue page after logging in using credentials from Excel <Rownumber>
		When User clicks on the hyperlink Implementation of Queue in Python
		Then User lands on the Implementation of Queue in Python page
		Examples:
			|Rownumber|
			|1|

@positiveflow
		Scenario: Queue - Verify that the user is able to navigate to the Practice Questions page and view the content.	
		Given User is in the Implementation of Queue in Python page
		When Queue - User clicks on the Practice Questions from the side navigation bar
		Then Queue - User lands on the Practice Questions page and is able to view the content successfully

Scenario: Queue - Verify that the Try here>>> button is functional
		Given User is in the Implementation of Queue in Python page
		When Queue - User clicks on the Try here>>> button
		Then Queue - User lands on the Try Editor page.

Scenario: Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Implementation of Queue in Python page	
		Given Queue - User is in Try Editor page from Implementation of Queue in Python page
		When Queue - User clicks on Run Button without entering the code
		Then Queue - An Alert window with the error message is displayed.

@negativeflow
Scenario Outline: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Implementation of Queue in Python page	
		Given Queue - User is in Try Editor page from Implementation of Queue in Python page
		When User clicks on Run Button after entering a invalid python code from Excel <Rownumber> for Queue Module
		Then An Alert window with the error message from Excel <Rownumber> for Queue Module is displayed
		Examples:
			|Rownumber|
			|2|

Scenario Outline: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Implementation of Queue in Python page
		Given Queue - User is in Try Editor page from Implementation of Queue in Python page
		When User clicks on Run Button after entering a valid python code from Excel <Rownumber> for Queue Module
		Then Correct output is displayed in the console from Excel <Rownumber> for Queue Module
		Examples:
			|Rownumber|
			|1|

Scenario Outline: Verify that the user is able to navigate to the Implementation using collections deque page
		Given User is in the Queue page after logging in using credentials from Excel <Rownumber>
		When User clicks on the hyperlink Implementation using collections deque
		Then User lands on the Implementation using collections deque page
		Examples:
			|Rownumber|
			|1|

Scenario: Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Implementation using collections deque page	
		Given Queue - User is in Try Editor page from Implementation using collections deque page
		When Queue - User clicks on Run Button without entering the code
		Then Queue - An Alert window with the error message is displayed.

Scenario Outline: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Implementation using collections deque page	
		Given Queue - User is in Try Editor page from Implementation using collections deque page
		When User clicks on Run Button after entering a invalid python code from Excel <Rownumber> for Queue Module
		Then An Alert window with the error message from Excel <Rownumber> for Queue Module is displayed
		Examples:
			|Rownumber|
			|2|

Scenario Outline: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Implementation using collections deque page
		Given Queue - User is in Try Editor page from Implementation using collections deque page
		When User clicks on Run Button after entering a valid python code from Excel <Rownumber> for Queue Module
		Then Correct output is displayed in the console from Excel <Rownumber> for Queue Module
		Examples:
			|Rownumber|
			|1|

Scenario Outline: Verify that the user is able to navigate to the Implementation using array page
		Given User is in the Queue page after logging in using credentials from Excel <Rownumber>
		When User clicks on the hyperlink Implementation using array
		Then User lands on the Implementation using array page
		Examples:
			|Rownumber|
			|1|

Scenario: Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Implementation using array page	
		Given Queue - User is in Try Editor page from Implementation using array page
		When Queue - User clicks on Run Button without entering the code
		Then Queue - An Alert window with the error message is displayed.

Scenario Outline: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Implementation using array page	
		Given Queue - User is in Try Editor page from Implementation using array page
		When User clicks on Run Button after entering a invalid python code from Excel <Rownumber> for Queue Module
		Then An Alert window with the error message from Excel <Rownumber> for Queue Module is displayed
		Examples:
			|Rownumber|
			|2|

Scenario Outline: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Implementation using array page
		Given Queue - User is in Try Editor page from Implementation using array page
		When User clicks on Run Button after entering a valid python code from Excel <Rownumber> for Queue Module
		Then Correct output is displayed in the console from Excel <Rownumber> for Queue Module
		Examples:
			|Rownumber|
			|1|

Scenario Outline: Verify that the user is able to navigate to the Queue Operations page
		Given User is in the Queue page after logging in using credentials from Excel <Rownumber>
		When User clicks on the hyperlink Queue Operations
		Then User lands on the Queue Operations page
		Examples:
			|Rownumber|
			|1|