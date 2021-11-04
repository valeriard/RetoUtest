package co.com.choucair.retotecnico.utest.tasks;

import co.com.choucair.retotecnico.utest.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static co.com.choucair.retotecnico.utest.userinterface.UtestDataPersonal.*;

public class DataPersonal implements Task {
    Data dataUser;

    public DataPersonal(Data dataUser) {
        this.dataUser = dataUser;
    }

    public static DataPersonal usernew(Data dataUser) {
        return Tasks.instrumented(DataPersonal.class,dataUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataUser.getFirstname()).into(INPUT_FIRSTNAME),
                Enter.theValue(dataUser.getLastname()).into(INPUT_LASTNAME),
                Enter.theValue(dataUser.getEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(dataUser.getMonth()).from(BUTTON_DATEBIRTHDAY),
                SelectFromOptions.byVisibleText(dataUser.getDay()).from(BUTTON_DAY),
                SelectFromOptions.byVisibleText(dataUser.getYear()).from(BUTTON_YEAR),
                Click.on(BUTTON_LANGUAGE),
                Enter.theValue(dataUser.getLanguages()).into(BUTTON_LANGUAGE).thenHit(Keys.ENTER),
                Click.on(BUTTON_NEXTLOCATION));
    }
}
