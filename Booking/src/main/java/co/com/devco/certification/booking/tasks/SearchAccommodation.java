package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.interactions.Select;
import co.com.devco.certification.booking.models.TravelData;
import co.com.devco.certification.booking.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchAccommodation implements Task{
    private TravelData travelData;

    public SearchAccommodation(TravelData travelData) {
        this.travelData = travelData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(travelData.getDestinationPlace()).into(HomePage.INPUT_ACCOMMODATION),
                Click.on(HomePage.CALENDAR),
                Select.date(travelData.getArrivalDate()),
                Select.date(travelData.getDepartureDate()),
                Click.on(HomePage.BTN_SEARCH)
                );

    }

    public static SearchAccommodation forTheTravel(TravelData travelData){
        return Tasks.instrumented(SearchAccommodation.class, travelData);
    }
}
