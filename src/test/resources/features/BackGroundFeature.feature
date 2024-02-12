Feature: Login Functionality

Background:
	Given I navigate to login page
  	And I enter my user name
  	And I enter my password
  	When  I click on login button

  Scenario: Successful Login
  	Then  I should be logged in 

  	Scenario: Logout
  	Given when i logged in
  	When i click on logout
  	Then i should be logged out