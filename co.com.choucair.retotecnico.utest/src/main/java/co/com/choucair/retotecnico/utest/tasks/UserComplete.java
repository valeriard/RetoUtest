package co.com.choucair.retotecnico.utest.tasks;

import co.com.choucair.retotecnico.utest.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.choucair.retotecnico.utest.userinterface.UtestCompletee.*;
public class UserComplete implements Task {
    Data dataUser;

    public UserComplete(Data dataUser) {
        this.dataUser = dataUser;
    }

    public static UserComplete thedata(Data dataUser) {
        return Tasks.instrumented(UserComplete.class,dataUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_PASSWORD),
                Enter.theValue(dataUser.getPassword()).into(BUTTON_PASSWORD),
                Click.on(BUTTON_PASSWORD_CONFIRM),
                Enter.theValue(dataUser.getPassword()).into(BUTTON_PASSWORD_CONFIRM),
                Click.on(CLICK_ACCEPT_TERMS),
                Click.on(CLICK_PRIVACY_SECURITY),
                Click.on(BUTTON_COMPLETE));
    }
}
