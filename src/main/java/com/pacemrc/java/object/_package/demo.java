package com.pacemrc.java.object._package;

import com.pacemrc.java.object.Class.User;

/**
 * 演示包和导包
 * note：
 * 1、在包下创建的类会默认申请所属的包
 * 2、使用import 导包
 */

public class demo {
    public static void main(String[] args) {
        User user = new User();
        user.name = "caofalin";
        user.age=  23;
        System.out.println(user.name);
        System.out.println(user.age);
    }


}
