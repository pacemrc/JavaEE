package com.pacemrc.java.object._this;

/**
 * 演示this关键字
 * note：
 * 1、this关键字表示调用该方法的对象
 *
 */

public class User {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        User user = new User();
        user.setName("caofalin");
        user.setAge(23);
        System.out.println(user.getName());
        System.out.println(user.getAge());

    }
}
