package co.com.choucair.certification.PruebasContinuas.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

public class BuscadorSucursales extends PageObject {


    public static final Target BOTON_EMPRESAS = Target.the("Boton para ir a empresas").
            located(By.xpath("(//span[contains(text(), 'Empresas')])[3]"));

}
