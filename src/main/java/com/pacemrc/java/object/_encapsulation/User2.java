package com.pacemrc.java.object._encapsulation;

/**
 * 演示使用封装了的类
 */
public class User2 {

    private String name;
    private int age;
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //添加了对输入值的校验
        if (age < 0){
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
