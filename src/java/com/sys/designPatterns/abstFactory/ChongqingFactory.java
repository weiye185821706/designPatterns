package com.sys.designPatterns.abstFactory;

public class ChongqingFactory implements PizzFactory {
    @Override
    public Pizza create() {
        return new NiunaiPizza();
    }
}
