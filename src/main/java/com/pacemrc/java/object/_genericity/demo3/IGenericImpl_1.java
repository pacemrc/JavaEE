package com.pacemrc.java.object._genericity.demo3;

/**
 * 泛型接口实现类1，实现类也是泛型类，实现类和接口的泛型类型要一致
 * @param <T>
 */
//public class IGenericImpl_1<T> implements IGeneric<K> {   类型不一致报错
public class IGenericImpl_1<T> implements IGeneric<T> {

    private T type;

    public IGenericImpl_1(T type) {
        this.type = type;
    }

    @Override
    public T getType() {
        return type;
    }
}
