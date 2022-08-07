Feature: feature to test product store website

  Scenario: Home Page is working
    Given browser is open
    And user clicks on respective product categories
    When User clicks on bext and previous buttons
    And hits enter
    Then Products are displayed to the user

  Scenario: To view product details
    Given products are displayed
    And user clicks on respective product links
    Then product details are displayed

  Scenario: To add product to cart
    Given click on add to cart button
    Then click on cart button on navigation bar

  Scenario: To check if quantity of product added to cart has increased if same product is added again to cart
    Given Click on home page
    And click on add to cart of same product
    Then click on cart button on navigation bar

  Scenario: To check if after clicking on delete button the product is getting deleted or not
    Given click on cart button of navigation page
    And click on delete button of respective product
    Then product is deleted

  Scenario: To check if after adding the product to the cart the total price is increasing
    Given click on link of a unique product
    And click on add to cart button
    And click on cart button
    Then Total price is updated

  Scenario: To check if user is succcessfully able to navigate from cart page to home page and vice a versa without altering contents present in cart
    Given Click on Cart button on navigation bar
    Then Click on Home page

  Scenario: To check if even after logging out  the product stays in the cart if not deleted
    Given Click on logout button
    And login using valid credentials
    Then Click on Cart

  Scenario: To check if the cart is empty product must not be able to be purchased
    Given delete all the products of cart
    And click on Place order button
    And fill in the details of textfields
    Then Purchase product

  Scenario: To check even after leaving all details empty the product is being able to be purchased
    Given Click on Cart button of navigation page
    And click on purchase button

  Scenario: To check if invalid credit card number is entered product must not be able to be purchased
    Given fill the details and enter invalid credit card number
    Then click on purchase 

  Scenario: To check if some textfields of place order pop up window are kept blank customer should not be able to purchase the product
    Given fill only name and credit card number textfields
    Then click purchase

  Scenario: To check after purchase button is clicked the products present in the cart are deleted
    Given Click Purchase again
    Then click on Okay button after popup modal is displayed
