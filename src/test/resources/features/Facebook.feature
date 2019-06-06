Feature: Facebook Feature File

  @tag1
  Scenario: Hit the facebook sites
    Given navigate to facebook page
    And check for the page title
    And close browser

  @tag2
  Scenario Outline: Enter the username and password. Validate the fields
    Given navigate to facebook page
    And Enter the username <username>
    And Enter the password value <password>
    And click on Login button
    And close browser

    Examples: 
      | username | password |
      | tamil    | test     |
      | nani     | pass     |
