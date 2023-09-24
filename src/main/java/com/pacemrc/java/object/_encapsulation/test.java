package com.pacemrc.java.object._encapsulation;

/**
 * 类中的成员变量设置private修饰符，使用getter setter可以对数据进行过滤校验，这种做法成为封装
 */
public class test {

    public static void test1(){
        User user = new User();//没有封装的类
        user.name = "john";
        user.age = -10;//用户可以随意给属性设置不符合逻辑值
        user.job = "engineer";
        System.out.println("没有使用封装的User类：");
        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.job);
    }

    public static void test2(){
        User2 user2 = new User2();
        user2.setName("john");
        user2.setAge(-10);//当输入值为负数时，age设置为0
        user2.setJob("engineer");
        System.out.println("使用封装的User2类：");
        System.out.println(user2.getName());
        System.out.println(user2.getAge());
        System.out.println( user2.getJob());
    }
    public static void main(String[] args) {
        //测试没有使用封装的类
        test1();
        //测试使用了封装的类
        test2();

    }
}
