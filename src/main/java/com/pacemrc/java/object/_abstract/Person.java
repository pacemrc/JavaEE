package com.pacemrc.java.object._abstract;

/**
 * 演示抽象类
 * note：
 * 1、抽象类中可以有普通方法
 * 2、抽象类的抽象方法必须通过子类重写来实现
 */
public abstract class Person {

    public abstract void sing();

    public abstract void dance();

    public abstract void rap();

    public void eat(){
        System.out.println("吃");
    }

}
