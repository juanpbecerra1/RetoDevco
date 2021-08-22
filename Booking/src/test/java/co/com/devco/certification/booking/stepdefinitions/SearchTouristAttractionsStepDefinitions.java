package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.models.ToursAttractionsData;
import co.com.devco.certification.booking.tasks.SearchTours;
import co.com.devco.certification.booking.userinterface.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class SearchTouristAttractionsStepDefinitions {
    @Given("the user is on the tourist attractions page")
    public void theUserIsOnTheTouristAttractionsPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://booking.com"),
                Click.on(HomePage.OPTION_TOURS_ATTRACTIONS));
    }

    @When("he enters the tourist attractions data")
    public void heEntersTheTouristAttractionsData(List<ToursAttractionsData> toursAttractionsData) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchTours.attractions(toursAttractionsData.get(0)));

    }
}
