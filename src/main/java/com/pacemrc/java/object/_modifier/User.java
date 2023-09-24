package com.pacemrc.java.object._modifier;

/**
 * 演示类中成员变量和成员方法的访问修饰符
 * note：
 * 1、java中有4种访问修饰符：public、default、private、protected
 * 2、private修饰符所修饰的属性和方法：同一个类可以访问
 * 3、default修饰符所修饰的属性和方法：同一个类、同一个包内的类可以访问
 * 4、protected修饰符所修饰的属性和方法：同一个类、同一个包、子类可以访问
 * 5、public修饰符所修饰的属性和方法：任何类都可以访问
 */
public class User {

    public String name;
    private int age;
    protected String job;
    boolean rich;


    public void sing(){
        System.out.println("public方法：唱");
    }

    private void dance(){
        System.out.println("private方法：跳");
    }

    void rap(){
        System.out.println("default方法：rap");
    }

    protected void run(){
        System.out.println("protected方法：跑");
    }


//    public static void main(String[] args) {
//        User user = new User();
//        user.name = "caofalin";
//        user.age = 23;
//        user.job = "engineer";
//        user.rich  = true;
//
//
//        System.out.println(user.name);
//        System.out.println(user.age);
//        System.out.println(user.job);
//        System.out.println(user.rich);
//        user.sing();
//        user.dance();
//        user.rap();
//        user.run();
//    }
}
