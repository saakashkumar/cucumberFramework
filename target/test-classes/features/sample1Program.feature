
  Feature: Adding new login for admins
    Scenario: Admin should be able to login inot application

      Given Admin is at login page of Netbaking
      When Admin enters username and password and clicks login
      Then home page is opened
      And cards are displayed