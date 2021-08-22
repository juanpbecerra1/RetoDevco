package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.exceptions.LoginException;
import co.com.devco.certification.booking.models.UserAccount;
import co.com.devco.certification.booking.questions.TheOption;
import co.com.devco.certification.booking.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.devco.certification.booking.utils.constant.General.OF_BOOKING;
import static co.com.devco.certification.booking.utils.constant.General.TRAVELER;
import static co.com.devco.certification.booking.utils.constant.MessageExceptions.LOGIN_EXCEPTION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class LoginStepDefinitions {
    @Before
    public void preparation() {
        setTheStage(new OnlineCast());
        theActorCalled(TRAVELER);
    }

    @Given("the user is on the main page")
    public void theUserIsOnTheMainPage() {
        theActorInTheSpotlight().wasAbleTo(Open.url(OF_BOOKING));
    }

    @When("he enters the login data")
    public void heEntersTheLoginData(List<UserAccount> userAccount) {
        theActorInTheSpotlight().attemptsTo(
                Login.withCredentials(userAccount.get(0)));
    }

    @Then("he will be able to see the option (.*)")
    public void heWillBeAbleToSeeTheOption(String option) {
        theActorInTheSpotlight().should(seeThat(TheOption.inProfile(),
                is(equalTo(option)))
                .orComplainWith(LoginException.class,
                        LOGIN_EXCEPTION));
    }
}
