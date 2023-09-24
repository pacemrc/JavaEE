package com.pacemrc.java.object._modifier;

public class test_protected extends User{
    public static void main(String[] args) {
        User user = new User();
        user.job = "student";
        System.out.println(user.job);
        user.run();
    }
}
