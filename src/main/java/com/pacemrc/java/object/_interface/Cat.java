package com.pacemrc.java.object._interface;

public class Cat extends Animal implements Loyal, Valuable {

    public void loyal(){
        System.out.println("猫是忠诚的");
    };

    public void getMoney(){
        System.out.println("猫可以用来换钱");
    };
    public void sayMiao(){
        System.out.println("喵喵叫~");
    }
}
