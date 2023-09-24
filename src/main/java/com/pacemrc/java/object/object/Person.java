package com.pacemrc.java.object.object;

/**
 * 演示万物皆对象
 * note：
 * 1、所有类都会直接或间接继承Object类
 */
public class Person {

    String name;
    int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.name= "caofalin";
        person.age = 23;

        person.toString();//从Object类继承来的方法
        person.hashCode();

        System.out.println(person.toString());
        System.out.println(person.hashCode());

    }
}
