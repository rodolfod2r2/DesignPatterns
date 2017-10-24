package br.com.designpatterns.AbstractFactoryPattern;

import br.com.designpatterns.FactoryPattern.Forma;

public abstract class AbstractFactory {
    public abstract Cor getCor(String cor);
    public abstract Forma getForma(String forma);
}
