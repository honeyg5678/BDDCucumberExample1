Feature: Facebook Account validation

  Scenario Outline: verification of  facebook account
    Given user launach any browser
    When after launching enter url of application
    Then user shoukd land on page sucessfully
    And user verify the title of application
    And user enter first name as <firstname> in the first name text box
    And user enter last name as <lastname> in the last name text box
    And user enter email as <email> in the email text box
    And user enter password as <newpassword> in the password text box

    Examples: 
      | firstname | lastname | email              | newpassword |
      | swayam    | gupta    | samgupta@gmail.com |      969000 |
