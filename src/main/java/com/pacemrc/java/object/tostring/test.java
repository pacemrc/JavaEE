package com.pacemrc.java.object.tostring;

/**
 * 演示重写toString方法
 * note：
 * 1、idea
 */
public class test {

    String name;
    int age;

    @Override
    public String toString() {
        return "test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        test test = new test();
        test.name = "caofalin";
        test.age = 23;
        System.out.println(test.toString());
    }
}
