package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue("Julio").into((ChoucairLoginPage.FIRST_NAME)),
                Enter.theValue("Gomez").into(ChoucairLoginPage.LAST_NAME),
                Enter.theValue("juliogm87@hotmail.com").into(ChoucairLoginPage.EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText("June").from(ChoucairLoginPage.MONTH),
                SelectFromOptions.byVisibleText("10").from(ChoucairLoginPage.DAY),
                SelectFromOptions.byVisibleText("1987").from(ChoucairLoginPage.YEAR),
                Click.on(ChoucairLoginPage.NEXT_BUTTON),
                Enter.theValue("Sincelejo sucre").into(ChoucairLoginPage.CITY),
                Click.on(ChoucairLoginPage.CITY_NEXT),
                Enter.theValue("250251").into((ChoucairLoginPage.CODIGO_POSTAL)),
                Click.on(ChoucairLoginPage.NEXT_BUTTON2),
                Click.on(ChoucairLoginPage.NEXT_BUTTON3),
                Enter.theValue("J123456789.").into(ChoucairLoginPage.PASSWORD1),
                Enter.theValue("J123456789.").into(ChoucairLoginPage.PASSWORD),
                Click.on(ChoucairLoginPage.CHECK1),
                Click.on(ChoucairLoginPage.CHECK2),
                Click.on(ChoucairLoginPage.BUTTON_FINISH)
                );

    }
}
