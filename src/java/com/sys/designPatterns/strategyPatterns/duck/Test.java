package com.sys.designPatterns.strategyPatterns.duck;

/**
 * 策略模式：把需要变化的地方封装成接口，将调用的方法委托给封装接口来调用。这样的好处就是，代码复用，便于扩展
 * 策略模式官译：定义了算法族（变化的地方封装成接口）,分别封装起来，让他们之间可以相互替换，此模式
 * 让算法的变化独立于使用算法的客户
 *
 *
 * 设计原则：多用组合少用继承
 *
 */
public class Test {

    public static void main(String[] args) {
        Duck duck = new RedDuck();
        duck.display();
        duck.performFly();
        duck.setFlyBehavior(new FlyBehaviorImp());
        duck.performFly();
        duck.performQuack();
    }

}
