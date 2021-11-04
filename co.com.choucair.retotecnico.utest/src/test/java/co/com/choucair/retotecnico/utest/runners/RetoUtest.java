package co.com.choucair.retotecnico.utest.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/retoUtest.feature",
        tags = "@NewUser",
        glue = "co.com.choucair.retotecnico.utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RetoUtest {
}
