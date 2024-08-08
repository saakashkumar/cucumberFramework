
  Feature: Adding new login for differemt user group

    Background:
      Given Setup databases
      When launch browser from config variable
      And hit the home page url of website

    @Regression
    Scenario: Admin should be able to login into application
      Given Admin is at login page of Netbaking
      When Admin enters username and password and clicks login
      Then home page is opened
      And cards are displayed

    @SmokeTest
    Scenario Outline: User should be able to login into application
      Given User is at login page of Netbaking
      When User enters username '<Username>' and password '<Password>' and clicks login
      Then home page is opened
      And cards are displayed
    Examples:
      | Username | Password |
      | Admin    | abc@123  |
      | User     | xyz@890  |

    @SmokeTest
    Scenario: User have to singup
      Given User is at default signup page
      When User entered all the details
        | Aakash                        |
        | Singh                         |
        | saakashkumar@gmail.com        |
        | 8092698618                    |
      Then home page is opened
      And cards are displayed