package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.models.ToursAttractionsData;
import co.com.devco.certification.booking.userinterface.ConfirmPaymentPage;
import co.com.devco.certification.booking.userinterface.DataTourAttractionsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class EnterData implements Task {
    private final ToursAttractionsData toursAttractionsData;

    public EnterData(ToursAttractionsData toursAttractionsData) {
        this.toursAttractionsData = toursAttractionsData;
    }

    public static EnterData ofUser(ToursAttractionsData toursAttractionsData) {
        return Tasks.instrumented(EnterData.class, toursAttractionsData);
    }

    @Step("{0} enters data of user")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(DataTourAttractionsPage.INPUT_NAME, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(5).seconds(),
                Enter.theValue(toursAttractionsData.getName()).into(DataTourAttractionsPage.INPUT_NAME),
                Enter.theValue(toursAttractionsData.getLastName()).into(DataTourAttractionsPage.INPUT_LAST_NAME),
                Enter.theValue(toursAttractionsData.getMail()).into(DataTourAttractionsPage.INPUT_EMAIL),
                Enter.theValue(toursAttractionsData.getMail()).into(DataTourAttractionsPage.INPUT_EMAIL_CONFIRM),
                Enter.theValue(toursAttractionsData.getPhoneNumber()).into(DataTourAttractionsPage.INPUT_PHONE),
                Click.on(DataTourAttractionsPage.BUTTON_NEXT),
                WaitUntil.the(ConfirmPaymentPage.LABEL_STEPS, WebElementStateMatchers.isVisible())
        );
    }
}
