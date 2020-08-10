package com.sys.designPatterns.abstFactory;

public class NainaoPizza extends Pizza{
    @Override
    public void create() {
        System.out.println("创建奶酪披萨");
    }
}
