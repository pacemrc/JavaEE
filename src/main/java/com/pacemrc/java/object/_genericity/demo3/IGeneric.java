package com.pacemrc.java.object._genericity.demo3;

/**
 * 泛型接口
 * 接口1：实现类也是泛型类，实现类和接口的泛型类型要一致
 */
public interface IGeneric<T> {

    T getType();

}
