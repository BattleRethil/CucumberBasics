package steps;

import base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import transformation.EmailTransform;
import transformation.SalaryDigitTransform;

import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil{

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
        System.out.println("The driver is " + base.StepInfo);
        System.out.println("Navigate Login Page");
    }

    @And("^I enter the users email address as email: ([^\"]*)$")
    public void iEnterTheUsersEmailAddressAsEmailAdmin(@Transform(EmailTransform.class) String email) {
        System.out.println("The email address is: " + email);
    }

    @And("^I verify the count of my salary digits for Rs (\\d+)$")
    public void iVerifyTheCountOfMySalaryDigitsForRs(@Transform(SalaryDigitTransform.class) Integer salary) {
        System.out.println("The salary digit is " + salary);
        
    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) {

        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);

        for (User user : users) {
            System.out.println("The username is: " + user.username);
            System.out.println("The password is: " + user.password);
        }
    }

    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            this.username = username;
            this.password = password;
        }
    }


    @And("^I click login button$")
    public void iClickLoginButton() {
        System.out.println("Click login button");
        
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() {
        System.out.println("I should see the userform page");
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) {
        System.out.println("Username is : " + userName);
        System.out.println("Password is : " + password);
    }
}
