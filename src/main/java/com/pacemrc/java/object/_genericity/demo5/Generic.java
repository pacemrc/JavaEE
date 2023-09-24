package com.pacemrc.java.object._genericity.demo5;

import java.util.ArrayList;

/**
 * 参数类型通配符demo
 * 参数类型通配符上限demo：参数类型最高是什么类可以满足检查正常
 * 参数类型通配符下限demo：参数类型最低是什么类可以满足检查正常
 */
public class Generic<T> {
    private T What;

    public void setWhat(T what) {
        What = what;
    }

    public T getWhat() {
        return What;
    }

    public static void showWhat1(Generic<String> generic) {
        String what = generic.getWhat();
        System.out.println(what);
    }

    /**
     * 参数类型通配符
     * @param generic
     */
    public static void showWhat2(Generic<?> generic) {
        Object what = generic.getWhat();
        System.out.println(what);
    }

    /**
     * 参数类型通配符上限
     * @param list
     */
    public static void showWhat3(ArrayList<? extends Cat> list) {
        for (int i = 0; i < list.size(); i++) {
            Cat cat = list.get(i);
            System.out.println(cat);
        }

    }

    /**
     * 参数类型通配符下限
     * @param list
     */
    public static void showWhat4(ArrayList<? super Cat> list) {
        for (int i = 0; i < list.size(); i++) {
            Object object = list.get(i);
            System.out.println(object);
        }

    }
}