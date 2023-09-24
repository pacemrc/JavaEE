package com.pacemrc.java.object._inheritance;

/**
 * 演示继承
 * note：
 * 1、相同包下的类继承：public、default、protected方法可以被访问
 * 2、不同包下的类继承：只有public方法可以被访问
 */
public class Person {

    public void sing(){
        System.out.println("public方法：人会唱");
    }

    private void dance(){
        System.out.println("private方法：人会跳");
    }

    void rap(){
        System.out.println("default方法：人会rap");
    }
    protected void run(){
        System.out.println("protected方法：人会跑");
    }
}
