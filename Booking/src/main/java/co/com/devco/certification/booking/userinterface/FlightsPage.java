package co.com.devco.certification.booking.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class FlightsPage extends PageObject {

    public static final Target OPEN_ORIGIN = Target.the("open origin input")
            .locatedBy("//div[contains(@id,'origin-airport')]");
    public static final Target INPUT_ORIGIN = Target.the("input origin")
            .locatedBy("//input[contains(@id,'origin-airport')]");
    public static final Target OPEN_DESTINATION = Target.the("open destination")
            .locatedBy("//div[contains(@id,'destination-airport')]");
    public static final Target INPUT_DESTINATION = Target.the("input destination")
            .locatedBy("//input[contains(@id,'destination-airport')]");
    public static final Target INPUT_ARRIVAL_DATE = Target.the("input arrival date")
            .locatedBy("//div[contains(@class,'date-input')]");
    public static final Target INPUT_DEPARTURE_DATE = Target.the("input departure date")
            .locatedBy("//div[contains(@class,'return-input')]");
    public static final Target BTN_SEARCH = Target.the("Button search")
            .locatedBy("//button[contains(@id,'submit')]");
}
