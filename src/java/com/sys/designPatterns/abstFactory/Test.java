package com.sys.designPatterns.abstFactory;

public class Test {
    public static void main(String[] args) {
        new Order(new ChongqingFactory());
    }
}
