package stepDefinitions.testSteps;


import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SigInPage;


public class LoginSteps extends Base {
    private Base base;
    SigInPage signInPage;

    public LoginSteps(Base base) {
        this.base = base;
    }

    @Given("A user in the login page")
    public void iInLogInePage() {
        Assert.assertTrue(base.driver.getCurrentUrl().contains("saucedemo"));
    }

    @When("user enter name and password in fields {string} {string}")
    public void userEnterNameAndPasswordInFields(String email, String password) {
        signInPage = new SigInPage(base.driver);
        signInPage.login(email, password);
    }

    @And("click on the login button")
    public void clickOnTheLoginButton() {
        signInPage = new SigInPage(base.driver);
        signInPage.clickOnLoginBtn();
    }

    @Then("system displays an error message says {string}")
    public void systemDisplaysAnErrorMessageSays(String errorMessage) {
        Assert.assertEquals(errorMessage, signInPage.getActualMessage());
    }

    @Then("user has been logged out and in login page again")
    public void userHasBeenLoggedOutAndInLoginPageAgain() {
        Assert.assertTrue(base.driver.getCurrentUrl().equals("https://www.saucedemo.com/"));

    }
}
