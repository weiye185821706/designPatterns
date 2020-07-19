package com.sys.designPatterns.observer.weather;

public class Wei implements Observer, DispalyServer {
    @Override
    public void dispaly() {
        System.out.println("wei接收了会议消息");
    }

    @Override
    public void update(String title, String name) {
        this.dispaly();
        System.out.println("通知标题为：" + title + "。通知内容为：" + name);
    }
}
