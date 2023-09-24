package com.pacemrc.java.object._genericity.demo3;


/**
 * 泛型接口的使用
 * 1、实现类不是泛型类，接口要明确数据类型
 * 2、实现类也是泛型类，实现类和接口的泛型类要一致
 */
public class test {

    public static void test1() {

        IGenericImpl_1<Object> objectIGenericImpl_1 = new IGenericImpl_1<>(true);
        IGenericImpl_1<String> stringIGenericImpl_1 = new IGenericImpl_1<>("caofalin");
        IGenericImpl_1<Integer> integerIGenericImpl_1 = new IGenericImpl_1<>(20);
        Object type1 = objectIGenericImpl_1.getType();
        String type2 = stringIGenericImpl_1.getType();
        Integer type3 = integerIGenericImpl_1.getType();
        System.out.println(
                "objectIGenericImpl："+ type1 + "\n"
                + "stringIGenericImpl：" + type2 + "\n"
                + "integerIGenericImpl：" + type3);

    }

    public static void test2(){
        //指定其他数据类型报错
//        new IGenericImpl_2<Integer>();
//        new IGenericImpl_2<boolean>();
        IGenericImpl_2 iGenericImpl_2 = new IGenericImpl_2();
        String word = iGenericImpl_2.getType();
        System.out.println(word);

    }

    public static void main(String[] args) {
        //测试实现类也是泛型类，实现类和接口的泛型类型要一致
        test1();
        //测试实现类不是泛型类，接口要明确数据类型
//        test2();
    }
}
