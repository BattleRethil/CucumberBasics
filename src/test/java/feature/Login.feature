Feature: LoginFeature
    This feature deals with the login functionality of the application

    Scenario: Login with the correct username and password
        Given I navigate to the login page
        And I enter the users email address as email: admin
        And I verify the count of my salary digits for Rs 1000000
        And I enter the following for Login
            | username | password      |
            | admin    | adminpassword |
        And I click login button
        Then I should see the userform page


    Scenario Outline: Login with wrong username and password using Scenario outline
        Given I navigate to the login page
        And I enter <username> and <password>
        And I click login button
        Then I should see the userform page

        Examples:
            | username | password     |
            | execute  | automation   |
            | admin    | admin        |
            | Rethil   | battlerethil |

