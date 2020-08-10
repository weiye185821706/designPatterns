package com.sys.designPatterns.propertype;

/**
 * 浅拷贝（只会拷贝基本数据类型，引用类型只会拷贝对象的引用地址）
 */
public class RolePropertype implements Cloneable{
    private String name;

    private Integer age;

    public RolePropertype(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "RolePropertype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
