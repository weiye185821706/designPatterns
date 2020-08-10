package com.sys.designPatterns.abstFactory;

public abstract class Pizza {

    public abstract void create();

    public void cut() {
        System.out.println("切披萨");
    }
    public void eat() {
        System.out.println("吃披萨");
    }
}
