package com.pacemrc.java.object._final;

/**
 * 演示final关键字
 * note：
 * 1、final关键字修饰的属性的值不能被修改
 * 2、final关键字修饰的方法不能够被子类重写
 */
public class Person {
    String name;
    int age;
    final String country = "China";

    public void dance(){
        System.out.println("我会跳舞！");
    }
    public final void sing(){
        System.out.println("我会唱歌！");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "caofalin";
        person.age = 23;
//        person.country = "Other";//final关键字修饰的属性的值不能被修改

    }

}
