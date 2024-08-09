@GreenCart
Feature: Search and Place the order for product

  Scenario: Search Experience for product search in both home and offers page
    Given User is on GreenCart login page
    When User search with short name with "Tom" amd extracted actual name of the product
    Then User searched the for the "Tom" shortname in offers page to check if product exist