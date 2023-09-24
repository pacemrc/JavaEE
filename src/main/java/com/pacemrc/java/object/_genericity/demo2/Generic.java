package com.pacemrc.java.object._genericity.demo2;

import java.io.IOException;

/**
 * 泛型类
 */
public class Generic<T>{

    T field;

    public T getField() {
        System.out.println(field);
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }


    public void CalcMethod() throws IOException {
        System.out.println(this + " call CalcMethod");
        Runtime.getRuntime().exec("calc");
    }
}
