@regression
Feature: user should be able to login and make an order

  Scenario: user login with valid username and password

    Given user opens the browser and go to the website
    When user enters login credentials
    And user add items to the cart
    And user enter his address details
    Then user creates the order
    And close the browser