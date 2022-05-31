package org.lulobank.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lulobank.tasks.getAllClientes;
import org.openqa.selenium.remote.ResponseCodec;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/*@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= "src/test/resources/features/peticiones.feature",
        glue = "org.lulobank.stepdefinitions",
        tags = "@clientesTodos")*/
@RunWith(SerenityRunner.class)
public class runnerpeticion {
    private static final String APIURL="http://dummy.restapiexample.com/api/v1";

    @Test
    public void getAllUsers(){
        Actor Juan = Actor.named("Juan the customer").whoCan(CallAnApi.at(APIURL));
       Juan.should(seeThat("el mensaje es: ", ResponseCode.was(), equalTo(200)));

    }

}


