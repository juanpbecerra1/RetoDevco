package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.models.UserAccount;
import co.com.devco.certification.booking.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginStepDefinitions {
    @Before
    public void preparation() {
        setTheStage(new OnlineCast());
        theActorCalled("User");
    }

    @Given("the user is on the main page")
    public void theUserIsOnTheMainPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://booking.com"));

    }

    @When("he enters the login data")
    public void heEntersTheLoginData(List<UserAccount> userAccount) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.withCredentials(userAccount.get(0)));
    }

    @Then("he will be able to see the option (.*)")
    public void heWillBeAbleToSeeTheOption(String string) {

    }

}
