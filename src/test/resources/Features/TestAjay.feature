Feature: After Long Time Writing Test Case For Feature BDD Cucumber

  Scenario Outline: Perform any 5 different action in omayo Application.
    Given User Verifing the <PageTitle> of the Application.
    When User Enter <username> in the in the UserName field.
    Then User Enter <Password> in the in the Password field.
    And User click on Login biiton.
    Then User verifies the <HomaPage> After Login.
    Examples:
      | PageTitle | username       | Password     | HomaPage |
      | Swag Labs | standard_user | secret_sauce | Products |
