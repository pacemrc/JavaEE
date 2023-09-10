package com.pacemrc.java.collection;

import java.util.ArrayList;


/**
 * 演示ArrayList的基本操作以及不同的遍历方式
 */
public class testLink {

    public static void testArrayList(){

        ArrayList<String> stringArrayList = new ArrayList<>();
        //添加元素
        stringArrayList.add("aaa");
        stringArrayList.add("bbb");
        stringArrayList.add("ccc");

        //获取元素
        String s = stringArrayList.get(0);
        System.out.println(s);

        //获取元素的个数
        int size = stringArrayList.size();
        System.out.println(size);

        //给第n个元素赋值
        stringArrayList.set(2,"ddd");
        String s1 = stringArrayList.get(2);
        System.out.println(s1);

        //通过Iterator遍历
//        Iterator<String> iterator = stringArrayList.iterator();
//        while (iterator.hasNext()){
//            String next = iterator.next();
//            System.out.println(next);
//        }

        //通过for循环遍历
//        for (int i = 0; i < stringArrayList.size(); i++) {
//            String s2 = stringArrayList.get(i);
//            System.out.println(s2);
//        }

        //通过for-each遍历
        for(String s3 : stringArrayList){
            System.out.println(s3);
        }


    }

    public static void main(String[] args) {
        testArrayList();

    }
}
