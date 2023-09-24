package com.pacemrc.java.object._constructor;

/**
 * 演示无参构造函数
 * note：
 * 1、构造方法的作用：创建对象
 * 2、无参构造方法，在创建对象时不对对象的属性进行赋值，java为没有初始化的属性提供默认值
 * 3、当类中没有定义构造方法时，java会默认提供一个无参的构造方法
 */
public class User {
    String name;
    int age;

//    public User(){};

    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.name);//null
        System.out.println(user.age);//0

    }
}
