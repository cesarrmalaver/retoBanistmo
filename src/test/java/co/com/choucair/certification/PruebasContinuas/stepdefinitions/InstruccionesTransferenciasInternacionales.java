package co.com.choucair.certification.PruebasContinuas.stepdefinitions;


import co.com.choucair.certification.PruebasContinuas.model.NombrePagina;
import co.com.choucair.certification.PruebasContinuas.questions.Answer;
import co.com.choucair.certification.PruebasContinuas.tasks.OpenBrowser;
import co.com.choucair.certification.PruebasContinuas.tasks.OpenUp;
import co.com.choucair.certification.PruebasContinuas.tasks.Verificar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class InstruccionesTransferenciasInternacionales {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("than Cesar wants to know about Instrucciones para completar transferencias internacionales")
    public void thanCesarWantsToKnowAboutInstruccionesParaCompletarTransferenciasInternacionales() {
        theActorCalled("Cesar").wasAbleTo(OpenBrowser.atBanistmoPage());
    }

    @When("^he seach for the PDF document$")
    public void heSeachForThePDFDocument() {
        theActorInTheSpotlight().attemptsTo(
                Verificar.elBuscadorDeSucursales()
        );

    }

    @Then("^he find the PDF document related to Instrucciones para completar transferencias internacionales$")
    public void heFindThePDFDocumentRelatedToInstruccionesParaCompletarTransferenciasInternacionales(List<NombrePagina> nombrePagina){
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(nombrePagina.get(1))));
    }


}
