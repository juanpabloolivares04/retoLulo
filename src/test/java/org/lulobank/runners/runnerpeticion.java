package org.lulobank.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= "src/test/resources/features/peticiones.feature",
        glue = "org.lulobank.stepsdefinitions",
        tags = "@clientesTodos")
public class runnerpeticion {
}
