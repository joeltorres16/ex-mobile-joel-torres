package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SwagLabsStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SwagLabStepDefs {
    @Steps
    SwagLabsStep swagLabsStep;

    @Given("que me encuentro en el Login de SwagLabs")
    public void queMeEncuentroEnElLoginDeSwagLabs() {
    }

    @When("ingreso usuario {string} y password {string}")
    public void ingresoUsuarioYPasswordValidos(String user, String pass) {
        swagLabsStep.inputCredential(user, pass);
    }

    @Then("encuentro la palabra {string} y valido la existencia de al menos un item")
    public void encuentroLaPalabraYValidoLaExistenciaDeAlMenosUnItem(String title) {
        Assert.assertEquals(swagLabsStep.title(),title);
        System.out.println("El titulo encontrado es: "+swagLabsStep.title());

        System.out.println("La cantidad de Items es: "+swagLabsStep.sizeList());
    }

    @Then("valido el mensaje de error {string}")
    public void validoElMensajeDeError(String message) {
        Assert.assertEquals(swagLabsStep.getTextError(),message);
    }
}
