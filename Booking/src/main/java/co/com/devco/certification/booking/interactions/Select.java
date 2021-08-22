package co.com.devco.certification.booking.interactions;

import co.com.devco.certification.booking.userinterface.HomePage;
import co.com.devco.certification.booking.utils.date.ConvertDate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class Select implements Interaction {
    private String date;
    private Target next;


    public Select(String date, Target next) {
        this.date = date;
        this.next = next;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        while(!Text.of(HomePage.CALENDAR_MOTH_YEAR)
                .viewedBy(actor).asString().equals(ConvertDate.getMothYear(date))){
          actor.attemptsTo(Click.on(next));
        }
        actor.attemptsTo(Click.on(HomePage.CALENDAR_DAY.of(ConvertDate.getDay(date))));

    }

    public static Select date(String date, Target next){
        return Tasks.instrumented(Select.class, date, next);
    }
}
