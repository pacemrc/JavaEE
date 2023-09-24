package com.pacemrc.java.object._constructor;

/**
 * 演示有参构造函数
 * note:
 * 1、有参构造方法的作用，在创建对象时同时给对象的属性赋值
 */
public class User2 {

    String name;
    int age;

    //定义了一个有参构造方法
    public User2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User2 user2 = new User2("caofalin", 23);
        System.out.println(user2.name);
        System.out.println(user2.age);
    }
}
