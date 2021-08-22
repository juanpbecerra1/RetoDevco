package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.exceptions.SearchFlightsException;
import co.com.devco.certification.booking.models.TravelData;
import co.com.devco.certification.booking.questions.TheButton;
import co.com.devco.certification.booking.tasks.FindFlights;
import co.com.devco.certification.booking.userinterface.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;

import static co.com.devco.certification.booking.utils.constant.General.OF_BOOKING;
import static co.com.devco.certification.booking.utils.constant.MessageExceptions.SEARCH_FLIGHTS_EXCEPTION;
import static co.com.devco.certification.booking.utils.enums.Translates.valueOf;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;


public class SearchFlightsStepDefinitions {
    @Given("the user is on the flights page")
    public void theUserIsOnTheFlightsPage() {
        theActorInTheSpotlight().wasAbleTo(Open.url(OF_BOOKING),
                Click.on(HomePage.OPTION_FLIGHTS));
    }

    @When("enters the data to fly")
    public void entersTheDataToFly(List<TravelData> travelData) {
        theActorInTheSpotlight().attemptsTo(
                FindFlights.forTravel(travelData.get(0)));
    }

    @Then("he will be able to see the button (.*)")
    public void heWillBeAbleToSeeTheButton(String button) {
        theActorInTheSpotlight().should(seeThat(TheButton.is(),
                containsString(valueOf(button.toUpperCase())
                        .toSpanish()))
                .orComplainWith(SearchFlightsException.class,
                        SEARCH_FLIGHTS_EXCEPTION));
    }
}
