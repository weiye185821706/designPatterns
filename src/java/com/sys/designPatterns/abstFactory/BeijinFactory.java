package com.sys.designPatterns.abstFactory;

public class BeijinFactory implements PizzFactory{
    @Override
    public Pizza create() {
        return new NainaoPizza();
    }
}
