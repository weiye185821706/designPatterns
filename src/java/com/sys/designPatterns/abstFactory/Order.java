package com.sys.designPatterns.abstFactory;

public class Order {

    private PizzFactory pizzFactory;

    public Order(PizzFactory pizzFactory) {
        this.createFactory(pizzFactory);
    }

    private void createFactory(PizzFactory pizzFactory) {
        this.pizzFactory = pizzFactory;
        Pizza pizza = pizzFactory.create();
        pizza.create();
        pizza.cut();
        pizza.eat();
    }

}
