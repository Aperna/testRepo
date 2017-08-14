Feature: Register to ASOS page
  As a user
  I want to register the ASOS site
  So that I can register successfully.

  Scenario Outline: user can register an account with valid data.
    Given user is on ASOS registration page
    When user should enter"<emailaddress>""<firstname>""<lastname>""<password>""<dateofbirth>""<gender>"
    And user clicks join ASOS button
    Then user should navigate to home page with logged in state.
    Examples:

    |emailaddress     |firstname|lastname|password|dateofbirth|gender|

    |aparna3717@gmail.com|anu   |pama    |selinium3717|23/04/1985|female|