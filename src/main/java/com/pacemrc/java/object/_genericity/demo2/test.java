package com.pacemrc.java.object._genericity.demo2;

import java.io.IOException;

/**
 * 测试泛型类和泛型类的继承
 */

public class test {   public static void test1(){
    Generic<Object> objectGeneric = new Generic<>();
    Generic<String> stringGeneric = new Generic<>();
    Generic<Integer> integerGeneric = new Generic<>();
    System.out.println("--------objectGeneric--------");
    objectGeneric.setField(true);
    objectGeneric.getField();
    System.out.println("--------stringGeneric--------");
    stringGeneric.setField("caofalin");
    stringGeneric.getField();
    System.out.println("--------integerGeneric--------");
    integerGeneric.setField(24);
    integerGeneric.getField();
}

    public static void test2() throws IOException {
        subGeneric<Object> objectsubGeneric = new subGeneric<>();
        subGeneric<String> stringsubGeneric = new subGeneric<>();
        subGeneric<Integer> integersubGeneric = new subGeneric<>();
        stringsubGeneric.setField("caofalin");
        stringsubGeneric.getField();

        objectsubGeneric.CalcMethod();
        stringsubGeneric.CalcMethod();
        integersubGeneric.CalcMethod();
    }

    public static void main(String[] args) throws IOException {

        //测试泛型类的使用
        test1();
        //测试泛型类的继承使用
        test2();
    }

}
