Feature: Login functionality

  Scenario: Successful login
    Given I am on the login page
    When I enter valid credentials
    Then I should be redirected to the dashboard



  Scenario: unSuccessful login
    Given I am in the login page
    When I enter invalid credentials
    Then I still in login page

  Scenario: empty login
    Given I am in login page
    When I enter no data
    Then Iam still login page

  Scenario: validusernameandinvalidpassword login
    Given I am in a login page
    When I enter valid username and  invalid password
    Then I will be in login page

  Scenario: invalidusernameandvalidpassword login
    Given I enter the login page
    When I enter invalid username and valid password
    Then I am still in login page

  Scenario: login without cliking login button
    Given Iam entering the login page
    When I enter valid username and valid password
    Then I remain in login page