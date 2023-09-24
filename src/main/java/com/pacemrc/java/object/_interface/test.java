package com.pacemrc.java.object._interface;

/**
 * 演示接口
 * note：
 * 1、接口是一种抽象类,使用interface修饰,接口中所有的方法都是抽象方法
 * 2、接口中的变量都是公开静态常量
 * 2、接口制能继承接口，接口需要通过类实现
 * 3、类只可以继承一个类，实现多个接口
 * 4、接口相当于类的属性【钻石(类)是值钱的(接口1)，坚硬的(接口2)】
 * 5、接口可以让不相关的类产生关联。如钻石和黄金是值前的，钻石和黄金是坚硬的
 */
public class test {
    public static void main(String[] args) {
        //多态，接口也可以多态
        Cat cat = new Cat();
        Loyal loyal1 = (Loyal) new Cat();
        Valuable valuable1 = (Valuable) new Cat();
        Animal animal1 = new Cat();
        //站在猫的角度
        cat.loyal();
        cat.eat();
        cat.sayMiao();
        //站在忠诚的角度
        loyal1.loyal();
        //站在值钱的角度
        valuable1.getMoney();
        //站在动物的角度
        animal1.eat();


        Book book = new Book();
        Valuable valuable2 = new Book();
        //站在书的角度
        book.read();
        //站在值钱的角度
        valuable2.getMoney();
        //打印静态常量
        System.out.println(Valuable.money);

    }
}
