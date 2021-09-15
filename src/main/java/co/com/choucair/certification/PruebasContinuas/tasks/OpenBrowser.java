package co.com.choucair.certification.PruebasContinuas.tasks;

import co.com.choucair.certification.PruebasContinuas.userinterface.BanistmoHomePage;
import co.com.choucair.certification.PruebasContinuas.userinterface.BanistmoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Task {

    private BanistmoHomePage banistmoHomePage;

    public static OpenBrowser atBanistmoPage() {
        return Tasks.instrumented(OpenBrowser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(banistmoHomePage));
    }
}
