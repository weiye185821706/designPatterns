package com.sys.designPatterns.factory;

public abstract class RoleBase {

    private String name;

    public void dancing() {
        System.out.println(this.name + "：英雄正在嘲讽对面");
    }

    abstract void qSkill();

    abstract void wSkill();

    abstract void eSkill();

    abstract void rSkill();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
