package com.pacemrc.java.object._genericity.demo4;

import com.pacemrc.java.object._genericity.demo4.Generic;

import java.util.ArrayList;

public class test {
    public static void test1(){
        Generic<String> stringGeneric = new Generic<>();
        ArrayList<String> strList = new ArrayList<>();
        strList.add("苹果手机");
        strList.add("小米手机");
        strList.add("华为手机");
        strList.add("Oppo手机");
        //泛型类的成员方法是在创建泛型类的实例时候指定的
        String product = stringGeneric.getProduct1(strList);
        System.out.println(product + "\t" + product.getClass().getSimpleName());
        System.out.println("----------------------------------");
        Generic<Integer> integerGeneric = new Generic<>();
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1000);
        intList.add(2000);
        intList.add(3000);
        intList.add(4000);
        Integer product1 = integerGeneric.getProduct1(intList);
        System.out.println(product1 + "\t" + product1.getClass().getSimpleName());
    }

    public static void test2(){
        Generic<Object> objectGeneric1 = new Generic<>();
        ArrayList<String> strList = new ArrayList<>();
        strList.add("苹果手机");
        strList.add("小米手机");
        strList.add("华为手机");
        strList.add("Oppo手机");
        //泛型类的泛型方法的具体参数类型是在使用的时候指定的
        String product1 = objectGeneric1.getProduct2(strList);
        System.out.println(product1 + "\t" + product1.getClass().getSimpleName());
        System.out.println("----------------------------------");
        Generic<Object> objectGeneric2 = new Generic<>();
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1000);
        intList.add(2000);
        intList.add(3000);
        intList.add(4000);
        Integer product2 = objectGeneric2.getProduct2(intList);
        System.out.println(product2 + "\t" + product2.getClass().getSimpleName());
    }

    public static void test3(){
        ArrayList<Boolean> boolList = new ArrayList<>();
        boolList.add(true);
        boolList.add(false);
        boolList.add(true);
        Boolean product = Generic.getProduct3(boolList);
        System.out.println(product + "\t" + product.getClass().getSimpleName());
    }

    public static void main(String[] args) {

        //测试泛型类的成员方法
        test1();
        //测试泛型类的泛型方法
        test2();
        //测试泛型类的静态泛型方法
        test3();

    }
}
