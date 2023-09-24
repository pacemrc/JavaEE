package com.pacemrc.java.object._genericity.demo5;

public class Animal {
    public String Name;
    public int age;
    public int level;

    public Animal(String name, int age, int level) {
        Name = name;
        this.age = age;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", level=" + level +
                '}';
    }
}
class Cat extends Animal{


    public Cat(String name, int age, int level) {
        super(name, age, level);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", level=" + level +
                '}';
    }
}

class SubCat extends Cat {

    public SubCat(String name, int age, int level) {
        super(name, age, level);
    }

    @Override
    public String toString() {
        return "CoffeeCat{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", level=" + level +
                '}';
    }
}
