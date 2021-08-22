package co.com.devco.certification.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TheLabel implements Question<String> {
    private final Target target;

    public TheLabel(Target target) {
        this.target = target;
    }

    public static TheLabel is(Target target) {
        return new TheLabel(target);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString();
    }
}
