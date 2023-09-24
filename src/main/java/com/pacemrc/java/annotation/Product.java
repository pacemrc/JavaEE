package com.pacemrc.java.annotation;

@Author(name = "pacemrc", age = 25, profile = "https://github.com/pacemrc")
public class Product {

    public static void main(String[] args) {

        Class<Product> clz = Product.class;
        Author annotation = clz.getAnnotation(Author.class);
        String name = annotation.name();
        int age = annotation.age();
        String profile = annotation.profile();
        System.out.println(name + " " + age + " " + profile);
    }
}
