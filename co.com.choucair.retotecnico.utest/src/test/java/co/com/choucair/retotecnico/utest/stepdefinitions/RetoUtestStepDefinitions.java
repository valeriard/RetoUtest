package co.com.choucair.retotecnico.utest.stepdefinitions;

import co.com.choucair.retotecnico.utest.model.Data;
import co.com.choucair.retotecnico.utest.questions.Answer;
import co.com.choucair.retotecnico.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RetoUtestStepDefinitions {

    @Before
    public void initialConfiguration(){
        setTheStage(new OnlineCast());
    }

    @Given("^Valeria going to create a new user$")
    public void valeriaGoingToCreateANewUser(List<Data> dataUser) {
        theActorCalled("valeria").wasAbleTo(OpenUp.thePage(),DataPersonal.usernew(dataUser.get(0)),
                UserAddress.theUser(dataUser.get(0)), UserDevice.inUse(dataUser.get(0)),UserComplete.thedata(dataUser.get(0)));
    }

    @When("^Valeria going to into sign in$")
    public void valeriaGoingToIntoSignIn(List<Data> dataUser) {
        theActorInTheSpotlight().attemptsTo(SingIn.theUser(dataUser.get(0)));
    }

    @Then("^Valeria going to  verify her account$")
    public void valeriaGoingToVerifyHerAccount(List<Data> dataUser) {
        theActorInTheSpotlight().should(seeThat(Answer.toThe(dataUser.get(0).getEmail())));
    }
}
