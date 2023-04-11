Feature: Login functionality

  Background:
    Given open the browser and launch HRMS application
  @login
  Scenario: Valid Admin Login
    When user enters valid email and valid password
    And click on login button
    Then user is logged in successfully
    And close the browser

  @login2
  Scenario: Valid Admin Login
    When user enters valid "admin" and valid "Hum@nhrm123"
    And click on login button
    Then user is logged in successfully
    And close the browser