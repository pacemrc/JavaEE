package com.pacemrc.java.map;

import java.util.HashMap;

/**
 * 演示HashMap的基本操作以及不同的遍历方式
 */
public class testMap {

    public static void testHashMap(){

        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("1","aaa");
        stringHashMap.put("2","bbb");
        stringHashMap.put("3","ccc");

        int size = stringHashMap.size();
        System.out.println(size);

        String s = stringHashMap.get("1");
        System.out.println(s);

        int i = stringHashMap.hashCode();
        System.out.println(i);

//        for (int j = 0; j < stringHashMap.size() ; j++) {
//            String s1 = stringHashMap.get(String.valueOf(j+1));
//            System.out.println(s1);
//        }

//        Set<String> keySet = stringHashMap.keySet();
//
//        for (String s1 : keySet) {
//            String s2 = stringHashMap.get(s1);
//            System.out.println(s2);
//        }

//        Set<Map.Entry<String, String>> entrySet = stringHashMap.entrySet();
//        for (Map.Entry<String, String> stringEntry : entrySet) {
//            String key = stringEntry.getKey();
//            String value = stringEntry.getValue();
//            System.out.println(key + " " + value);
//        }


//        Set<Map.Entry<String, String>> entries = stringHashMap.entrySet();
//        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, String> entry = iterator.next();
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + " "+ value);
//        }


    }



    public static void main(String[] args) {

//        testHashMap();



    }

}
