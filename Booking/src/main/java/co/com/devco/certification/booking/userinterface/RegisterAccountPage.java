package co.com.devco.certification.booking.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterAccountPage extends PageObject {
    public static final Target INPUT_MAIL = Target.the("input mail").located(By.id("username"));
    public static final Target BUTTON_CONTINUE_WITH_EMAIL = Target.the("button continue with email")
            .locatedBy("//button[@class='bui-button bui-button--large bui-button--wide']");
    public static final Target INPUT_PASSWORD = Target.the("input password").located(By.id("new_password"));
    public static final Target INPUT_CONFIRMED_PASSWORD = Target.the("input confirmed password").located(By.id("confirmed_password"));
    public static final Target BUTTON_CREATE_NEW_ACCOUNT = Target.the("button create new account")
            .locatedBy("//button[@class='bui-button bui-button--large bui-button--wide']");
}
