package com.sys.designPatterns.factory;

public enum RoleType {

    YASUO("1","亚索"),
    JIE("2", "劫");

    private String value;

    private String name;

    RoleType(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
