package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.models.UserAccount;
import co.com.devco.certification.booking.userinterface.HomePage;
import co.com.devco.certification.booking.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {
    private final UserAccount userAccount;

    public Login(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public static Login withCredentials(UserAccount userAccount) {
        return instrumented(Login.class, userAccount);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTN_LOGIN),
                Enter.theValue(userAccount.getMail()).into(LoginPage.INPUT_MAIL),
                Click.on(LoginPage.BUTTON_CONTINUE_WITH_EMAIL),
               WaitUntil.the(LoginPage.INPUT_PASSWORD, WebElementStateMatchers.isVisible())
                       .forNoMoreThan(5).seconds(),
                Enter.theValue(userAccount.getPassword()).into(LoginPage.INPUT_PASSWORD),
                Click.on(LoginPage.BUTTON_LOGIN));

    }
}
