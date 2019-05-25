package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Login_SD {

    @Given("^Newtours Application Url is available$")
    public void newtours_application_url_is_available() throws Throwable {
        throw new PendingException();
    }

    @When("^entered \"([^\"]*)\" and entered \"([^\"]*)\"$")
    public void entered_something_and_entered_something(String username, String password, String strArg1, String strArg2) throws Throwable {
        throw new PendingException();
    }

    @Then("^customer should login successfully$")
    public void customer_should_login_successfully() throws Throwable {
        throw new PendingException();
    }

    @And("^clicked on Submit button$")
    public void clicked_on_submit_button() throws Throwable {
        throw new PendingException();
    }

}