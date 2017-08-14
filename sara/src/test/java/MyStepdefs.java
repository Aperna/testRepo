import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^user is on ASOS registration page$")
    public void userIsOnASOSRegistrationPage()  {

    }

    @When("^user should enter\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void userShouldEnter(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5){
    }

    @And("^user clicks join ASOS button$")
    public void userClicksJoinASOSButton() {
    }
    @Then("^user should navigate to home page with logged in state.$")
    public void userShouldNavigateToHomePageWithLoggedInState() {
    }
}


