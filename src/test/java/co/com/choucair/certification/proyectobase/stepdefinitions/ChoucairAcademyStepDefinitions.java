package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Julio is a young man who wants to be part of the Choucair Company$")
    public void JulioisayoungmanwhowantstobepartoftheChoucairCompany() {
        OnStage.theActorCalled("Julio").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));


    }

    @When("^he search for the course Recursos Automatizacion Bancolombia on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform () {


    }

    @Then("^he finds the course called resorces Recursos Automatizacion Bancolombia$")
    public void heFindsTheCourseCalledResorcesRecursosAutomatizacionBancolombia() {

    }


}
