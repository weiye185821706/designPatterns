package com.sys.designPatterns.strategyPatterns.duck;

public class FlyKSImp implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("快速飞行");
    }
}
