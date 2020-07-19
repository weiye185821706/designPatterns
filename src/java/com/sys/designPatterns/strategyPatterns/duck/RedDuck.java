package com.sys.designPatterns.strategyPatterns.duck;

public class RedDuck extends Duck{


    public RedDuck() {
        this.flyBehavior = new FlyKSImp();
        this.quackBehavior = new QuackBehaviorImp();
    }

    @Override
    public void swim() {
        System.out.println("游泳");
    }

    @Override
    public void display() {
        System.out.println("我是一直红鸭子");
    }
}
