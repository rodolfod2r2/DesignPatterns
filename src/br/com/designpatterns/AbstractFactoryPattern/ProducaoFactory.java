package br.com.designpatterns.AbstractFactoryPattern;

import br.com.designpatterns.FactoryPattern.FormaFactory;

public class ProducaoFactory {

    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("SHAPE")){

            return new FormaFactory();

        } else if(choice.equalsIgnoreCase("COLOR")){

            return new CorFactory();

        }

        return null;
    }
}
