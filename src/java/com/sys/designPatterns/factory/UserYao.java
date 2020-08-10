package com.sys.designPatterns.factory;

public class UserYao {

    public UserYao() {
        RoleBase roleBase = RoleFactory.create(RoleType.YASUO);
        roleBase.qSkill();
        roleBase.eSkill();
        roleBase.wSkill();
        roleBase.rSkill();
        RoleBase roleBase1 = RoleFactory.create(RoleType.JIE);
        roleBase1.rSkill();
    }

}
