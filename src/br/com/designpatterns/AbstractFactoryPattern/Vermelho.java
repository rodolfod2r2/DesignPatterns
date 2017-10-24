package br.com.designpatterns.AbstractFactoryPattern;

public class Vermelho implements Cor {
    @Override
    public void preenchimento() {
        System.out.println("Cor: Vermelho");
    }
}
