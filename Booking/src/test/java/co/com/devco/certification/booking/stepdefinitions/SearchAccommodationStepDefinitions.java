package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.exceptions.SearchAccommodationException;
import co.com.devco.certification.booking.models.TravelData;
import co.com.devco.certification.booking.questions.TheLabel;
import co.com.devco.certification.booking.tasks.SearchAccommodation;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static co.com.devco.certification.booking.userinterface.HomePage.LABEL_ACCOMMODATIONS;
import static co.com.devco.certification.booking.userinterface.ResultsAccommodationPage.LABEL_ACCOMMODATIONS_FOUNDS;
import static co.com.devco.certification.booking.utils.constant.MessageExceptions.SEARCH_ACCOMMODATION_EXCEPTION;
import static co.com.devco.certification.booking.utils.enums.Translates.valueOf;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;


public class SearchAccommodationStepDefinitions {
    @When("enters the accommodation data")
    public void entersTheAccommodationData(List<TravelData> travelData) {
        theActorInTheSpotlight().attemptsTo(
                SearchAccommodation.forTheTravel(travelData.get(0)));

    }

    @Then("he will be able to see the label (.*)")
    public void heWillBeAbleToSeeTheLabel(String label) {
        theActorInTheSpotlight().should(seeThat(TheLabel.is(LABEL_ACCOMMODATIONS_FOUNDS),
                containsString(valueOf(label.toUpperCase())
                        .toSpanish()))
                .orComplainWith(SearchAccommodationException.class,
                        SEARCH_ACCOMMODATION_EXCEPTION));
    }

    @Then("^he will be able to see the message (.*)")
    public void heWillBeAbleToSeeTheMessage(String message) {
        theActorInTheSpotlight().should(seeThat(TheLabel.is(LABEL_ACCOMMODATIONS),
                containsString(valueOf(message.toUpperCase())
                        .toSpanish()))
                .orComplainWith(SearchAccommodationException.class,
                        SEARCH_ACCOMMODATION_EXCEPTION));
    }
}
