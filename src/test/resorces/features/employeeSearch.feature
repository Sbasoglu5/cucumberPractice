Feature: Searching Employee

  Background:
    When user enters valid email and valid password
    And click on login button
    When user clicks on PIM option

    @employeeId
    Scenario: Search employee with Id
      When user enters valid employee Id
      And clicks on search button
      And user sees employee information displayed

    @employeeTitle
    Scenario: Search Employee by Job Title
      When user selects job title
      And clicks on search button
      And user sees employee information displayed