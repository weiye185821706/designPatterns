package com.sys.designPatterns.singleton;

/**
 * 单例模式（饿汉式）可能造成内存浪费 2.第二种写法（静态代码块）
 */
public class Test {

    private Test() {

    }

    private final static Test instance = new Test();

    public static Test getinstance() {
        return instance;
    }

}
