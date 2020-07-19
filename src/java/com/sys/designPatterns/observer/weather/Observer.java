package com.sys.designPatterns.observer.weather;

/**
 * 观察者接口
 */
public interface Observer {
    /**
     * 更新
     */
    void update(String title, String name);
}
