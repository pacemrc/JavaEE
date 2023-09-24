package com.pacemrc.java.object._genericity.demo4;

/**
 * 泛型方法demo
 * 泛型类，是在实例化类的时候指定泛型的具体类型
 * 泛型方法，是在调用方法的时候指明泛型的具体类型
 * 泛型类的泛型表示和泛型方法的泛型标识是独立不影响的，名称可以相同(T,K,E,V)
 */

import java.util.ArrayList;
import java.util.Random;

public class Generic<T> {

    private T product;

    //泛型类的成员方法
    public T getProduct1(ArrayList<T> list){
        Random random = new Random();
        T t = list.get(random.nextInt(list.size()));
        return t;
    }

    //泛型类的泛型方法
    public<E> E getProduct2(ArrayList<E> list){
        Random random = new Random();
        E e = list.get(random.nextInt(list.size()));
        return e;
    }
    //泛型类的静态泛型方法
    public static <E> E getProduct3(ArrayList<E> list){
        Random random = new Random();
        E e = list.get(random.nextInt(list.size()));
        return e;
    }

}
