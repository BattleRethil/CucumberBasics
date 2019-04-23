package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "UserName")
    private WebElement txtUsername;

    @FindBy(how = How.NAME, using = "Password")
    private WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//input[@value='Login']")
    private WebElement btnLogin;



    public void CredentialLogin(String userName, String password){
        txtUsername.sendKeys(userName);
        txtPassword.sendKeys(password);
        System.out.println("The username is " + userName + ", and the password " + password);
    }

    public void ClickLogin() {
        btnLogin.click();
        System.out.println("Clicking the Login button");
    }
}
