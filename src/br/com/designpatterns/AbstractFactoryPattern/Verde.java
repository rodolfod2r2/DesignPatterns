package br.com.designpatterns.AbstractFactoryPattern;

public class Verde implements Cor {
    @Override
    public void preenchimento() {
        System.out.println("Cor: Verde");
    }
}
