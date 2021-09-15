package co.com.choucair.certification.PruebasContinuas.questions;

import co.com.choucair.certification.PruebasContinuas.model.NombrePagina;
import co.com.choucair.certification.PruebasContinuas.userinterface.BuscadorSucursales;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.sql.SQLOutput;

public class Answer implements Question<Boolean> {

    NombrePagina nombrePagina;

    public Answer(NombrePagina nombrePagina) {
        this.nombrePagina = nombrePagina;
    }

    public static Answer toThe(NombrePagina nombrePagina) {
        return new Answer(nombrePagina);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result = false;
        //String currentTitle = "Buscador de Sucursales";

        System.out.println(nombrePagina.getStrNombreDeLaPagina());

        String currentTitle = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();

        System.out.println(currentTitle);
        System.out.println(nombrePagina.getStrNombreDeLaPagina());

        if (currentTitle.contains(nombrePagina.getStrNombreDeLaPagina())){
            result = true;
        }
        return result;

    }
}
