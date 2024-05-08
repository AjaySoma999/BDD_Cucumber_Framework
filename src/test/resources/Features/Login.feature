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

  Scenario Outline: get value(attrubutevalue) in the text field with which have data in it?
    Given Verify user is in <title> home page
    And Verify user is able to get the value <filed1> from the value attribute with contains data in the text field
    When Enter data <data> in field2 text field
    When Verify user is able to get the value <field2> from the id there is no value attribute with contains data in the text field
    Examples:
      | title                       | filed1       | data       | field2     |
      | Automation Testing Practice | Hello World! | VerifyTest | VerifyTest |

