package com.pacemrc.java.object._genericity.demo5;

import java.util.ArrayList;
/**
 * 参数类型通配符demo
 * 参数类型通配符上限demo：参数类型最高是什么类可以满足检查正常
 * 参数类型通配符下限demo：参数类型最低是什么类可以满足检查正常
 */
public class test {

    public static void test1(){
        Generic<String> strGeneric = new Generic<>();
        strGeneric.setWhat("jerry");
        Generic.showWhat1(strGeneric);

//        Generic<Integer> intGeneric = new Generic<>();
//        intGeneric.setWhat(100);
//        Generic.showWhat1(intGeneric);
    }

    public static void test2(){
        Generic<String> strGeneric = new Generic<>();
        strGeneric.setWhat("jerry");
        Generic.showWhat2(strGeneric);

        System.out.println("-------------------");
        Generic<Integer> intGeneric = new Generic<>();
        intGeneric.setWhat(100);
        Generic.showWhat2(intGeneric);
    }

    public static void test3(){

        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<SubCat> coffeeCats = new ArrayList<>();

//        Generic.showWhat3(animals);//参数类型上限是Cat，传入Animal类型参数检查报错
        Generic.showWhat3(cats);//参数类型上限是Cat，传入Cat类型参数检查正常
        Generic.showWhat3(coffeeCats);//参数类型上限是Cat,参入Cat类的子类参数检查正常

    }

    public static void test4(){

        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<SubCat> coffeeCats = new ArrayList<>();

        Generic.showWhat4(animals);
        Generic.showWhat4(cats);
//        Generic.showWhat4(coffeeCats);//参数类型下限是Cat,传入参数类型是coffeeCat类型检查报错

    }
    public static void main(String[] args) {
        //测试参数类型是具体数据类型的方法
//        test1();
        //测试参数类型是通配符的方法
//        test2();
        //测试类型通配符上限
//        test3();
        //测试类型通配符下限
        test4();
    }
}
