package co.com.devco.certification.booking.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SessionPage extends PageObject {
    public static final Target OPTION_YOU_ACCOUNT = Target.the("option you account").located(By.id("profile-menu-trigger--title"));

}
