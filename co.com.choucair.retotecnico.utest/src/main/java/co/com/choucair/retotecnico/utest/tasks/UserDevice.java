package co.com.choucair.retotecnico.utest.tasks;

import co.com.choucair.retotecnico.utest.model.Data;
import co.com.choucair.retotecnico.utest.userinterface.UtestDevice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.openqa.selenium.Keys;

import static co.com.choucair.retotecnico.utest.userinterface.UtestDevice.*;

public class UserDevice implements Task {
    Data dataUser;

    public UserDevice(Data dataUser) {
        this.dataUser = dataUser;
    }

    public static UserDevice inUse(Data dataUser) {
    return Tasks.instrumented(UserDevice.class,dataUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_YOURCOMPUTER),
                MoveMouse.to(BUTTON_WINDOWS).andThen(actions -> actions.click()),
                Click.on(BUTTON_VERSION),
                MoveMouse.to(BUTTON_VESIONIN).andThen(actions -> actions.click()),
                Click.on(BUTTON_LANGUAGUE2),
                MoveMouse.to(BUTTON_LANGUAGUESPANISH).andThen(actions -> actions.click()),
                Click.on(BUTTON_MOBILE),
                MoveMouse.to(BUTTON_MOBILEDEVICE).andThen(actions -> actions.click()),
                Click.on(BUTTON_MODEL),
                Enter.theValue(dataUser.getModel()).into(BUTTON_MODELCLICK).thenHit(Keys.ENTER),
                Click.on(BUTTON_OPERATINGSYSTEMCLICK),
                Enter.theValue(dataUser.getSyos()).into(BUTTON_OPERATINGSYSTEMCLICKIOS).thenHit(Keys.ENTER),
                Click.on(BUTTON_NEXTLASTSTEP));
    }
}
