package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.exceptions.SearchToursAttractionsException;
import co.com.devco.certification.booking.models.ToursAttractionsData;
import co.com.devco.certification.booking.questions.TheLabel;
import co.com.devco.certification.booking.tasks.SearchTours;
import co.com.devco.certification.booking.userinterface.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;

import static co.com.devco.certification.booking.userinterface.ResultsAccommodationPage.LABEL_PAYMENT;
import static co.com.devco.certification.booking.utils.constant.General.OF_BOOKING;
import static co.com.devco.certification.booking.utils.constant.MessageExceptions.SEARCH_TOURS_ATTRACTIONS_EXCEPTION;
import static co.com.devco.certification.booking.utils.enums.Translates.valueOf;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class SearchTouristAttractionsStepDefinitions {
    @Given("the user is on the tourist attractions page")
    public void theUserIsOnTheTouristAttractionsPage() {
        theActorInTheSpotlight().wasAbleTo(Open.url(OF_BOOKING),
                Click.on(HomePage.OPTION_TOURS_ATTRACTIONS));
    }

    @When("he enters the tourist attractions data")
    public void heEntersTheTouristAttractionsData(List<ToursAttractionsData> toursAttractionsData) {
        theActorInTheSpotlight().attemptsTo(SearchTours.attractions(
                toursAttractionsData.get(0)));
    }

    @Then("he will be able to see the (.*) in screen")
    public void heWillBeAbleToSeeTheInScreen(String message) {
        theActorInTheSpotlight().should(seeThat(TheLabel.is(LABEL_PAYMENT),
                containsString(valueOf(message.toUpperCase())
                        .toSpanish()))
                .orComplainWith(SearchToursAttractionsException.class,
                        SEARCH_TOURS_ATTRACTIONS_EXCEPTION));
    }
}
