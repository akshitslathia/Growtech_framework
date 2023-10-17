Feature: Login Scenarios
@sanity

  Scenario Outline: Login to application with correct user id and password
    Given User opens the Application
    And User enter the "<username>"
    And User will enter the "<password>"
    When User will click on the submit button
    Then User will be navigated to homepage

    Examples: 
      | username   | password |
      | mngr532031 | pUbapeh  |
