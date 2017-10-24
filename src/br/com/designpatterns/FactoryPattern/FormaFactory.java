package br.com.designpatterns.FactoryPattern;

import br.com.designpatterns.AbstractFactoryPattern.AbstractFactory;
import br.com.designpatterns.AbstractFactoryPattern.Cor;

public class FormaFactory extends AbstractFactory {

    @Override
    public Cor getCor(String cor) {
        return null;
    }

    public Forma getForma(String tipoForma) {

        if (tipoForma == null) {
            return null;
        }
        if (tipoForma.equalsIgnoreCase("CIRCULO")) {
            return new Circulo();
        } else if (tipoForma.equalsIgnoreCase("RETANGULO")) {
            return new Retangulo();
        } else if (tipoForma.equalsIgnoreCase("QUADRADO")) {
            return new Quadrado();
        }
        return null;
    }

}
