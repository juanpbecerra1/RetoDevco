package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.interactions.Select;
import co.com.devco.certification.booking.models.TravelData;
import co.com.devco.certification.booking.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class SearchAccommodation implements Task {
    private final TravelData travelData;

    public SearchAccommodation(TravelData travelData) {
        this.travelData = travelData;
    }

    public static SearchAccommodation forTheTravel(TravelData travelData) {
        return Tasks.instrumented(SearchAccommodation.class, travelData);
    }

    @Step("{0} search accommodation")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(travelData.getDestinationPlace()).into(HomePage.INPUT_ACCOMMODATION),
                Click.on(HomePage.CALENDAR),
                Select.date(travelData.getArrivalDate(), HomePage.CALENDAR_NEXT_MOTH),
                Select.date(travelData.getDepartureDate(), HomePage.CALENDAR_NEXT_MOTH),
                Click.on(HomePage.BTN_SEARCH)
        );
    }
}
