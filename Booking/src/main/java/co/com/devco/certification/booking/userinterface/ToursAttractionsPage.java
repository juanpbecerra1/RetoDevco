package co.com.devco.certification.booking.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ToursAttractionsPage extends PageObject {
    public static final Target INPUT_SEARCH = Target.the("input search").located(By.name("query"));
    public static final Target COUNTRY_DESTINATION = Target.the("country destination")
            .locatedBy("//div[text()='{0}']");
    public static final Target DESTINATION = Target.the("destination")
            .locatedBy("//h4[contains(text(),'{0}')]");
    public static final Target SELECT_DESTINATION = Target.the("select destination")
            .locatedBy("//button[@data-testid = 'select-ticket']");
    public static final Target CALENDAR = Target.the("calendar")
            .locatedBy("//div[@data-testid='datepicker']");
    public static final Target BTN_NEXT = Target.the("button next")
            .locatedBy("//button[contains(@class,'Calendar-module__control--next')]");
    public static final Target BTN_SEARCH = Target.the("button search")
            .locatedBy("//button[@type='submit']");
    public static final Target LABEL_NUMBER_PASSENGERS = Target.the("label number of passengers")
            .locatedBy("(//div[contains(@class,'Text-module__root--variant-strong_2')])[2]");
    public static final Target ADD_PASSENGER = Target.the("add  passenger")
            .locatedBy("//button[@data-testid='add-ticket']");
    public static final Target SELECT_TICKET = Target.the("Select Ticket")
            .locatedBy("//button[@data-testid='select-ticket']");
}
