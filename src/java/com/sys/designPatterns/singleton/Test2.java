package com.sys.designPatterns.singleton;

/**
 * 静态类部类创建单例（线程安全，并且做到了懒加载推荐使用）
 */
public class Test2 {

    private Test2() {

    }

    private static class Test2Instance {
        private static final Test2 INSTANCE = new Test2();
    }

    public static Test2 getInstance() {
        return Test2Instance.INSTANCE;
    }

}
