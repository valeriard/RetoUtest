package co.com.choucair.retotecnico.utest.tasks;

import co.com.choucair.retotecnico.utest.model.Data;
import co.com.choucair.retotecnico.utest.userinterface.UtestCompletee;
import static co.com.choucair.retotecnico.utest.userinterface.UtestSignIn.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class SingIn implements Task {
    Data dataUser;

    public SingIn(Data dataUser) {
        this.dataUser = dataUser;
    }

    public static SingIn theUser(Data dataUser) {
        return Tasks.instrumented(SingIn.class,dataUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestCompletee.BUTTON_LOGIN),
                Click.on(BUTTON_PASSWORD),
                Enter.theValue(dataUser.getEmail()).into(BUTTON_EMAILADDRESS),
                Click.on(BUTTON_PASSWORD),
                Enter.theValue(dataUser.getPassword()).into(BUTTON_PASSWORD),
                Click.on(BUTTON_SIGIN)
        );

    }
}
