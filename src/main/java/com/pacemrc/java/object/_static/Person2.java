package com.pacemrc.java.object._static;

/**
 * 演示创建对象时，静态代码块，构造方法，普通代码块的调用顺序
 * note：
 * 1、创建对象时，执行顺序：静态代码块>普通代码块>构造方法
 *
 */
public class Person2 {
    String name;
    int age;

    //构造方法
    public Person2(String name, int age){
        System.out.println("调用了构造方法");
        this.name = name;
        this.age = age;
    }
    //静态代码块
    static {
        System.out.println("调用了静态代码块");
    }
    //普通代码块
    {
        System.out.println("调用了普通代码块");
    }


    public static void main(String[] args) {
        Person2 person2 = new Person2("caofalin", 23);
        //调用了静态代码块
        //调用了普通代码块
        //调用了构造方法
    }
}
