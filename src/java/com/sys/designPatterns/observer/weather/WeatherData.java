package com.sys.designPatterns.observer.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observerList = new ArrayList<>();

    private String title;
    private String name;

    /**
     * 观察者注册
     *
     * @param observer
     */
    @Override
    public void registerObserve(Observer observer) {
        this.observerList.add(observer);
    }

    /**
     * 观察者注销
     *
     * @param observer
     */
    @Override
    public void removeObserve(Observer observer) {
        int i = observerList.indexOf(observer);
        if (i >= 0) {
            observerList.remove(i);
        }
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObserve() {
        for (Observer observer : observerList) {
            observer.update(this.title, this.name);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
