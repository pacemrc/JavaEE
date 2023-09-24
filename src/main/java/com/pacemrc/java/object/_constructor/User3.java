package com.pacemrc.java.object._constructor;

/**
 * 演示构造方法的重载
 * note：
 * 1、构造方法的重载：一个类中拥有多个不同参数的相同名称的构造方法
 * 2、作用：在创建对象时。根据需要调用不同的构造方法为对象的具体属性进行赋值
 */
public class User3 {

    String name;
    int age;
    boolean rich;

    //创建了一个无参构造方法
    public User3(){};

    //创建了一个有两个参数的构造方法
    public User3(String name, int age){
        this.name = name;
        this.age = age;
    };
    //创建了一个有三个参数的构造方法
    public User3(String name, int age, boolean rich){
        this.name = name;
        this.age = age;
        this.rich = rich;
    };

    public static void main(String[] args) {
        User3 user1 = new User3();
        User3 user2 = new User3("caofalin", 23);
        User3 user3 = new User3("caofalin", 23, true);
        System.out.println("=====================");
        System.out.println("User1");
        System.out.println(user1.name);
        System.out.println(user1.age);
        System.out.println(user1.rich);
        System.out.println("=====================");
        System.out.println("User2");
        System.out.println(user2.name);
        System.out.println(user2.age);
        System.out.println(user2.rich);
        System.out.println("=====================");
        System.out.println("User3");
        System.out.println(user3.name);
        System.out.println(user3.age);
        System.out.println(user3.rich);
    }
}
