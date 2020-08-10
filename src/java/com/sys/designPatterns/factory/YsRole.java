package com.sys.designPatterns.factory;

public class YsRole extends RoleBase {
    @Override
    void qSkill() {
        System.out.println(this.getName() + ":放了q技能打到一个小兵");
    }

    @Override
    void wSkill() {
        System.out.println(this.getName() + ":面对疾风吧");

    }

    @Override
    void eSkill() {
        System.out.println(this.getName() + ":用e技能开启快乐模式");
    }

    @Override
    void rSkill() {
        System.out.println(this.getName() + ":放了大招瞬间没了");
    }
}
