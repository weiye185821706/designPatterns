package com.sys.designPatterns.observer.weather;

/**
 * 定义气象主接口
 */
public interface Subject {

    void registerObserve(Observer observer);

    void removeObserve(Observer observer);

    void notifyObserve();

}
