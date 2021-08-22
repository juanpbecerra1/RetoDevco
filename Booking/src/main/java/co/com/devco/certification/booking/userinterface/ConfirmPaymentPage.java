package co.com.devco.certification.booking.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ConfirmPaymentPage extends PageObject {
    public static final Target LABEL_STEPS = Target.the("label steps")
            .locatedBy("//div[text()='Paso 2 de 2']");
}
