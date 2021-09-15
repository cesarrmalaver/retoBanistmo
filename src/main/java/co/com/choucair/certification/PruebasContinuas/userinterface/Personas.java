package co.com.choucair.certification.PruebasContinuas.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Personas {
    public static final Target PRODUCTOS_SERVICIOS_BUTTON = Target.the("Boton de productos y servicios").
            located(By.xpath("//a[@class='dropdown-toggle']"));

    public static final Target TRANSFERENCIAS_INTERNACIONALES_BUTTON = Target.the("Boton de transferencias internacionales").
            located(By.xpath("//a[contains(@href, '/wps/portal/banistmo/personas/productos-y-servicios/transferencias-internacionales')]"));
}
