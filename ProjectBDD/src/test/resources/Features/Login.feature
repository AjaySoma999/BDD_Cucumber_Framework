Feature: testing web page using cucumber
  Check user fill the general form in the page

  Scenario Outline: Login The WEB App
    Given Verify user is in <title> home page
    And User enter name in the <name> test-box
    When User enter email in the <email> test-box
    And User enter valid data in <phone> text-box
    When User enter valid data in <address> textbox
    And User click on male radio button in gender fields
    Then User click on monday check box in days fields
    Examples:
      | title                       | name | email                | phone      | address  |
      | Automation Testing Practice | ajay | somaajay99@gmail.com | 9912756069 | Kondapur |


