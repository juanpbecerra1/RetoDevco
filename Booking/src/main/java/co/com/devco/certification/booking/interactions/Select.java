package co.com.devco.certification.booking.interactions;

import co.com.devco.certification.booking.userinterface.HomePage;
import co.com.devco.certification.booking.utils.date.ConvertDate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class Select implements Interaction {
    private String date;


    public Select(String date) {
        this.date = date;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        while(!Text.of(HomePage.CALENDAR_MOTH_YEAR)
                .viewedBy(actor).asString().equals(ConvertDate.getMothYear(date))){
          actor.attemptsTo(Click.on(HomePage.CALENDAR_NEXT_MOTH));
        }
        actor.attemptsTo(Click.on(HomePage.CALENDAR_DAY.of(ConvertDate.getDay(date))));

    }

    public static Select date(String date){
        return Tasks.instrumented(Select.class, date);
    }
}
