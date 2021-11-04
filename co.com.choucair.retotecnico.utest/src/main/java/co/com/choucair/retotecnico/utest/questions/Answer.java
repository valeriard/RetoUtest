package co.com.choucair.retotecnico.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.retotecnico.utest.userinterface.UtestSignIn.*;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String SignEmail = Text.of(BUTTON_VERIFY).viewedBy(actor).asString();

        if(question.equals(SignEmail)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
