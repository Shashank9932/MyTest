Feature: Registering to automation practice

  Scenario Outline: Registration error-incorrect email
    Given Automation practice application is opened
    And I click sign in
    And I create account with emailid "testRandomtestauto.com"
    Then I will see an error "<error>"

    Examples: 
      | error                  |
      | Invalid email address. |

  Scenario: check Megamenus works
    Given Automation practice application is opened
    And I hover on Dresses
    And I will see Summer Dresses

