package br.com.designpatterns.viewDemo;

import br.com.designpatterns.FactoryPattern.Forma;
import br.com.designpatterns.FactoryPattern.FormaFactory;

public class MainDemo {

    public static void main (String[] args){

        //Factory Pattern
        FormaFactory formaFactory = new FormaFactory();

        Forma circulo = formaFactory.getForma("CIRCULO");
        circulo.desenho();

        Forma quadrado = formaFactory.getForma("QUADRADO");
        quadrado.desenho();

        Forma retangulo = formaFactory.getForma("RETANGULO");
        retangulo.desenho();

    }
}
