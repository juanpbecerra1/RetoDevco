package co.com.devco.certification.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certification.booking.userinterface.SessionPage.OPTION_YOU_ACCOUNT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TheOption implements Question<String> {
    public static TheOption inProfile() {
        return new TheOption();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(OPTION_YOU_ACCOUNT, isVisible()));
        return Text.of(OPTION_YOU_ACCOUNT).viewedBy(actor).asString();
    }
}
