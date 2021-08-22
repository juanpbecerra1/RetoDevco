package co.com.devco.certification.booking.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataTourAttractionsPage extends PageObject {
    public static final Target INPUT_NAME = Target.the("input name").located(By.name("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("input last name").located(By.name("lastName"));
    public static final Target INPUT_EMAIL = Target.the("input email").located(By.name("email"));
    public static final Target INPUT_EMAIL_CONFIRM = Target.the("input email confirm").located(By.name("emailConfirm"));
    public static final Target INPUT_PHONE = Target.the("input phone").located(By.name("phone"));
    public static final Target BUTTON_NEXT = Target.the("button next").located(By.xpath("//button[@type='submit']"));
    public static final Target LOADER = Target.the("loader")
            .located(By.xpath("//p[text()='Un momento, estamos preparando tu selección']"));
}
