package co.com.choucair.retotecnico.utest.tasks;

import co.com.choucair.retotecnico.utest.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.choucair.retotecnico.utest.userinterface.UtestPage.*;

public class OpenUp implements Task {
    private UtestPage utestPage;

    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPage),
                Click.on(BUTTON_JOIN));
    }
}
