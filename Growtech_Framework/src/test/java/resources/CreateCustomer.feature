@Regression
Feature: Create a customer with all the details

  Background: 
    Given User opens the Application
    And User enter the "mngr532031"
    And User will enter the "pUbapeh"
    When User will click on the submit button
    Then User will be navigated to homepage

  Scenario Outline: Creating a new customer with all the details
    Given user will click on the new customer link
    And user will enter the customer name as "<customer_name>"
    Then user will select gender
    And user will enter the date of birth as "<date_of_birth>"
    And user will enter the address as "<customer_address>"
    Then user will quit the browser

    Examples: 
      | customer_name | date_of_birth | customer_address |
      | Akshit        | 03-02-1997    | 273C, Noble Enclave|
