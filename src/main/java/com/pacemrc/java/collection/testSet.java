package com.pacemrc.java.collection;

import java.util.HashSet;
import java.util.Iterator;


/**
 * 演示HashSet的基本操作以及不同的遍历方式
 */
public class testSet {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("aaa");
        hashSet.add("bbb");
        hashSet.add("ccc");

        //获取set的个数
        int size = hashSet.size();
        System.out.println(size);

        //将set转换为数组
        Object[] objects = hashSet.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }

        //判断是否为空
        boolean empty = hashSet.isEmpty();
        System.out.println(empty);

        //遍历set
        for (String s : hashSet) {
            System.out.println(s);
        }

        //通过迭代器遍历
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
