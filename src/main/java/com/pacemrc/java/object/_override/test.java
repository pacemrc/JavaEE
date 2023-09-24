package com.pacemrc.java.object._override;

public class test extends User{

    @Override
    public void sing(){
        System.out.println("我会唱歌！");
    }

    public static void main(String[] args) {
        test test = new test();
        test.sing();
    }
}
