package co.com.devco.certification.booking.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultsAccommodationPage extends PageObject {
    public static final Target LABEL_ACCOMMODATIONS_FOUNDS = Target.the("label accommodations found")
            .located(By.xpath("//div[@class='sr_header ']//h1"));
    public static final Target LABEL_PAYMENT = Target.the("label payment")
            .locatedBy("//div[@class='css-19vrgv4']//h2");
}
