package org.lulobank.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.assertj.core.api.Assertions.assertThat;

public class resultados implements Question {

    public static Question<Integer> was (){
        return new resultados();
    }

    @Override
    public Integer status(Actor actor){
        return SerenityRest.lastResponse().statusCode();
    }


}
