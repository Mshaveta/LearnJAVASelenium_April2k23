Feature: Login
  Scenario: Verify login functionality with valid username and password
    Given The user launches the application with url
    When The user enters the valid username in username text field
    And  The user enters the valid password in password text field

  Scenario: Verify login functionality with invalid username and password
    Given The user launches the application with url
    When The user enters the invalid username in username text field
    And  The user enters the invalid password in password text field