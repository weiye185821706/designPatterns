package com.sys.designPatterns.propertype;

public class Test {
    public static void main(String[] args) throws Exception{
        RolePropertype propertype = new RolePropertype("叶伟", 1);
        RolePropertype clone = (RolePropertype)propertype.clone();
        RolePropertype clone1 = (RolePropertype)propertype.clone();
        RolePropertype clone2 = (RolePropertype)propertype.clone();
        RolePropertype clone3 = (RolePropertype)propertype.clone();
        System.out.println(clone.toString());
        System.out.println(clone1.toString());
        System.out.println(clone2.toString());
        System.out.println(clone3.toString());

    }
}
