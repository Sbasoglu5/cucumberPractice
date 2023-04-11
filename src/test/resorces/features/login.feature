Feature: Login functionality


  @login
  Scenario: Valid Admin Login
    When user enters valid email and valid password
    And click on login button
    Then user is logged in successfully


  @login2
  Scenario: Valid Admin Login
    When user enters valid "admin" and valid "Hum@nhrm123"
    And click on login button
    Then user is logged in successfully

