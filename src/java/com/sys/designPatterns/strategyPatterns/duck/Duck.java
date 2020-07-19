package com.sys.designPatterns.strategyPatterns.duck;

/**
 * 鸭子共同行为类
 */
public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    /**
     * 鸭子游泳
     */
    public abstract void swim();

    /**
     * 鸭子的类型
     */
    public abstract void display();

    /**
     * 委托会飞
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * 委托叫
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
