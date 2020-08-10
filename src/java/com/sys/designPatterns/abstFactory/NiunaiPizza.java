package com.sys.designPatterns.abstFactory;

public class NiunaiPizza extends Pizza{
    @Override
    public void create() {
        System.out.println("创建牛奶披萨");
    }
}
