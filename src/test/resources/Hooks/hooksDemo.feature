Feature: Check lgin functionality
	@smoke
  Scenario: Login Test1
    Given user is on hooks login page
    When users enters valid username and password
    And clicks on login button
    Then user is navigated to the home page

    @reg
      Scenario: Login Test2
    Given user is on hooks login page
    When users enters valid username and password
    And clicks on login button
    Then user is navigated to the home page