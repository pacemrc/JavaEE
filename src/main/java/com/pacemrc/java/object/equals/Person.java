package com.pacemrc.java.object.equals;

/**
 * 演示 equals  ==
 * note：
 * 1、equals用来判断变量的值是否相等
 * 2、==用来判断两个对象是不是同一个（内存地址是否相同）
 * 3、equals最终是调用了==
 *     public boolean equals(Object obj) {
 *         return (this == obj);
 *     }
 *
 */
public class Person {
    String name;
    int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "caofalin";
        person.age = 23;

        String name1 = "caofalin";//java为提高运行效率，若一个变量的值和内存中已存在的变量值相同，则不会创建新的变量，而是将新变量的值从已存在变量的值中引用，即内存中只有一个
        String name2 = "caofalin";
        int a = 3;
        int b = 3;

        Person person2 = new Person();
        person2.name = "caofalin";
        person2.age = 23;

        System.out.println(person.equals(person2));//false
        System.out.println(person == person2);//false
        System.out.println(person.name.equals(person2.name));//true

        System.out.println(name1 == name2);//true
        System.out.println(name1.equals(name2));//true

    }
}
