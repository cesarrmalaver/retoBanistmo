package co.com.choucair.certification.PruebasContinuas.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TransferenciasInternacionales {

    public static final Target TRANSFERENCIAS_INTERNACIONALES_BUTTON = Target.the("Boton de para las transferencias internacionales").
            located(By.xpath("(//a[contains(@title,'Adquiérala en nuestras sucursales')])[1]"));
}
