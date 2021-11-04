package co.com.choucair.retotecnico.utest.tasks;

import co.com.choucair.retotecnico.utest.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.openqa.selenium.Keys;
import static co.com.choucair.retotecnico.utest.userinterface.UtestAddress.*;

public class UserAddress implements Task {
    Data dataUser;

    public UserAddress(Data dataUser) {
        this.dataUser = dataUser;
    }

    public static UserAddress theUser(Data dataUser) {
        return Tasks.instrumented(UserAddress.class,dataUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Click.on(INPUT_CITY),
                Enter.theValue(dataUser.getCity()).into(INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(INPUT_CITY),
                Click.on(INPUT_POSTAL),
                Enter.theValue(dataUser.getPostal()).into(INPUT_POSTAL),
                Click.on(BUTTON_COUNTRY),
                MoveMouse.to(BUTTON_COLOMBIA).andThen(actions -> actions.click()),
                Click.on(BUTTON_NEXDEVICE));
    }
}
