@user01
Feature:As a user I should be able create an account

  Scenario: Accessing Automation page, creating new account

    Given User is on a homepage
    When User verify that home page title is 'Automation Exercise'
    And User clicks on Signup / Login button
    And User should see  "New User Signup!" on the webpage
    And Enter "Piri" and "piroska.papsdetfl@gmail.com"
    And Click Signup button
    And user should see "ENTER ACCOUNT INFORMATION"

    And Fill details:  Title, Name, Email, Password, Date of birth Day ,Month, Year

    And Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!

    And Fill details: First name , Last name , Company , Address, Address, Country, State, City, Zipcode, Mobile Number

    And  Click Create Account button
    And Verify that ACCOUNT CREATED! is visible
    And Click Continue button
    And Verify that Logged in as username is visible
    And Click Delete Account button
    Then Verify that "ACCOUNT DELETED!" is visible and click Continue button



