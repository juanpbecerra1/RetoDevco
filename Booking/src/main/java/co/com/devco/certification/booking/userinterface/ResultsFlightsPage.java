package co.com.devco.certification.booking.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultsFlightsPage extends PageObject {
    public static final Target BTN_VIEW_DEAL = Target.the("button view deal")
            .located(By.xpath("//span[@class='custom-text']"));
}
