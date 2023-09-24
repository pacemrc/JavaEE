package com.pacemrc.java.object._super;

public class test extends Car {

    String color = "白色";



    public static void main(String[] args) {
        test test = new test();
        test.name = "奥迪";
        System.out.println(test.name);
//        System.out.println(super.name);
        System.out.println(test.color);

    }

}
