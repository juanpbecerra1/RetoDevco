package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.interactions.Select;
import co.com.devco.certification.booking.interactions.SelectNumber;
import co.com.devco.certification.booking.models.ToursAttractionsData;
import co.com.devco.certification.booking.userinterface.HomePage;
import co.com.devco.certification.booking.userinterface.ToursAttractionsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class SearchTours implements Task {
    private final ToursAttractionsData toursAttractionsData;

    public SearchTours(ToursAttractionsData toursAttractionsData) {
        this.toursAttractionsData = toursAttractionsData;
    }

    public static SearchTours attractions(ToursAttractionsData toursAttractionsData) {
        return Tasks.instrumented(SearchTours.class, toursAttractionsData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ToursAttractionsPage.COUNTRY_DESTINATION.of(toursAttractionsData.getCountry())),
                Click.on(ToursAttractionsPage.DESTINATION.of(toursAttractionsData.getDestination())),
                WaitUntil.the(HomePage.CALENDAR, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(HomePage.CALENDAR),
                Select.date(toursAttractionsData.getDate(), ToursAttractionsPage.BTN_NEXT),
                WaitUntil.the(ToursAttractionsPage.SELECT_DESTINATION, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(ToursAttractionsPage.SELECT_DESTINATION),
                WaitUntil.the(ToursAttractionsPage.LABEL_NUMBER_PASSENGERS, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                SelectNumber.ofTickets(toursAttractionsData.getNumberTickets()),
                EnterData.ofUser(toursAttractionsData));

    }
}
