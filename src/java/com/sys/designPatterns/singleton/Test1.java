package com.sys.designPatterns.singleton;

/**
 * 懒汉式（这种方式线程不安全）
 */
public class Test1 {

    private static volatile Test1 instance;

    private Test1() {

    }

    public static Test1 getInstance() {
        if (instance != null) {
            return instance;
        }
        synchronized (Test1.class) {
            if (instance == null) {
                instance = new Test1();
            }
        }
        return instance;
    }

}
