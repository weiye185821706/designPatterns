package com.sys.designPatterns.strategyPatterns.duck;

public class QuackBehaviorImp implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
