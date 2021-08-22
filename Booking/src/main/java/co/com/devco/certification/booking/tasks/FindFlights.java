package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.models.TravelData;
import co.com.devco.certification.booking.userinterface.FlightsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class FindFlights implements Task {
    private final TravelData travelData;

    public FindFlights(TravelData travelData) {
        this.travelData = travelData;
    }

    public static FindFlights forTravel(TravelData travelData) {
        return Tasks.instrumented(FindFlights.class, travelData);
    }

    @Step("{0} find flights")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FlightsPage.OPEN_ORIGIN),
                Enter.theValue(travelData.getOrigin()).into(FlightsPage.INPUT_ORIGIN),
                Click.on(FlightsPage.OPEN_DESTINATION),
                Enter.theValue(travelData.getDestinationPlace()).into(FlightsPage.INPUT_DESTINATION),
                Enter.theValue(travelData.getArrivalDate()).into(FlightsPage.INPUT_ARRIVAL_DATE),
                Enter.theValue(travelData.getDepartureDate()).into(FlightsPage.INPUT_DEPARTURE_DATE),
                Click.on(FlightsPage.BTN_SEARCH)
        );
    }
}
