package org.lulobank.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class getAllClientes implements Task {
  //  private static final String ENDPOINTALL= "";

   //Factoty
    public static Performable services(int api){
        return instrumented(getAllClientes.class, api);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource("/employees").with(requestSpecification -> requestSpecification.header("Retry-After", "100")));
    }


}






/*

    private static final String APIURL="http://dummy.restapiexample.com/api/v1/";
    private static final String ENDPOINTALL= "/employees";

    Actor Juan = Actor.named("Juan the customer").whoCan(CallAnApi.at(APIURL));
    Juan.attemptsTo(Get.resource(ENDPOINTALl));
*/



