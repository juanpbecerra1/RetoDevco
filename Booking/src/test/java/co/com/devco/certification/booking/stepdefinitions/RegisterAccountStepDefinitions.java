package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.models.UserAccount;
import co.com.devco.certification.booking.tasks.RegisterNew;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;


public class RegisterAccountStepDefinitions {
    @When("he enters the register data")
    public void heEntersTheRegisterData(List<UserAccount> userAccount) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegisterNew.account(userAccount.get(0)));
    }
}
