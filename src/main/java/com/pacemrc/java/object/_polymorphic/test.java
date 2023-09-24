package com.pacemrc.java.object._polymorphic;

/**
 * 演示多态
 * note：
 * 1、将不同类型的对象抽象成同一类型，多种类型的类需继承抽象的类
 * 2、向上转型：把子类变量赋值给父类变量，该转型会屏蔽掉子类中特有的方法
 * 3、向下转型（强转）：把父类变量赋值给子类变量，可以还原出子类中特有的方法
 * 4、多态的具体实现：将不同的类抽象成一个通用类A，使得不同的类继承该通用类A，有一个B类中的方法接收参数是A类对象，那么可以使用向上转型的方式创建A类的子类对象作为B类方法的接收值
 */
public class test {
    public static void main(String[] args) {
        Person person = new Person();
        Animal cat = new Cat();//向上转型，多态的体现
        Animal dog = new Dog();
        person.feed(cat);
        person.feed(dog);
//        cat.catchMouse();//向上转型屏蔽掉子类中特有的方法
//        dog.watchDoor();//向上转型屏蔽掉子类中特有的方法
        System.out.println("==========");
        //向下转型：把父类变量赋值给子类变量，可以还原出子类中特有的方法
        Cat cat1 = (Cat) cat;
        cat1.catchMouse();//向下转型恢复子类的特有方法

        Dog dog1 = (Dog) dog;
        dog1.watchDoor();//向下转型恢复子类的特有方法

    }
}
