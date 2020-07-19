package com.sys.designPatterns.strategyPatterns.duck;

public class FlyBehaviorImp implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("我会飞行");
    }
}
