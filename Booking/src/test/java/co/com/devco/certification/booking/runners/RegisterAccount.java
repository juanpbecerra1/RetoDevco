package co.com.devco.certification.booking.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register_account.feature",
        glue = "co.com.devco.certification.booking.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RegisterAccount {
}
