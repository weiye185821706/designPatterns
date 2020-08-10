package com.sys.designPatterns.factory;

/**
 * 简单工厂（根据自己的需求创建工厂）
 */
public class RoleFactory {

    public static RoleBase create(RoleType type) {
        switch (type) {
            case JIE:
                JieRole jieRole = new JieRole();
                jieRole.setName("劫");
                return jieRole;
            case YASUO:
                YsRole ysRole = new YsRole();
                ysRole.setName("亚索");
                return ysRole;
            default:
                System.out.println("英雄还不存在");
                break;
        }
        return null;
    }

}
