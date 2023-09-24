package com.pacemrc.java.object.MemberDefaultValue;

/**
 * 演示类中成员变量的默认值
 * note：
 * 类中成员变量中基本数据类型默认赋值 0 ，引用数据类型默认赋值 null
 * 1、java中数据类型：基本数据类型、引用类型
 * 2、基本数据类型：整型、浮点型、字符型和布尔型
 * 3、引用类型：类、接口、数组
 * 4、整型：byte、int、short、long
 * 5、浮点型：float、double
 * 6、字符型：char
 * 7、布尔型：boolern
 *
 * 8、类：class
 * 9、接口：interface
 * 10、数组 []
 */
public class Person {

    byte aByte;
    int anInt;
    short aShort;
    long aLong;
    float aFloat;
    double aDouble;
    char aChar;
    boolean aBoolean;
    String string;

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.aByte);
        System.out.println(person.anInt);
        System.out.println(person.aShort);
        System.out.println(person.aLong);
        System.out.println(person.aFloat);
        System.out.println(person.aDouble);
        System.out.println(person.aChar);
        System.out.println(person.aBoolean);
        System.out.println(person.string);

    }

}
