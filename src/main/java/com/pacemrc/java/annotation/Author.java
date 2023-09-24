package com.pacemrc.java.annotation;

import java.lang.annotation.*;

@Retention(value = RetentionPolicy.RUNTIME)
@Target( { ElementType.TYPE } )
@Inherited
public @interface Author {

    String name() default "your_name";
    int age() default -1;
    String profile() default "https://www.example.com";
}
