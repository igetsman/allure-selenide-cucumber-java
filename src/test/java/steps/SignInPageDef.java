package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignInPage;
public class SignInPageDef {
    SignInPage signInPage = new SignInPage();
    @Then("Input login {string}")
    public void inputLogin(String text) {
        signInPage.inputLogin(text);
    }
    @Then("Input password {string}")
    public void inputPassword(String text) {
        signInPage.inputPassword(text);
    }
    @Then("Click submit button")
    public void clickSubmitButton() {
        signInPage.clickSubmitButton();
    }

    @When("Login to site as user {string} - {string}")
    public void loginToSiteAsUser(String arg0, String arg1) {
        signInPage.showPasswordLogin();
        signInPage.inputLogin(arg0);
        signInPage.inputPassword(arg1);
        signInPage.clickSubmitButton();
    }

}
