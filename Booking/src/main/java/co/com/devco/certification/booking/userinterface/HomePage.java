package co.com.devco.certification.booking.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {
    public static final Target BTN_LOGIN = Target.the("button login")
            .locatedBy("(//a[@class='bui-button bui-button--secondary js-header-login-link'])[2]");
    public static final Target BTN_MAKE_AN_ACCOUNT = Target.the("button make an account")
            .locatedBy("//span[contains(text(),'Hazte una cuenta')]");
    public static final Target INPUT_ACCOMMODATION = Target.the("input accommodation")
            .locatedBy("//input[@class='c-autocomplete__input sb-searchbox__input sb-destination__input']");
    public static final Target CALENDAR = Target.the("calendar")
            .locatedBy("//div[@class='sb-date-field b-datepicker' or @data-testid='datepicker']");
    public static final Target CALENDAR_MOTH_YEAR = Target.the("calendar moth year")
            .locatedBy("//div[@class='bui-calendar__month' or contains(@class,'Calendar-module__month')]");
    public static final Target CALENDAR_DAY = Target.the("calendar day")
            .locatedBy("//table[@class='bui-calendar__dates' or contains(@class,'Calendar-module__dates')]//span[text()='{0}']");
    public static final Target CALENDAR_NEXT_MOTH = Target.the("next moth")
            .locatedBy("//div[@class='bui-calendar__control bui-calendar__control--next']");
    public static final Target BTN_SEARCH = Target.the("button search")
            .locatedBy("//button[@class='sb-searchbox__button ']");
    public static final Target OPTION_FLIGHTS = Target.the("option flights")
            .locatedBy("//span[contains(text(),'Vuelos')]");
    public static final Target OPTION_TOURS_ATTRACTIONS = Target.the("option tour attractions")
            .locatedBy("//a[@data-decider-header='attractions']");
    public static final Target LABEL_ACCOMMODATIONS = Target.the("label accommodations mayor to 30 days")
            .locatedBy("(//div[@class='fe_banner__message '])[2]");
}
