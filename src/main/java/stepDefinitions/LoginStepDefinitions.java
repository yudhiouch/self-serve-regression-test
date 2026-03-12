package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import step.LoginStep;

@AllArgsConstructor
public class LoginStepDefinitions {
    private LoginStep loginStep;

    @Given("User open browser")
    public void userOpenBrowser() {
        loginStep.setupDriver();
    }

    @When("user open {string} url")
    public void userOpenUrl(String url) {
        loginStep.userOpenUrl(url);
    }

    @Then("straitsx page should be displayed")
    public void straitsxPageShouldBeDisplayed() {
        loginStep.validateStraitsxPageDisplayed();
    }
}
