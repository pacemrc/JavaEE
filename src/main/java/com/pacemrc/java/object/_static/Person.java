package com.pacemrc.java.object._static;

/**
 * 演示静态属性
 * note:
 * 1、静态属性、静态方法、静态代码块使用static关键字修饰
 * 2、静态属性、静态方法和类的对象无关联
 * 3、调用方法：类名.静态属性/静态方法
 *
 */
public class Person {
    String name;
    int age;
//    String base = "Beijing";
    static String base = "Beijing";

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("caofalin", 23);
        Person person2 = new Person("liujunying", 23);
        Person person3 = new Person("wangbingbing", 23);

        System.out.println(person1.base);
        System.out.println(person2.base);
        System.out.println(person3.base);
        //假如现在需要把所有人的base改为jiangxi
        //一般方法是给每个人的base修改为jiangxi
        //static方法全局修改base
        Person.base = "Jiangxi";
        System.out.println(person1.base);
        System.out.println(person2.base);
        System.out.println(person3.base);
    }
}
