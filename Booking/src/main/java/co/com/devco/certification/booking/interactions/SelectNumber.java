package co.com.devco.certification.booking.interactions;

import co.com.devco.certification.booking.userinterface.ToursAttractionsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class SelectNumber implements Interaction {
    private String cantidad;

    public SelectNumber(String cantidad) {
        this.cantidad = cantidad;
    }

    public static SelectNumber ofTickets(String cantidad) {
        return Tasks.instrumented(SelectNumber.class, cantidad);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int cant = Integer.parseInt(cantidad);
        while (!Text.of(ToursAttractionsPage.LABEL_NUMBER_PASSENGERS).viewedBy(actor).asString().equals(cantidad)) {
            actor.attemptsTo(Click.on(ToursAttractionsPage.ADD_PASSENGER));
        }
        actor.attemptsTo(Click.on(ToursAttractionsPage.SELECT_TICKET));
    }
}
