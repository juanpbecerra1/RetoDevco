package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.models.TravelData;
import co.com.devco.certification.booking.tasks.FindFlights;
import co.com.devco.certification.booking.userinterface.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;


public class SearchFlightsStepDefinitions {
    @Given("the user is on the flights page")
    public void theUserIsOnTheFlightsPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://booking.com"),
                Click.on(HomePage.OPTION_FLIGHTS));

    }

    @When("enters the data to fly")
    public void entersTheDataToFly(List<TravelData> travelData) {
        OnStage.theActorInTheSpotlight().attemptsTo(FindFlights.forTravel(travelData.get(0)));
    }

    @Then("he will be able to see the button (.*)")
    public void heWillBeAbleToSeeTheButton(String string) {

    }
}
