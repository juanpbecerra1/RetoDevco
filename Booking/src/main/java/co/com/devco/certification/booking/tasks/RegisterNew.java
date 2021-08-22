package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.models.UserAccount;
import co.com.devco.certification.booking.userinterface.HomePage;
import co.com.devco.certification.booking.userinterface.LoginPage;
import co.com.devco.certification.booking.userinterface.RegisterAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class RegisterNew implements Task {
    private UserAccount userAccount;

    public RegisterNew(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTN_MAKE_AN_ACCOUNT),
                Enter.theValue(userAccount.getMail()).into(RegisterAccountPage.INPUT_MAIL),
                Click.on(RegisterAccountPage.BUTTON_CONTINUE_WITH_EMAIL),
                WaitUntil.the(RegisterAccountPage.INPUT_PASSWORD, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(5).seconds(),
                Enter.theValue(userAccount.getPassword()).into(RegisterAccountPage.INPUT_PASSWORD),
                Enter.theValue(userAccount.getPassword()).into(RegisterAccountPage.INPUT_CONFIRMED_PASSWORD),
                Click.on(RegisterAccountPage.BUTTON_CREATE_NEW_ACCOUNT));

    }
    public static RegisterNew account(UserAccount userAccount){
        return Tasks.instrumented(RegisterNew.class, userAccount);
    }
}
