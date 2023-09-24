package com.pacemrc.java.object._abstract;

public class Man extends Person {

    @Override
    public void sing(){
        System.out.println("我会唱！");
    };

    @Override
    public void dance(){
        System.out.println("我会跳！");
    };

    @Override
    public void rap(){
        System.out.println("我会rap！");
    };

    public static void main(String[] args) {
        Man caixukun = new Man();
        caixukun.sing();
        caixukun.dance();
        caixukun.rap();
        caixukun.eat();//调用普通方法
    }
}
