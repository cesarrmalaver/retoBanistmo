package co.com.choucair.certification.PruebasContinuas.tasks;

import co.com.choucair.certification.PruebasContinuas.interactions.SwitchWindows;
import co.com.choucair.certification.PruebasContinuas.userinterface.Personas;
import co.com.choucair.certification.PruebasContinuas.userinterface.TransferenciasInternacionales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class Verificar implements Task {

    public static Verificar elBuscadorDeSucursales() {
        return Tasks.instrumented(Verificar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Personas.PRODUCTOS_SERVICIOS_BUTTON),
                Click.on(Personas.TRANSFERENCIAS_INTERNACIONALES_BUTTON),
                Click.on(TransferenciasInternacionales.TRANSFERENCIAS_INTERNACIONALES_BUTTON),
                SwitchWindows.setWindow()
        );
    }
}
