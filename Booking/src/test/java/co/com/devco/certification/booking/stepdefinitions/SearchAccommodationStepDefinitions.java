package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.models.TravelData;
import co.com.devco.certification.booking.tasks.SearchAccommodation;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;


public class SearchAccommodationStepDefinitions {
    @When("enters the accommodation data")
    public void entersTheAccommodationData(List<TravelData> travelData) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchAccommodation.forTheTravel(travelData.get(0)));

    }

    @Then("he will be able to see the label (.*)")
    public void heWillBeAbleToSeeTheLabel(String string) {

    }



}
