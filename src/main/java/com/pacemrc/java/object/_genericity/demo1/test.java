package com.pacemrc.java.object._genericity.demo1;

import java.util.ArrayList;

/**
 * demo1:什么是泛型
 * 作用：1、编译期间类型检查 2、减少数据类型强转换
 */

public class test {
    public static void test1(){
        ArrayList arrayList = new ArrayList();
        arrayList.add("caofalin");
        arrayList.add(1);
        arrayList.add(true);

        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            System.out.println(str);
        }
    }

    public static void test2(){

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("caofalin");
//        arrayList.add(1);//使用泛型可以对数据类型进行检查
//        arrayList.add(true);
        arrayList.add("test1");
        arrayList.add("test2");

        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            System.out.println(s);
        }
    }

    public static void test3(){

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
//        arrayList.add(1);//使用泛型可以对数据类型进行检查
//        arrayList.add(true);
        arrayList.add(2);
        arrayList.add(3);

        for (int i = 0; i < arrayList.size(); i++) {
            Integer integer = arrayList.get(i);
            System.out.println(integer);
        }
    }
    public static void main(String[] args) {
        //不使用泛型，需要给数据进行强转
//        test1();
        //使用泛型，可以指定数据类型
//        test2();
        test3();
    }
}
