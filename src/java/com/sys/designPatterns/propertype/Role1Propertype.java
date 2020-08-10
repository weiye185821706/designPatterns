package com.sys.designPatterns.propertype;

import java.io.*;

/**
 * 深拷贝（通过序列化方式深拷贝）
 */
public class Role1Propertype implements Cloneable, Serializable {
    private String name;

    private Integer age;

    public Role1Propertype(String name, Integer age) {
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

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        ObjectInputStream objectInputStream;
        try {
            // 系列化
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(arrayOutputStream);
            objectOutputStream.writeObject(this);
            // 反序列化
            ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(arrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(arrayInputStream);
            return objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
