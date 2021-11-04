package co.com.choucair.retotecnico.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSignIn {
    public static final Target BUTTON_EMAILADDRESS= Target.the("EMAIL ADDRESS")
            .located(By.xpath("//input[contains(@name,'username')]"));
    public static final Target BUTTON_PASSWORD= Target.the(" ENTER PASSWORD")
            .located(By.xpath("//input[contains(@name,'password')]"));
    public static final Target BUTTON_SIGIN= Target.the("SIGN IN")
            .located(By.xpath("//button[@class='btn'][contains(.,'Sign in')]"));
    public static final Target BUTTON_VERIFY= Target.the("VERIFY")
            .located(By.xpath("//span[contains(.,'')]"));
}
