package com.sys.designPatterns.observer.weather;

/**
 * 观察者模式：首先定义一个主题，然后封装观察者，最后观察者注册到主题里面就可以收到通知。好处：松耦合，主题不知道
 * 通知哪个对象，只需要知道我数据更新了通知就行了。而观察者也不需要知道到底是谁通知的。只需要处理自己收到数据的逻辑
 */
public class Test {

    public static void main(String[] args) {
        Tome tome = new Tome();
        Wei wei = new Wei();

        WeatherData weatherData = new WeatherData();
        weatherData.setName("开会");
        weatherData.setTitle("泡妞");
        weatherData.registerObserve(tome);
        weatherData.registerObserve(wei);
        weatherData.notifyObserve();
        weatherData.removeObserve(wei);
        weatherData.notifyObserve();
    }
}
