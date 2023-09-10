package com.pacemrc.java.collection;


/**
 * 演示数组的定义以及遍历方式
 */
public class testArray {

    public static void main(String[] args) {

        String[] stringArray1 = {"1","2","3"};
        String[] stringArray2 = new String[] {"1","2","3"};
        String[] strigArray3 = new String[3];

        for (String s : stringArray1) {
            System.out.println(s);
        }
    }
}
