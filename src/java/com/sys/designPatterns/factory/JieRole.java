package com.sys.designPatterns.factory;

public class JieRole extends RoleBase {
    @Override
    void qSkill() {
        System.out.println(this.getName() + ":放了q技能打到一个小兵");
    }

    @Override
    void wSkill() {
        System.out.println(this.getName() + ":放了分身节能");
    }

    @Override
    void eSkill() {
        System.out.println(this.getName() + ":放了e技能打到一个小兵");
    }

    @Override
    void rSkill() {
        System.out.println(this.getName() + ":放了大招秀死了自己");
    }
}
