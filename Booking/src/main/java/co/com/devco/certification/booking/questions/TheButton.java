package co.com.devco.certification.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.devco.certification.booking.userinterface.ResultsFlightsPage.BTN_VIEW_DEAL;

public class TheButton implements Question<String> {
    public static TheButton is() {
        return new TheButton();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(BTN_VIEW_DEAL).viewedBy(actor).asString();
    }
}
