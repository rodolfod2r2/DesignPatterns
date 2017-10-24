package br.com.designpatterns.AbstractFactoryPattern;

import br.com.designpatterns.FactoryPattern.Forma;

public class CorFactory extends AbstractFactory {
    @Override
    public Cor getCor(String cor) {
        if(cor == null){
            return null;
        }

        if(cor.equalsIgnoreCase("VERMELHO")){
            return new Vermelho();
        } else if(cor.equalsIgnoreCase("VERDE")){
            return new Verde();
        } else if(cor.equalsIgnoreCase("AZUL")){
            return new Azul();
        }

        return null;
    }

    @Override
    public Forma getForma(String forma) {
        return null;
    }
}
