package com.pacemrc.java.object.tostring;

/**
 * 演示toString方法
 * note：
 * 1、toString方法是Object类中的方法
 * 2、toString方法，输出类的描述信息。
 * 格式：[包名]+类名@类在内存中的地址。eg:
 * org.demo.toString方法.Person@1b6d3586
 */
public class Person {

    String name;
    int age;

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.toString());
    }
}
